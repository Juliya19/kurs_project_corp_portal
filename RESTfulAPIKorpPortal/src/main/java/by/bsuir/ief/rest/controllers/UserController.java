package by.bsuir.ief.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Даша on 06.04.2016.
 */
@Controller
@RequestMapping("/usersapi")
public class UserController {

    @RequestMapping(value = "/create")
    public void create()
    {
        System.out.println("Create User!!!");
    }

    @RequestMapping(value = "/delete")
    public void delete()
    {
        System.out.println("complete user delete ");
        System.out.println("Hello Dasha!!");
    }
}