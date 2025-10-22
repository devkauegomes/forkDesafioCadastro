import entity.Endereco;
import entity.Pet;
import entity.SexoPet;
import entity.TipoPet;
import service.PetService;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(52, "Panelas",
                "Rua Manoel Benigno", "Centro");
        Pet dog = new Pet("Zeus", "Silva",
                TipoPet.CACHORRO, SexoPet.MACHO, endereco,
                4, 13, "Viralata");

        PetService petService = new PetService();

        petService.AdicionarPet(dog);
        petService.listarPets();
        petService.removerPet(dog);
        System.out.println("########################");
        petService.listarPets();
    }
}
