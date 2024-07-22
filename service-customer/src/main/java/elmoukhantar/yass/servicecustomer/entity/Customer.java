package elmoukhantar.yass.servicecustomer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Customer {
    @Id
    private String id;
    private String cin;
    private String name;
    private String email;
}
