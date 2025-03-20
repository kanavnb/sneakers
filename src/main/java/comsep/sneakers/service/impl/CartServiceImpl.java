package comsep.sneakers.service.impl;

import comsep.sneakers.mapper.CartItemMapper;
import comsep.sneakers.model.CartItem;
import comsep.sneakers.model.dto.CartItemDTO;
import comsep.sneakers.repository.CartItemRepository;
import comsep.sneakers.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CartServiceImpl implements CartService {
    private final CartItemRepository cartItemRepository;
    private final CartItemMapper cartItemMapper;



    @Override
    public CartItemDTO addToCart(CartItemDTO cartItemDTO) {
        CartItem cartItem = cartItemMapper.toEntity(cartItemDTO);
        cartItem = cartItemRepository.save(cartItem);
        return cartItemMapper.toDto(cartItem);
    }

    @Override
    public void removeFromCart(Long cartItemId) {
        cartItemRepository.deleteById(cartItemId);
    }

    @Override
    public List<CartItemDTO> getCartItems(Long userId) {
        return cartItemRepository.findByUserId(userId)
                .stream()
                .map(cartItemMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void clearCart(Long userId) {
        cartItemRepository.deleteByUserId(userId);
    }
}
