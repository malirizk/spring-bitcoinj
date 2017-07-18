package mileschet.bitcoin.springbitcoinj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBitcoinjApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBitcoinjApplication.class, args);
	}
}
