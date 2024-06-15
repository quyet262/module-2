package ss7.thuc_hanh.interface_edible;

public class Chicken extends Animal implements Edible{
    public String makeSound(){
        return "Chicken: cục tác cục tác";
    };

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
