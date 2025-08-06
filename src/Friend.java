
import java.util.Scanner;



public class Friend {

    //  declaring the data members(variables declared directly in the class are called data members)

    String _name;
    String _address;
    String _contact;
    String _fgame;

    public Friend(String name, String address, String contact, String fgame){
        // Initialising the data members
        _name = name;
        _address = address;
        _contact = contact;
        _fgame = fgame;
    }

    public void Display(){
        System.out.println(_name);
        System.out.println(_address);
        System.out.println(_contact);
        System.out.println(_fgame);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        String address;
        String contact;
        String fgame;

        System.out.println("What is youre friends name");
        name = s.nextLine();
        System.out.println("What is youre friends address");
        address = s.nextLine();
        System.out.println("What is youre friends contact");
        contact = s.nextLine();
        System.out.println("What is youre friends favourite game");
        fgame = s.nextLine();

        //creating an object of the print class

        Friend d1 = new Friend(name, address, contact, fgame);

        System.out.println("What is youre friends name");
        name = s.nextLine();
        System.out.println("What is youre friends address");
        address = s.nextLine();
        System.out.println("What is youre friends contact");
        contact = s.nextLine();
        System.out.println("What is youre friends favourite game");
        fgame = s.nextLine();

        Friend d2 = new Friend(name, address, contact, fgame);

        
        d1.Display();
        d2.Display();
    }
}
