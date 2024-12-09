package ioc.xtec.cat.selectionsort;

/**
 * Clase SelectionSort
 * 
 * @author marcos
 * 
 */
public class SelectionSort {

    /**
     * Constructor por defecto de la clase SelectionSort.
     * Este constructor es utilizado para inicializar la clase SelectionSort
     */
    public SelectionSort(){
        // Constructor vacio por defecto
        System.out.print("Marcos Ortiz Gómez - M8 - EAC4");
    }
        
    /**
     * Metodo sort, ordena el array dado
     * 
     * @param arr array con las palabras introducidas
     */
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Metodo contains, comprueba si el array ya contiene la palabra dada
     * 
     * @param arr array con los numeros dados
     * @param value valor a comprobar si existe en el array
     * @return true | false
     */
    public boolean contains(int[] arr, int value) {
        /**
         * Si el array es null devuelve una exepcion con el mensaje
         * 
         * @exception IllegalArgumentException
         */
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    
}
