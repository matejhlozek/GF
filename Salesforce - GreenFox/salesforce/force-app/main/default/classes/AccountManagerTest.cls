@isTest
private class AccountManagerTest {
    
    @isTest
    static void testGetAccount(){
        Account a = new Account(Name='TestAccount');
        insert a;
        Contact c = new Contact(AccountId=a.Id, FirstName='Test', LastName='Test');
        insert c;
        
        RestRequest request = new RestRequest();
        request.requestURI = 'https://creative-narwhal-qn5q2g-dev-ed.lightning.force.com/services/apexrest/Accounts/' + a.Id + '/contacts';
        request.httpMethod = 'GET';
        RestContext.request = request;
        
        Account myAcct = AccountManager.getAccount();
        System.assert(myAcct != null);
        System.assertEquals('TestAccount', myAcct.Name);
        
    }

}