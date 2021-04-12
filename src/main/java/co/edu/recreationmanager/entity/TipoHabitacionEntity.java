package co.edu.recreationmanager.entity;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name="tipo_habitacion")
public class TipoHabitacionEntity {

    @Id
    @Column(name="id_tipo_habitacion")
    private Integer idTipoHabitacion;
    @Column(name="nombre_habitacion")
    private String nombreHabitacion;
    @Column(name="numero_personas")
    private int numeroPersonas;
    @Column(name="precio")
    private double precioHabitacion;

}
