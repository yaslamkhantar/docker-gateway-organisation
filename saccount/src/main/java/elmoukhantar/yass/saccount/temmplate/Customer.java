package elmoukhantar.yass.saccount.temmplate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {
    private String id;
    private String cin;
    private String name;
    private String email;
}
