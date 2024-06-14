package Activities;


import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Grapes");
        myList.add("Banana");
        myList.add("Orange");

        myList.add(3, "Mango");
        myList.add(1, "Papaya");

        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }

        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Vinod is in list: " + myList.contains("Vinod"));
        System.out.println("Size of ArrayList: " + myList.size());

        myList.remove("Papaya");

        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
