package elmoukhantar.yass.servicecustomer.testprofiles;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
@RefreshScope
public class Testconfig {
  /*  @Value("${account.params.x}")
    private  int x;

    @Value("${account.params.y}")
   private   int y;
    @GetMapping("/testprofile")
    public Map<String,Integer> getCustomerCount(){
        return Map.of("x--> ",this.x,"y--> ",this.y);
    }*/
    private Globalconfig globalconfig;

    @GetMapping("/globalss")
    public Globalconfig getGlobalconfig() {
        return globalconfig;
    }

}
