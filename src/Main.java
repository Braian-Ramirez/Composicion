public class Main {
    public static void main(String[] args) {

        Fecha nacimiento = new Fecha( 7,12,1994);
        Fecha contratacion = new Fecha(29, 2, 2012);
        Empleado empleado = new Empleado("Braian", "Ramírez", nacimiento, contratacion);

        System.out.println( empleado );
    }
}