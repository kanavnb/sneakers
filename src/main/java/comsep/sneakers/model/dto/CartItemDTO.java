package comsep.sneakers.model.dto;

import lombok.Data;

@Data
public class CartItemDTO {
    private Long id;
    private Long sneakerId;
    private int quantity;
}
