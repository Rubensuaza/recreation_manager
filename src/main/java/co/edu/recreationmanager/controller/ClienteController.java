package co.edu.recreationmanager.controller;

import co.edu.recreationmanager.command.ClienteCommand;
import co.edu.recreationmanager.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/health")
    public String health(){return "funcionando";}


    @GetMapping("/listado")
    public List<ClienteCommand> findAll(){return clienteService.findAll();}

    @GetMapping("/{id}/cliente")
    public ClienteCommand findById(@PathVariable int id){
        return clienteService.findById(id);
    }
}
