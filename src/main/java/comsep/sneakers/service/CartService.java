package comsep.sneakers.service;

import comsep.sneakers.model.dto.CartItemDTO;
import java.util.List;

public interface CartService {
    CartItemDTO addToCart(CartItemDTO cartItemDTO);
    void removeFromCart(Long cartItemId);
    List<CartItemDTO> getCartItems(Long userId);
    void clearCart(Long userId);
}
