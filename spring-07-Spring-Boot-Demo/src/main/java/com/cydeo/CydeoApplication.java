package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CydeoApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ConfigurableApplicationContext context = SpringApplication.run(CydeoApplication.class, args);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
        commentService.printConfigData();
        commentService.printDbConfigData();
    }

}
