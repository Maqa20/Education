package az.edu.itbrains.education.services;

import az.edu.itbrains.education.dtos.category.CategoryCreateDto;
import az.edu.itbrains.education.dtos.category.CategoryDto;
import az.edu.itbrains.education.dtos.category.CategoryUpdateDto;
import az.edu.itbrains.education.models.Category;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAll();

    CategoryCreateDto createCategory(CategoryCreateDto categoryCreateDto);

    CategoryUpdateDto getUpdateCategory(Long id);

    CategoryUpdateDto updateCategory(Long id, CategoryUpdateDto categoryUpdateDto);

    CategoryDto deleteCategory(Long id);

    Category findCategoryById(Long categoryId);
}
