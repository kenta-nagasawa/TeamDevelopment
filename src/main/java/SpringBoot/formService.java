package SpringBoot;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class formService {
	@Autowired
	private formRepository repository;
	
	private String name;
	private String name_sub;
	private String gender;
	private String hobby;
	private String comment;
	

	/**
	 * ユーザー情報 新規登録
	 * @param user ユーザー情報
	 */
	public List<formEntity> searchAll() {
		    return repository.findAll();
	}
	
	public String outputCheck(String name, String name_sub, String gender, String hobby, String comment,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("name_sub", name_sub);
		model.addAttribute("gender", gender);
		model.addAttribute("hobby", hobby);
		model.addAttribute("comment", comment);
		this.name = name;
		this.name_sub = name_sub;
		this.gender = gender;
		this.hobby = hobby;
		this.comment = comment;
		return "check";
	}
	
	public String outputDone(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("name_sub", name_sub);
		model.addAttribute("gender", gender);
		model.addAttribute("hobby", hobby);
		model.addAttribute("comment", comment);
		return "done";
	}
}
