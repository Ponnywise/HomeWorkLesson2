public class Whale extends Mammal implements Water {

    public Whale(String name) {
        super(name);
    }

    @Override
    public void LiveInWater() {
        System.out.println("The " + getName() + " live in water");
    }

    @Override
    public void hasSpine() {
        System.out.println("The " + getName() + " has spine");
    }
}
