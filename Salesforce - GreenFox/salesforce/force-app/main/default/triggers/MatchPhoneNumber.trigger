trigger MatchPhoneNumber on Contact (before insert, before update) {
	
    for(Contact c : Trigger.New) {
        if(c.Match_Phone_Number__c == true)
        c.Phone = c.MobilePhone;
    }   
}