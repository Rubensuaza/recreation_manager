package co.edu.recreationmanager.command;


import lombok.Data;
import lombok.NoArgsConstructor;


import java.sql.Date;

@Data
@NoArgsConstructor
public class ReservaCommand {

    private Integer idReserva;
    private Date fechaInicio;
    private Date fechaFin;
    private ClienteCommand cliente;
    private HabitacionCommand habitacion;
    private int numeroPersonas;
    private char activa;
    

}
