package com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onlineshopping.dao.CategoryDAO;
import com.onlineshopping.dto.Category;

@Controller
public class Pagecontroller {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public String index(Model model) {

		model.addAttribute("title", "Home");

		model.addAttribute("categories", categoryDAO.listOfCategories());

		model.addAttribute("userClickHome", true);
		return "page";

	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;

	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;

	}

	/* Methods To Load all Products */

	@RequestMapping(value = { "/show/all/products" })
	public String showAllProducts(Model model) {

		model.addAttribute("title", "All Products");

		model.addAttribute("categories", categoryDAO.listOfCategories());

		model.addAttribute("userClickAllProducts", true);
		return "page";

	}

	@RequestMapping(value = { "/show/category/{id}/products" })
	public String showCategoryProducts(@PathVariable("id") int id, Model model) {

		Category category = categoryDAO.getCategoryById(id);

		model.addAttribute("title", category.getName());

		// Passing List of categories
		model.addAttribute("categories", categoryDAO.listOfCategories());

		// Passing Single Category
		model.addAttribute("category", category);

		model.addAttribute("userClickCategoryProducts", true);
		return "page";

	}

}
