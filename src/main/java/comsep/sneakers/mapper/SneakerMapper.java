package comsep.sneakers.mapper;

import comsep.sneakers.model.Sneaker;
import comsep.sneakers.model.dto.SneakerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SneakerMapper {
    SneakerMapper INSTANCE = Mappers.getMapper(SneakerMapper.class);

    SneakerDTO toDto(Sneaker sneaker);
    Sneaker toEntity(SneakerDTO sneakerDTO);
}
