package co.edu.recreationmanager.factory;

import co.edu.recreationmanager.command.TipoHabitacionCommand;
import co.edu.recreationmanager.entity.TipoHabitacionEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TipoHabitacionFactory {

    public List<TipoHabitacionCommand> entityToCommand(List<TipoHabitacionEntity> tipoHabitacionEntityList){
        List<TipoHabitacionCommand> tipoHabitacionCommandList= new ArrayList<>();
        tipoHabitacionEntityList.forEach(tipoHabitacion->tipoHabitacionCommandList.add(entityToCommand(tipoHabitacion)));
        return tipoHabitacionCommandList;
    }



    private TipoHabitacionCommand entityToCommand(TipoHabitacionEntity tipoHabitacionEntity){
        TipoHabitacionCommand tipoHabitacionCommand=new TipoHabitacionCommand();
        tipoHabitacionCommand.setIdTipoHabitacion(tipoHabitacionEntity.getIdTipoHabitacion());
        tipoHabitacionCommand.setNombreHabitacion(tipoHabitacionEntity.getNombreHabitacion());
        tipoHabitacionCommand.setNumeroPersonas(tipoHabitacionEntity.getNumeroPersonas());
        tipoHabitacionCommand.setPrecioHabitacion(tipoHabitacionEntity.getPrecioHabitacion());
        return tipoHabitacionCommand;
    }

    public TipoHabitacionCommand tipoHabitacionEntityToCommand(TipoHabitacionEntity tipoHabitacionEntity) {
        return entityToCommand(tipoHabitacionEntity);
    }
}
