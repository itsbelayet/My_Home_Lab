package Oop;

public class CallByReferRun {

    public static void main(String[] agrs){

        CallByRefer r1 = new CallByRefer();
        r1.name="Miru";
        System.out.println("Befor Calling "+r1.name);

        r1.change(r1);
        System.out.println("After Calling "+r1.name);

    }

}
