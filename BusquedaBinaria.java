public class BusquedaBinaria {

    public int busquedaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fin = array.length - 1;
        //  {10, 8, 5, 6, 7, 3, 1, 2, 9} => 8
        //  {10, 8, 5, 6, 7 |||, 3, 1, 2, 9} medio = 0 +(9-0)/2=> 4
        //
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Si el elemento se encuentra en el punto medio, se devuelve su índice
            if (array[medio] == elemento) {
                return medio;
            }

            // Si el elemento es mayor que el punto medio, se busca en la mitad derecha del array
            if (array[medio] < elemento) {
                inicio = medio + 1;
            }

            // Si el elemento es menor que el punto medio, se busca en la mitad izquierda del array
            else {
                fin = medio - 1;
            }
        }

        // Si el elemento no se encuentra en el array, se devuelve -1
        return -1;
    }
}
