package co.edu.recreationmanager.service;

import co.edu.recreationmanager.command.TipoDocumentoCommand;

import java.util.List;

public interface TipoDocumentoService {
    List<TipoDocumentoCommand> findAll();
    TipoDocumentoCommand finById(int idTipoDocumneto);
}
