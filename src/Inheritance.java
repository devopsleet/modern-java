public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        //doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        System.out.println(dog.type);
        //doAnimalStuff(dog, "fast");
    }

//    public static void doAnimalStuff(Animal animal, String speed) {
//
//        animal.makeNoise();
//
//        animal.move(speed);
//
//        System.out.println(animal);
//        System.out.println("-----------");
//    }
}
