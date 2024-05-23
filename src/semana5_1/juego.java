package semana5_1;
//23 de mayo crear mi primer Git
public class juego {
    private int codigo;
    private int anio;

    public juego(int codigo, int anio){
        this.codigo = codigo;
        this.anio = anio;
    }

    public void imprimir(){
        System.out.println("codigo del juego "+codigo+" tipo de juego "+anio);
    }
}
 class juego_mesa extends juego{
    private String tipo_juego;

    public juego_mesa(int codigo, int anio,String tipo_juego){
        super(codigo,anio);
        this.tipo_juego= tipo_juego;
    }
    public void mensaje(){
        System.out.println("Juego realizado");
    }

     @Override
     public void imprimir() {
         super.imprimir();
         System.out.println("EL tipo de juego realizado "+tipo_juego);
     }
 }

 class juego_cancha extends juego{
    String juego_tipo;
    public juego_cancha(int codigo,int anio, String juego_tipo){
        super(codigo,anio);
        this.juego_tipo = juego_tipo;
    }
    public void mensaje(){
        System.out.println("Juego de cancha realizado");
    }

     @Override
     public void imprimir() {
         super.imprimir();
         System.out.println("EL tipo de juego de cancha realizado "+juego_tipo);
     }
 }