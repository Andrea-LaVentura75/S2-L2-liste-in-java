package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        System.out.println("Quante frasi vuoi inserire");
        int numeroFrasi = scanner.nextInt();
        scanner.nextLine();

        Set<String> paroleSingole = new TreeSet<>();

        Set<String> paroleDuplicate = new TreeSet<>();

        Set<String> paroleNellaFrase = new HashSet<>();

        for (int i = 0; i < numeroFrasi; i++) {

            System.out.println("Inserisci una frase");
            String frase = scanner.nextLine();
            String[] parole = frase.split(" ");



            for(String parola:parole){
                if(paroleNellaFrase.add(parola)){
                    paroleSingole.add(parola);
                }else{
                    paroleDuplicate.add(parola);
                }
            }
        }

        paroleSingole.removeAll(paroleDuplicate);


        System.out.println("parole duplicate:");
        for(String parola:paroleDuplicate){
            System.out.println( parola);
        }

        System.out.println("numero di parole singole nella frase: " + paroleSingole.size());
        for (String parola: paroleSingole) {
            System.out.println(parola);
        }

    }

}
