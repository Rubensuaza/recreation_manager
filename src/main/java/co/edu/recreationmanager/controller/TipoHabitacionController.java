package co.edu.recreationmanager.controller;

import co.edu.recreationmanager.command.TipoHabitacionCommand;
import co.edu.recreationmanager.service.TipoHabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo_habitacion")
public class TipoHabitacionController {
    @Autowired
    private TipoHabitacionService tipoHabitacionService;

    @GetMapping("/tipos_habitacion")
    public List<TipoHabitacionCommand> findAll(){return tipoHabitacionService.findAll();}

    @GetMapping("/{id}/habitacion")
    public TipoHabitacionCommand finbyId(@PathVariable int id){
        return tipoHabitacionService.findById(id);
    }



}
