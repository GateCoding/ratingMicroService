package ma.emsi.service_appreils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceAppreilsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAppreilsApplication.class, args);
	}

}
