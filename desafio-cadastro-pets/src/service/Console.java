package service;

import entity.Endereco;
import entity.Pet;
import entity.SexoPet;
import entity.TipoPet;
import util.ConstanteUtils;
import util.PrintUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Console {

    public static void menuOpcoesUsuario() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        PetService petService = new PetService();

        while (true) {
            PrintUtils.mostrarOpcoes();
            System.out.print("\nDigite a opção: ");
            String opcaoString = sc.nextLine();
            System.out.println();
            int opcao;
            try {
                opcao = Integer.parseInt(opcaoString);
                if (opcao <= 0 || opcao > 6) {
                    System.out.println("\nDigite um número válido.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("\nDigite um número válido.");
                continue;
            }

            switch (opcao) {
                case 1:
                    Pet pet = formularioCadastroPet();
                    petService.adicionarPet(pet);
                    break;
                case 4:
                    petService.listarPets();
                    break;
                case 6:
                    break;
            }

            if (opcao == 6){
                break;
            }
        }
    }

    public static Pet formularioCadastroPet() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        File file = new File("perguntas.txt");
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
            System.out.println(br.readLine());
            System.out.print("Nome e sobrenome do Pet: ");
            String nomeSobrenomePet;

            while (true){
                nomeSobrenomePet = sc.nextLine();
                if (nomeSobrenomePet.isBlank()){
                    nomeSobrenomePet = null;
                    break;
                }else if (nomeSobrenomePet.matches("[a-zA-Z]+(\\s[a-zA-Z]+)+")){
                    break;
                }
                System.out.print("Nome e sobrenome inválidos, digite novamente: ");
            }


            System.out.println(br.readLine());
            System.out.print("Digite '1'(Cachorro) ou '2'(Gato): ");
            String tipoDoPetString = sc.next();
            int tipoDoPet;
            while (true) {
                try {
                    tipoDoPet = Integer.parseInt(tipoDoPetString);
                    while (tipoDoPet > 2 || tipoDoPet < 1) {
                        System.out.print("Opção inválida, digite '1'(Cachorro) ou '2'(Gato): ");
                        tipoDoPetString = sc.next();
                        tipoDoPet = Integer.parseInt(tipoDoPetString);
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Opção inválida, digite '1'(Cachorro) ou '2'(Gato): ");
                    tipoDoPetString = sc.next();
                }
            }

            TipoPet tipoPetEnum = switch (tipoDoPet) {
                case 1 -> TipoPet.CACHORRO;
                case 2 -> TipoPet.GATO;
                default -> null;
            };



            System.out.println(br.readLine());
            System.out.print("Digite '1'(Macho) ou '2'(Fêmea): ");
            String sexoDoPetString = sc.next();
            int sexoDoPet;

            while (true) {
                try {
                    sexoDoPet = Integer.parseInt(sexoDoPetString);
                    while (sexoDoPet < 1 || sexoDoPet > 2) {
                        System.out.print("Opção inválida, digite '1'(Macho) ou '2'(Fêmea): ");
                        sexoDoPetString = sc.next();
                        sexoDoPet = Integer.parseInt(sexoDoPetString);
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Opção inválida, digite '1'(Macho) ou '2'(Fêmea): ");
                    sexoDoPetString = sc.next();
                }
            }

            SexoPet sexoPetEnum = switch (sexoDoPet) {
                case 1 -> SexoPet.MACHO;
                case 2 -> SexoPet.FEMEA;
                default -> null;
            };



            System.out.println(br.readLine());
            System.out.print("Digite o número da casa(opcional): ");
            sc.nextLine();
            Integer numeroDaCasa = null;
            while (true) {
                String numeroDaCasaString = sc.nextLine();
                if (numeroDaCasaString.isBlank()){
                    break;
                }else {
                    try {
                        numeroDaCasa = Integer.parseInt(numeroDaCasaString);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("O número da casa é inválido, digite novamente: ");
                    }
                }
            }


            System.out.print("Digite a cidade: ");
            String cidade = sc.nextLine();
            while (!cidade.matches("\\D+")) {
                System.out.print("A cidade digitada é inválida, digite novamente: ");
                cidade = sc.nextLine();
            }

            System.out.print("Digite a rua: ");
            String rua = sc.nextLine();
            while (!rua.matches("\\D+")) {
                System.out.print("A rua digitada é inválida, digite novamente: ");
                rua = sc.nextLine();
            }

            System.out.print("Digite o bairro: ");
            String bairro = sc.nextLine();
            while (!bairro.matches("\\D+")) {
                System.out.print("O bairro digitado é inválido, digite novamente: ");
                bairro = sc.nextLine();
            }



            System.out.println(br.readLine());
            System.out.print("Digite a idade do Pet(Ex: 3 anos ou 0.3 meses): ");
            Double idade = null;
            while (true) {
                String idadeString = sc.nextLine();
                if (idadeString.isBlank()) {
                    break;
                } else {
                    try {
                        idade = Double.parseDouble(idadeString);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.print("A idade informada é inválida, digite novamente: ");
                    }
                }
            }

            System.out.println(br.readLine());
            System.out.print("Digite o peso do Pet(kg): ");
            Double peso = null;
            while (true) {
                String pesoString = sc.nextLine();
                if (pesoString.isBlank()) {
                    break;
                } else {
                    try {
                        peso = Double.parseDouble(pesoString);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.print("O peso informado é inválido, digite novamente: ");
                    }
                }
            }

            System.out.println(br.readLine());
            System.out.print("Digite a raça do Pet: ");
            String racaPet;

            while (true){
                racaPet = sc.nextLine();
                if (!racaPet.matches("\\D*")){
                    System.out.print("A raça informada não é válida, digite novamente: ");
                    continue;
                } else if (racaPet.isBlank()) {
                    racaPet = ConstanteUtils.NAO_INFORMADO;
                }
                break;
            }

            Endereco endereco = new Endereco(numeroDaCasa, cidade, rua, bairro);
            return new Pet(nomeSobrenomePet, tipoPetEnum, sexoPetEnum, endereco, idade, peso, racaPet);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
