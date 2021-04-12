package co.edu.recreationmanager.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name="tipo_documento")
public class TipoDocumentoEntity {
    @Id
    @Column(name="id_tipo_documento")
    private Integer idTipoDocumento;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
