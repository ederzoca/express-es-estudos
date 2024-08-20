import java.time.LocalDate;

public class Expressoes2 {

    public static void main(String[] args) {
        String nome = "Eder Silveira";
        Integer matricula = 794;
        Double salario = 2000.0;
        LocalDate dataAdmissao = LocalDate.now();

        // String textoImpresso = "Olá ".concat(nome).concat(" ").concat(sobrenome).concat("!");
        //String textoImpresso = String.format("Olá, %s %s!", nome, sobrenome);

        String dadosFuncionario = String.format("Matrícula: %05d Nome: %-20.20s Salário: %,.2f Data: %td/%<tm/%<ty",
                matricula, nome, salario, dataAdmissao);

        //%05d -> indica que deve ter 5 dígitos ou zero a esquerda
        //%-20s -> determina alinhamento após a string, mas a quantidade de dígitos da String entra na conta
        //%-20.20s -> se exceder os 20 caracteres ele irá cortar o nome
        //%2f -> indica que terá 2 digitos apos a virgula
        //%,.2f -> faz a formatação do ponto e vírgula dos dígitos


        System.out.println(dadosFuncionario);
    }
}