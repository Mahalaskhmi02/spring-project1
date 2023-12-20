package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FormController {
	CustomerRepo repo;
	@Autowired
	@RequestMapping("/")
	public String details() 
	{
		return "edureka";
	}

	@RequestMapping("/details")
	public String details(Customers customers) 
	{
		repo.save(customers);
		return "edureka";
	}
	@PostMapping("/getdetails")
	public String getdetails() 
	{
		return "ViewCustomers";
	}

@PostMapping("/getdetails")
public ModelAndView getdetails(@RequestParam int cid)
{
	ModelAndView mv= new ModelAndView("Retrive");
    Customers customers = repo.findById(cid).orElse(null);
    mv.addObject(customers);
    return mv;
}
}


