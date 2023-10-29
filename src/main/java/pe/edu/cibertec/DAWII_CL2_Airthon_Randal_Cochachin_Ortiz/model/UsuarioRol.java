package pe.edu.cibertec.DAWII_CL2_Airthon_Randal_Cochachin_Ortiz.model;

import jakarta.persistence.*;

@Entity
@Table(name="usuario_rol")
public class UsuarioRol {
    @Id
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    @Id
    @ManyToOne
    @JoinColumn(name = "idrol")
    private Rol rol;
}
