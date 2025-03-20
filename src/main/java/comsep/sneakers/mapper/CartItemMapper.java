package comsep.sneakers.mapper;

import comsep.sneakers.model.CartItem;
import comsep.sneakers.model.dto.CartItemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper (componentModel = "spring")
public interface CartItemMapper {
    CartItemMapper INSTANCE = Mappers.getMapper(CartItemMapper.class);

    CartItemDTO toDto(CartItem cartItem);
    CartItem toEntity(CartItemDTO cartItemDTO);
}
