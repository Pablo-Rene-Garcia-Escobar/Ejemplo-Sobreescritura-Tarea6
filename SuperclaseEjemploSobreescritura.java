package EjemploSobreescritura;

public class SuperclaseEjemploSobreescritura {

    private int a;
    private int b;
    public int c;
    
    public SuperclaseEjemploSobreescritura(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int operar(int a, int b) {
        c = a + b;
        return c;
    }

}
