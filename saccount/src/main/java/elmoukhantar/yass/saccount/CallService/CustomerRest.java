package elmoukhantar.yass.saccount.CallService;


import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import elmoukhantar.yass.saccount.temmplate.Customer;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-customer")
public interface CustomerRest {
    @GetMapping("/rest1/{cin}")
    @CircuitBreaker(name = "customerservice",fallbackMethod = "getcustomer")
    Customer getCustomer(@PathVariable String cin);

    default Customer getcustomer(String cin,Exception exception){
        Customer customer = new Customer();
        customer.setCin(cin);
        customer.setId("aaaa");
        customer.setName("not ava");
        customer.setEmail("not ava");
        return customer;
    }



}
