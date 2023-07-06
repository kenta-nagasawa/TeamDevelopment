package SpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 画面からHTTPリクエストを受け付けるため@Controllerアノテーションを付与する
@RequestMapping("")
@Controller
public class formController {


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
	private formService service;

	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String displayAdd(Model model) {
		model.addAttribute("formRequest", new formRequest());
		return "input";
	}

	@RequestMapping(value = "/user/create", method = RequestMethod.POST)
	public String create(@Validated @ModelAttribute formRequest formRequest, BindingResult result,
			@RequestParam String name, String name_sub, String gender, String hobby, String comment, Model model) {
		if (result.hasErrors()) {
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("validationError", errorList);
			return "input";
		} else {
			return service.output(name, name_sub, gender, hobby, comment, model);
		}
	}
}
