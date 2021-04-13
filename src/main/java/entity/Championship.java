package entity;
import lombok.*;
import javax.persistence.*;
@Entity
@Table(name = "championship")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Championship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 75)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sport_id")
    private SportType sportType;
}
