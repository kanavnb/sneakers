package comsep.sneakers.mapper;

import comsep.sneakers.model.OrderItem;
import comsep.sneakers.model.dto.OrderItemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderItemMapper {
    OrderItemDTO toDto(OrderItem orderItem);
    OrderItem toEntity(OrderItemDTO orderItemDTO);
}
