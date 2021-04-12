package co.edu.recreationmanager.service;

import co.edu.recreationmanager.command.ReservaCommand;

import java.util.List;

public interface ReservaService {

    List<ReservaCommand> findAll();
    ReservaCommand findById(int idReserva);



}
