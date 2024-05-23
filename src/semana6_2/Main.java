package semana6_2;

class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo,double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo+ " Precio "+precio);
    }
}
class Taxi extends Vehiculo {
    private int numPuertas;
    private String color;
    private String placa;
    private int anio_taxi;
    private String marca_taxi;

    public Taxi(String marca, String modelo, double precio, int numPuertas,String color,String placa,
                int anio_taxi,String marca_taxi) {
        super(marca, modelo,precio);
        this.numPuertas = numPuertas;
        this.color = color;
        this.placa = placa;
        this.anio_taxi = anio_taxi;
        this.marca_taxi = marca_taxi;
    }

    public void mostrarInfoCoche() {
        mostrarInfo();
        System.out.println("Numero de puertas: " + numPuertas+ " Color "+color+" Placa "+
                placa+" Año del taxi "+anio_taxi+" Marca del taxi "+marca_taxi);
    }

}
public class Main {
    public static void main(String[] args) {
        Taxi mitaxi = new Taxi("Toyota", "Corolla", 60.80,4,"ROJO","XL890",
                1990,"TOYOTA");
        mitaxi.mostrarInfoCoche();
    }
}
