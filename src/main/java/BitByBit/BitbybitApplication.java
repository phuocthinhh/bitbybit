package BitByBit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "b.Repository")
@EntityScan(basePackages = "b.Model")
public class BitbybitApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitbybitApplication.class, args);
	}

}
