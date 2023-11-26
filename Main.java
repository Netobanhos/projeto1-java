//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroPremiado = (new Random()).nextInt(100);
        int tentativas = 0;

        while(tentativas < 5) {
            ++tentativas;
            System.out.println(String.format("Essa é sua %d , tentativa!", tentativas));
            System.out.println("Digite um numero entre 0 e 100: ");
            int leitor = ler.nextInt();
            if (leitor == numeroPremiado) {
                System.out.println("Parabens, você acertou!");
                break;
            }

            if (tentativas == 5) {
                System.out.println("Suas chances acabou, inicie o jogo!");
                break;
            }

            if (leitor > numeroPremiado) {
                System.out.println("Digite um numero menor! ");
            } else if (leitor < numeroPremiado) {
                System.out.println("Digite um numero maior!");
            }
        }

    }
}
