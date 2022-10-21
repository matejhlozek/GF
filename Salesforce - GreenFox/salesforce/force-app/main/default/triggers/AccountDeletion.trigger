trigger AccountDeletion on Account (before delete) {
    
    List<Account> accounts = [SELECT Id, Account.Potential_Value__c, (SELECT Id FROM Contacts) FROM Account WHERE Id IN :Trigger.old];
    for (Account acc : accounts) {
        if(trigger.isDelete && acc.Contacts.size()>5 && acc.Potential_Value__c > 150000){
            Trigger.oldMap.get(acc.Id).addError(
                'Cannot delete accounts that have more than 5 contacts or the potential value is higher than €150,000.');
        }            
    }    
}