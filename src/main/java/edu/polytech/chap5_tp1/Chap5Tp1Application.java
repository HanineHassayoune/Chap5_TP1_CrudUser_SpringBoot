package edu.polytech.chap5_tp1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Chap5Tp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Chap5Tp1Application.class, args);
    }

    @Bean
    public CommandLineRunner run() throws Exception
    {return args -> {
       // User user = new User(1,"user1","user1@gmail.com","123456789");
        //System.out.println("User"+ user);
    };

    }
    }


