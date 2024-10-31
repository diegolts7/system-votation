import candidato.Candidato;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Candidato diego = new Candidato("Diego","PMDB",2355);
        System.out.println(diego.getNome());
    }
}