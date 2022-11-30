public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AñadirPuerta();
        miCoche.AñadirPuerta();
        miCoche.AñadirPuerta();
        miCoche.AñadirPuerta();
        System.out.println(miCoche.puertas);
    }
}

public static void suma(int a, int b, int c){
    int resultado;
    resultado = a + b + c;
    System.out.println(resultado);
}

public class Coche {
    public int puertas = 0;

    public void AñadirPuerta() {
        this.puertas++;
    }
}
