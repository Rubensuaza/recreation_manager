package co.edu.recreationmanager.service.impl;

import co.edu.recreationmanager.command.HabitacionCommand;
import co.edu.recreationmanager.factory.HabitacionFactory;
import co.edu.recreationmanager.repository.HabitacionRepository;
import co.edu.recreationmanager.service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HabitacionServiceImpl implements HabitacionService {

    @Autowired
    private HabitacionFactory habitacionFactory;

    @Autowired
    private HabitacionRepository habitacionRepository;


    @Override
    public List<HabitacionCommand> findAll() {
        return habitacionFactory.entityToCommand(habitacionRepository.findAll());
    }

    @Override
    public HabitacionCommand findById(int idHabitacio) {
        return habitacionFactory.habitacionEntityToCommand(habitacionRepository.findById(idHabitacio).orElse(null));
    }
}
