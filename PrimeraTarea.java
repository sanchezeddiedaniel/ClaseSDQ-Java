import java.sql.SQLOutput;
import java.util.IllegalFormatCodePointException;

public class PrimeraTarea {

    public static void main(String[] args) {


        System.out.println("CALCULO DEL INDICE DE MASA CORPORAL DE UNA PERSONA");
        double peso = 90; double estatura = 1.3; double imc = (peso/(estatura*estatura));

        System.out.print("PESO: " + peso + "Kg \nESTATURA: "+ estatura +"m");
        System.out.println("\nSU INDICE DE MASA CORPORAL ES: " + imc + "\nY ESTE INDICA QUE ESTAS:");
        if (imc < 18.5){
            System.out.println("IF: BAJO PESO");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("IF: NORMAL");
        }else if (imc >= 25 && imc <= 29.9){
            System.out.println("IF: SOBRE PESO");
        } else {
            System.out.println("IF: OBESO");
        }
        System.out.println();
        double imc2 = Math.round(imc);
        int imc3 = (int)imc2;
        switch (imc3){
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
            case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17:
                System.out.println("SW: BAJO PESO");
                break;
            case 18: case 19: case 20: case 21: case 22: case 23: case 24:
                System.out.println("SW: NORMAL");
                break;
            case 25: case 26: case 27: case 28: case 29: case 30:
                System.out.println("SW: SOBRE PESO");
                break;
            default:
                if (imc3 < 0 ){
                    System.out.println("Su IMC esta por debajo de 0");
                } else {
                    System.out.println("SW: OBESO");
                }
                break;

        }


        System.out.println();
        System.out.println("CALCULO DEL PROMEDIO DE 4 MATERIAS");
        int n1 = 90; int n2 = 100; int n3 = 81; int n4 = 74; int prom = (n1+n2+n3+n4)/4;
        System.out.println(
                "Nota 1: " + n1 +"\nNota 2: " + n2 + "\nNota 3: " + n3+ "\nNota 4: " + n4 + "\n\nPromedio: " + prom);

        System.out.println();
        System.out.println("CALCULO DEL AREA DE UN TRIANGULO");
        int b = 20; int a = 10; int r = (b*a)/2;
        System.out.println("Base: " + b + "\nAltura: " + a + "\n\nResultado: " + r );

        System.out.println();
        System.out.println("TABLA DEL 3 USANDO EL BUCLE FOR");

        int num = 3; //el numero de la tabla
        for(int i = 1; i <= 12; ++i) // bucle que llegue la tabla hasta el 12
        {
            System.out.println(num +" * " + i + " = " + num * i);
        }

        System.out.println();
        System.out.println("TABLA DEL 3 USANDO BUCLE DO-WHILE");
        int z = 1;
        int x = 3;
        do {
            System.out.println( x + " * " + z + " = " + z * x);
            z++;
        }while (z<=12);
        System.out.println();

        System.out.println("TABLA DEL 3 USANDO BUCLE WHILE");
        int j = 1;
        int num2 = 3;
        while (j<13){
            System.out.println(num2+ " * " + j + " = " + num2*j);
            j++;
        }
        System.out.println();

    }

}
