package co.edu.recreationmanager.service.impl;

import co.edu.recreationmanager.command.TipoHabitacionCommand;
import co.edu.recreationmanager.factory.TipoHabitacionFactory;
import co.edu.recreationmanager.repository.TipoHabitacionRepository;
import co.edu.recreationmanager.service.TipoHabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoHabitacionServiceImpl implements TipoHabitacionService {
    @Autowired
    private TipoHabitacionRepository tipoHabitacionRepository;

    @Autowired
    private TipoHabitacionFactory tipoHabitacionFactor;

    @Override
    public List<TipoHabitacionCommand> findAll() {
        return tipoHabitacionFactor.entityToCommand(tipoHabitacionRepository.findAll());
    }

    @Override
    public TipoHabitacionCommand findById(int idtipoHabitacion) {
        return tipoHabitacionFactor.tipoHabitacionEntityToCommand(tipoHabitacionRepository.findById(idtipoHabitacion).orElse(null));
    }
}
