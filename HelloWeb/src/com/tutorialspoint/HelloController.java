package com.tutorialspoint;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import Dao.UserDao;
import model.Candidate;
import model.Employee;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller

public class HelloController
	{
	@Autowired
	UserDao dao;
   	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
   public String printHello(ModelMap model) 
   	{
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";
   }
   	@RequestMapping(value="/login_chk",method=RequestMethod.GET)
   	public String login(@ModelAttribute("login")Employee lm)
   
   	{	/*System.out.println("In login");
   		return "redirect:/Action_file.jsp";
	*/System.out.println(lm.getId());
   		String password=dao.loginChk(lm);
   		if(lm.getPassword().equals(password))
   		{
   		return "redirect:/Action_file.jsp";}
   		else
   		{
   			System.out.println("error");
   			return "redirect:/error.jsp";
   		}
   	}
   	
   /*	public String getvalue(ModelMap model)
   	{
   		model.addAttribute("id")
   	}*/
   	@RequestMapping(value="/register",method=RequestMethod.GET)
   	public String register(@ModelAttribute("reg")Employee emp)
   	{
   		System.out.println("id:"+emp.getId());
   		
   		int i=dao.save(emp);
   		System.out.println("saved successfully"+i);
   		return "Action_file.jsp";
   	}
   	
   	@RequestMapping(value="/candidateDetails",method=RequestMethod.GET)
   	public String saveCandidate(@ModelAttribute("candidate")Candidate candidate)
   	{
   		//int i=dao.saveCandidate(candidate);
   		int id=candidate.getId();
   		String fname=candidate.getFirstname();
   		String lname=candidate.getLastname();
   		String category=candidate.getCategory();
   		
   		System.out.println("saved successfully"+id+""+fname+""+lname+""+category);
   		return "";
   	}
   	@RequestMapping(value="/result",method=RequestMethod.POST)
   	public String showResultPage(Model model,@ModelAttribute("cand")Candidate cand)
   	{
   		String category=cand.getCategory();
   		
   		java.util.List<Candidate> list=dao.getCandidates(category);
   		
   		System.out.println("id is:"+list.size());
   		for(int i=0;i<list.size();i++)
   		{
   			System.out.println("values:"+list.get(i).getId());
   			System.out.println("values:"+list.get(i).getFirstname());
   		}
   
   				model.addAttribute("msg","hello");
   
   		model.addAttribute("list",list);
   		return "result";
   	}
   	@ResourceMapping(value="/result_details",method=RequestMethod.POST)
   	public String saveResultDetails(Model model)
   	{
   		return "";
   	}
}