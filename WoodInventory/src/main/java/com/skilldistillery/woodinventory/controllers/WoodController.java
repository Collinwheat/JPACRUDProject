package com.skilldistillery.woodinventory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.woodinventory.data.WoodInventoryDOA;

@Controller
public class WoodController {
	
	@Autowired
	private WoodInventoryDOA dao;
	
	
	@RequestMapping(path = {"/","index.do"})
	public String index(Model model) {
		model.addAttribute("wood", dao.findAll());
		return "index";
	}

}
