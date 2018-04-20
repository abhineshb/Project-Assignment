package com.product.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.product.model.Product;
import com.product.model.UserDetail;
import com.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loginPage(Model model)
	{
		return "login";
	}
	
	@RequestMapping(value="/userValidate", method=RequestMethod.GET)
	public String UserValidate(@Validated UserDetail user ,Model model)
	{
		System.out.println(user.getUserId() + "==="+user.getPassword() );
		if(user.getUserId().equals("abhi") && user.getPassword().equals("pwd"))
			{
			System.out.println("indside");
			return "ProductHome";
			}
		else	
		{
			System.out.println("else");
			return "loginFail";
		}
	}
	
	@RequestMapping(value="/getAllProducts", method=RequestMethod.GET , produces={"application/json"} )
	@ResponseBody
	public String getAllproduct()
	{
		Gson g =new Gson();
		
		return g.toJson( new ArrayList<Product>(productService.getAllProduct().values()));
	}
	
	  private Map<Long, Product> employeeMap = new HashMap<>();
	@RequestMapping(value="/items", method=RequestMethod.GET , produces={"application/json"} )
	public String getAllproductItem(@ModelAttribute("Product") Product prod,
		      BindingResult result, ModelMap model)
	{
	Map<String, Product> m =	productService.getAllProduct();
	Set it =m.entrySet();
	Iterator i =it.iterator();
	while(i.hasNext())
	{
		Map.Entry<String,Product> tt =(Entry<String, Product>) i.next();
		prod=(Product)tt.getValue();
	    model.addAttribute("name", prod.getName());
        model.addAttribute("id", prod.getId());
        model.addAttribute("descr", prod.getDescription());
        model.addAttribute("id", prod.getRelatedProduct());
      
	} 
 return "ProductHome";
        
	}
	
	
}
