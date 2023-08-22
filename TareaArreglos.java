import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formattable;
import java.util.List;
import java.util.random.RandomGenerator;

public class TareaArreglos {

    public static void main(String[] args) {

        vMasGrande();
        vMasPequeno();
        vConCaracteres();
    }

    public static void vMasGrande(){

//        Integer[] aNumeros = new Integer[10];
//        aNumeros[0] = 1209;
//        aNumeros[1] = 402;
//        aNumeros[2] = 904;
//        aNumeros[3] = 90;
//        aNumeros[4] = 124;
//        aNumeros[5] = 10293;
//        aNumeros[6] = 9992;
//        aNumeros[7] = 84720;
//        aNumeros[8] = 32143;
//        aNumeros[9] = 2023;
        int[] bNumeros = {1209, 402, 904, 90, 124, 10293, 9992, 84720, 32143, 2023};

        int mayor = bNumeros[0]; // Asume que el mayor es el index 0
        //recorrer arreglo y si no es asi seguir la longitud del arreglo
        //si el numero es mayor imprimir el numero mayor
        for (int x = 1; x < bNumeros.length; x++){
            if (bNumeros[x] > mayor){
                mayor = bNumeros[x];
            }
        }
        System.out.println("El numero mayor es: " + mayor);
    }

    public static void vMasPequeno(){
//

        ArrayList <Integer> aNumeros = new ArrayList<Integer>();
        aNumeros.add(1209);
        aNumeros.add(402);
        aNumeros.add(904);
        aNumeros.add(90);
        aNumeros.add(124);
        aNumeros.add(10293);
        aNumeros.add(9992);
        aNumeros.add(84720);
        aNumeros.add(32143);
        aNumeros.add(2023);

        System.out.println("El numero menor de la lista es: " + Collections.min(aNumeros));


    }

    public static void vConCaracteres() {
        ArrayList<String> listaCadenas = new ArrayList<String>();
        listaCadenas.add("Cuba");
        listaCadenas.add("Colombia");
        listaCadenas.add("Inglaterra");
        listaCadenas.add("Francia");
        listaCadenas.add("Peru");
        listaCadenas.add("Chile");
        listaCadenas.add("Republica Dominicana");
        listaCadenas.add("Lisboa");
        listaCadenas.add("Estados Unidos");
        listaCadenas.add("El Salvador");
        listaCadenas.add("Honduras");
        listaCadenas.add("China");
        // Imprimir los valores que tengan 5 o mas caracteres
        System.out.println("\nValores con 5 o mas caracteres:");
        for (String x : listaCadenas) {
            if (x.length() >= 5) {
                System.out.println(x);
            }
        }//Fin for

        // Si... los valores tienen 5 o mas caracteres
        // Entonces... Concatenar SI al final de la palabra e Imprimir Resultados

        System.out.println("\nConcatenacion:");
        for (String x : listaCadenas) {
            if (x.length() >= 5) {
                System.out.println(x.concat("SI"));
            }
        }//Fin for

    }



}
