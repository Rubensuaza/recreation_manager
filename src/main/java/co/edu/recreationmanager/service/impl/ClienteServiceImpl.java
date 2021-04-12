package co.edu.recreationmanager.service.impl;

import co.edu.recreationmanager.command.ClienteCommand;
import co.edu.recreationmanager.factory.ClienteFactory;
import co.edu.recreationmanager.repository.ClienteRepository;
import co.edu.recreationmanager.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteFactory clienteFactory;


    @Override
    public List<ClienteCommand> findAll() {
        return clienteFactory.entityToCommand(clienteRepository.findAll());
    }

    @Override
    public ClienteCommand findById(int idCliente) {
        return clienteFactory.clienteEntityToCommand(clienteRepository.findById(idCliente).orElse(null));
    }


}
