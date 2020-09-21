package Constructor;

public class ConstructorList {

    String name;
    String contactNumber;
    int age;

    public ConstructorList(){  // Default Constructor Without Parameter  # 01
        System.out.println("========== Default Constructor Without Parameter ========");
        System.out.println("Hi, this is Belayet");
        System.out.println("173-16 Croydon Road");
     }

    public ConstructorList(String name){ // Single Parameterised Constructor # 02
        System.out.println("============ Single Parameterised Constructor ===========");
        System.out.println("My Name is "+name);
    }
    public ConstructorList(String name,String contactNumber){ // Double Parameterised Constructor # 03
        System.out.println("============ Double Parameterised Constructor ===========");
        //this.name = name;
        //this.contactNumber = contactNumber;
        System.out.println("My Name is "+name+" Contact # is "+contactNumber);
    }
}
