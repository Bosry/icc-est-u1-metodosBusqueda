public class MetodosBusqueda {
    public int busquedaSecuencial(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }

    public void printArreglo(int[] arreglo) {
        for (int elem : arreglo) {
            System.out.print(elem + " ");
        }
    }

    public int busquedaBinaria(int[] arr, int value) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arr[medio] == value) {
                // Elemento encontrado
                return medio;
            }
            if (arr[medio] < value) {
                // Buscar la mitad de la derecha
                inicio = medio + 1;
            } else {
                // Buscar en la mitad de la izquierda
                fin = medio - 1;
            }
        }
        return -1;
    }

    public int arregloSec(int[] arr2, int valor) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == valor) {
                return i;
            }
        }
        System.out.println("Numero de interacciones (Secuencial): " + valor);
        return -1;
    }

    public int arregloBin(int[] arr2, int valor) {
        int inicio = 0;
        int fin = arr2.length - 1;
        int numero = 0;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arr2[medio] == valor) {
                numero++;
                return medio;
            }
            if (arr2[medio] < valor) {
                numero++;
                inicio = medio + 1;
            }
            if (arr2[medio] > valor) {
                numero++;
                fin = medio - 1;
            }
        }
        System.out.println("Numero de interacciones (Binario): " + numero);
        return -1;
    }
}
