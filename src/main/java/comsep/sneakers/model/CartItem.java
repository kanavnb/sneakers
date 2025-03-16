package comsep.sneakers.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Entity
@Service
@Table(name = "cart_tb")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String users;
    private String products;
    private String quantity;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "sneaker_id", nullable = false)
    private Sneakers sneaker;
}
