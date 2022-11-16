package comexamples.addressbook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class AddressBook {
    private String firstname;
    private String lastname;
    private String address;
    private String zipcode;
    private String mobileNumber;
    private String city;
    private String state;
    private String email;
    public static void main(String[]args)
    {
        System.out.println("Welcome to address book problem");
        System.out.println("Enter the following details of the person:");
        Scanner sc =new Scanner(System.in);
        String firstname = sc.nextLine();
        String lastname = sc.nextLine();
        String address = sc.nextLine();
        String zipcode =sc.nextLine();
        String mobileNumber = sc.nextLine();
        String city= sc.nextLine();
        String state =sc.nextLine();
        String email =sc.nextLine();
        AddressBook ob =new AddressBook("Saptarishi","Sen","Dhakuria","Kolkata","700031","9831759788","sensaptarishi98@gmail.com");
        System.out.println(ob.toString());

    }
    public AddressBook(String firstname,String lastname,String address,String city,String zipcode,String mobileNumber,String email)
    {
        this.firstname =firstname;
        this.lastname =lastname;
        this.address =address;
        this.city =city;
        this.zipcode =zipcode;
        this.mobileNumber =mobileNumber;
        this.email=email;
    }
    public String getFirstname()
    {
        return firstname;

    }
    public void setFirstname(String firstname)
    {
        this.firstname =firstname;
       // System.out.println("The firstname is :" + firstname);
    }
    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname =lastname;
        //System.out.println("The last name is :" + lastname);
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address =address;
        //System.out.println("The address is:" + address);
    }
    public String getZipcode()
    {
        return zipcode;
    }
    public void setZipcode(String zipcode)
    {
        this.zipcode =zipcode;
        //System.out.println("The zipcode is:" + zipcode);
    }
    public String getMobileNumber()
    {
        return mobileNumber;
    }
   public void setMobileNumber(String mobileNumber)
   {
       this.mobileNumber =mobileNumber;
       //System.out.println("The mobileNumber is:" + mobileNumber);
   }
   public String getCity()
   {
       return city;
   }
   public void setCity(String city)
   {
       this.city =city;
       //System.out.println("The city is :" + city);
   }
   public String getState()
   {
       return state;
   }
   public void setState(String state)
   {
       this.state =state;
       //System.out.println("The state is:" + state);
   }
   public String getEmail()
   {
       return email;
   }
   public void setEmail(String email)
   {
       this.email=email;
       //System.out.println("The email id is:" + email);
   }
   public String toString() {
       return "AddressBook{" +
               "firstname='" + firstname + '\'' +
               ", lastname='" + lastname + '\'' +
               ", address= '" + address + '\'' +
               ", zipcode= '" + zipcode + '\'' +
               ", mobileNumber= '" + mobileNumber + '\'' +
               ", city ='" + city + '\'' +
               ", email ='" + email + '\'' +
       '}';
   }


    public void printContact(ArrayList<String> list) {
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



