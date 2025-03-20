package comsep.sneakers.model.dto;

import lombok.Data;

@Data
public class SneakerDTO {
    private Long id;
    private String brand;
    private String model;
    private double price;
}
