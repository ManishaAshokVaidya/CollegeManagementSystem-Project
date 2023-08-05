package MyPack.CollegeManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan("MyPack.CollegeManagementSystem.Model")
@ComponentScan(basePackages = "MyPack.CollegeManagementSystem.Security") // Add your package here
public class CollegeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeManagementSystemApplication.class, args);
		
		System.out.println("Ok....");
		
	}
	

}
