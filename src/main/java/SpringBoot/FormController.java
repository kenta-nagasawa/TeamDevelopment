package SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {


	@GetMapping("/login")
	public String showLoginPage() {
		return "login.html";
	}
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
	@Autowired
	private FormService service;

	@GetMapping(value = "/input")
	public String displayAdd(Model model) {
		model.addAttribute("formRequest", new FormRequest());
		return "input";
	}

	@PostMapping(value = "/user/create")
	public String create(@Validated @ModelAttribute FormRequest request, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "input";
		} 
		model.addAttribute("name", request.getName());
		model.addAttribute("kana", request.getKana());
		model.addAttribute("gender", request.getGender());
		model.addAttribute("hobby", request.getHobby());
		model.addAttribute("word", request.getWord());
		return "check";
	}
	
	@PostMapping(value = "/check")
	public String createDB(@ModelAttribute FormRequest request,Model model) {
		service.regist(request, model);
		
		return "done";
	}
	}


