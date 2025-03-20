package comsep.sneakers.mapper;

import comsep.sneakers.model.Order;
import comsep.sneakers.model.dto.OrderDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDTO toDto(Order order);
    Order toEntity(OrderDTO orderDTO);
}
