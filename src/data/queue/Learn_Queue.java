package dataQueue;

import java.util.LinkedList;
import java.util.Queue;

// Peek only peek data from the list
// Poll peek first data then remove from the list
public class Learn_Queue {

    public static void main(String[] args){

        Queue<String> vname = new LinkedList<>();
        vname.add("Mohammed");
        vname.add("Belayet");
        vname.add("Hossain");
        vname.add("Miru");


        Queue<Integer> vint = new LinkedList<>();
        vint.add(30);
        vint.add(40);
        vint.add(50);
        vint.add(60);

        for(String vn:vname){
            System.out.println(vn);
        }
        System.out.println(vname.peek()+"  Peek value");
        System.out.println(vname.poll()+"  Poll value");
        System.out.println(vname.peek()+"  Peek value");
        System.out.println(vname.poll()+"  Poll value");
        System.out.println(vname.poll()+"  Poll value");

        for(String vn:vname){
            System.out.println(vn);
        }
        System.out.println(vname.remove()+"  Remove value");



        System.out.println("*************************************");
        for (Integer vn:vint) {
            System.out.println(vn);
        }
        System.out.println(vint.peek());
        System.out.println(vint.peek());
        System.out.println(vint.peek());

    }
}
