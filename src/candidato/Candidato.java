package candidato;

public class Candidato {

    private String nome;
    private String partido;
    private int nVotos;
    private int numeroCandidato;

    public Candidato(String nome, String partido, int numeroCandidato){
        this.nome = nome;
        this.numeroCandidato = numeroCandidato;
        this.partido = partido;
        this.nVotos = 0;
    }

    public void votar(){
        this.nVotos++;
    }

    public int getNVotos(){
        return this.nVotos;
    }

    public String getPartido() {
        return this.partido;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNumeroCandidato() {
        return this.numeroCandidato;
    }
}
