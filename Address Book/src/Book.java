
import java.util.*;

public  class Book implements AddressBookInterface {

    HashMap<Long, ContactDetails> addressBookContainer = new HashMap<Long, ContactDetails>();
    Scanner s = new Scanner(System.in);


     HashMap<Long,ContactDetails > save(long phoneNumber, ContactDetails addEntry){

         addressBookContainer.put(phoneNumber,addEntry);
         return addressBookContainer;
     }


  public ContactDetails addEntry(){
      ContactDetails details = new ContactDetails();
     
    	 
    		//System.out.println("Enter Entry"+(i+1));
    		System.out.println("Enter the First Name");
    		details.getFirstName();
    		System.out.println("Enter the Last Name");
    		details.getLastName();
    		System.out.println("Enter The Address");
    		details.getAddress();
    		System.out.println("Enter the city");
    		details.getCity(); 
    		System.out.println("Enter the state");
    		details.getState();
    		System.out.println("Enter the zip Code");
      		details.getZip();
      		System.out.println("Enter the Phone number");
      		details.getPhone();
    	
    	
      return addEntry();
      



  }
    public HashMap<Long, ContactDetails> editEntry(long key, ContactDetails Addressbook) {
        if (addressBookContainer.containsKey(key)==false){
            System.out.println("Contacts not Found");

        }else if (addressBookContainer.containsKey(key)==true){
            addressBookContainer.put(key, addEntry());
            System.out.println("values edited");

        }
        return addressBookContainer;
    }


    public void displayContact() {
		System.out.println(addressBookContainer);
	}
    
    
    public void deleteEntry(long key) {
        
    	if (addressBookContainer.containsKey(key) == true)
        {
    		addressBookContainer.remove(key);
            System.out.println(key + " Deleted Successfully");
         }
    	else
    		if (addressBookContainer.containsKey(key) == false) {
            System.out.println("Error: Dosenot exist");
         }

    }


	}



