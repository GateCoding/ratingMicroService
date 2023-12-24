package ma.emsi.server_sh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerShApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerShApplication.class, args);
	}

}
