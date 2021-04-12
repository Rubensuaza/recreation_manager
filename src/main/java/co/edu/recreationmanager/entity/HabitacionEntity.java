package co.edu.recreationmanager.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name="habitacion")
public class HabitacionEntity {

    @Id
    @Column(name="id_habitacion")
    private Integer idHabitacion;
    @Column(name="id_tipo_habitacion")
    private Integer idTipoHabitacion;
    @Column(name="nombre_habitacion")
    private String nombre;
    @Column(name="disponible")
    private char disponible;

    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public Integer getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public char getDisponible() {
        return disponible;
    }
}
