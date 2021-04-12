package co.edu.recreationmanager.controller;

import co.edu.recreationmanager.command.TipoDocumentoCommand;
import co.edu.recreationmanager.service.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo-documento")
public class TipoDocumentoController {
    @Autowired
    private TipoDocumentoService tipoDocumentoService;

    @GetMapping("/tipos-documento")
    public List<TipoDocumentoCommand> findAll(){return tipoDocumentoService.findAll();}

    @GetMapping("/{id}/tipo-documento")
    public TipoDocumentoCommand findById(@PathVariable int id){return tipoDocumentoService.finById(id);}
}
