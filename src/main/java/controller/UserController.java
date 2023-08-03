package controller;

import dto.UserRequest;

@Controller
public class UserController {

    @PostMapping("/user/create")
    
    public String createUser(@Valid @ModelAttribute("userRequest") UserRequest userRequest,
    		
                             BindingResult bindingResult) {
    	
        if (bindingResult.hasErrors()) {
        	
            // バリデーションエラーがある場合は、エラーメッセージを画面に表示する
        	// 入力フォームページのテンプレート名を返す
        	
            return "your-registration-page"; 
        }

        // 登録が成功したらログインページへリダイレクト
        return "redirect:/login"; 
    }
    
    
}


