package com.gourianova.binocularvision.controller;

import com.gourianova.binocularvision.model.User;
import com.gourianova.binocularvision.model.UserRole;
import com.gourianova.binocularvision.repo.UserRepo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class AddUserController {
    private static final AtomicLong counter = new AtomicLong();
    private UserRepo userRepo;

    public UserRepo getUserRepo() {
        return userRepo;
    }

    public void setUserRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @RequestMapping(value = "/user", method = RequestMethod.GET)

    public ModelAndView user() {


        return new ModelAndView("user", "confirmUser",new User());
    }

    @RequestMapping(value = "/views/jsp/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("SpringWeb") User user,
                          ModelMap model) {
        model.addAttribute("first_name", user.getFirst_name());
        model.addAttribute("last_name", user.getLast_name());
        model.addAttribute("login", user.getLogin());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("balance", user.getBalance());
        user.setCreate_time(LocalDate.now());
        user.setId(counter.incrementAndGet());
        user.setRoleId(2);
               this.userRepo.save(user);
               return "/views/jsp/confirm.jsp";
    }

@Bean
    CommandLineRunner commandLineRunner(UserRepo userRepo) {
        return args -> {
            this.userRepo=userRepo;
        };

    }
}