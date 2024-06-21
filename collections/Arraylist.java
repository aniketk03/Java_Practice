package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Aniket");
        students.add("Yogesh");
        students.add("A");
        students.add("b");
        students.add("c");
        students.add("d");
        students.add("e");

        students.set(1,"Ani");//update
        students.remove(2);//a removed from list
        students.remove(String.valueOf("e"));//removed certain value e
        System.out.println(students.get(0));//get certain value
        System.out.println(students.contains("Aniket"));//boolean


        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        System.out.println(students.addAll(list1));//added two lists

        //printing or traverse

        for(int i=0; i<students.size();i++)
        {
            System.out.println(students.get(i));
        }//by simple for loop

        for(String A : students)
        {
            System.out.println(A);
        }//by for each loop

        //iterator important topic
        Iterator<String> it = students.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println(students);


    }

}
