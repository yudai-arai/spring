package demo.login.controller;

import demo.login.domain.model.User;
import demo.login.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    UserService userServise;

    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("contents", "login/home :: home_contents");
        return "login/homeLayout";
    }

    @GetMapping("/userList")
    public String getUserList(Model model) {
        model.addAttribute("contents", "login/userList :: userList_contents");

        List<User> userList = userServise.selectMany();

        model.addAttribute("userList", userList);

        int count = userServise.count();
        model.addAttribute("userListCount", count);

        return "login/homeLayout";
    }

    @PostMapping("/logout")
    public String postLogout() {
        return "redirect:/login";
    }

    @GetMapping("/userList/csv")
    public String getUserListCsv(Model model) {
        return getUserList(model);
    }
}
