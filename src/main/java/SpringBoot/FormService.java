package SpringBoot;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class FormService {
	@Autowired
	private FormRepository repository;

	/**
	   * ユーザー情報 新規登録
	   * @param user ユーザー情報
	   */
    public void regist(FormRequest request, Model model) {
    	Date now = new Date();
    	FormEntity entity  = new FormEntity();
    	
    	entity.setUser_id(2);
	    entity.setName(request.getName());
	    entity.setKana(request.getKana());
	    entity.setGender(request.getGender());
	    entity.setHobby(request.getHobby());
	    entity.setWord(request.getWord());
	    entity.setCreated_at(now);
	    entity.setUpdated_at(now);
	    
	    model.addAttribute("introduction_id", entity.getIntroduction_id());
		model.addAttribute("name", entity.getName());
		model.addAttribute("kana", entity.getKana());
		model.addAttribute("gender", entity.getGender());
		model.addAttribute("hobby", entity.getHobby());
		model.addAttribute("word", entity.getWord());
		
	    repository.save(entity);
	  }
	
}
