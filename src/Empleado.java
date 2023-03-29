public class Empleado {
    private String primerNombre;
    private String primerApellido;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;

    public Empleado( String nombre, String apellido, Fecha fechaDeNacimiento, Fecha fechaDeContratacion){
        primerNombre = nombre;
        primerApellido = apellido;
        fechaNacimiento = fechaDeNacimiento;
        fechaContratacion = fechaDeContratacion;
    }
    public String toString(){
        return String.format("%s, %s contratado: %s cumpleaños: %s", primerApellido, primerNombre, fechaContratacion, fechaNacimiento);
    }
}
