package semana4_2;

class Empleado{
    private int cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(){

    }

    public Empleado(int cedula,String nombre, String apellido,int edad){
        this.cedula = cedula ;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public void mostrar(){
        System.out.println("mi  cedula es: "+cedula+ " mi nombre es: "+nombre+ " ,mi apellido es: "+apellido+ " y mi edad es: "+edad);
    }

}

public class  Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(12435657,"Angelo","Loor",12);
        Empleado empleado = new Empleado();
        empleado.setNombre("Angel");
        empleado.mostrar();
    }
}