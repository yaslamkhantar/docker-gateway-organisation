package elmoukhantar.yass.servicecustomer.dto;

import elmoukhantar.yass.servicecustomer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customerrepository extends JpaRepository<Customer,String> {

    Customer findByCin(String cin);
}
