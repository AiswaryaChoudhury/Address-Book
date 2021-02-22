import  java.util.Scanner;
public class ContactDetails {

    private String firstName;
    private String lastName;
    private String Address;
    private String city;
    private String state;
    private int zip;
    private long phone;
    Scanner sc= new Scanner(System.in);

    public String getFirstName() {
    	firstName=sc.next();
        return firstName;
    }

    public String getLastName() {
    	lastName=sc.next();
        return lastName;
    }

    public String getAddress() {
    	Address=sc.next();
        return Address;
    }

    public String getCity() {
    	city = sc.next();
        return city;
    }

    public String getState() {
    	state = sc.next();
        return state;
    }

    public int getZip() {
    	zip = sc.nextInt();
        return zip;
    }
     public long getPhone(){
    	 phone = sc.nextLong();
    	 return phone;
    	 
     }
    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    

    public String toString() {
      return "ContactDetails{" +
            "firstName='" + firstName + '\'' +      ", lastName='" + lastName + '\'' +
             ", Address='" + Address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phone=" + phone +
                '}';
    }
}