public class Fish extends Animal implements Water {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void LiveInWater() {
        System.out.println("The " + getName() + " live in water");
    }
}
