package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Klk");
    }

    /*@RequestMapping("/")
    public String sayKlk()
    {
        return "Práctica Barcamp Hecha Por Roselin Sosa y Jean Lemoine";
    }*/

}
