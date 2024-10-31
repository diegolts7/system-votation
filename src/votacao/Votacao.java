package votacao;

import candidato.Candidato;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Votacao {
    private Map<Integer,Candidato> candidatos = new HashMap<>();
    private int votosBrancos, votosNulos;

    public Votacao(){
        this.votosBrancos = 0;
        this.votosNulos = 0;
    }

    public int getVotosBrancos() {
        return this.votosBrancos;
    }

    public int getVotosNulos() {
        return this.votosNulos;
    }

    public void cadastrarCandidato(String nome, String partido, int numeroCandidato){
        if (!this.candidatos.containsKey(numeroCandidato)){
            this.candidatos.put(numeroCandidato, new Candidato(nome, partido, numeroCandidato));

        }

    }

    public Map<Integer, Candidato> getCandidatos() {
        return this.candidatos;
    }

    public void cadastrarVoto(int numeroCandido){
        if(this.candidatos.containsKey(numeroCandido)){
                this.candidatos.get(numeroCandido).votar();
        }else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Voto em nenhum candidato, ele será nulo. (y - confirmar. n - negar");
            char infoNulo = scanner.next().charAt(0);
            if (infoNulo == 'y' || infoNulo == 'Y'){
                this.votosNulos++;
            }
        }
    }

    public void ImprimirCandidatos(){
        for(Map.Entry<Integer, Candidato> entry : this.candidatos.entrySet()){
            Candidato candidato = entry.getValue();
            System.out.println(String.format("\nCandidato %s do partido %s com o numero %d\nNumero de votos: %d",
                    candidato.getNome(),candidato.getPartido(),candidato.getNumeroCandidato(),candidato.getNVotos()));
        }
        System.out.println(String.format("\nVotos nulos: %d\nVotos em branco: %d", this.votosNulos,
                this.votosBrancos));
    }
}
