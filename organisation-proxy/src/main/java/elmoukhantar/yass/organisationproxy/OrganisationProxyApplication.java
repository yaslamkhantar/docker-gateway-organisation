package elmoukhantar.yass.organisationproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OrganisationProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganisationProxyApplication.class, args);
    }

}
