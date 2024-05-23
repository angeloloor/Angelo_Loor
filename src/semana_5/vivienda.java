package semana_5;

public class vivienda {
    private int numero;
    private String propietario;

    public vivienda(int numero, String propietario){
        this.numero = numero;
        this.propietario = propietario;
    }

    public void imprimir(){
        System.out.println("Numero "+numero+" Propietario "+propietario);
    }


}

class departamento extends vivienda{
    private int piso;
    public departamento(int numero, String propietario, int piso) {
        super(numero, propietario);
        this.piso = piso;
    }

    public void mensaje(){
        System.out.println("Departamento arrendado");
    }

    @Override
    public void imprimir() {
        System.out.println("Piso "+piso);
        super.imprimir();

    }
}

class casa extends vivienda{
    private int num_habitacion;
    private String ubicacion;
    public casa(int numero, String propietario,int num_habitacion,String ubicacion){
        super(numero, propietario);
        this.num_habitacion = num_habitacion;
        this.ubicacion = ubicacion;
    }
    public void mensaje(){
        System.out.println("Casa comprado");
    }

    @Override
    public void imprimir() {
        System.out.println("Habitacion "+num_habitacion+" Ubicacion "+ubicacion);
        super.imprimir();

    }
}