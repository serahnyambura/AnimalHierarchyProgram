// Subclass representing a Bird
class Bird extends Animal {
    private String featherColor;

    // Constructor for the Bird class
    public Bird(int numberOfLegs, String featherColor) {
        super(numberOfLegs);
        this.featherColor = featherColor;
    }

    // Getter for feather color
    public String getFeatherColor() {
        return featherColor;
    }

    // Override the flee() method for specific bird behavior
    @Override
    public void flee() {
        System.out.println("The bird with " + getNumberOfLegs() + " legs is flying away.");
    }

    // Override the hunt() method for specific bird behavior
    @Override
    public void hunt() {
        System.out.println("The bird with " + getFeatherColor() + " feathers is searching for worms.");
    }
}