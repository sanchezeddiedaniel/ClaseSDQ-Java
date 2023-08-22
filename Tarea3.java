import java.util.Scanner;

public class Tarea3 {

    public static void main(String[] args) {
        clear();
        menu();
    } //inicio
    public static void tablaFor(int num){
        for (int i = 1; i <= num; i++){
            System.out.println();
            for (int j = 1; j <= 12; j++){
                int res = i * j;
//                System.out.println(i + "x" + j + "=" + res);
                System.out.printf("%2d x %2d = %3d   ", j, i, res);

            }
        }

    }
    public static void tablaDoWhile(int num){
        int i = 1;
        do {
            System.out.println();
            int j = 1;
            do {
                int res = i * j;
//                System.out.println(i + "x" + j + "=" + res);
                System.out.printf("%2d x %2d = %3d   ", j, i, res);
                j++;
            }while (j <= 12);
            i++;
        } while (i <= num);

    }
    public static void tablaWhile(int num){
        int i = 1;

        while (i <= num){
            System.out.println();
            int j =1;

            while (j <= 12){

                int res = i * j;
//                System.out.println(i + "x" + j + "=" + res);
                System.out.printf("%2d x %2d = %3d   ", j, i, res);
                j++;
            }
            i++;
        }

    }
    public static void tablaForSinSeis(int num){

        for (int i = 1; i <= num; i++){
            System.out.println();
            for (int j = 1; j <= 12; j++){
                int res = i * j;

                if(res == 6){ //condicion que si es 6 no se imprima nada
                    System.out.println();

                } else {
                    System.out.println(i + "x" + j + "=" + res);
                }
//

            }
        }
    }
    public static void tablaDoWhileSinSeis(int num){
        int i = 1;
        do {
            System.out.println();
            int j = 1;
            do {
                int res = i * j;

                if (res == 6){ //condicion que si es 6 no se imprima nada
                    System.out.println();
                } else {
                    System.out.println(i + "x" + j + "=" + res);
                }
                j++;
            }while (j <= 12);
            i++;
        } while (i <= num);
    }
    public static void tablaWhileSinSeis(int num){
        int i = 1;

        while (i <= num){
            System.out.println();
            int j =1;

            while (j <= 12){

                int res = i * j;

                if (res == 6){ //condicion que si es 6 no se imprima nada
                    System.out.println();
                } else {
                    System.out.println(i + "x" + j + "=" + res);
                }
                j++;
            }
            i++;
        }
    }
    public static int numeroMenor(int num1, int num2, int num3){

        int menor = num1;

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        return menor;

    }
    public static int numeroMayor(int num1, int num2, int num3){
        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        return mayor;


    }
    public static void arbolito(int altura){

        for (int i = altura; i >= 1; i--) { // Determina la altura

            for (int j = 1; j <= altura - i; j++) { // Determina los espacios que debe dejar entre los caracteres

                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) { // Imprime los caracteres

                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static double suma(double num1, double num2){

        return num1 + num2;
    }
    public static double resta(double num1, double num2){

        return num1 - num2;
    }
    public static double multiplicacion(double num1, double num2){

        return num1 * num2;
    }
    public static double division(double num1, double num2){

        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("ERROR NO SE PUEDE DIVIDIR ENTRE 0");
            return Double.NaN;
        }

    }
    public static void menu(){
        System.out.println("***********************************************************");
        System.out.println("                  BIENVENIDOS AL MENU");
        System.out.println("***********************************************************");

        System.out.println("1. IMPRIMIR TABLAS DEL 1 AL 12 METODO FOR");
        System.out.println("2. IMPRIMIR TABLAS DEL 1 AL 12 METODO DO-WHILE");
        System.out.println("3. IMPRIMIR TABLAS DEL 1 AL 12 METODO WHILE");
        System.out.println("4. IMPRIMIR TABLAS DEL 1 AL 12 SIN EL 6 METODO FOR");
        System.out.println("5. IMPRIMIR TABLAS DEL 1 AL 12 SIN EL 6 METODO DO-WHILE");
        System.out.println("6. IMPRIMIR TABLAS DEL 1 AL 12 SIN EL 6 METODO");
        System.out.println("7. DETERMINAR EL NUMERO MENOR DE 3 NUMEROS DIGITADOS");
        System.out.println("8. DETERMINAR EL NUMERO MAYOR DE 3 NUMEROS DIGITADOS");
        System.out.println("9. IMPRIMIR ARBOLITO");
        System.out.println("10. SUMA");
        System.out.println("11. RESTA");
        System.out.println("12. MULTIPLICACION");
        System.out.println("13. DIVISION");
        System.out.println("0. SALIR DEL PROGRAMA");
        System.out.println();
        System.out.print("INGRESA UNA OPCION: ");
        int opcion;
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextInt();
        switch (opcion) {
            case 0 -> {
                System.out.println("***********************************************************");
                System.out.println("                 SALIENDO DEL PROGRAMA");
                System.out.println("***********************************************************");
            }
            case 1 -> tablaFor(12);
            case 2 -> tablaDoWhile(12);
            case 3 -> tablaWhile(12);
            case 4 -> tablaForSinSeis(12);
            case 5 -> tablaDoWhileSinSeis(12);
            case 6 -> tablaWhileSinSeis(12);
            case 7 -> {
                Scanner tecla = new Scanner(System.in);
                System.out.print("INGRESE EL PRIMER NUMERO: ");
                int num1 = tecla.nextInt();
                System.out.print("INGRESE EL SEGUNDO NUMERO: ");
                int num2 = tecla.nextInt();
                System.out.print("INGRESE EL TERCER NUMERO: ");
                int num3 = tecla.nextInt();
                int nMayor = numeroMayor(num1, num2, num3);
                System.out.println("EL NUMERO MAYOR ES: " + nMayor);
            }
            case 8 -> {
                Scanner tecla2 = new Scanner(System.in);
                System.out.print("INGRESE EL PRIMER NUMERO: ");
                int n1 = tecla2.nextInt();
                System.out.print("INGRESE EL SEGUNDO NUMERO: ");
                int n2 = tecla2.nextInt();
                System.out.print("INGRESE EL TERCER NUMERO: ");
                int n3 = tecla2.nextInt();
                int nMenor = numeroMenor(n1, n2, n3);
                System.out.println("EL NUMERO MENOR ES : " + nMenor);
            }
            case 9 -> {
                Scanner tecladoArbolito = new Scanner(System.in);
                System.out.print("\nINGRESA LA ALTURA DEL ARBOLITO INVERTIDO: ");
                int altura = tecladoArbolito.nextInt();
                arbolito(altura);
            }
            case 10 -> {
                Scanner tecladoSumar = new Scanner(System.in);
                System.out.print("INGRESE PRIMER NUMERO: ");
                double nSuma1 = tecladoSumar.nextDouble();
                System.out.print("INGRESE SEGUNDO NUMERO: ");
                double nSuma2 = tecladoSumar.nextDouble();
                double sumar = suma(nSuma1, nSuma2);
                System.out.println("EL RESULTADO DE LA SUMA ES: " + sumar);
            }
            case 11 -> {
                Scanner tecladoRestar = new Scanner(System.in);
                System.out.print("INGRESE PRIMER NUMERO: ");
                double nResta1 = tecladoRestar.nextDouble();
                System.out.print("INGRESE SEGUNDO NUMERO: ");
                double nResta2 = tecladoRestar.nextDouble();
                double restar = resta(nResta1, nResta2);
                System.out.println("EL RESULTADO DE LA RESTA ES: " + restar);
            }
            case 12 -> {
                Scanner tecladoMultiplicar = new Scanner(System.in);
                System.out.print("INGRESE PRIMER NUMERO: ");
                double nMultiplicacion1 = tecladoMultiplicar.nextDouble();
                System.out.print("INGRESE SEGUNDO NUMERO: ");
                double nMultiplicacion2 = tecladoMultiplicar.nextDouble();
                double multiplicar = multiplicacion(nMultiplicacion1, nMultiplicacion2);
                System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: " + multiplicar);
            }
            case 13 -> {
                Scanner tecladoDividir = new Scanner(System.in);
                System.out.print("INGRESE PRIMER NUMERO: ");
                double nDividir1 = tecladoDividir.nextDouble();
                System.out.print("INGRESE SEGUNDO NUMERO: ");
                double nDividir2 = tecladoDividir.nextDouble();
                double dividir = division(nDividir1, nDividir2);
                System.out.println("EL RESULTADO DE LA DIVISION ES: " + dividir);
            }
            default -> {
                Scanner tecladoDefault = new Scanner(System.in);
                System.out.println("ERROR DE ENTRADA, POR FAVOR INGRESE UNA OPCION VALIDA.\nPRESIONE ENTER PARA CONTINUAR");
                tecladoDefault.nextLine(); // Espera que el usuario presione cualquier tecla para continuar
                clear(); // Simula limpiar la pantalla
                menu(); // Bucle
            }
        }

    }
    public static void clear(){

        // IMPRIMIR 20 LINEAS PARA SIMULAR LA LIMPIEZA DE PANTALLA
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }


} //fin
