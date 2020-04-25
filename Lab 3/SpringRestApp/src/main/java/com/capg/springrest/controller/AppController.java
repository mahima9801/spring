package com.capg.springrest.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class AppController {
	
	@RequestMapping("/showPage")
	public String showPage()
	{
		return "register";
	}
	@RequestMapping("/viewPage")
	public String viewPage()
	{
		return "find";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct(@ModelAttribute("product") Product product,ModelMap modelMap)
	{
		String uri="http://localhost:8088/Lab3/products";
		RestTemplate restTemplate=new RestTemplate();
		Product savedProduct=restTemplate.postForObject(uri,product,Product.class);
		modelMap.addAttribute("msg","Product is added successful"+savedProduct.getId());
		return "message";
		
	}
	
	@RequestMapping("/viewProduct")
	public String getProduct(@RequestParam("id")int id,ModelMap map)
	{
		String uri="http://localhost:8088/Lab3/products";
		RestTemplate template=new RestTemplate();
		Product product=template.getForObject(uri+"/"+id,Product.class);
		map.addAttribute("product",product);
		return "show-product";
	}
	

}
