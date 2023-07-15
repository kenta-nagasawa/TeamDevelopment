package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.FormRequest;

// 画面からHTTPリクエストを受け付けるため@Controllerアノテーションを付与する\s
@Controller
public class FormController {
	
	@GetMapping("/new")
    public String showNewPage() {
        return "new.html";
    }
	@GetMapping("/top")
    public String showTopPage() {
        return "top.html";
    }
	@GetMapping("/done")
    public String showDonePage() {
        return "done.html";
        }
	
	@GetMapping(value = "/input")
	public String displayAdd(Model model) {
		model.addAttribute("formRequest", new FormRequest());
		return "input";
	}
	
	@GetMapping(value = "/login")
	public String displayLogin(Model model) {
		model.addAttribute("formRequest", new FormRequest());
		return "login";
	}
	
	@PostMapping("/user/create")
	public String create(@ModelAttribute("formRequest") @Validated FormRequest formRequest,BindingResult result,Model model) {
		if (result.hasErrors()) {
			return "input";
		}
//		model.addAttribute("name", request.getName());
//		model.addAttribute("kana", request.getKana());
//		model.addAttribute("hobby", request.getHobby());
//		model.addAttribute("comment", request.getComment());
		return "check";
	}
	
	@PostMapping(value = "/user/done")
	public String showDone(Model model,FormRequest request) {
//		model.addAttribute("name", request.getName());
//		model.addAttribute("kana", request.getKana());
//		model.addAttribute("gender", request.getGender());		
//		model.addAttribute("hobby", request.getHobby());
//		model.addAttribute("comment", request.getComment());
		return "done";
	}
}
