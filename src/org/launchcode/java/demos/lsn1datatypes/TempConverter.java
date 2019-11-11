package org.launchcode.java.demos.lsn1datatypes;
/*In the above line "package org.launchcode.java.demos.javawebdevelopment.datatypes;" declares the package in which the
file resides. For this simple program, our code could run without this line. However, we want to get used to always
 declaring the package of our Java classes.

 Packages help to encapsulate our code. Encapsulation refers to the practice of shielding our code from outside
 influences. It's an essential component of good object oriented programming, and package declaration in Java is just
 one application of this principle. Without declaring a package, a Java class exists within the default package. In
 larger applications, leaving all classes in the default package risks naming conflicts and bugs. */


import java.util.Scanner;
/*The import statement in Java allows us to access the class, methods, and data stored in a different file. "import"
tells the compiler that we are going to use a shortened version of the class name. In this example, we are going to use
the class "java.util.Scanner", but we can refer to it as "Scanner". We could use the "java.util.Scanner" without any
 problems and without any import statement, provided we always refer to it by its full name.

 This idea bears repeating. In Java, you can use any available class WITHOUT having to import it, but you must use the
 full name of the class. "Available" classes include:
 1.) All the classes you define in the .java and .class files in your current working directory.
 2.) All the classes that get shipped with the software (Pre-loaded classes)*/

/*The class naming system in Java is very hierarchical. The full name of the Scanner class is really
"java.util.Scanner". You can think if this name as having two parts:
1.) java.util is called the package.
2.) Scanner is the class name. */

public class TempConverter {
    public static void main(String[] args) {
        /*In the below lines of code we declared our variables. Since Java is a statically typed language, we must
        always declare the data type for any variable. This is the same rule in TypeScript, but with one difference,
         notice that the data type is defined before the variable name, not after. The lines below establish that
         fahrenheit and celsius will hold values of type double. The line below those, the variable "input" references
         a Scanner object.

         If later in the code we try to initialize fahrenheit with a string:
         fahrenheit = "xyz"
         the compiler throws an error because fahrenheit is declared to be a double.

         The following error is common for new Java programmers. Suppose we forget to include the declaration for
         celsius. What happens when we try to compile and run our program?

        1.)Edit your TempConverter class by removing line 8, which declares the variable celsius.
        2.)Click any of the “Run” options in IntelliJ. Alternatively, use the terminal to navigate to the parent
        directory of your TempConverter.java class and run java TempConverter.java.

        Your terminal will return some errors that resemble these:
        Error:(16, 9) java: cannot find symbol
        symbol:   variable celsius
        location: class TempConverter

        Error:(17, 64) java: cannot find symbol
        symbol:   variable celsius
        location: class TempConverter

        These two compiler errors occur before the program runs. The values in the parentheses () give the line number
        and text column where the error was found. In the first description (line 16, column 9), the celsius variable
        before the = is flagged. When this type of error happens, it usually means that the variable was not declared
        before we tried to initialize it with a value.

        The second error message (line 17, column 64) occurs because we use celsius before it has been assigned a value.

        The general rule in Java is that you must decide on the data type for your variable first, and then declare that
        variable before you use it

        As in other languages, Java allows us to declare and initialize our variables in the same line:
            double celsius = (fahrenheit -32) * 5/9; */

        double fahrenheit;
        double celsius;

        /*In Java, "Scanner" objects make getting input from users, a file, or even over the network relatively easy.
        For our temperature conversion program, we declared the variable input to be of type Scanner.*/

        Scanner input;
        /*We want our program to prompt the user to enter in a number in the command line. We accomplish this by
        creating a "Scanner" instance using the word "new" and then calling the constructor and passing it the System.in
        object like we did below.*/
        input = new Scanner(System.in);

        /*Notice  that  this Scanner object is assigned to the name input, which we declared to be a "Scanner object in
        line 75.

        And you know those System statements we've been using? like "System.in and System.out.println() for print
        statements. Well, "System" itself is a java class. System.in is similar to System.out except, as the name
        implies, it is used for input.*/

        /*Next, in the line below, we ask the user to enter a number, and the following line we use the input to read
        the value from the command line */
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        /*Here again, in the above lines of code, we see the implications of Java being a strongly typed language.
        Notice that we must call the method "nextDouble()", because the variable fahrenheit was declared as a double.

        Because Java  is a statically typed language, we must call the appropriate method on the Scanner object to
        ensure the entered data is of the correct type. In this case the compiler compares the types for fahrenheit and
        input.nextDouble() and throws an error if the two do not match.

        Refer to the "Nebo" notes version of this follow along for a basic list of  commonly used methods of the Scanner
        class. You can also use the link in Chapter 2 - Data Types-Section 2.2.6 to access a complete list of the
        methods*/

        input.close();
        /*To collect data from the command line or other sources, create a Scanner object. This opens up resources in
        our machine to manage thee input, and these resources remain open even after the required data is loaded into
        our program

        An open Scanner can allow unintended access to the program, and it ties up resources that might be needed
        elsewhere. Best practice states that if you open a Scanner object, close it after it finishes its job. The above
        line does this in our TempConverter program*/

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}

/*The Scanner class serves as a kind of adapter that gathers primitive data types as input and converts them into object
types (e.g. it converts an int to Integer).

For the temperature conversion program, we collected user input from the  command line, but there are other options for
collecting data for our programs.*/
