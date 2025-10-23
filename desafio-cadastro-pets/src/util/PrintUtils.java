package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PrintUtils {
    public static void mostrarPerguntas(){
        System.out.println();
        File file = new File("perguntas.txt");
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void mostrarOpcoes(){
        System.out.println("\nEscolha uma das opções abaixo digitando o respectivo número:");
        System.out.println("1 - Cadastrar um novo pet");
        System.out.println("2 - Alterar os dados do pet cadastrado");
        System.out.println("3 - Deletar um pet cadastrado");
        System.out.println("4 - Listar todos os pets cadastrados");
        System.out.println("5 - Listar pets por algum critério (idade, nome, raça)");
        System.out.println("6 - Sair");
    }

}
