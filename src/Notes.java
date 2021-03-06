import static java.lang.Math.E;
import static java.lang.Math.PI;

public class  Notes {

    public static void main(String args[]) {

        //Website: http://www.cs.princeton.edu/IntroProgramming
        //DATE 12/8/17
        //Chapter 1.2
        //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Pg. 15
        //Integers, declared as int, are numbers such as 00, -12, 2147483647, and so on. There are no decimals in integers
        int integerVariable = 5;
        System.out.println("My integer variable: " + integerVariable);
        /*

        Common operators:

        +: Simple addition
        -: Simple subtraction
        *: Simple multiplication
        /: Simple division
        %: Taking whatevers is left after you multiply something Ex: 3 % 2 = 1

         */
        System.out.print("Integer addition (integer + 1): ");
        System.out.println(integerVariable + 1);
        System.out.print("Integer subtraction (integer - 1): ");
        System.out.println(integerVariable - 1);
        System.out.print("Integer multiplication (integer * 2): ");
        System.out.println(integerVariable * 2);
        //NOTE: Division with integers will leave you with a number that doesn't include the remainder, so your answer with not be correct.
        System.out.print("Integer division (integer / 2): ");
        System.out.println(integerVariable / 2);
        System.out.print("Integer remainder function (integer % 2): ");
        System.out.println(integerVariable % 2);
        System.out.println();
        //Floating-point numbers, declared as double, are any numbers, such as 3.14, -2.5 and 6.022e23
        double floatingPointVariable = 4.5;
        System.out.println("My double variable: " + floatingPointVariable);
        /*

        Common operators:

        +: Simple addition
        -: Simlpe subtraction
        *: Simple multiplication
        /: Simple division


         */
        System.out.print("Double addition (double + 1): ");
        System.out.println(floatingPointVariable + 1);
        System.out.print("Double subtraction (double - 1): ");
        System.out.println(floatingPointVariable - 1);
        System.out.print("Double multiplication (double * 2): ");
        System.out.println(floatingPointVariable * 2 );
        System.out.print("Double division (double / 2): ");
        System.out.println(floatingPointVariable / 2);
        System.out.println();
        //Boolean values, declared as boolean, are values of true and false
        boolean booleanOne = true;
        boolean booleanTwo = false;
        /*

        Common operators:

        &&: Both booleans have to be true in order for it to evaluate as true
        ||: Only one of the booleans has to be true in order for it to be evaluated as true
        !: This will evaluate the boolean as the opposite of whatever it should be

         */
        System.out.print("Using the && operator: ");
        System.out.println(booleanOne && booleanTwo);
        System.out.print("Using the || operator: ");
        System.out.println(booleanOne || booleanTwo);
        System.out.print("Using the ! operator: ");
        System.out.println(!booleanOne);
        System.out.println();
        // DATE 12/11/17
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Characters, declared as char are any one symbol on the keyboard. ex: A, 1, %, and \n. You use '' around the characters to identify them as charaters
        char characterVariable = 'A';
        System.out.println("My Character: " + characterVariable);
        System.out.println();
        //Strings, are sequences of characters. ex: "AB" "Hello" "2.5"
        //Common operators: +, used to add two strings together
        String stringVariableA = "This is my first string";
        System.out.println(stringVariableA);
        String stringVariableB = "and this is my second string";
        System.out.println(stringVariableB);
        System.out.println(stringVariableA + " " + stringVariableB);
        System.out.println();
        //Pg. 28
        /*

       op          meaning         true        false
       ---------------------------------------------
       ==          equal           2 == 2      2 == 3
       !=          not equal       3 != 2     2 != 2
       <           less than       2 < 13      2 < 2
       <-      less than or equal  2 <= 2     3 <= 2
       >           greater than    13 > 2      2 > 13
       >=   greater than or equal  3 >= 2      2 >= 3

       */
        //void print(String x) || prints out text, but doesn't move cursor to the next line
        System.out.print("System.out.print test");
        System.out.print(" This is a different method on the same line");
        //void println(String x) || You can use System.out.println With a blank variables space so that it just moves the cursor to the next line
        System.out.println();
        System.out.println("System.out.println test");
        System.out.println();
        //NOTE: Any type of data can be used, and will be automatically converted to string
        //Functions in Java's Math library
        //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //DATE 12/12/17
        //----------------------------------------------------------------------------------------------------------------------
        //pg. 29
        double a;
        double b;
        double theta;
        double ratio;
        double doubleResult;
        int intResult;
        long longResult;
        String s;
        //Math Library
        //double abs(double a) || returns the absolute value of a
        a = -1;
        System.out.println("a: " + a);
        doubleResult = Math.abs(a);
        System.out.println("The absolute value of a: " + doubleResult);
        System.out.println();
        //double max(double a, double b) || returns the maximum of a and b
        a = 2;
        b = 5;
        System.out.println("a: " + a +", b: " + b);
        doubleResult = Math.max(a, b);
        System.out.println("The maximum of a and b: " + doubleResult);
        System.out.println();
        //double min(double a, double b) || returns the minimum of a and b
        a = 4;
        b = 6;
        System.out.println("a: " + a + ", b: " + b);
        doubleResult = Math.min(a, b);
        System.out.println("The minimum of a and b: " + doubleResult);
        System.out.println();
        //NOTE: These functions are also defined  for int, long, and float
        //double sin(double theta) || returns the sine ratio of theta
        theta = 22; //Degrees
        System.out.println("theta: " + theta + " degrees");
        theta = Math.toRadians(theta); //Radians
        System.out.println("theta: " + theta + " radians");
        doubleResult = Math.sin(theta);
        System.out.println("Sine of theta: " + doubleResult);
        System.out.println();
        //double asin(double ratio) || returns the inverse sine of the ratio
        ratio = 0.4;
        System.out.println("ratio: " + ratio);
        doubleResult = Math.asin(ratio);
        System.out.println("Inverse sine of the ratio (radians): " + doubleResult + " radians");
        doubleResult = Math.toDegrees(ratio);
        System.out.println("Inverse sine of the ratio (degrees): " + doubleResult + " degrees");
        System.out.println();
        //double cos(double theta) || returns the cosine ratio of theta
        theta = 44; //Degrees
        System.out.println("theta: " + theta + " degrees");
        theta = Math.toRadians(theta); //Radians
        System.out.println("theta: " + theta + " radians");
        doubleResult = Math.cos(theta);
        System.out.println("Cosine of theta: " + doubleResult);
        System.out.println();
        //double acos(double ratio) || returns the inverse cosine of the ratio
        ratio = 0.5;
        System.out.println("ratio: " + ratio);
        doubleResult = Math.asin(ratio);
        System.out.println("Inverse cosine of the ratio (radians): " + doubleResult + " radians");
        doubleResult = Math.toDegrees(doubleResult);
        System.out.println("Inverse cosine of the ratio (degrees): " + doubleResult + " degrees");
        System.out.println();
        //double tan(double theta) || returns the tangent ratio of theta
        theta = 45;
        System.out.println("theta: " + theta + " degrees");
        theta = Math.toRadians(theta);
        System.out.println("theta: " + theta + " radians");
        doubleResult = Math.tan(theta);
        System.out.println("Tangeant of theta: " + doubleResult);
        System.out.println();
        //DATE 12/13/17
        //----------------------------------------------------------------------------------------------------------------------------
        //double atan(double ratio) || returns the inverse tangent of theta
        ratio = 0.5;
        System.out.println("ratio: " + ratio);
        doubleResult = Math.atan(ratio);
        System.out.println("Inverse tangeant of the ratio (radians): " + doubleResult);
        doubleResult = Math.toDegrees(ratio);
        System.out.println("Inverse tangeant of the ratio (degrees): " + doubleResult);
        System.out.println();
        //NOTE: To use trig functions, you must convert angles to radians. Use toDegrees() and toRadians() to convert
        //double exp(double a) DON'T KNOW YET
        //double log(double a) DON'T KNOW YET
        //double pow(double a, double b) || raise a to the bth power (a^b)
        a = 2;
        b = 3;
        System.out.println("a: " + a + ", b: " + b);
        doubleResult = Math.pow(a, b);
        System.out.println("a raised to the bth power: " + doubleResult);
        System.out.println();
        //long round(double a) || round to the nearest integer
        a = 2.51;
        System.out.println("a: " + a);
        longResult = Math.round(a);
        System.out.println("a rounded to the nearest integer: " + longResult);
        System.out.println();
        //double random() || random number between 0 and 1
        doubleResult = Math.random();
        System.out.println("Random number between 0 and 1: " + doubleResult);
        System.out.println();
        //double E || the value of e (constant)
        a = E;
        System.out.println("E: " + a);
        System.out.println();
        //double PI || the value of pi (constant)
        a = PI;
        System.out.println("PI: " + a);
        System.out.println();
        //int Integer.parseInt(String s) || convert s to an int value
        s = "123";
        System.out.println("My string: " + s);
        intResult = Integer.parseInt(s);
        System.out.println("String converted to an integer: " + intResult);
        System.out.println();
        //double Double.parseDouble(String s) || convert s to a double value
        s = "1.23";
        System.out.println("My string: " + s);
        doubleResult = Double.parseDouble(s);
        System.out.println("String converted to a double: " + doubleResult);
        System.out.println();
        //int Long.parseLong(String s) || convert s to a long value
        s = "3000000000";
        System.out.println("My string: " + s);
        longResult = Long.parseLong(s);
        System.out.println("String converted to a long: " + longResult);
        System.out.println();
        //DATE 12/14/17
        //p.32
        /*

        expression          expression type         expression value
        -------------------------------------------------------------
        "1234" + 99               String                  "123499"
        Integer.parseInt("123")   int                        123
        (int) 2.71828             int                         2
        Math.round(2.71828)       long                        3
        (int) Math.round(2.71828) int                         3
        (int) Math.round(3.13159) int                         3
        11 * 0.3                  double                     3.3
        (int) 11 * 0.3            double                     3.3
        11 * (int) 0.3            int                         0
        (int) (11 * 0.3)          int                         3

         */
        //Chapter 1.3
        //--------------------------------------------------------------------------------------------------------------------------------------
        //pg 46
        // if (<boolean expression>) { <statements> } || if the statement is true, then rune the code
        a = 2;
        b = 1;
        System.out.println("a: " + a + ", b: " + b);
        if (a > b) {

            System.out.println("The statement is true");

        }
        System.out.println();
        //p. 47
        /*
        0
        if (<boolean expression>) {<statements true>}
        else {<statements false>)

        If the statement is true, then it will run the code. If it is false, then it will run the code in the else block

        */
        a = 2;
        b = 1;
        System.out.println("a: " + a + ", b: " + b);
        if (a < b) {

            System.out.println("The statement is true");

        }
        else {

            System.out.println("The statement is false");

        }
        System.out.println();
        //p. 49
        //while (<boolean expression>) {<statements>} || If the statement is true, execute the statements. Then check if it is is still true, and if it run it once again. This will continue as long as the statement is true
        a = 1;
        while (a <= 5) {

            System.out.println("a is " + a + ".");
            a = a + 1;

        }
        System.out.println();
        //p. 55
        /*

        for (<initialize>; <boolean expression>; <increment>) {

        <statements>
        <increment>;

        }

        You create a variable, use the variable in a boolean expression, and then set the increment of the variable

         */
        for (int i = 1; i <= 10; i++) {

            System.out.println("Hello " + i);

        }
        System.out.println();
        //DATE 1/3/2018 -- Happy new year!
        //--------------------------------------------------------------------------------------------------------------
        /*

        We modify variables a lot in java, so it's useful to have several short hand notations. For example, here are all the one's that increment the value of the variable by 1
        i = i + 1   i++;   ++i;   i += 1

         */
        //DATE 1/23/2018
        //pg. 70
        /*

        break;

        break statements are used if you want to exit a loop without it running to completion

         */
        a = 1;
        while (a == 1) {

            System.out.println("This would go on forever, but we used a break statement to end it.");
            break;

        }
        System.out.println();
        /*

        continue

        continue statements are used within a loop to skip to the next iteration of the loop.

         */
        for (a = 1; a <= 10; a++) {

            if (a == 5) {

                continue;

            }
            System.out.println(a);

        }
        System.out.println();
        //Note that the output does not contain 5
        /*

        switch (<variable>) {

            case <value>:

                <statement>
                break;

            case <value>:

                <statement>
                break;

            default:

                <statement>
                break;

        }

        Used as a solution to the problem of having to use too many else if statements. You have it search for a value in each of the cases, run their statements, and if none match, it runs default

         */
        //NOTE: Use break statements
        stringVariableA = "pizza";
        switch (stringVariableA) {

            case "pizza":

                System.out.println("Pizza is good");
                break;

            case "ice cream":

                System.out.println("Ice cream is good");
                break;

                default:

                    System.out.println("I'm not sure what food is good");
                    break;

        }
        System.out.println();
        /*

        Another way to write a while loop

        do {<statements>} while (<boolean expression>);

        Same as

        while (<boolean expression>) {<statements>}

         */
        a = 6;
        do {

            System.out.println("a is " + a + ".");
            a++;

        }
        while (a <= 5);
        System.out.println();
        /*

        Only difference is first test of the condition is omitted, the above loop will run once even if a is 6

         */

        //DATE 2/20/2018
        //pg. 86
        //Chapter 1.4
        //Arrays
        /*

        This is the array declaration. The square brackets after the data type specify we're declaring an array

         */
        int[] intArray;
        String[] stringArray;
        char[] charArray;
        boolean[] booleanArray;

        /*

        The "notesArray = new int[N];" creates the array. It is not necessary for primitive data types, but it is needed for other types of data. The N specifies the length of the array, but the array can be any length.

         */
        int[] notesArray;
        int N = 10;
        notesArray = new int[N];
        /*

        To add values to an array, simply use

            <arrayName>[<arrayValue>] = <data>;

         */
        //NOTE: Remember that arrays start at 0
        notesArray[9] = 10;
        System.out.println(notesArray[9]);
        System.out.println();
        //Another example, showing that it's not always necessary to have the declaration and creation seperate
        String[] notesArrayTwo = new String[10];
        notesArrayTwo[0] = "Test";
        System.out.println(notesArrayTwo[0]);
        System.out.println();
        /*

        You can also set a small number of literal values at initialization in an array.

         */
        String[] notesArrayThree= {"Test1", "Test2", "Test3", "Test4"};
        System.out.println(notesArrayThree[0]);
        System.out.println();
        //Example
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int randomSuit = (int) (Math.random() * suit.length);
        int randomRank = (int) (Math.random() * rank.length);
        System.out.println(rank[randomRank] + " of " + suit[randomSuit]);
        System.out.println();
        //DATE 2/21/2018
        //pg. 104
        /*

        Two dimensional arrays

         */
        int[][] twoDimensionalArrayExample; //Declaration
        twoDimensionalArrayExample = new int[10][10]; //Creation
        twoDimensionalArrayExample[4][4] = 10;//Adding values
        System.out.println(twoDimensionalArrayExample[4][4]);
        System.out.println();
        //NOTE: Remember it can also be initiated as "int[][] array = new int[10][10];"
        /*

        Setting 2D array values at compile time

         */
        int[][] twoDimensionalArrayExampleTwo = {

                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }

        };
        System.out.println(twoDimensionalArrayExampleTwo[1][1]);
        System.out.println();

    }

}