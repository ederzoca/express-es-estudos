public class Expressoes {

    public static void main(String[] args) {
        String nome = "Eder";
        String sobrenome = "Silveira";

        // String textoImpresso = "Olá ".concat(nome).concat(" ").concat(sobrenome).concat("!");
        String textoImpresso = String.format("Olá, %s %s!", nome, sobrenome);

        System.out.println(textoImpresso);
    }
}
