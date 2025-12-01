package br.dev.gabriel.leitura_escrita.repository;

import br.dev.gabriel.leitura_escrita.model.Contato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ContatoRepository {

    private Path arquivo = Paths.get("/Users/25203630/arquivos/dados.csv");

    public Contato contato;

    public void gravar(){
        try {
            Files.writeString(arquivo, contato.separarDadosContato(), StandardOpenOption.APPEND);
            System.out.println("Contato gravado com sucesso!");
        } catch (IOException erro) {
            erro.printStackTrace();

        }
    }
    public void exibirContato(){
        try {
            List<String> linhas = Files.readAllLines(arquivo);

            for (String linha : linhas) {
                String[] linhaContato = linha.split(",");
                System.out.println("NOME: " + linhaContato[1]);
                System.out.println("EMAIL: " + linhaContato[2]);
                System.out.println("TELEFONE: " + linhaContato[3]);
                System.out.println("--------------------------------------");

            }

//            int contador = 0;
//            while (contador < linhas.size()){
//                System.out.println(linhas.get(contador));
//
//                contador++;
//           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
