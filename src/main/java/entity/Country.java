package entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Country {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name", length = 55)
    private String name;
}
