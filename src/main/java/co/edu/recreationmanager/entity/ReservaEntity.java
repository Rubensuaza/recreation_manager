package co.edu.recreationmanager.entity;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name="reserva")
public class ReservaEntity {

        @Id
        @Column(name="id_reserva")
        private Integer idReserva;
        @Column(name="fecha_inicio")
        private Date fechaInicio;
        @Column(name="fecha_fin")
        private Date fechaFin;
        @Column(name="id_cliente")
        private Integer idCliente;
        @Column(name="id_habitacion")
        private Integer idHabitacion;
        @Column(name="numero_personas")
        private int numeroPersonas;
        @Column(name="activa")
        private char activa;
}
