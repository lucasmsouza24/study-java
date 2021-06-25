import java.util.*;

public class myApp {
    public static void main(String[] args) {
        List<Integer> myArray = new ArrayList<Integer>();

        myArray.add(1);
        myArray.add(1);
        myArray.add(3);
        myArray.add(7);
        myArray.add(11);

        myArray.set(0, 0);

        System.out.println(myArray);
    }
}
