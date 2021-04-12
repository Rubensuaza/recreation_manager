package co.edu.recreationmanager.service.impl;

import co.edu.recreationmanager.command.TipoDocumentoCommand;
import co.edu.recreationmanager.factory.TipoDocumentoFactory;
import co.edu.recreationmanager.repository.TipoDocumentoRepository;
import co.edu.recreationmanager.service.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService {
    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Autowired
    private TipoDocumentoFactory tipoDocumentoFactory;

    @Override
    public List<TipoDocumentoCommand> findAll() {
        return tipoDocumentoFactory.entityToCommand(tipoDocumentoRepository.findAll());
    }

    @Override
    public TipoDocumentoCommand finById(int idTipoDocumneto) {
        return tipoDocumentoFactory.tipoDocumentoEntityToCommand(tipoDocumentoRepository.findById(idTipoDocumneto).orElse(null));
    }
}
