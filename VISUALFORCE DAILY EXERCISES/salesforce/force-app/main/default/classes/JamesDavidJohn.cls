public class JamesDavidJohn {
    
    String nameOfContact = 'John';
    
    public List<Contact> getContacts() {

        List<Contact> results = [
        SELECT FirstName, LastName, Title, Email FROM Contact WHERE 
            FirstName = :nameOfContact OR
        	LastName = :nameOfContact];
        return results;
	}
    
   public void setJohns(){
        nameOfContact = 'John';
    }
   public void setDavids(){
        nameOfContact = 'David';
    }
   public void setJameses(){
        nameOfContact = 'James';
    }
    
}