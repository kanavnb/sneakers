package comsep.sneakers.model;

import jakarta.persistence.*;
import lombok.*;
@Data
@Entity
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "sneaker_id")
    private Sneaker sneaker;

    private int quantity;
}
