import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Gerente extends Persona {

    private String zonaSupervicion;
    private int salario;

    Gerente(int identificacion, String nombre, String profesion, String zonaSupervicion,
        int salario) {
        super(identificacion, nombre, profesion);
        this.zonaSupervicion = zonaSupervicion;
        this.salario = salario;

    }
}
