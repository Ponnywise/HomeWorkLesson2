//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bear teddy = new Bear("Teddy");
        Fish dish = new Fish("Dish");
        Cat kitty = new Cat("Kitty");
        Whale dale = new Whale("Dale");


        System.out.println("Hi, I am a " + teddy.getName());
        teddy.hasFur();
        teddy.hasSpine();
        System.out.println();
        System.out.println("Hi, I am a " + kitty.getName());
        kitty.hasFur();
        kitty.hasSpine();


    }
}