public class myApp {
    public static void main(String[] args) {

        // char datatype should be envolved by 'test'

        char letter1 = 'L';
        char letter2 = 'u';
        char letter3 = 'c';
        char letter4 = 'a';
        char letter5 = 's';

        String word = new StringBuilder().append(letter1).append(letter2).append(letter3).append(letter4).append(letter5).toString();

        System.out.println("letter1: " + letter1);
        System.out.println("letter2: " + letter2);
        System.out.println("letter3: " + letter3);
        System.out.println("letter4: " + letter4);
        System.out.println("letter5: " + letter5);

        System.out.println("Word: " + word);
    }
}
