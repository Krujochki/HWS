public class Animal {
    String tipe;

    Animal(String tipe){
        if (tipe == "Herbivore" || tipe == "Predator"){
            this.tipe = tipe;
        }
    }
}
