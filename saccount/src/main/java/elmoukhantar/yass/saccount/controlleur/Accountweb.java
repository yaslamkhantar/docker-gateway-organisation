package elmoukhantar.yass.saccount.controlleur;

import elmoukhantar.yass.saccount.CallService.CustomerRest;
import elmoukhantar.yass.saccount.dto.Accountrepository;
import elmoukhantar.yass.saccount.entity.Accountbank;
import elmoukhantar.yass.saccount.temmplate.Customer;
import lombok.AllArgsConstructor;
import lombok.CustomLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api2")
@AllArgsConstructor
public class Accountweb {
    private Accountrepository accountrepository;

    private CustomerRest customerrest;

    @GetMapping("/banks")
    public List<Accountbank> findallbank(){
        return accountrepository.findAll();
    }
    @GetMapping("/bank/{id}")
    public Accountbank findbankbyid(@PathVariable Long id){
        Accountbank accountbank= accountrepository.findById(id).get();
        Customer customer=customerrest.getCustomer(accountbank.getCustomercin());
        accountbank.setCustomer(customer);
        return accountbank;

    }
}
