package co.edu.recreationmanager.command;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class TipoHabitacionCommand {

    private Integer idTipoHabitacion;
    private String nombreHabitacion;
    private int numeroPersonas;
    private double precioHabitacion;

}
