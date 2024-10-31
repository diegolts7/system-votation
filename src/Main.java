import candidato.Candidato;
import votacao.Votacao;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Votacao minhaUrna = new Votacao();
        minhaUrna.cadastrarCandidato("Diego", "PMDB", 2355);
        minhaUrna.cadastrarCandidato("Savio gayzinho master", "DOKU", 2469);
        minhaUrna.cadastrarVoto(2469);

       minhaUrna.ImprimirCandidatos();

    }
}