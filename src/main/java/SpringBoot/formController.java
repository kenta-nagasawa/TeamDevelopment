package SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 画面からHTTPリクエストを受け付けるため@Controllerアノテーションを付与する
@Controller
public class formController {
	
	@Autowired
	private formService service;

	/*
	@GetMapping(value = "/input")
	public String displayInput(Model model) {
		model.addAttribute("userRequest", new formRequest());
		return "input";
	}
	*/
	@RequestMapping(value = "/input")
	public String displayInput() {
		return "input";
	}
	
	@GetMapping("/check")
	 public String displayView(@PathVariable Long id, Model model) {
		return "check";
	}
	@PostMapping("/check")
	public String output1(
		@RequestParam String name, String name_sub, String gender, String hobby, String comment,
		Model model) {
		model.addAttribute("name", name);
		model.addAttribute("name_sub", name_sub);
		model.addAttribute("gender", gender);
		model.addAttribute("hobby", hobby);
		model.addAttribute("comment", comment);
		return "check";
	}
}
