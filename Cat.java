// Subclass representing a Cat
class Cat extends Animal {
    private String furColor;

    // Constructor for the Cat class
    public Cat(int numberOfLegs, String furColor) {
        super(numberOfLegs);
        this.furColor = furColor;
    }

    // Getter for fur color
    public String getFurColor() {
        return furColor;
    }

    // Override the flee() method for specific cat behavior
    @Override
    public void flee() {
        System.out.println("The cat with " + getFurColor() + " fur is running away quickly.");
    }

    // Override the hunt() method for specific cat behavior
    @Override
    public void hunt() {
        System.out.println("The cat with " + getNumberOfLegs() + " legs is pouncing on prey.");
    }
}