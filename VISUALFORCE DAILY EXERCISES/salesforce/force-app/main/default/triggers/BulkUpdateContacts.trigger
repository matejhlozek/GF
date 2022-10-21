trigger BulkUpdateContacts on Account (after update) {
    
    List<Contact> contactList = new List<Contact>();
    for(Account acc: [SELECT Id, numberOfEmployees, (SELECT Id, Salutation FROM Contacts) FROM Account WHERE Id in: Trigger.new]){
        If(acc.Contacts.size()>0 && acc.numberOfEmployees < 5000){
            contactList.addAll(acc.Contacts);
        }
    }
    
    for(contact c:contactList){
        if(c.Salutation == 'Mr.'){
            c.Description = 'He has less than 5000 colleagues.';
        }
        
        else if(c.Salutation == 'Mrs.' || c.salutation == 'Ms.' ){
            c.Description = 'She has less than 5000 colleagues.';
        } 
        
        else c.Description = 'They have less than 5000 colleagues.';
    }
    update contactList;
}