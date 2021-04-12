package co.edu.recreationmanager.factory;


import co.edu.recreationmanager.command.HabitacionCommand;
import co.edu.recreationmanager.entity.HabitacionEntity;
import co.edu.recreationmanager.service.TipoHabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HabitacionFactory {
    @Autowired
    private TipoHabitacionService tipoHabitacionService;

    public List<HabitacionCommand> entityToCommand(List<HabitacionEntity> habitacionEntityList){
        List<HabitacionCommand> habitacionCommandList=new ArrayList<>();
        habitacionEntityList.forEach(habitacion->habitacionCommandList.add(entityToCommand(habitacion)));
       return habitacionCommandList;
    }

    public HabitacionCommand habitacionEntityToCommand(HabitacionEntity habitacionEntity){
        HabitacionCommand habitacionCommand=entityToCommand(habitacionEntity);
        return habitacionCommand;
    }
    private HabitacionCommand entityToCommand(HabitacionEntity habitacionEntity){
        HabitacionCommand habitacionCommand=new HabitacionCommand();
        habitacionCommand.setIdHabitacion(habitacionEntity.getIdHabitacion());
        habitacionCommand.setTipoHabitacion(tipoHabitacionService.findById(habitacionEntity.getIdTipoHabitacion()));
        habitacionCommand.setNombre(habitacionEntity.getNombre());
        habitacionCommand.setDisponible(habitacionEntity.getDisponible());
        return habitacionCommand;
    }
}
