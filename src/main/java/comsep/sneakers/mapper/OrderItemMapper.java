package comsep.sneakers.mapper;

import comsep.sneakers.model.OrderItem;
import comsep.sneakers.model.dto.OrderItemDTO;
import org.mapstruct.Mapper;

@Mapper
public interface OrderItemMapper {
    OrderItemDTO toDto(OrderItem orderItem);
    OrderItem toEntity(OrderItemDTO orderItemDTO);
}
