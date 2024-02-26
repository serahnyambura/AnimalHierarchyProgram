// Base class representing the concept of an animal family
class Animal {
    private int numberOfLegs;

    // Constructor for the Animal class
    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    // Getter for the number of legs
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    // Method representing the action of the animal fleeing
    public void flee() {
        System.out.println("The animal is fleeing...");
    }

    // Method representing the action of the animal hunting
    public void hunt() {
        System.out.println("The animal is hunting...");
    }
}