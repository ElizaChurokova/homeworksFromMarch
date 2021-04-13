package entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza_box")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class PizzaBox {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "color", length = 55)
    private String color;
    @Column(name = "destination_address", length = 55)
    private String destinationAddress;

}
