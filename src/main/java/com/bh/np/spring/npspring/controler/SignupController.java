//package com.bh.np.spring.npspring.controler;
//
//import com.bh.np.spring.npspring.commands.UserCommand;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//@Deprecated
//@Controller
////@RequestMapping("/signup")
//public class SignupController {
//
//    private static Log log = LogFactory.getLog(SignupController.class);
//
//    @RequestMapping(value = "/signup", method = RequestMethod.POST)
//    public String doSignUp(@Validated @ModelAttribute("user") UserCommand user, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) return "signup";
//
//        log.info("Email: " + user.getEmail() +
//                " Name: " + user.getName() +
//                " Password: " + user.getPassword());
//
//        return "redirect:/";
//    }
//
//    @RequestMapping(value = "/signup", method = RequestMethod.GET)
////    @GetMapping
//    public String getSignup(Model model) {
//
//        model.addAttribute("user", new UserCommand());
//
//        return "signup";
//    }
//
//
//}
