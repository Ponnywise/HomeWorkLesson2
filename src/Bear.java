public class Bear extends Mammal implements Fur{

    public Bear(String name) {
        super(name);
    }

    @Override
    public void hasSpine() {
        System.out.println("The " + getName() + " has spine");
    }

    @Override
    public void hasFur() {
        System.out.println("The " + getName() + " has fur");
    }
}
