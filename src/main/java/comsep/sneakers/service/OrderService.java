package comsep.sneakers.service;

import comsep.sneakers.model.dto.OrderDTO;
import java.util.List;

public interface OrderService {
    OrderDTO placeOrder(OrderDTO orderDTO);
    OrderDTO getOrderById(Long id);
    List<OrderDTO> getOrdersByUserId(Long userId);
    void cancelOrder(Long id);
}
