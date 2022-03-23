package Tarefa;

import PrimeiraClass.Venda;

public class Academia {

    public static void main(String args []){
        System.out.println("Vem vindo academia Force! ");

        Aluno aluno = new Aluno();
        aluno.setNome("Edson de Oliveira");
        System.out.println(aluno.getNome());

        aluno.cadastrarEndereco("Rua Fiéis de Deus");
        System.out.println(aluno.getEndereco());

        aluno.setMatricula(2048);
        System.out.print("Número: ");
        System.out.println(aluno.getMatricula());

        aluno.setTelefone(913504896);
        System.out.print("Número do telefone: ");
        System.out.println(aluno.getTelefone());

        //Import os dados na Class Vendas.
        System.out.println("\nCompras Realizadas. ");
        Vendas vendas = new Vendas();
        String end = vendas.nomeDoSuplemento();
        System.out.println(end);

        System.out.print("Código: ");
        System.out.println(vendas.codigoDoProduto());

        System.out.print("Quantidade: ");
        System.out.println(vendas.Quantidade());



    }
}
