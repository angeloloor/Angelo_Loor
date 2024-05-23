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
class taxi_pirata extends Taxi{
    private String placa_taxipirata;
    private String modelo_taxipirata;
    private int anio_taxipirata;
    public taxi_pirata(String marca, String modelo, double precio,int numPuertas,String color,String placa,int anio_taxi,String marca_taxi,String placa_taxipirata
    ,String modelo_taxipirata,int anio_taxipirata){
        super(marca, modelo,precio,numPuertas,color,placa,anio_taxi,marca_taxi);
        this.placa_taxipirata = placa_taxipirata;
        this.modelo_taxipirata = modelo_taxipirata;
        this.anio_taxipirata = anio_taxipirata;
    }
    public void mostrainfoTaxipirata(){
        mostrarInfo();
        mostrarInfoCoche();
        System.out.println("Placa taxi pirata "+placa_taxipirata+" Modelo del taxi pirata "+modelo_taxipirata+" Año del taxi pirata "+anio_taxipirata);
    }
}
public class Main {
    public static void main(String[] args) {
        taxi_pirata mitaxi = new taxi_pirata("Toyota", "Corolla", 60.80,4,"ROJO","XL890",
                1990,"TOYOTA","PQ768","AVEO",2005);
        mitaxi.mostrainfoTaxipirata();
    }
}
