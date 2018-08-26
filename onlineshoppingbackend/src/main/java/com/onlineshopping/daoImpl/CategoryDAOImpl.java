package com.onlineshopping.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.onlineshopping.dao.CategoryDAO;
import com.onlineshopping.dto.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		category.setId(1);
		category.setName("Television");
		category.setDescription("This is Bravia TV ");
		category.setImageURL("cat1.png");

		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is Iphone Mobile ");
		category.setImageURL("cat2.png");

		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is Lenovo Laptop ");
		category.setImageURL("cat3.png");

		categories.add(category);
	}

	@Override
	public List<Category> listOfCategories() {

		return categories;
	}

	@Override
	public Category getCategoryById(int id) {

		for (Category category : categories) {

			if (category.getId() == id) {
				return category;
			}
		}
		return null;
	}

}
