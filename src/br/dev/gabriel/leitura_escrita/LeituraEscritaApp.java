package br.dev.gabriel.leitura_escrita;

import br.dev.gabriel.leitura_escrita.model.Contato;
import br.dev.gabriel.leitura_escrita.repository.ContatoRepository;

import java.util.Scanner;
import java.util.UUID;

public class LeituraEscritaApp {

    public static void main(String[] args) {
        System.out.println("Leitura escrita app");

        Scanner leitor = new Scanner(System.in);

        Contato contato = new Contato();
        System.out.print("Digite o nome do contato: ");
        contato.nome = leitor.nextLine();
        System.out.print("Digite o email do contato: ");
        contato.email = leitor.nextLine();
        System.out.print("Digite o telefone do contato: ");
        contato.telefone = leitor.nextLine();
        contato.id = UUID.randomUUID().toString();


        ContatoRepository contatoRepository = new ContatoRepository();
        contatoRepository.contato = contato;
        contatoRepository.gravar();
        contatoRepository.exibirContato();
    }
}
