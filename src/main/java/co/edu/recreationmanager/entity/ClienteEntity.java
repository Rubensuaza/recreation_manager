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
@Table(name="cliente")
public class ClienteEntity {

    @Id
    @Column(name="id_cliente")
    private Integer idCliente;
    @Column(name="id_tipo_documento")
    private Integer idTipoDocumento;
    @Column(name="numero_documento")
    private String numeroDocumento;
    @Column(name="nombre_cliente")
    private String nombre;
    @Column(name="apellido_cliente")
    private String apellido;
    @Column(name="numero_telefonico")
    private String numeroTelefono;
    @Column(name="direccion")
    private String direccion;
    @Column(name="correo")
    private String correo;
    @Column(name="usuario")
    private String usuario;
    @Column(name="contraseña")
    private String contraseña;
    @Column(name="activo")
    private char activo;

    public Integer getIdCliente() {
        return idCliente;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public char getActivo() {
        return activo;
    }
}
