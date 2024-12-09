/**
 * Algoritmo que ordena las palabras que se le pasan por consola de texto
 * 
 * @author Marcos Ortiz Gomez
 * @version 1.0.0
 */
package ioc.xtec.cat.selectionsort;

import java.util.Scanner;

/**
 * Clase principal Main
 */
public class Main {
    /**
     * Constructor por defecto de la clase Main.
     * Este constructor es utilizado para inicializar la clase Main
     * y ejecutar el algoritmo de ordenación.
     */
    public Main(){
        // Constructor vacio por defecto
    }

    /**
     * Constructor del objeto main
     * 
     * @param args argumentos para iniciar el objeto main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Solicita el tamaño del array
         * 
         * @param size  tamaño para el array
         */
        System.out.println("Introdueix la mida de l'array: ");
        int size = scanner.nextInt();

        /**
         * Declara el array con el tamaño dado, y pide que se introduzcan los
         * numeros y los guarda en el array
         * 
         * @param array array de almacenmiento de los numeros dados
         */
        int[] array = new int[size];
        System.out.println("Introdueix els elements de l'array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        /**
         * Crea un objeto SelectionSort llamado sorter
         * 
         * @param sorter para ordenar un array
         */
        SelectionSort sorter = new SelectionSort();
        
        /**
         * Crea un objeto ArrayValidator llamado validator
         * 
         * @param validator para validar los datos introducidos en el array
         */
        ArrayValidator validator = new ArrayValidator();

        try {
            /**
             * Pasa a validator el array para validarlo
             * 
             * @param array
             */
            validator.validateArray(array);

            System.out.print("Array original:");
            /**
             * Llama al metodo printArray para pintar el array por consola
             * 
             * @param array
             */
            printArray(array);

            /**
             * Solicita un valor para buscar en el array
             * 
             * @param valueToSearch
             */
            System.out.println("Introdueix un valor a buscar a l'array: ");
            int valueToSearch = scanner.nextInt();

            /**
             * Comprueba si existe el valor dado en valueToSearch en el array
             * 
             * @param contains
             * @return true | false
             */
            boolean contains = sorter.contains(array, valueToSearch);
            if (contains) {
                System.out.println("El valor " + valueToSearch + " existeix a l'array.");
            } else {
                System.out.println("El valor " + valueToSearch + " no existeix a l'array.");
            }

            /**
             * Ordena el array dado y lo muestra por consola
             * 
             * @param array
             */
            sorter.sort(array);

            System.out.print("Array ordenat:");
            printArray(array);

        } catch (IllegalArgumentException e) {
            /**
             * Muestra si se produce alguna execpcion
             * 
             * @exception IllegalArgumentException
             * @param e
             */
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
    
    /**
     * Metodo para pintar el array por consola
     * 
     * @param arr array dado para pintar
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
