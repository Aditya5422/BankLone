package com.ds.EmpoyeeApp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerContlloer {
	@Autowired
	CustomerService service;
	
	 @RequestMapping(value = "/index")
	   public String index() {
	      return "index";
	   }
	 
	  @RequestMapping("/new") 
	public String showNewProductPage(Model model) {
	  CustmoerBean custmoerBean = new CustmoerBean();
	  model.addAttribute("CustmoerBean", custmoerBean);
	  return "index2"; 
	  }
	 

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("custmoerBean") CustmoerBean custmoerBean) {
		service.save(custmoerBean);
		return "redirect:/";
	}

}
