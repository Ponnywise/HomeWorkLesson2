public class Cat extends Mammal implements Fur{


    public Cat(String name) {
        super(name);
    }

    @Override
    public void hasFur() {
        System.out.println("The " + getName() + " has fur");
    }

    @Override
    public void hasSpine() {
        System.out.println("The " + getName() + " has spine");
    }
}
