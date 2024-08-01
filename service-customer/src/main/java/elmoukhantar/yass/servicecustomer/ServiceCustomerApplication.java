package elmoukhantar.yass.servicecustomer;

import elmoukhantar.yass.servicecustomer.dto.Customerrepository;
import elmoukhantar.yass.servicecustomer.entity.Customer;
import elmoukhantar.yass.servicecustomer.testprofiles.Globalconfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
@EnableConfigurationProperties(Globalconfig.class)

public class ServiceCustomerApplication {



    public static void main(String[] args) {
        SpringApplication.run(ServiceCustomerApplication.class, args);
    }

    @Bean
    CommandLineRunner start(Customerrepository customerrepository){
        return args -> {
            customerrepository.save(new Customer(UUID.randomUUID().toString(),"MOPAA","yassine", "yassine@gmail.com"));
            customerrepository.save(new Customer(UUID.randomUUID().toString(),"MfghA","hajar", "hajar@gmail.com"));
            customerrepository.save(new Customer(UUID.randomUUID().toString(),"btuj","khalid", "khalid@gmail.com"));
            customerrepository.save(new Customer(UUID.randomUUID().toString(),"sfgu","souad", "souad@gmail.com"));
            //http://localhost:8081/actuator/refresh



        };
    }

}
