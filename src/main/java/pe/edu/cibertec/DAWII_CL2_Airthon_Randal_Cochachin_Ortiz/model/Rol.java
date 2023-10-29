package pe.edu.cibertec.DAWII_CL2_Airthon_Randal_Cochachin_Ortiz.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrol")
    private Long idRol;

    @Column(name = "nomrol")
    private String nomRol;

    @ManyToMany(mappedBy = "roles")
    private Set<Usuario> usuarios;
}
