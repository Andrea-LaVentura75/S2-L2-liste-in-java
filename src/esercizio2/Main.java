package esercizio2;

import java.util.*;

public class Main {

    public static List<Integer> generaListaCasuale(int n){

        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(101));
        }

        Collections.sort(lista);
        return lista;
    }

    public static  List<Integer> creareListaInversa(List<Integer> listaOriginale){

        List<Integer> nuovaLista = new ArrayList<>(listaOriginale);

        List<Integer> inversa =new ArrayList<>(listaOriginale);
        Collections.reverse(inversa);
        nuovaLista.addAll(inversa);

        return nuovaLista;
    }

    public static void stampaPosizioni(List<Integer> lista, boolean stampaPari){

        System.out.println("Valori in posizioni " + (stampaPari ? "pari" : "dispari") + ":");

        for (int i = 0; i < lista.size(); i++) {
            if(stampaPari && i % 2 ==0){
                System.out.println(lista.get(i));
            }else if(!stampaPari && i % 2 != 0){
                System.out.println(lista.get(i));
            }
        }
    }

    public static void main(String[] args) {

        int n =7;

        List<Integer> listaCasuale = generaListaCasuale(n);
        System.out.println("Lista casuale ordinata:");
        System.out.println(listaCasuale);

        List<Integer> listaInvertita = creareListaInversa(listaCasuale);
        System.out.println("Lista con elementi e ordine inverso:");
        System.out.println(listaInvertita);

        boolean stampaPari = true;
        stampaPosizioni(listaCasuale, stampaPari);

    }

}

