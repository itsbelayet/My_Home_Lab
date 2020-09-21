package Method;

public class RunMethod {

    public static void main(String[] agrs){
        //List_Of_Method.testmethod();

        MethodList obj = new MethodList();
        obj.name="Belayet";
        obj.gender="Male";
        obj.age=55;
        obj.display();

        MethodList obj1 = new MethodList();
        obj1.name="Ismat";
        obj1.gender="Femail";
        obj1.age=60;
        obj1.display();
        //List_Of_Method.display();

        MethodList obj2 = new MethodList();
        obj2.set_parameter("Zakir","Male",50);

        MethodList obj3 =  new MethodList();
        int squre_result=obj3.squre();
        System.out.println(squre_result);

        //System.out.println(obj3.squre()); // or Direct put the object result

        MethodList obj4 =  new MethodList();
        obj4.addition(25,40);


    }
}
