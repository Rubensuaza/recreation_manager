package co.edu.recreationmanager.factory;

import co.edu.recreationmanager.command.TipoDocumentoCommand;
import co.edu.recreationmanager.entity.TipoDocumentoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TipoDocumentoFactory {

    public List<TipoDocumentoCommand> entityToCommand(List<TipoDocumentoEntity> tipoDocumentoEntityList){
        List<TipoDocumentoCommand> tipoDocumentoCommandList=new ArrayList<>();
        tipoDocumentoEntityList.forEach(tipoDocumento->tipoDocumentoCommandList.add(entityToCommand(tipoDocumento)));
        return tipoDocumentoCommandList;
    }

    public TipoDocumentoCommand tipoDocumentoEntityToCommand(TipoDocumentoEntity tipoDocumentoEntity){
        return entityToCommand(tipoDocumentoEntity);
    }

    private TipoDocumentoCommand entityToCommand(TipoDocumentoEntity tipoDocumentoEntity){
        TipoDocumentoCommand tipoDocumentoCommand=new TipoDocumentoCommand();
        tipoDocumentoCommand.setIdTipoDocumento(tipoDocumentoEntity.getIdTipoDocumento());
        tipoDocumentoCommand.setNombre(tipoDocumentoEntity.getNombre());
        tipoDocumentoCommand.setDescripcion(tipoDocumentoEntity.getDescripcion());
        return tipoDocumentoCommand;
    }
}
