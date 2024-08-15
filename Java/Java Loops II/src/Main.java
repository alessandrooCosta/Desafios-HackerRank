import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int q = scan.nextInt();
        for(int i = 0; i<q ;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for(int j = 0; j<n; j++) {
                a = a + ((int) Math.pow(2, j) * b);// Dessa forma a variavel "a" acumula o valor do resultado do loop anterior.
                System.out.print(a+ " ");
            }
            System.out.println();
        }
    }
}
