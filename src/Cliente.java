public class Cliente {
        String nombre;
        String apellido;
        String telefono;
        String email;
        LocalDate fechaNacimiento;

        Usuario usuario;   // N:1
        Imagen imagen;     // 1:1
    }

