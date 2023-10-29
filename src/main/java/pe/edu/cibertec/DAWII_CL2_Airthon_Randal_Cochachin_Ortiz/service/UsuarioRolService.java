package pe.edu.cibertec.DAWII_CL2_Airthon_Randal_Cochachin_Ortiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWII_CL2_Airthon_Randal_Cochachin_Ortiz.model.UsuarioRol;
import pe.edu.cibertec.DAWII_CL2_Airthon_Randal_Cochachin_Ortiz.repository.UsuarioRolRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioRolService {

    @Autowired
    private UsuarioRolRepository usuarioRolRepository;

    // Obtener todos los registros de UsuarioRol
    public List<UsuarioRol> getAllUsuarioRoles() {
        return usuarioRolRepository.findAll();
    }

    // Obtener un registro de UsuarioRol por idUsuario y idRol
    public Optional<UsuarioRol> getUsuarioRolById(Long idUsuario, Long idRol) {
        return usuarioRolRepository.findById(new UsuarioRolId(idUsuario, idRol));
    }

    // Guardar un nuevo registro de UsuarioRol
    public UsuarioRol saveUsuarioRol(UsuarioRol usuarioRol) {
        return usuarioRolRepository.save(usuarioRol);
    }

    // Eliminar un registro de UsuarioRol por idUsuario e idRol
    public void deleteUsuarioRol(Long idUsuario, Long idRol) {
        usuarioRolRepository.deleteById(new UsuarioRolId(idUsuario, idRol));
    }
}
