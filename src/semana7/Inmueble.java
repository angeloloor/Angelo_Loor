package semana7;

public class Inmueble {
    String direccion;
    double tamano;
    int numHabitaciones;
    double precio;

    public Inmueble(String direccion, double tamano, int numHabitaciones, double precio){
        this.direccion = direccion;
        this.tamano = tamano;
        this.numHabitaciones = numHabitaciones;
        this.precio = precio;
    }
    public String getDireccion() {
        return direccion;
    }


    public double getTamano() {
        return tamano;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }


    public double getPrecio() {
        return precio;
    }

    public void mostrarInformacio(){
        System.out.println("Direccion: "+direccion+" Tamaño: "+tamano+" Numero de Habitaciones"+numHabitaciones+" Precio"+precio);
    }
}
