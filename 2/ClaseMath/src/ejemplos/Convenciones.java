
package ejemplos;

public class Convenciones {
    public static void main(String[] args) {
        double anguloEnGrados = 45;
        
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        System.out.println("Deg a Rad " + anguloEnGrados + "º = " + anguloEnRadianes + " rad");
        
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Rad a Deg " + anguloEnRadianes + " rad = " + anguloEnGrados + "º");
    }
}
