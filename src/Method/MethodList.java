package Method;

public class MethodList {
    String name;
    String gender;
    int age;

//    String tname="Test Name";
//    int tvalu = 55;
//    public static void testmethod(){
//        System.out.println(tname+"  "+tvalu);
//    }

    public void display(){ // public can delete
        System.out.println("Non-Paameterised Method: My Name is "+name+" Address is "+gender+" Age is "+age);
    }
    void set_parameter(String nm,String gd,int ag){
        System.out.println("Parameterised Method: My Name is "+nm+" Address is "+gd+" Age is "+ag);
    }
    int squre(){    //Non-Parameter Return type method
        return 7 * 7;
    }
    int addition(int num1,int num2){ //Parameter Return type method
        int result=num1+num2;
        System.out.println("Addition Result is "+result);
        return result;
    }





}