package signupform.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import signupform.demo.entity.User;
import signupform.demo.service.UserService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private UserService service;

	@Override
	public void run(String... args) throws Exception {

		User u1 = User.builder()
				.username("renzothenoob")
				.password("hatdog123")
				.build();

		service.saveUser(u1);
	}
}
