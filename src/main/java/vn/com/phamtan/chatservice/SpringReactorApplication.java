package vn.com.phamtan.chatservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoAuditing
@EnableMongoRepositories(basePackages = {"vn.com.phamtan.chatservice.domain","vn.com.phamtan.chatservice.repo"})
public class SpringReactorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringReactorApplication.class, args);
    }

}
