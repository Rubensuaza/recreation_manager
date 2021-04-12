package co.edu.recreationmanager.factory;

import co.edu.recreationmanager.command.ClienteCommand;
import co.edu.recreationmanager.entity.ClienteEntity;
import co.edu.recreationmanager.service.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



@Component
public class ClienteFactory {
    @Autowired
    private TipoDocumentoService tipoDocumentoService;

    public List<ClienteCommand> entityToCommand(List<ClienteEntity> listaCLienteEntity){
        List<ClienteCommand> clienteCommandList=new ArrayList<>();
        listaCLienteEntity.forEach(cliente->clienteCommandList.add(entityToCommand(cliente)));
        return clienteCommandList;
    }

    public ClienteCommand clienteEntityToCommand(ClienteEntity clienteEntity){
        ClienteCommand clienteCommand=entityToCommand(clienteEntity);
        return  clienteCommand;
    }


    private ClienteCommand entityToCommand(ClienteEntity clienteEntity){
        ClienteCommand clienteCommand=new ClienteCommand();
        clienteCommand.setIdCliente(clienteEntity.getIdCliente());
        clienteCommand.setTipoDocumento(tipoDocumentoService.finById(clienteEntity.getIdTipoDocumento()));
        clienteCommand.setNumeroDocumento(clienteEntity.getNumeroDocumento());
        clienteCommand.setNombre(clienteEntity.getNombre());
        clienteCommand.setApellido(clienteEntity.getApellido());
        clienteCommand.setNumeroTelefono(clienteEntity.getNumeroTelefono());
        clienteCommand.setDireccion(clienteEntity.getDireccion());
        clienteCommand.setCorreo(clienteEntity.getCorreo());
        clienteCommand.setUsuario(clienteEntity.getUsuario());
        clienteCommand.setContraseña(clienteEntity.getContraseña());
        clienteCommand.setActivo(clienteEntity.getActivo());
        return clienteCommand;
    }

}
