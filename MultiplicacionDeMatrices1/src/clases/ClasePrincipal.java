package clases;

public class ClasePrincipal {

    public static void main(String[] args) {

        //declaracion de matrices
        int matriz_uno[][] = new int[2][3];
        int matriz_dos[][] = new int[3][2];
        int matriz_resultante[][] = new int[2][2];

        //llenado de la matriz uno
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz_uno[i][j] = (int)(Math.random() * 5);
            }
        }
        
        //llenado de matriz dos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz_dos[i][j] = (int)(Math.random() * 5);
            }
        }

        //multiplicacion de variables
        for (int i = 0; i < 4; i++) {

            if (matriz_resultante[0][0] == 0) {
                int temporal = (matriz_uno[0][0] * matriz_dos[0][0])
                        + (matriz_uno[0][1] * matriz_dos[1][0])
                        + (matriz_uno[0][2] * matriz_dos[2][0]);

                matriz_resultante[0][0] = temporal;                
            }
            
            if(matriz_resultante[1][0] == 0){
                int temporal = (matriz_uno[1][0] * matriz_dos[0][0])
                        + (matriz_uno[1][1] * matriz_dos[1][0])
                        + (matriz_uno[1][2] * matriz_dos[2][0]);

                matriz_resultante[1][0] = temporal;                
            }
            
            
            if(matriz_resultante[0][1] == 0){
                int temporal = (matriz_uno[0][0] * matriz_dos[0][1])
                        + (matriz_uno[0][1] * matriz_dos[1][1])
                        + (matriz_uno[0][2] * matriz_dos[2][1]);

                matriz_resultante[0][1] = temporal;                
            }
            
            if(matriz_resultante[1][1] == 0){
                int temporal = (matriz_uno[1][0] * matriz_dos[0][1])
                        + (matriz_uno[1][1] * matriz_dos[1][1])
                        + (matriz_uno[1][2] * matriz_dos[2][1]);

                matriz_resultante[1][1] = temporal;                
            }
        }
        
        //imprimiendo las matrices
        for (int i = 0; i < 3; i++) {
            /*para imprimir la matriz uno, se debe condicionar con un if debido 
            * a que la la matiz uno es distinta a la matriz dos.
            */
            if(i < 2){
                //Imprimiendo la mtrizz uno 
                for (int j = 0; j < 3; j++) {
                    System.out.print("[ " + matriz_uno[i][j] + " ]");
                }
                
                //Separacion de matrices para ubicacion de signo "x"
                if(i == 1){
                    System.out.print("   x   ");
                } else{
                    System.out.print("       ");
                }                
            } else{
                System.out.print("                      ");
            }
            
            //imprimiendo la matriz dos
            for (int j = 0; j < 2; j++) {
                System.out.print("[ " + matriz_dos[i][j] + " ]");
            }
            
            //Separacion de matrices para ubicacion de signo "="
            if (i == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }
            
            //Imprimiendo la matriz resultante
            if(i < 2){
                for (int j = 0; j < 2; j++) {
                    System.out.print("[" + matriz_resultante[i][j] + "]");
                }
            }    
            System.out.println("");        
        }



    }
}
