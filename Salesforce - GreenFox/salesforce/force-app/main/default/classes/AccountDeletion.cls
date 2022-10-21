@isTest
private class AccountDeletion {
    @isTest static void TestDeleteAccountWithMoreThanFiveContacts() {
        Account acct = new Account(Name = 'Test Account');
        insert acct; 
        Opportunity opp = new Opportunity(Amount = 151000, AccountId=acct.Id, Name='Test Opp', 
                                          CloseDate=date.today(), StageName= 'Prospecting', Probability=100);
        insert opp;               
        List<Contact> con = new List<Contact>{
            new Contact(Salutation='Mr.',FirstName='Joe',LastName='Smith',AccountId=acct.Id),
            new Contact(Salutation='Mrs.',FirstName='Kathy',LastName='Smith',AccountId=acct.Id),
            new Contact(Salutation='Mrs.',FirstName='Caroline',LastName='Roth',AccountId=acct.Id),
            new Contact(Salutation='Mrs.',FirstName='Kim',LastName='Shain',AccountId=acct.Id),
            new Contact(Salutation='Mr.',FirstName='Kim',LastName='Jong-un',AccountId=acct.Id),
            new Contact(Salutation='Mrs.',FirstName='Kim',LastName='Kardashian',AccountId=acct.Id)
         }; insert con;
        
        Test.startTest();
        Database.DeleteResult result = Database.delete(acct, false);
        Test.stopTest();
        System.assertEquals('Cannot delete accounts that have more than 5 contacts or the potential value is higher than €150,000.',
                             result.getErrors()[0].getMessage());
    }   
    
    @isTest static void TestDeleteAccountWithLessThanFiveContacts() {
        Account acct = new Account(Name = 'Test Account');
        insert acct; 
        Opportunity opp = new Opportunity(Amount = 160000, AccountId=acct.Id, Name='Test Opp', 
                                          CloseDate=date.today(), StageName= 'Prospecting');
        insert opp;               
        List<Contact> con = new List<Contact>{
            new Contact(Salutation='Mr.',FirstName='Joe',LastName='Smith',AccountId=acct.Id),
            new Contact(Salutation='Mrs.',FirstName='Kathy',LastName='Smith',AccountId=acct.Id),
            new Contact(Salutation='Mrs.',FirstName='Caroline',LastName='Roth',AccountId=acct.Id)
         }; insert con;
        
        Test.startTest();
        Database.DeleteResult result = Database.delete(acct, false);
        Test.stopTest();
        System.assert(result.isSuccess());
    }   
       @isTest static void TestDeleteAccountWithPotentialValueLessThan150000() {
        Account acct = new Account(Name = 'Test Account');
        insert acct; 
        Opportunity opp = new Opportunity(Amount = 10000, AccountId=acct.Id, Name='Test Opp', 
                                          CloseDate=date.today(), StageName= 'Prospecting');
        insert opp;               
        List<Contact> con = new List<Contact>{
            new Contact(Salutation='Mr.',FirstName='Joe',LastName='Smith',AccountId=acct.Id),
            new Contact(Salutation='Mrs.',FirstName='Kathy',LastName='Smith',AccountId=acct.Id),
            new Contact(Salutation='Mrs.',FirstName='Caroline',LastName='Roth',AccountId=acct.Id),
            new Contact(Salutation='Mrs.',FirstName='Kim',LastName='Shain',AccountId=acct.Id),
            new Contact(Salutation='Mr.',FirstName='Kim',LastName='Jong-un',AccountId=acct.Id),
            new Contact(Salutation='Mrs.',FirstName='Kim',LastName='Kardashian',AccountId=acct.Id)
         }; insert con;
        
        Test.startTest();
        Database.DeleteResult result = Database.delete(acct, false);
        Test.stopTest();
        System.assert(result.isSuccess());
    }  
}