package Abstraction;

public class Dog implements Animal {

    public void Guard(){
        System.out.println("Dog Guard us");
    }

    public void Food() {
        System.out.println("Dog take food");
    }

    public void Play() {
        System.out.println("Dog Play with his master");
    }
}
