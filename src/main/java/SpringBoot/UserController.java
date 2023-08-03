package SpringBoot;




import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// コントローラー
@Controller
public class UserController {

    // サービス
    @Autowired
    UserService userService;

    // ルーティング
    @GetMapping(value = "/user/search")
    public String displaySearch(Model model) {
        return "index";
    }

    @RequestMapping(value = "/user/id_search", method = RequestMethod.POST)
    public String search(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
        return "index";
    }
}