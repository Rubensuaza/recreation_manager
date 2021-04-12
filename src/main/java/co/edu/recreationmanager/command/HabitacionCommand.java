package co.edu.recreationmanager.command;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class HabitacionCommand {

    private Integer idHabitacion;
    private TipoHabitacionCommand tipoHabitacion;
    private String nombre;
    private char disponible;
}
