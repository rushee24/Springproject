package com.example.myspringproject.Controller;



import com.example.myspringproject.model.User;
import com.example.myspringproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "userList"; // Create a user list view (e.g., userList.jsp or userList.html)
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "userDetails"; // Create a user details view (e.g., userDetails.jsp or userDetails.html)
    }

    @GetMapping("/register")
    public String registrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration"; // Display the registration form (e.g., registration.jsp or registration.html)
    }

    @PostMapping("/register")
    public String addUser(@ModelAttribute User user) {
        userService.addUser(user);
        return "redirect:/users"; // Redirect to the user list after adding
    }
}
