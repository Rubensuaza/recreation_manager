package co.edu.recreationmanager.service.impl;

import co.edu.recreationmanager.command.ReservaCommand;
import co.edu.recreationmanager.factory.ReservaFactory;
import co.edu.recreationmanager.repository.ReservaRepository;
import co.edu.recreationmanager.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private ReservaFactory reservaFactory;


    @Override
    public List<ReservaCommand> findAll() {
        return reservaFactory.entityToCommand(reservaRepository.findAll());
    }

    @Override
    public ReservaCommand findById(int idReserva) {
        return reservaFactory.reservaEntityToCommand(reservaRepository.findById(idReserva).orElse(null));
    }
}
