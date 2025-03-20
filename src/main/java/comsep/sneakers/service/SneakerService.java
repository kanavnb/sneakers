package comsep.sneakers.service;

import comsep.sneakers.model.dto.SneakerDTO;
import java.util.List;

public interface SneakerService {
    SneakerDTO addSneaker(SneakerDTO sneakerDTO);
    SneakerDTO getSneakerById(Long id);
    List<SneakerDTO> getAllSneakers();
    void deleteSneaker(Long id);
}
