package co.edu.recreationmanager.command;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@Getter
@NoArgsConstructor
public class ClienteCommand {


    private Integer idCliente;
    private TipoDocumentoCommand tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellido;
    private String numeroTelefono;
    private String direccion;
    private String correo;
    private String usuario;
    private String contraseña;
    private char activo;
}
