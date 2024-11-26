package esercizio3;

public class CreazioneContatto {

   private String nome;
   private int numeroTelefonico;

    public CreazioneContatto(String nome, int numeroTelefonico) {
        this.nome = nome;
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Numero: " + numeroTelefonico;
    }
}
