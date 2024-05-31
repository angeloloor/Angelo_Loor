package semana7;


public class CasaIndividual extends Inmueble {
    double Tamano_Terreno;

    public CasaIndividual(String direccion, double tamano, int numHabitaciones, double tamano_Terreno, double precio){
        super(direccion,tamano,numHabitaciones,precio);
        this.Tamano_Terreno = tamano_Terreno;
    }

    public double getTamano_Terreno() {
        return Tamano_Terreno;
    }

    @Override
    public void mostrarInformacio() {
        super.mostrarInformacio();
        System.out.println("Tamaño del terreno: "+Tamano_Terreno);
    }
}
