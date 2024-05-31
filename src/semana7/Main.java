package semana7;

public class Main {
    public static void main(String[] args) {
        Inmueble cliente1 = new Inmueble("Calderon",12.23,5,80.35);
        Departamento clite2 = new Departamento("Carapungo",56.00,6,4,90.08);
        CasaIndividual clite3 = new CasaIndividual("Carapungo",56.00,6,20,90.08);
        Suite clite4 = new Suite("Carapungo",56.00,6,false,90.08);

        Inmueble[] clientes = {cliente1, clite2, clite3, clite4};

        for (Inmueble cliente : clientes) {
            cliente.mostrarInformacio();
            System.out.println();
        }
    }
}
