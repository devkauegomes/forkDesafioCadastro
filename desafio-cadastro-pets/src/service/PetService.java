package service;

import entity.Pet;

public class PetService {
    private Pet[] pets;
    private int contadorArray;

    public PetService() {
        this.pets = new Pet[5000];
    }

    public void AdicionarPet(Pet pet){
        if (this.contadorArray < this.pets.length){
            this.pets[contadorArray] = pet;
            contadorArray++;
        }
    }

    public void removerPet(Pet pet){
        Pet[] petsNovo = new Pet[this.pets.length - 1];
        int contador = 0;

        for (Pet petOriginal : this.pets){
            if (petOriginal != null){
                if (petOriginal == pet){
                    continue;
                }

                petsNovo[contador] = petOriginal;
                contador++;
            }
        }

        this.pets = petsNovo;
    }

    public void listarPets(){
        for (Pet pet : this.pets){
            if (pet == null) continue;
            System.out.println(pet);
        }
    }


}
