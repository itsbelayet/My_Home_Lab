package Oop.Polymorphism.MethodOverriding;

public class Ismail {

    public void job(){
        System.out.println("He served at Pouroshova");
    }
    public void age(int ag1){
        System.out.println("He was "+ag1+" years old");
    }
    public void salary(int gross,int net){
        int pay=gross-net;
        System.out.println("His Salary was "+pay);
    }
}
