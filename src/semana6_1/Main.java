package semana6_1;

class persona{
    private int cedula;
    private String nombre;
    private double telefono;

    public persona(int cedula, String nombre, double telefono){
        this.cedula = cedula;
        this.nombre =nombre;
        this.telefono = telefono;

    }

    public void mostrar(){
        System.out.println("CEDULA: "+cedula+ " NOMBRE: "+nombre+" TELEFONO: "+telefono);
    }
}

public class Main {
    public static void main(String[] args){
        persona per1 = new persona(13423456,"Angelo",987355632);
    }
}
