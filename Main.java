public class Main {
    public static void main(String[] args) {
        Ordenamiento ordenamiento = new Ordenamiento();
        BusquedaBinaria busqueda = new BusquedaBinaria();

        int[] array = {10, 8, 5, 6, 4, 7, 3, 1, 2, 9};

        ordenamiento.heapSort(array);


        int elemento = 7;
        // Imprimir el array ordenado
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int indice = busqueda.busquedaBinaria(array, elemento);

        if (indice != -1) {
            System.out.println("El elemento " + elemento + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El elemento " + elemento + " no se encuentra en el array");
        }
    }
}