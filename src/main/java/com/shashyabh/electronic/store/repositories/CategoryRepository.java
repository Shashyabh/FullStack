package com.shashyabh.electronic.store.repositories;

import com.shashyabh.electronic.store.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String>
{
}
