package com.skilldistillery.woodinventory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.woodinventory.data.WoodInventoryDAO;
import com.skilldistillery.woodinventory.entities.wood;

@Controller
public class WoodController {
	
	@Autowired
	private WoodInventoryDAO dao;
	
	
	@RequestMapping(path = {"/","index.do"})
	public String index(Model model) {
		model.addAttribute("wood", dao.findAll());
		return "index";
	}
	
	@RequestMapping(path = "create.do")
	public String toCreatePage() {
		return "CreatePage";
	}
	
	@RequestMapping(value = "createReturn.do")
	public String create(@RequestParam String Species,
						 @RequestParam int Length,
						 @RequestParam int Thickness,
						 @RequestParam int Width,
						 @RequestParam String Type,
						 Model model) {
		
		wood scrapPiece = new wood();
		
		scrapPiece.setSpecies(Species);
		scrapPiece.setLength(Length);
		scrapPiece.setThickness(Thickness);
		scrapPiece.setWidth(Width);
		scrapPiece.setType(Type);
		
		scrapPiece = dao.create(scrapPiece); 
		
		model.addAttribute("wood", scrapPiece);
		
		return "ViewScrapPiece";
	}
	
	@RequestMapping(path = "RemovePassThrough.do")
	public String passToRemovePage() {
		return "DeleteScrapPiece";
	}
	
	@RequestMapping(path = "remove.do")
	public String remove(@RequestParam int Id, Model model) {
		dao.deleteById(Id);
		model.addAttribute("wood", wood.class);
		return "DeleteScrapPiece";
	}
	
	@RequestMapping(path = "UpdatePassThrough.do")
	public String passToUpdatePage() {
		return "UpdateScrap";
	}
	
	@RequestMapping(path = "update.do")
	public String updateScrap(@RequestParam int Id,
			 @RequestParam String Species,
			 @RequestParam int Length,
			 @RequestParam int Thickness,
			 @RequestParam int Width,
			 @RequestParam String Type,
			 Model model) {
		
		wood updateWood = dao.findById(Id);
		
		updateWood.setSpecies(Species);
		updateWood.setLength(Length);
		updateWood.setThickness(Thickness);
		updateWood.setWidth(Width);
		updateWood.setType(Type);
		
		
		
		
		dao.update("wood", updateWood);
		model.addAttribute("wood", updateWood);
		
		return "index";
		
	}
	
	

}
