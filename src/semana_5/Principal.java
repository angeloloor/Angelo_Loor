package semana_5;

public class Principal {
    public static void main(String[] args){
        vivienda v1 = new vivienda(123,"Fernando");
        v1.imprimir();

        departamento d1 = new departamento(124,"Pepe",2);
        d1.imprimir();
        d1.mensaje();

        casa c1 = new casa(125,"Pedro",3,"Calderon");
        c1.imprimir();
        c1.mensaje();


    }
}
