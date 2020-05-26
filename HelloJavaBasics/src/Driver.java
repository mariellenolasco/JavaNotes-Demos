import com.revature.models.*;
//Called driver because it contains the main method
//Not a naming convention, you can name it whatever you want
//Note that you do want your code to be as self describing as possible
public class Driver {
    //This is a comment in java
    //This is the main method
    //It tells java where to start
    //public is an access modifier meaning its accessible anywhere,
    // static means the method belongs to the class, meaning you don't need to create a driver object to invoke it
    // void means it returns nothing
    // main is the name of the method
    // It takes in a string array of arguments as parameters, this is especially useful for when you need some initial
    // input essential to your program
    public static void main(String[] args){
        //This is a variable in java
        // Note how you need to declare the data type of your variable because Java is a strongly typed language
        // Variables need to be initialized before you're able to use them
        // String is an object in java, if you try to use it before initializing it, i.e just do String hello
        // What you have is a reference to a string object not an actual object
        // When you try to utilize this reference, java would complain
        // So we have a datatype, variable name,and the value
        // Note that your variable should be self describing, so your code would be readable
        //Notice the lack of access modifiers in the variable because it is in method scope.
        //Variables in class scope are the ones with access modifiers
        String welcomeMessage = "Hello World!";

        //This prints out the message to your console
        System.out.println(welcomeMessage);

        //So we have variables, and we can print them to the console
        // that's great, if we're making a greeting app
        // actually a greeting app would have more logic than printing out messages
        // so what if i want to greet the users via their name?
        //Activity get user input using var args

        //Alright so we got them by name
        //What about if i wanna greet them depending on the day?
        //introduce if else if, switch statement here

        //what about if i want to present them options for things to do
        //introduce looping

        //This is getting long
        // Note that all we've done is work on the main method
        // This seems a bit procedural
        // note that Java is an Object Oriented language
        // if we just keep on writing code like this we might as well code in c
        // Let's take a step back and understand what is Object Oriented Programming?

        //Let's create an Animal class.

    }

    public static int add2(Integer input){
     return input +2;
    }

}
