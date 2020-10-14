package Oop.Polymorphism.MethodOverriding;

public class Miru extends Ismail{
    public void job(){
        System.out.println("He served at Titas Gas");
    }
    public void age(int ag1){
        System.out.println("He is "+ag1+" years old");
    }
    public void salary(int gross,int net){
        int pay=gross-net;
        System.out.println("His Monthly Salary is "+(pay*4));
    }
}
