package comsep.sneakers.service.impl;

import comsep.sneakers.mapper.SneakerMapper;
import comsep.sneakers.model.Sneaker;
import comsep.sneakers.model.dto.SneakerDTO;
import comsep.sneakers.repository.SneakersRepository;
import comsep.sneakers.service.SneakerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class SneakerServiceImpl implements SneakerService {
    private final SneakersRepository sneakersRepository;
    private final SneakerMapper sneakerMapper = SneakerMapper.INSTANCE;


    @Override
    public SneakerDTO addSneaker(SneakerDTO sneakerDTO) {
        Sneaker sneaker = sneakerMapper.toEntity(sneakerDTO);
        sneaker = sneakersRepository.save(sneaker);
        return sneakerMapper.toDto(sneaker);
    }

    @Override
    public SneakerDTO getSneakerById(Long id) {
        return sneakersRepository.findById(id)
                .map(sneakerMapper::toDto)
                .orElse(null);
    }

    @Override
    public List<SneakerDTO> getAllSneakers() {
        return sneakersRepository.findAll()
                .stream()
                .map(sneakerMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteSneaker(Long id) {
        sneakersRepository.deleteById(id);
    }
}
