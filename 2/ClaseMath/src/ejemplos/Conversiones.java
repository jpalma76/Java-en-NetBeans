
package ejemplos;

public class Conversiones {
    public static void main(String[] args) {
        double anguloEnGrados = 45;
        
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        
        System.out.println("Convertir angulos(Deg) a radianes(Rad).");
        System.out.println(anguloEnGrados + "º = " + anguloEnRadianes + " rad");
        
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        
        System.out.println("Convertir radianes(Rad) a angulos(Deg).");
        System.out.println(anguloEnRadianes + " rad = " + anguloEnGrados + "º");

    }
}
