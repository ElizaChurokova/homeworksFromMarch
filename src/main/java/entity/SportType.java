package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "sport_types")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class SportType {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name", length = 55)
    private String name;


}
