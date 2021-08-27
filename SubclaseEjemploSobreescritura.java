package EjemploSobreescritura;

public class SubclaseEjemploSobreescritura extends SuperclaseEjemploSobreescritura{
    
    public static final long serialVersionUID = 700L;

    public SubclaseEjemploSobreescritura(int a, int b) {
        super(a, b);
    }
    
    //se sobreescribe por que el metodo tiene el mismo nombre de la superclase y lo utilizo para hacer una accion diferente
    @Override
    public int operar(int a, int b){
        c=a-b;
        return c;
    }
    
}