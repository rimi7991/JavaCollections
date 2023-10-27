package com.basicsstrong.arrays;

import java.util.*;

public class ArrayIntroduction {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        ArrayList al1 = new ArrayList();
        ArrayList al2 = new ArrayList(15);
        //ArrayList al3 = new ArrayList(Collection c);
        ArrayList<String> al4 = new ArrayList<String>(0);

        al1.add("John");
        al1.add(true);
        al1.add(1500);
        al1.add(10);

        System.out.println("The entered values are : " + al1);

        al1.remove(1);
        al1.remove(new Integer(10));

        System.out.println("List after removing element :"+al1);

        Iterator iter = al1.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
//        List l = new ArrayList(0);
//        System.out.println("Enter the elements in the arraylist");
//        for(ListIterator iter : al2)
//        {
//            String inputVal = in.nextLine();
//            al2.add(inputVal);
//        }



    }

}
