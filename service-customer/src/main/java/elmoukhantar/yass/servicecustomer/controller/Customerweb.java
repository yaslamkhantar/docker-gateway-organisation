package elmoukhantar.yass.servicecustomer.controller;

import elmoukhantar.yass.servicecustomer.dto.Customerrepository;
import elmoukhantar.yass.servicecustomer.entity.Customer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest1")
@AllArgsConstructor
public class Customerweb {
    private Customerrepository customerrepository;



    @GetMapping("/{cin}")
    public Customer findCustomerBycin(@PathVariable String cin) {

        return customerrepository.findByCin(cin);
    }
    @GetMapping("/customers")
    public List<Customer> findlist(){
        return customerrepository.findAll();
    }
}
