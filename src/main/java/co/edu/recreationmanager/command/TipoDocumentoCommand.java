package co.edu.recreationmanager.command;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TipoDocumentoCommand {

    private Integer idTipoDocumento;
    private String nombre;
    private String descripcion;
}
