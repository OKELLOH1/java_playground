public class Pet {
    private String name;
    private String petType;
    private String owner;
    private int age;

    // Constructor
    public Pet(String name, String petType, String owner, int age) {
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.age = age;
    }

    // Getters and setters (optional, but recommended)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Example usage
    public static void main(String[] args) {
        // Create three Pet objects
        Pet pet1 = new Pet("Doggy", "Dog", "Roma", 3);
        Pet pet2 = new Pet("Bunda", "Cat", "Alif", 5);
        Pet pet3 = new Pet("luks", "Hamster", "Jipsy", 1);

        // Print information about each pet
        System.out.println("Pet 1:");
        System.out.println("Name: " + pet1.getName());
        System.out.println("Type: " + pet1.getPetType());
        System.out.println("Owner: " + pet1.getOwner());
        System.out.println("Age: " + pet1.getAge() + " years");
        System.out.println();

        System.out.println("Pet 2:");
        System.out.println("Name: " + pet2.getName());
        System.out.println("Type: " + pet2.getPetType());
        System.out.println("Owner: " + pet2.getOwner());
        System.out.println("Age: " + pet2.getAge() + " years");
        System.out.println();

        System.out.println("Pet 3:");
        System.out.println("Name: " + pet3.getName());
        System.out.println("Type: " + pet3.getPetType());
        System.out.println("Owner: " + pet3.getOwner());
        System.out.println("Age: " + pet3.getAge() + " years");
    }
}