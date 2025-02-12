package in.sushmita;

import in.sushmita.service.EmpService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaTxApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context =
		SpringApplication.run(DataJpaTxApplication.class, args);

		EmpService empService = context.getBean(EmpService.class);

		empService.saveData();
	}

}
