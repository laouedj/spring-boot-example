package com.home.tutorial.test_spring_boot_tomcat.tomcat.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
 @RequestMapping("/home")
 public String home() {
  return "index";
 }
}
