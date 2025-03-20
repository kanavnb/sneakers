package comsep.sneakers.controller;

import comsep.sneakers.model.dto.CartItemDTO;
import comsep.sneakers.service.CartService;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/cart")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/create")
    public CartItemDTO addToCart(@RequestBody CartItemDTO cartItemDTO) {
        return cartService.addToCart(cartItemDTO);
    }

    @DeleteMapping("/remove{id}")
    public void removeFromCart(@PathVariable Long id) {
        cartService.removeFromCart(id);
    }

    @GetMapping("/get{userId}")
    public List<CartItemDTO> getCartItems(@PathVariable Long userId) {
        return cartService.getCartItems(userId);
    }

    @DeleteMapping("/clear/{userId}")
    public void clearCart(@PathVariable Long userId) {
        cartService.clearCart(userId);
    }
}
