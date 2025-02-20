import java.util.Scanner;

class soal5 {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        String text1 = input1.nextLine();
        Scanner input2 = new Scanner(System.in);
        String text2 = input2.nextLine();
        System.out.println("The length of text 1 is: " + text1.length());
        System.out.println("The length of text 2 is: " + text2.length());

        if (text1.compareTo(text2) > 0){
            System.out.println("text1 is lexicographically greater than text2");
        }
        else if (text1.compareTo(text2) < 0){
            System.out.println("text1 is lexicographically less than text2");
        }
        else if (text1.compareTo(text2) == 0){
            System.out.println("Same text");
        }

        //Uppercase huruf pertama
        String upper1 = text1.substring(0, 1).toUpperCase();
        String upper2 = text2.substring(0, 1).toUpperCase();
        String cap1 = upper1 + text1.substring(1);
        String cap2 = upper2 + text2.substring(1);

        System.out.println(cap1);
        System.out.println(cap2);
    }
}