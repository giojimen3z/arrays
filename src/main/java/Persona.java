import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Persona {

    private int identificacion;
    private String nombre;
    private String profesion;

    Persona() {
    }

    Persona(int identificacion, String nombre) {

        this.identificacion = identificacion;
        this.nombre = nombre;
    }


}
