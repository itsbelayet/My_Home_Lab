package Abstraction;

public abstract class Abstract_Class {

        String carName="Toyota";
        int modelYear=2010;

        public abstract void Display();
        public abstract void Navigation();

        public void AutoGear(){
            System.out.println("This is Auto Gear Car");

        }
}
