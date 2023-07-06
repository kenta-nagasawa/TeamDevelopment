package SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 画面からHTTPリクエストを受け付けるため@Controllerアノテーションを付与する\s
@Controller
public class formController {

	@Autowired
	private formService service;
	
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
		model.addAttribute("formRequest", new formRequest());
		return "input";
	}
	@GetMapping(value = "/login")
	public String displayLogin(Model model) {
		model.addAttribute("formRequest", new formRequest());
		return "login";
	}

	@PostMapping(value = "/user/create")
	public String create(@Validated @ModelAttribute formRequest formRequest, BindingResult result,
			@RequestParam String name, String name_sub, String gender, String hobby, String comment, Model model) {
		if (result.hasErrors()) {
			for (ObjectError error : result.getAllErrors()) {
				model.addAttribute("error", error);
			}
			return "input";
		}
		return service.outputCheck(name, name_sub, gender, hobby, comment, model);
		
	}
	@PostMapping(value = "/user/done")
	public String showDone(Model model) {
		return service.outputDone(model);
	}
}
