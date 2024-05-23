package semana6;

class A {
    private String cedula;
    private String nombre;
    public A(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
}

class B {
    private int edad;
    private String correo;

    public B(int edad, String correo) {
        this.edad = edad;
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }
}

class C {
    private A a;
    private B b;

    public C(String cedula, String nombre, int edad, String correo) {
        a = new A(cedula, nombre);
        b = new B(edad, correo);
    }

    public void mostrarInfo() {
        System.out.println("Cédula: " + a.getCedula() + ", Nombre: " +
                a.getNombre());
        System.out.println("Edad: " + b.getEdad() + ", Correo: " +
                b.getCorreo());
    }
}

public class Main {
    public static void main(String[] args) {
        C persona = new C("12345678", "Angelo Loor", 30,
                "joeangelo.loor@epn.edu.ec");
        persona.mostrarInfo();
    }
}
