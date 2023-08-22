import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TerceraTarea {

    public void checkedArchivo(String datos){
        File file = new File("archivo.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(datos);
            fileWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Archivo Creado");
    }
    public void unchecked(){
        Scanner tecla1 = new Scanner(System.in);
        double ressuma = 0;
        boolean bootloop;
        do {
            try {
                bootloop = false;
                System.out.print("Primer Numero: ");
                double a = tecla1.nextDouble();
                System.out.print("Segundo Numero: ");
                double b = tecla1.nextDouble();
                ressuma = suma(a,b);
                System.out.println("Resultado: " + ressuma);
            } catch (InputMismatchException ex){
                System.out.println("Ingrese Solo Numeros...");
                tecla1.next();
                bootloop = true;
//            }
            }
        } while (bootloop);
    }

    public double suma(double a, double b){
        return a + b;
    }

    public String pares(String ch) {
        String res = "";
        for (int i =0; i < ch.length(); i++){
            if (i % 2 == 0){
                res += ch.charAt(i);
            }
        }
        return res;
    }

    public String impares(String ch2) {
        String res2 = "";
        for (int i =0; i < ch2.length(); i++){
            if (i % 2 != 0){
                res2 += ch2.charAt(i);
            }
        }
        return res2;
    }

    public boolean numbers1(String ch3){
        for (int i =0; i < ch3.length(); i++){
            if (Character.isDigit((ch3.charAt(i)))){
                return true;
            }
        }
        return false;
    }

    public boolean numbers2(String ch4){
        for (int i =0; i < ch4.length(); i++){
            if (Character.isDigit((ch4.charAt(i)))){
                return true;
            }
        }
        return false;
    }

    public void checkedWThrows() throws FileNotFoundException {
        File doc = new File("Nuevo-Archivo.txt");
//        FileInputStream stream = new FileInputStream(doc);

        try {
            FileInputStream stream = new FileInputStream(doc);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }


}
