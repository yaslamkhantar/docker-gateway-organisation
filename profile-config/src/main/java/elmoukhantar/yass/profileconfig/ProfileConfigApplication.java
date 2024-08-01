package elmoukhantar.yass.profileconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProfileConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfileConfigApplication.class, args);
    }

}
