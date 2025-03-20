package comsep.sneakers.model.dto;

import lombok.Data;

@Data
public class OrderItemDTO {
    private Long id;
    private Long sneakerId;
    private int quantity;
    private double price;
}
