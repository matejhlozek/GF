public class QuickSOQLPractice {
    
    public static List<account> returnAccountIdNameBillingCity(){
        List<account> resultAccount = [SELECT Id, Name, BillingCity FROM Account];
            
        	System.debug(resultAccount);
            return resultAccount;
    }
    
    public static List<contact> returnContactIdNameWithFilters(){
        List<contact> resultContact = [SELECT Id, Name FROM Contact WHERE MailingCountry LIKE '%Lawrence%' AND Name LIKE 'A%'];
        
    System.debug(resultContact);
            return resultContact;
    }
    
     public static List<account> returnAccountNames(){
        List<account> resultAccount = [SELECT Id, Name FROM Account ORDER BY Name DESC];
            
        	System.debug(resultAccount);
            return resultAccount;
    }

}