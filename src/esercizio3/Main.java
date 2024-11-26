package esercizio3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> rubrica = new HashMap<>();

        aggiungiContatto(rubrica);

        stampaRubrica(rubrica);

        eliminaContatto(rubrica);
        stampaRubrica(rubrica);


    }

    public static void stampaRubrica(HashMap<String, Integer> rubrica) {
        System.out.println("Rubrica:");
        for (HashMap.Entry<String, Integer> entry : rubrica.entrySet()) {
            String nome = entry.getKey();
            Integer numero = entry.getValue();
            System.out.println(nome + ": " + numero);
        }
    }

    public static void aggiungiContatto(HashMap<String, Integer> rubrica) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti contatti vuoi aggiungere?");
        int contatti = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < contatti; i++) {
            System.out.println("Inserisci nome:");
            String nome = scanner.nextLine();

            System.out.println("Inserisci numero:");
            int numero = scanner.nextInt();
            scanner.nextLine();

            rubrica.put(nome, numero);
            System.out.println("Contatto aggiunto: " + nome + " -> " + numero);
        }
    }

    public static void eliminaContatto(HashMap<String, Integer> rubrica) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il nome del contatto da eliminare:");
        String nome = scanner.nextLine();

        if (rubrica.containsKey(nome)) {
            rubrica.remove(nome); // Rimuove il contatto dalla rubrica
            System.out.println("Contatto eliminato: " + nome);
        } else {
            System.out.println("Contatto non trovato.");
        }


    }



}
