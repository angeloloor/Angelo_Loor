package semana5_1;

public class principal {
    public static void main(String[] args){
        juego j1 = new juego(12324,1998);
        j1.imprimir();

        juego_mesa m1 = new juego_mesa(1243,2001,"Cartas");
        m1.imprimir();
        m1.mensaje();

        juego_cancha c1 = new juego_cancha(124,2000,"Basquet");
        c1.imprimir();
        c1.mensaje();


    }
}
