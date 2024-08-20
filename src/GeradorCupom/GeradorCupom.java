package GeradorCupom;

import java.time.LocalDate;
import java.time.LocalTime;

public class GeradorCupom {

    public Cupom gerar() {
        Cupom cupom = new Cupom();
        cupom.data = LocalDate.of(2022,1,6);
        cupom.hora = LocalTime.of(12,12,39);
        cupom.nomeFantasia = "MERCADINHO BIGBOM";

        Endereco endereco = new Endereco();
        endereco.logradouro = "RUA PINDAMOIANGABA";
        endereco.numero = 382;
        endereco.complemento = "FACHADA VERDE";
        endereco.bairro = "VILA DO CHAVES";
        endereco.cidade = "GUARUJÁ";
        endereco.uf = "BA";
        cupom.endereco = endereco;

        cupom.ccf = 120289;
        cupom.cdd = 124857;
        cupom.cpf = "15436978412";
        cupom.ie = "10.457.671-2";
        cupom.im = "08641569";

        CupomItem item01 = new CupomItem();
        item01.ordem = 1;
        item01.sku = 146;
        item01.descricao = "QUIBE CRU";
        item01.preco = 27.9;
        item01.und = "KG";
        item01.quantidade = 0.233;
        item01.subtotal = 5.90;
        cupom.itens.add(item01);

        CupomItem item02 = new CupomItem();
        item02.ordem = 2;
        item02.sku = 138;
        item02.descricao = "ESFIHA";
        item02.preco = 12.0;
        item02.und = "KG";
        item02.quantidade = 0.654;
        item02.subtotal = 18.24;
        cupom.itens.add(item02);

        CupomItem item03 = new CupomItem();
        item03.ordem = 3;
        item03.sku = 75;
        item03.descricao = "BOM-BOM";
        item03.preco = 2.75;
        item03.und = "G";
        item03.quantidade = 0.50;
        item03.subtotal = 2.75;
        cupom.itens.add(item03);

        return cupom;
    }
}
