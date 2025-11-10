package views;
import models.Persona;

public class ShowConsole {
    public ShowConsole(){

    }

    public void printArray(int[] arreglo){
        System.out.println("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
            if(i < arreglo.length - 1){
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }

    public void printResult(int result, int valor){
        if(result == -1){
            System.out.println("ERROR: No se encontro el valor {" + valor + "}");
        } else {
            System.out.println("El numero {" + valor + "} se encontro en la posicion [" + result + "]");
        }
    }

    public void printResult(Integer result){
        if(result != null){
            System.out.println("El valor {" + result + "} si esta en el arreglo");
        } else {
            System.out.println("ERROR: No se encontro el valor buscado");
        }
    }

    public void showPersonResult(Persona resultadoPersona, String name){
        if(resultadoPersona == null){
            System.out.println("No se encontro la Persona con el nombre: " + name);
        } else {
            System.out.println("Se encontro la persona con el nombre: " + name);
        }
    }

    public void showPersonResult(Persona resultadoPersona, int age){
        if(resultadoPersona == null){
            System.out.println("No se encontro la Persona con la edad: " + age);
        } else {
            System.out.println("Se encontro la persona con la edad: "+ age);
        }
    }

    public void showPersonResult(Persona resultadoPer3, int i, boolean nombre){
        if(resultadoPer3 == null){
            
        }
    }

}
