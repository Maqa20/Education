package az.edu.itbrains.education.services.impls;

import az.edu.itbrains.education.dtos.category.CategoryCreateDto;
import az.edu.itbrains.education.dtos.category.CategoryDto;
import az.edu.itbrains.education.dtos.category.CategoryUpdateDto;
import az.edu.itbrains.education.models.Category;
import az.edu.itbrains.education.repositories.CategoryRepository;
import az.edu.itbrains.education.services.CategoryService;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<CategoryDto> getAll() {
        List<Category> categoryList = categoryRepository.findAll();
         List <CategoryDto> categoryDtoList = categoryList.stream().map(category -> modelMapper.map(category, CategoryDto.class)).toList();
        return categoryDtoList;
    }

    @Override
    public CategoryCreateDto createCategory(CategoryCreateDto categoryCreateDto) {
        Category category = modelMapper.map(categoryCreateDto, Category.class);
        categoryRepository.save(category);
        return categoryCreateDto;
    }

    @Override
    public CategoryUpdateDto getUpdateCategory(Long id) {
            Category category = categoryRepository.findById(id).orElse(null);
            if (category != null) {
                return modelMapper.map(category, CategoryUpdateDto.class);
            }
        return null;
    }

    @Override
    public CategoryUpdateDto updateCategory(Long id, CategoryUpdateDto categoryUpdateDto) {
        Category category = categoryRepository.findById(id).orElse(null);
        if (category != null) {
            modelMapper.map(categoryUpdateDto, category);
            categoryRepository.save(category);
            return modelMapper.map(category, CategoryUpdateDto.class);
        }
        return null;
    }

    @Override
    public CategoryDto deleteCategory(Long id) {
        Category category = categoryRepository.findById(id).orElse(null);
        if (category != null) {
            categoryRepository.delete(category);
            return modelMapper.map(category, CategoryDto.class);
        }
        return null;
    }

    @Override
    public Category findCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }
}
