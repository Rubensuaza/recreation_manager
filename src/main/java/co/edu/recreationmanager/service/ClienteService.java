package co.edu.recreationmanager.service;

import co.edu.recreationmanager.command.ClienteCommand;

import java.util.List;

public interface ClienteService {

    List<ClienteCommand> findAll();
    ClienteCommand findById(int idCliente);

}
