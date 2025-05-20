import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroCasoTeste = scan.nextInt();
        for (int i = 0; i < numeroCasoTeste; i++) {
            if (scan.hasNextLong()) { // Verifica se é um Long
                long numero = scan.nextLong();
                System.out.println(numero + " can be fitted in:");
                if ((numero >= Byte.MIN_VALUE) && (numero <= Byte.MAX_VALUE))
                    System.out.println("* byte");
                if ((numero >= Short.MIN_VALUE) && (numero <= Short.MAX_VALUE))
                    System.out.println("* short");
                if ((numero >= Integer.MIN_VALUE) && (numero <= Integer.MAX_VALUE))
                    System.out.println("* int");
               if ((numero >= Long.MIN_VALUE) && (numero <= Long.MAX_VALUE))
                    System.out.println("* long");
            }else {
                String valorNaopermitido = scan.next(); //  scan.next() = Descarta a entrada inválida.
                System.out.println(valorNaopermitido + " can't be fitted anywhere.");
            }
        }
    }
}
