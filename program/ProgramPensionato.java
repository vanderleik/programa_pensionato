package pensionato.program;

import pensionato.entity.Rent;

import java.util.Locale;
import java.util.Scanner;

/**
 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos núme-
 * ros 0 a 9.
 *
 * Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número
 * de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para ca
 * da registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Su-
 * pondo que seja escolhido um quarto vago. Ao final, o programa deve imprimir um relatório de todas as ocupações do pen
 * sionato, por ordem de quarto.
 */
public class ProgramPensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i < n+1; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ": ");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
                if (vect[i] != null) {
                    System.out.println(i + ": " + vect[i]);
                }
        }

        sc.close();
    }
}
