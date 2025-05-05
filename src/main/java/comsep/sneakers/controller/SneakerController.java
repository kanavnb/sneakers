package comsep.sneakers.controller;

import comsep.sneakers.model.dto.SneakerDTO;
import comsep.sneakers.service.SneakerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/sneakers")
public class SneakerController {
    private final SneakerService sneakerService;

    @PostMapping("/create")
    public SneakerDTO addSneaker(@RequestBody SneakerDTO sneakerDTO) {
        return sneakerService.addSneaker(sneakerDTO);
    }

    @GetMapping("/get/{id}")
    public SneakerDTO getSneakerById(@PathVariable Long id) {
        return sneakerService.getSneakerById(id);
    }

    @GetMapping("/get/all")
    public List<SneakerDTO> getAllSneakers() {
        return sneakerService.getAllSneakers();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSneaker(@PathVariable Long id) {
        sneakerService.deleteSneaker(id);
    }
}
