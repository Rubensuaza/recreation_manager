package co.edu.recreationmanager.controller;

import co.edu.recreationmanager.command.ReservaCommand;
import co.edu.recreationmanager.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    @GetMapping("/reservas")
    public List<ReservaCommand> findAll(){return reservaService.findAll();}

    @GetMapping("/{id}/reserva")
    public ReservaCommand findById(@PathVariable int id){return reservaService.findById(id);}
}
