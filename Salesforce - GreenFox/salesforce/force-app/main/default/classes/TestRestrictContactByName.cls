@isTest
public class TestRestrictContactByName {

        @isTest static void TestRestrictContactByName()
        {
            Contact con = new Contact(LastName = 'INVALIDNAME');
            test.startTest();
            Database.SaveResult result= database.insert(con,false);
            test.stopTest();
            system.assertEquals('The Last Name INVALIDNAME is not allowed for DML', 
                               result.getErrors()[0].getMessage());

        }
}