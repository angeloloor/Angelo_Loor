package semana_4;

class Empleado{
    private int cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public Empleado(int cedula, String nombre, String apellido, int edad){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    /*public void marca_tarjeta(){
        System.out.println("mi cedula es: "+cedula+ " mi nombre es: "+nombre+ " ,mi apellido es: "+apellido+ " y mi edad es: "+edad);
    }

    public void registro_vacaciones(){
        System.out.println("mi cedula es: "+cedula+ " mi nombre es: "+nombre+ " ,mi apellido es: "+apellido+ " y mi edad es: "+edad);
    }*/

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

public class  Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1725657215, "Juan", "Loor", 21);
        Empleado empleado2 = new Empleado(1346879003, "Angelo", "Loor", 20);

        System.out.println("Empleado 1 - Cedula: " + empleado1.getCedula() + ", Nombre: " + empleado1.getNombre() + ", Apellido: " + empleado1.getApellido() + ", Edad: " + empleado1.getEdad());
        empleado1.setEdad(34);
        empleado1.setCedula(1725457623);
        empleado1.setApellido("Romero");
        empleado1.setNombre("Angel");
        System.out.println("Empleado 1 - Cedula: " + empleado1.getCedula() + ", Nombre: " + empleado1.getNombre() + ", Apellido: " + empleado1.getApellido() + ", Edad: " + empleado1.getEdad());

    }
}