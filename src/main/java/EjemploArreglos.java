public class EjemploArreglos {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona(12314,"Gio");
        Persona persona3 = new Persona(13213,"test","desarrollador");


        persona1.setIdentificacion(13245678);
        persona1.setNombre("test1");
        persona1.setProfesion("QA");
        System.out.println(persona1.getIdentificacion() + persona1.getNombre() + persona1.getProfesion());
        System.out.println(persona2.getIdentificacion() + persona2.getNombre() + persona2.getProfesion());
        System.out.println(persona3.getIdentificacion() + persona3.getNombre() + persona3.getProfesion());



    }

}
