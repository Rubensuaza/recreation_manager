package co.edu.recreationmanager.controller;

import co.edu.recreationmanager.command.HabitacionCommand;
import co.edu.recreationmanager.service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/habitacion")
public class HabitacionController {

    @Autowired
    private HabitacionService habitacionService;

    @GetMapping("/habitaciones")
    public List<HabitacionCommand> findAll(){return habitacionService.findAll();}

    @GetMapping("/{id}/habitacion")
    public HabitacionCommand findById(@PathVariable int id){return habitacionService.findById(id);}
}
