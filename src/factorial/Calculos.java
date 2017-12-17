
package factorial;

/**
 *
 * @author Alex
 */
public class Calculos {
    /**
     * Este método devuelve la factorización de un número
     * @param j Número para calcular la factorización
     * @return  Factorización del número
     */
    public int calcular(int j){
        int f;
        if (j == 0) {
            f = 1;
        } else {
            f = 1;
            for (int i = j; i >= 1; i--) {
                f = f * i;
            }
        }return f;
    }
}
