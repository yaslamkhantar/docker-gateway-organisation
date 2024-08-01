package elmoukhantar.yass.servicecustomer.testprofiles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="global.params")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Globalconfig {
    private int aa;
    private int bb;
}
