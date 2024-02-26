// Subclass representing a Wolf
class Wolf extends Animal {
    private boolean hasPack;

    // Constructor for the Wolf class
    public Wolf(int numberOfLegs, boolean hasPack) {
        super(numberOfLegs);
        this.hasPack = hasPack;
    }

    // Getter for pack existence
    public boolean hasPack() {
        return hasPack;
    }

    // Override the flee() method for specific wolf behavior
    @Override
    public void flee() {
        if (hasPack()) {
            System.out.println("The wolf with " + getNumberOfLegs() + " legs is running in a pack.");
        } else {
            System.out.println("The lone wolf with " + getNumberOfLegs() + " legs is running.");
        }
    }

    // Override the hunt() method for specific wolf behavior
    @Override
    public void hunt() {
        if (hasPack()) {
            System.out.println("The wolf pack with " + getNumberOfLegs() + " legs is hunting in a pack.");
        } else {
            System.out.println("The lone wolf with " + getNumberOfLegs() + " legs is hunting.");
        }
    }
}