package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class color {
	@GetMapping("/display")
	public String display(HttpServletRequest req)
	{
		String name=req.getParameter("name");
		HttpSession session = req.getSession();
	    session.setAttribute("displayName", name);
		return "NewFile1.jsp";
	}
}

