package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "follower")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "follower_id", nullable = false)
    private User userFollower;
    @ManyToOne
    @JoinColumn(name = "followed_id", nullable = false)
    private User userFollowed;
}
