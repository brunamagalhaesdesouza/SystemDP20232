package App;

import Composicao.Endereco;
import Pessoas.Cliente;
import Pessoas.Funcionario;

import java.time.LocalDate;

public class AppMain {

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        Cliente cli1 = new Cliente();
        Endereco end1 = new Endereco();
        LocalDate dataNascimento = LocalDate.of(1990,1,1);

        cli1.cadastrar("mat01", "Programadora", "Bruna", dataNascimento,
                end1, "0817236197236");

        System.out.println("Idade: " + cli1.obterIdade());
    }
}