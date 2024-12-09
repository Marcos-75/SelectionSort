package ioc.xtec.cat.selectionsort;

/**
* Sole constructor. (For invocation by subclass 
* constructors, typically implicit.)
*/
public class ArrayValidator {
    
    /**
     * Constructor por defecto de la clase ArrayValidator.
     * Este constructor es utilizado para inicializar la clase ArrayValidator
     */
    public ArrayValidator(){
        // Constructor vacio por defecto
    }

    /**
     * Se pasa por parametro el array
     * 
     * @param arr array que contiene los numeros dados
     */
    public void validateArray(int[] arr) {
        /**
         * Metodo para gestionar las execpciones, retorna un mensaje de excepcion
         * si es null o el tamaño del array es cero
         * 
         * @exception IllegalArgumentExecption 
         */
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }
    
}
