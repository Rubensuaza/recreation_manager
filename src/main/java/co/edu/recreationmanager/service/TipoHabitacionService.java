package co.edu.recreationmanager.service;

import co.edu.recreationmanager.command.TipoHabitacionCommand;

import java.util.List;

public interface TipoHabitacionService {

    List<TipoHabitacionCommand> findAll();
    TipoHabitacionCommand findById(int idtipoHabitacion);
}
