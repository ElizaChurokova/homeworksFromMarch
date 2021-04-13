package entity;
import lombok.*;
import javax.persistence.*;
@Entity
@Table(name = "team")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 55)
    private String name;
    @Column(name = "logo_address", length = 55)
    private String logoAddress;
    @Column (name = "official_site")
    private String officialSite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sport_id")
    private SportType sportTypes;

}
