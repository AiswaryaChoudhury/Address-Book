
import java.util.Scanner;

public class AddressBook {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        System.out.println("Welcome to Address Book");
        System.out.println("------------------------------");
        Scanner sc= new Scanner(System.in);
        ContactDetails details=new ContactDetails();
        Book book=new Book();

        boolean terminate = false;
        while(terminate!=true){
            System.out.println("1.To add new address");
            System.out.println("2.Edit an exixting contact");
    		System.out.println("3.Delete an existing contact");
    		System.out.println("4.Display Contacts");
    		System.out.println("5.Exit");

            int option= sc.nextInt();
            switch (option){

                case 1:
                    details=book.addEntry();
                    System.out.println(book.save(details.getPhone(), details));
                    break;


                case 2:
                    System.out.println("Enter details to edit contact ");
                    long key= sc.nextLong();
                    details=book.addEntry();
                    book.editEntry(key,details);
                    break;
                    
                case 3:
                    System.out.println("Enter the details to delete");
                    long phoneToDelete = sc.nextLong();
                    book.deleteEntry(phoneToDelete);
                    break;
                    
                case 4: 
                	book.displayContact();
                	break;
                
                case 5:
        			System.exit(0);
        			break;
        			
                default:
                    System.out.println("please select a valid option");
                    break;
                }
        }
    }

}