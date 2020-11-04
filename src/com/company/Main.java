package com.company;
import ibadts.IBCollection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IBCollection<String> NAMES = new IBCollection<>();
        NAMES.add(new String[]{"john", "marie"});
        for (int count=0; count<=2; count++)
        {
            NAMES.resetNext();
            while(NAMES.hasNext())
                System.out.println(NAMES.getNext());
        }

    }
}
