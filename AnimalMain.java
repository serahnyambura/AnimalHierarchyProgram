// Main class to test the Animal and its subclasses
public class AnimalMain {
    public static void main(String[] args) {
        // Create instances of each animal subclass with additional attributes
        Bird sparrow = new Bird(2, "Brown");
        Cat domesticCat = new Cat(4, "Gray");
        Wolf grayWolf = new Wolf(4, true);

        // Demonstrate specific behaviors and attributes of each animal
        System.out.println("Details and Behaviors of a Bird:");
        System.out.println("Number of legs: " + sparrow.getNumberOfLegs());
        System.out.println("Feather color: " + sparrow.getFeatherColor());
        sparrow.flee();
        sparrow.hunt();
        System.out.println();

        System.out.println("Details and Behaviors of a Cat:");
        System.out.println("Number of legs: " + domesticCat.getNumberOfLegs());
        System.out.println("Fur color: " + domesticCat.getFurColor());
        domesticCat.flee();
        domesticCat.hunt();
        System.out.println();

        System.out.println("Details and Behaviors of a Wolf:");
        System.out.println("Number of legs: " + grayWolf.getNumberOfLegs());
        System.out.println("Has a pack: " + grayWolf.hasPack());
        grayWolf.flee();
        grayWolf.hunt();
    }
}