package pers.ditto.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author OrangeCH3
 * @create 2021-06-02 21:26
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello,OrangeCH3!";
    }

}
