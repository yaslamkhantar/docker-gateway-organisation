package elmoukhantar.yass.saccount;

import elmoukhantar.yass.saccount.dto.Accountrepository;
import elmoukhantar.yass.saccount.entity.Accountbank;
import elmoukhantar.yass.saccount.enumeration.Atype;
import elmoukhantar.yass.saccount.temmplate.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class SaccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaccountApplication.class, args);
    }

    @Bean
    CommandLineRunner start(Accountrepository accountrepository){
        return args -> {
            Customer customer1 = new Customer();
            accountrepository.save(new Accountbank(1L,98000, LocalDate.now(),"MAD", Atype.COMPTE_DECOUVERT,null,"ATYP"));
            accountrepository.save(new Accountbank(2L,69999, LocalDate.now(),"JPY", Atype.COMPTE_DOUBLE,null,"PPP"));
            accountrepository.save(new Accountbank(3L,9987, LocalDate.now(),"EUR", Atype.COMPTE_EPARGNE,null,"JKLM"));
            accountrepository.save(new Accountbank(4L,110000, LocalDate.now(),"MAD", Atype.COMPTE_DECOUVERT,null,"NHUY"));
    };
    }

}
