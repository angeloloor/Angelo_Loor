package semana7;

public class Suite extends Inmueble {
    boolean tieneJacuzzi;

    public Suite(String direccion, double tamano, int numHabitaciones, boolean tieneJacuzzi, double precio){
        super(direccion,tamano,numHabitaciones,precio);
        this.tieneJacuzzi = tieneJacuzzi;
    }

    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }

    @Override
    public void mostrarInformacio() {
        super.mostrarInformacio();
        System.out.println("Tiene un Jacuzzi: "+tieneJacuzzi);
    }
}
