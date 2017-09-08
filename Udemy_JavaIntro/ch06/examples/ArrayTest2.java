package examples;

public class ArrayTest2 {
    public static void main(String args[]) {
        int odds[] = { 1, 3, 5, 7, 9 };
        String bookInfo[][] = { 
                { "Java In a Nutshell", "Flanagan" },
                { "Core Java", "Horstmann" },
                { "Thinking in Java", "Eckel" } };

        for (int num : odds) {
            System.out.println(num);
        }

        for (String[] book : bookInfo) {
            for (String s : book) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
