package controllers;

import views.ShowConsole;
import models.Persona;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private int[] arreglo;

    //public MetodosBusqueda() {
        //this.arreglo = new int[] { 10, 11, -2, 5, 6, 8, 15, 22 };
        //this.showConsole = new ShowConsole();
        //showConsole.printArray(arreglo);

        // buscar 5

        //int result1 = busquedaLineal(5);
        //showConsole.printResult(result1, 5);

        // buscar -2

        //int result2 = busquedaLineal(-2);
        //showConsole.printResult(result2, -2);

        // buscar 20

        //int result3 = busquedaLinealWhile(20);
        //showConsole.printResult(result3, 20);

        // buscar -100 y 10 con objetos integer

        //Integer result4 = busquedaLinealObj(100);
        //showConsole.printResult(result4);
        //Integer result5 = busquedaLinealObj(10);
        //showConsole.printResult(result5);
    //}

    public int busquedaLineal(int value) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int busquedaLinealWhile(int value) {
        int i = 0;
        while (i < arreglo.length) {
            if (arreglo[i] == value) {
                return arreglo[i];
            }
            i++;
        }
        return -1;
    }

    public Integer busquedaLinealObj(int value) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == value) {
                return arreglo[i];
            }
        }
        return null;
    }

    public Integer busquedaLinealObj2(int value) {
        return (Integer) null;
    }

    public Persona searchPersonByName(Persona[] personas, String name) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getName().equalsIgnoreCase(name)) {
                return personas[i];
            }
        }
        return null;
    }

    public Persona findPersonByAgeAndImpar(Persona[] personas, int age){
        for (int i = 0; i < personas.length; i++) {
            if(age % 2 != 0){
                return personas[i];
            }
        }
        return null;
    }
    
    public Persona findPersonByValueName(Persona[] personas, int i){
        for(Persona persona : personas){
            int valorNombre = 0;
            for (char letra : persona.getName().toCharArray()) {
                int intvalorLetra = (int) letra;
                valorNombre += (int) intvalorLetra;
            }
            if(valorNombre == i){
                return persona;
            }
        }
        return null;
    }
}
