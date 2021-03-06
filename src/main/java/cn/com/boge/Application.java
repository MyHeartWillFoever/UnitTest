package cn.com.boge;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("cn.com.*")
public class Application {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
 
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
