package mk.ukim.finki.webpaud1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class WebPaud1Application {

    public static void main(String[] args) {
        SpringApplication.run(WebPaud1Application.class, args);
    }

}
