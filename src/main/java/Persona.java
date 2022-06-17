import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
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


    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
