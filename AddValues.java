import java.util.Scanner;
public class AddValues {
    //add an arbitrabily long list of intergers
    //the user first supplies the size of the list 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;      // running Sum
        int count = 0;   // Keeps track of the number of intergrades
        int size ;       // Size of the list
        System.out.print("How many numbers would you like to add");
        size = input.nextInt();
        System.out.println("enter the " + size + "Number");
        while(count< size) // while the number of the data is the lessthen size repeat
            {
                sum = sum + input.nextInt();   // read an integer  , add it to sum
                count++;  // keep track of the number of data
 
            }
            System.out.println("Sum:" + sum);



    }
}
