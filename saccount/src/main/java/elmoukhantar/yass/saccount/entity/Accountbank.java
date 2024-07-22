package elmoukhantar.yass.saccount.entity;

import elmoukhantar.yass.saccount.enumeration.Atype;
import elmoukhantar.yass.saccount.temmplate.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Accountbank {
    @Id
    @GeneratedValue

    private Long acoountid;
    private double balance;
    private LocalDate creatat;
    private String currency;
    private Atype type;
    @Transient
    private Customer customer;
    private String customercin;

}
