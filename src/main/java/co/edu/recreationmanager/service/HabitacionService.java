package co.edu.recreationmanager.service;

import co.edu.recreationmanager.command.HabitacionCommand;

import java.util.List;

public interface HabitacionService {

    List<HabitacionCommand> findAll();
    HabitacionCommand findById(int idHabitacio);
}
