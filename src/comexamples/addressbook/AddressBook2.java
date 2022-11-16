package comexamples.addressbook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class AddressBook2 {
    private static ArrayList <String> contactDetails = new ArrayList<>();
    public static void main(String[] args)
    {
        AddressBook2 obj =new AddressBook2();
        AddressBook a =new AddressBook("Saptarishi","Sen","Dhakuria","Kolkata","700031","9831759788","sensaptarishi98@gmail.com");
        System.out.print("\n" + a.toString());
        System.out.println();
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the contact details.............");
        System.out.println("Enter the first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter the last name:");
        String lastName = scan.nextLine();
        System.out.println("Enter the address:");
        String address = scan.nextLine();
        System.out.println("Enter the city:");
        String city = scan.nextLine();
        System.out.println("Enter the state:");
        String state = scan.nextLine();
        System.out.println("Enter the zip code:");
        String zip = scan.nextLine();
        System.out.println("Enter the phone no:");
        String phoneNumber = scan.nextLine();
        System.out.println("Enter the email:");
        String email = scan.nextLine();
        scan.close();
        AddressBook b =new AddressBook(firstName,lastName,address,city,zip,phoneNumber,email);

        contactDetails.add(a.toString());
        contactDetails.add(b.toString());
        a.printContact(contactDetails);

    }
    public void printContact(List<String> list) {
        System.out.println("Contact details are below.....\n");
        if(!list.isEmpty())
        {
            Iterator it = list.iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        }
    }
}

