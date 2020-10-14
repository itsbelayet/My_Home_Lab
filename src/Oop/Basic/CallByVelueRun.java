package Oop;

public class CallByVelueRun {

    public static void main(String[] args){

        CallByValue obj = new CallByValue();
        int x=100;
        System.out.println("Before Calling x Value "+x);

        obj.Change(x);
        System.out.println("After Calling x Value "+x);

    }

}
