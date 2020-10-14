package Abstraction;

public class Cow implements Animal{

    public void Guard() {
        System.out.println("Cow Can't Guard us");
    }

    public void Food() {
        System.out.println("Cow gives us milk");
    }

    public void Play() {
        System.out.println("Cow Can't play");
    }
}
