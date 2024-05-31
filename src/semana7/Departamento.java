package semana7;

public class Departamento extends Inmueble {
    int numPiso;

    public Departamento(String direccion, double tamano, int numHabitaciones, int numPiso, double precio){
        super(direccion,tamano,numHabitaciones,precio);
        this.numPiso = numPiso;
    }
    public int getNumPiso() {
        return numPiso;
    }

    @Override
    public void mostrarInformacio() {
        super.mostrarInformacio();
        System.out.println("Numero de pisos"+numPiso);
    }
}
