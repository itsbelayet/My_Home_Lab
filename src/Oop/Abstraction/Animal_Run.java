package Abstraction;

public class Animal_Run {

    public static void main(String[] args){
        Dog dogobj=new Dog();
        dogobj.Guard();
        dogobj.Food();
        dogobj.Play();

        Cow cowobj=new Cow();
        cowobj.Food();
        cowobj.Play();
        cowobj.Guard();
    }
}
