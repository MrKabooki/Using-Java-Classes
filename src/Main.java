import java.util.Scanner;

public class Main {

    public static void change(String anyString){ // cant call a non-static method from main if main is static
        anyString = "123";
    }

    public static void change(int i){
        i = 100;
    }

    public static void main(String[] args)  {

        int d = 5;
        String name = "default name";
        Scanner myScan = new Scanner(System.in);

        System.out.print("Enter your number: ");
        d = myScan.nextInt();

        System.out.print("Enter your name: ");
        name = (new Scanner(System.in).nextLine());

        System.out.println("[" + name + "], " + d);

        myScan.close();
        
        

        // String string = "abc, g, 123,, 89";
        // String fields[];

        // fields = string.split(",");  

        // for(String s: fields){ // outputs each index of the field array
        //     System.out.println("[" + s + "]");
        // }

        // System.out.println("abc".compareTo("aBc")); // returns ascii value
        // System.out.println("dac".compareToIgnoreCase("paiIIi"));

        // String name1 = "Aaron Singh";
        // change(name1); // does not work

        // int i = 8;
        // change(i); // does not work
        // System.out.println(i);

        // System.out.println(name1);

        // String name1 = "Aaron Singh"; // string is a class in a package called lang
        // String name2 = "Aaron Singh"; // both pointing to the same thing in the string pool (java does it behind the scenes)
        // String name3 = new String("Aaron Singh");
        // byte array[] = {36, 37};

        // String string1 = new String(array);
        // String string2 = new String();

        // System.out.println(name1 + "|" + string1 + "|" + string2 + "|");

        // System.out.println(string2.length());

        // System.out.println(name1 == name2); // proves the theory listed above
        // System.out.println(name3 == name2); // notice the difference in line 17 and the output of it
        // System.out.println(name3.equals(name1));
        // System.out.println(name3.equals(name2));
    }
}
