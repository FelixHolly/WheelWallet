package at.hollndonner.wheelwallet.controller;

import at.hollndonner.wheelwallet.model.Mechanic;
import at.hollndonner.wheelwallet.service.MechanicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MechanicController {

    private final MechanicService mechanicService;

    public MechanicController(MechanicService mechanicService) {
        this.mechanicService = mechanicService;
    }

    @PostMapping("/mechanics")
    public ResponseEntity<Mechanic> createMechanic(@RequestBody Mechanic mechanic) {
        Mechanic createdMechanic = mechanicService.createMechanic(mechanic);
        return new ResponseEntity<>(createdMechanic, HttpStatus.CREATED);
    }

    @GetMapping("/mechanics/{id}")
    public ResponseEntity<Mechanic> getMechanicById(@PathVariable Long id) {
        Mechanic mechanic = mechanicService.getMechanicById(id);
        return new ResponseEntity<>(mechanic, HttpStatus.OK);
    }

}
