
package ambito;

public class Los_Tres_Ambitos {
    
    static int variableEstatica; 
    
    int variableGlobal; //no es necesario inicializarla
    
    void miMetodo(int parametro){
        int variableLocal = 0; //el parametro tambien es local dentro del metodo
    }
}
