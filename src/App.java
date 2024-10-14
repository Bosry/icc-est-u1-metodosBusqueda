import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        int[] arreglo = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        //metodosBusqueda.printArreglo(arreglo);

        //int posicion = metodosBusqueda.busquedaSecuencial(arreglo, 7);
        //if (posicion != -1) {
        //    System.out.println("El valor se encuentra en la posicion: [" + posicion + "]");
        //} else {
        //    System.out.println("\nValor no encontrado" + "\nError: 404");
        //}
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        metodosBusqueda.busquedaBinaria(arr, 6);
        int[] arr2 = new int[100000];
        metodosBusqueda.arregloSec(arr2, 50418);
        metodosBusqueda.arregloBin(arr2, 50418);
    }
}