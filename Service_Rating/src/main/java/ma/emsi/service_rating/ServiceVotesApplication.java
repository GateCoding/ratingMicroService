package ma.emsi.service_rating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceVotesApplication {


	// Rest Template Bean
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	// Web Client Bean
	// We must add a WebFlux dependency
	@Bean
	public WebClient webClient(){
		return  WebClient.builder().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceVotesApplication.class, args);
	}

}
