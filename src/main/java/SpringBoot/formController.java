package SpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// 画面からHTTPリクエストを受け付けるため@Controllerアノテーションを付与する
@Controller
public class formController {
	
	@Autowired
	private formService service;
	
    // http://localhost(ポート番号)/sampleにアクセスすると「form.html」が呼ばれる
	@GetMapping(value = "/input")
	public String displayInput(Model model) {
		model.addAttribute("employee", new Employee());
		return "input.html";
	}
	
	@GetMapping("/check")
	 public String displayView(@PathVariable Long id, Model model) {
		return "check";
	}
	
	/*
	 * 一覧表　表示
	 * 
	 */
	@GetMapping (value = "/list")
	public String displayList(Model model) {
		List<user> userlist = formService.searchAll();
		model.addAttribute("id", userlist);
		return "list.html";
	}
	
}
