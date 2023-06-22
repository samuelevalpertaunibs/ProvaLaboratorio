package it.unibs.fp.astaquadri;

public class Autore {
    private String nome;
    private String cognome;
    private String nomeArte;

    public Autore(String nome, String cognome, String nomeArte) {
        this.nome = nome;
        this.cognome = cognome;
        this.nomeArte = nomeArte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNomeArte() {
        return nomeArte;
    }

    public void setNomeArte(String nomeArte) {
        this.nomeArte = nomeArte;
    }
}
