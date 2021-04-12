package co.edu.recreationmanager.factory;

import co.edu.recreationmanager.command.ReservaCommand;
import co.edu.recreationmanager.entity.HabitacionEntity;
import co.edu.recreationmanager.entity.ReservaEntity;
import co.edu.recreationmanager.service.ClienteService;
import co.edu.recreationmanager.service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReservaFactory {
    @Autowired
    private HabitacionService habitacionService;

    @Autowired
    private ClienteService clienteService;

    public List<ReservaCommand> entityToCommand(List<ReservaEntity> reservaEntityList){
        List<ReservaCommand> reservaCommandList=new ArrayList<>();
        reservaEntityList.forEach(reserva->reservaCommandList.add(entityToCommand(reserva)));
        return reservaCommandList;
    }

    public ReservaCommand reservaEntityToCommand(ReservaEntity reservaEntity){
        ReservaCommand reservaCommand=entityToCommand(reservaEntity);
        return reservaCommand;
    }
    private ReservaCommand entityToCommand(ReservaEntity reservaEntity){
        ReservaCommand reservaCommand=new ReservaCommand();
        reservaCommand.setIdReserva(reservaEntity.getIdReserva());
        reservaCommand.setFechaInicio(reservaEntity.getFechaInicio());
        reservaCommand.setFechaFin(reservaEntity.getFechaFin());
        reservaCommand.setCliente(clienteService.findById(reservaEntity.getIdCliente()));
        reservaCommand.setHabitacion(habitacionService.findById(reservaEntity.getIdHabitacion()));
        reservaCommand.setNumeroPersonas(reservaEntity.getNumeroPersonas());
        reservaCommand.setActiva(reservaEntity.getActiva());

        return reservaCommand;
    }
}
