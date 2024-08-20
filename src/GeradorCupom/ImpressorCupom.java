package GeradorCupom;

public class ImpressorCupom {

    public void imprimir(Cupom cupom) {

        StringBuilder conteudo = new StringBuilder();
        conteudo.append(tracos());
        conteudo.append(String.format("%-50s\n\n", cupom.nomeFantasia));

        Endereco end = cupom.endereco;
        conteudo.append(String.format("%-50s\n", end.logradouro + ", N. " + end.numero));
        conteudo.append(String.format("%-50s\n", end.bairro + ", " + end.cidade + " - " + end.uf));

        conteudo.append(String.format("CPF/CNPJ: %-50s\n", cpfCnpj(cupom.cpf)));
        conteudo.append(String.format("Data: %-29s Hora: %s\n", cupom.data, cupom.hora));
        conteudo.append(String.format("IE: %-33s IM: %s\n", cupom.ie, cupom.im));
        conteudo.append(String.format("CCF: %-33d CDD: %d\n", cupom.ccf, cupom.cdd));
        conteudo.append(tracos());
        conteudo.append("CUPOM FISCAL\n");
        conteudo.append(tracos());
        conteudo.append(String.format("%-4s %-5s %-30s %8s\n", "ITEM", "COD.", "DESCRIÇÃO", "VALOR"));

        for (CupomItem item : cupom.itens) {
            conteudo.append(String.format("%-4d %-5d %-30s %8.2f\n",
                    item.ordem, item.sku, item.descricao, item.subtotal));
        }

        conteudo.append(tracos());

        // Exibir conteúdo no console
        System.out.println(conteudo.toString());
    }

    private String tracos() {
        String repeatted = new String(new char[50]).replace("\0", "-");
        return repeatted + "\n";
    }

    private String cpfCnpj(String cpfCnpj) {
        if (cpfCnpj.length() == 11) {
            return cpfCnpj.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        } else {
            return cpfCnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
        }
    }
}
