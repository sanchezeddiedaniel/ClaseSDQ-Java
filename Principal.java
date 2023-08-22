public class Principal {


    public static void main(String[] args) {

        TerceraTarea t = new TerceraTarea();
        String a = "ABCDEFghijkl";
        String b = "A1sdfsa";

        System.out.println(t.pares(a));
        System.out.println(t.impares(a));
        System.out.println(t.numbers1(b));
        System.out.println(t.numbers1(a));
        t.unchecked();
        String dat = "Eddie Sanchez";
        t.checkedArchivo(dat);
//        t.checkedWThrows();

    }


}
