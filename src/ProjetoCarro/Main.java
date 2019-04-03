package ProjetoCarro;

public class Main {
    public static void main(String args[]){
        Proprietario proprietario = new Proprietario("Lucas", 654);
        proprietario.nome = "Joao Lucas";
        proprietario.bairro = "Pedreira";
        proprietario.cep = 66085540;
        proprietario.cidade = "Bel�m";
        proprietario.complemento = "Casa 31b";
        proprietario.cpf = 65465;
        proprietario.rua = "Marqu�s de herval";
        proprietario.rg = 654654;
        proprietario.estado = "Par�";
        proprietario.dataNascimento = "16/09/1996";

        Carro carro = new Carro();
        carro.proprietario = proprietario;
        carro.numPortas = 4;
        carro.numMarchas = 5;
        carro.velocidadeAtual = 10;
        carro.marchaAtual = 3;
        carro.modelo = "R4VA";
        carro.ano = 2019;
        carro.cambioAutomatico = true;
        carro.cor = "Vermelho";
        carro.marca = "Toyota";
        carro.tetoSolar = false;
        carro.velocidadeMax = 350;
        carro.volCombustivel = 25;

        System.out.println(carro.velocidadeAtual);
        carro.acelera();
        carro.acelera();
        carro.freia();
        System.out.println(carro.velocidadeAtual);

        System.out.println(carro.marchaAtual);
        carro.trocaMarcha(10);
        System.out.println(carro.marchaAtual);
        System.out.println(carro.proprietario.nome);

    }
}