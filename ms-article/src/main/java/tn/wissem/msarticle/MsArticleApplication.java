package tn.wissem.msarticle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsArticleApplication.class, args);
    }

}
