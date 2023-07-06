package SpringBoot;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class formService {
	@Autowired
	private formRepository repository;

	/**
	 * ユーザー情報 新規登録
	 * @param user ユーザー情報
	 */
	public List<formEntity> searchAll() {
		    return repository.findAll();
	}
	
	public String output(String name, String name_sub, String gender, String hobby, String comment,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("name_sub", name_sub);
		model.addAttribute("gender", gender);
		model.addAttribute("hobby", hobby);
		model.addAttribute("comment", comment);
		return "check";
	}
}
