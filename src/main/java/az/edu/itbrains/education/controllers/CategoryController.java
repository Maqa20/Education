package az.edu.itbrains.education.controllers;
import az.edu.itbrains.education.dtos.category.CategoryCreateDto;
import az.edu.itbrains.education.dtos.category.CategoryDto;
import az.edu.itbrains.education.dtos.category.CategoryUpdateDto;
import az.edu.itbrains.education.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/all")
    public ResponseEntity<List<CategoryDto>> getAll(){

        List<CategoryDto> categoryDtoList = categoryService.getAll();
        return new ResponseEntity<>(categoryDtoList, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<CategoryCreateDto> createCategory(@RequestBody CategoryCreateDto categoryCreateDto){

        CategoryCreateDto category =categoryService.createCategory(categoryCreateDto);
        return new ResponseEntity<>(category,HttpStatus.CREATED);
    }
    @GetMapping("/update/{id}")
    public ResponseEntity<CategoryUpdateDto> getCategoryById(@PathVariable Long id){

        CategoryUpdateDto update = categoryService.getUpdateCategory(id);
        return new ResponseEntity<>(update,HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<CategoryUpdateDto> updateCategory(@PathVariable  Long id ,@RequestBody CategoryUpdateDto categoryUpdateDto){

        CategoryUpdateDto category = categoryService.updateCategory(id, categoryUpdateDto);
        return new ResponseEntity<>(category,HttpStatus.OK);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<CategoryDto> remove(@PathVariable Long id){
        CategoryDto categoryDto = categoryService.deleteCategory(id);
        return new ResponseEntity<>(categoryDto,HttpStatus.OK);
    }

}
