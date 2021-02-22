
import java.util.HashMap;

public interface AddressBookInterface {
    public ContactDetails addEntry();



    @SuppressWarnings("hiding")
	public <AddressBook> HashMap<Long, ContactDetails> editEntry(long key ,ContactDetails AddressBook);

    public void deleteEntry(long key);

}
