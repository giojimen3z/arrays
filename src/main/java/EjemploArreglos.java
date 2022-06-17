import java.util.ArrayList;


public class EjemploArreglos {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona(12314, "Gio");
        Persona persona3 = new Persona(13213, "test", "desarrollador");

        Gerente gerente1 = new Gerente(1141654, "Gato", "ingeniero",
            "proyecto assets", 5000);

        persona1.setIdentificacion(13245678);
        persona1.setIdentificacion(1322454518);
        persona1.setNombre("test1");
        persona1.setProfesion("QA");

        System.out.println(
            persona1.getIdentificacion() + persona1.getNombre() + persona1.getProfesion());
        System.out.println(
            persona2.getIdentificacion() + persona2.getNombre() + persona2.getProfesion());
        System.out.println(
            persona3.getIdentificacion() + persona3.getNombre() + persona3.getProfesion());

        System.out.println(
            gerente1.getIdentificacion() + gerente1.getNombre() + gerente1.getProfesion()
                + gerente1.getZonaSupervicion() + gerente1.getSalario());


        //1. Se declara erl arreglo
        Persona [] person;

        //2. se intancia el arreglo de tipo object

        person = new Persona[4];

        //3. Se inicializan los valores del arreglo

        person[0] = new Persona("Gio");
        person[1] = new Persona("test");
        //4.se imprime de manera manual

        System.out.println("personas[0] = " + person[0]);
        System.out.println("personas[1] = " + person[1]);
        System.out.println("personas[2] = " + person[2]);
        System.out.println("personas[3] = " + person[3]);

        // arreglo  notacion simplificada


        String [] nombres = {"test4","Alejandra","test","test3"};

        for (int i=0; i<nombres.length;i++){

            System.out.println("el nombre en el indice "+ i + " es: " + nombres[i]);
        }

        int i =1;

        for (String nombre:nombres ) {
            System.out.println("el nombre en el indice "+ i + " es: " + nombre);
            i++;
        }
        ArrayList<Persona> lista = new ArrayList<>();



        lista.add(persona2);
        lista.add(1,gerente1);


        for (Persona personita:lista) {

            System.out.println(personita.toString());
        }

    }



}
