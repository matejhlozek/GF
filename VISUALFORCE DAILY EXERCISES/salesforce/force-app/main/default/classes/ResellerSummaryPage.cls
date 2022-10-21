public class ResellerSummaryPage {
    
    public string caseId {get; set;}
    public string taskId {get; set;}
    public string CaseNumber {get; set;}
    public Task task { get; set; }
    public List<Task> newTaskList {get; set;}
    public string eventId {get; set;}
    Public string selectedField {get;set;}
    Public string selectedField2 {get;set;}
    Public string selectedField3 {get;set;}
    Public List <AggregateResult> numberOfTasks = Database.query('SELECT COUNT(Id) FROM Task');
    
    
    public List<Case> caseResults = [
        SELECT CaseNumber, CreatedDate, AccountId, Subject, Priority, Status FROM Case WHERE Account.RecordType.name LIKE '%Reseller' AND Status != 'Closed' 
        ORDER BY CreatedDate];
    
    public List<Task> taskResults = [
        SELECT Id, CreatedDate, WhatId, Subject, Priority, Status  FROM Task WHERE Status !='Not Started' AND Status !='Completed' ORDER BY CreatedDate];
    
    public List<Event> eventResults = [
        SELECT Id, CreatedDate, WhatId, Subject, EndDateTime FROM Event WHERE Account.RecordType.name LIKE '%Reseller' ORDER BY CreatedDate];
    
        public List<Account> getAccounts() {
        List<Account> results = [
        SELECT Name, RecordTypeId FROM Account WHERE RecordType.name LIKE '%Reseller'];
        return results;           
            
	}
    
     public ResellerSummaryPage(){
       task=new Task();
    }  
    
    public PageReference Save() {        
        insert task;
        newTaskList = [SELECT Id, CreatedDate, WhatId, Subject, Priority, Status FROM Task WHERE id = :task.Id];
        PageReference pr = new PageReference('/apex/ResellerSummaryPage?core.apexpages.request.devconsole=1');
   		pr.setRedirect(true);
        
        
        Messaging.SingleEmailMessage semail = new Messaging.SingleEmailMessage();
        String[] sendingTo = new String[]{task.Account_Owner_Email__c};
        semail.setToAddresses(sendingTo);
        semail.setSubject('New Task has been created!'); 
		semail.setPlainTextBody('New task ' + task.Id + ' with Subject name ' + task.Subject + ' has been created.'); 
		Messaging.sendEmail(new Messaging.SingleEmailMessage[] {semail}); 	
        
        return pr;
    }

    public List<Case> getCases() {
        return caseResults;
	}
        public List<Task> getTasks() {        
        return taskResults;
	}    
        public List<Event> getEvents() {        
        return eventResults;
	}   
    
    public PageReference gotoCaseDetailPage(){
        return new PageReference('/' + caseId);
    }
        public PageReference gotoTaskDetailPage(){
        return new PageReference('/' + taskId);
    }
            public PageReference gotoEventDetailPage(){
        return new PageReference('/' + eventId);
    }
    
    Public pagereference sortCases(){
        string s = 'SELECT CaseNumber, CreatedDate, AccountId, Subject, Priority, Status FROM Case WHERE Account.RecordType.name LIKE \'%Reseller\'  AND Status != \'Closed\' ';
  if(selectedField == 'CreatedDateDESC')
     caseResults = Database.query(s + 'ORDER BY CreatedDate DESC') ;        
         else if(selectedField == 'CreatedDate')
     caseResults = Database.query(s + 'ORDER BY CreatedDate');        
        else  if(selectedField == 'AccountNameDESC')
     caseResults = Database.query(s + 'ORDER BY AccountId DESC') ;        
        else if(selectedField == 'AccountName')
     caseResults = Database.query(s + 'ORDER BY AccountId') ;         
        else if(selectedField == 'SubjectNameDESC')
    caseResults = Database.query(s + 'ORDER BY Subject DESC') ;                    
       else if(selectedField == 'SubjectName')
     caseResults = Database.query(s + 'ORDER BY Subject') ;        
        else if(selectedField == 'PriorityDESC')
     caseResults = Database.query(s + 'ORDER BY Priority DESC') ;        
        else if(selectedField == 'Priority')
    caseResults = Database.query(s + 'ORDER BY Priority') ;        
        else if(selectedField == 'StatusDESC')
     caseResults = Database.query(s + 'ORDER BY ORDER BY Status DESC') ;        
        else if(selectedField == 'Status')
     caseResults = Database.query(s + 'ORDER BY ORDER BY Status') ;        
 		return null;
 }
        Public pagereference sortTasks(){
        string s = 'SELECT Id, CreatedDate, WhatId, Subject, Priority, Status FROM Task WHERE Account.RecordType.name LIKE \'%Reseller\' AND Status !=\'Not Started\' AND Status !=\'Completed\'  ' ;
  if(selectedField2 == 'CreatedDateDESC')
     taskResults = Database.query(s + 'ORDER BY CreatedDate DESC') ;        
         else if(selectedField2 == 'CreatedDate')
     taskResults = Database.query(s + 'ORDER BY CreatedDate');        
        else  if(selectedField2 == 'WhatIdDESC')
     taskResults = Database.query(s + 'ORDER BY Account Name DESC') ;        
        else if(selectedField2 == 'WhatId')
     taskResults = Database.query(s + 'ORDER BY Account Name') ;         
        else if(selectedField2 == 'SubjectNameDESC')
    taskResults = Database.query(s + 'ORDER BY Subject DESC') ;                    
       else if(selectedField2 == 'SubjectName')
     taskResults = Database.query(s + 'ORDER BY Subject') ;        
        else if(selectedField2 == 'PriorityDESC')
     taskResults = Database.query(s + 'ORDER BY Priority DESC') ;        
        else if(selectedField2 == 'Priority')
    taskResults = Database.query(s + 'ORDER BY Priority') ;        
        else if(selectedField2 == 'StatusDESC')
     taskResults = Database.query(s + 'ORDER BY ORDER BY Status DESC') ;        
        else if(selectedField2 == 'Status')
     taskResults = Database.query(s + 'ORDER BY ORDER BY Status') ;        
 		return null;
 }
            Public pagereference sortEvents(){
        string s = 'SELECT Id, CreatedDate, WhatId, Subject, EndDateTime FROM Event WHERE Account.RecordType.name LIKE \'%Reseller\'  ';
  if(selectedField3 == 'CreatedDateDESC')
     eventResults = Database.query(s + 'ORDER BY CreatedDate DESC') ;        
         else if(selectedField3 == 'CreatedDate')
     eventResults = Database.query(s + 'ORDER BY CreatedDate');        
        else  if(selectedField3 == 'WhatIdDESC')
     eventResults = Database.query(s + 'ORDER BY Account Name DESC') ;        
        else if(selectedField3 == 'WhatId')
     eventResults = Database.query(s + 'ORDER BY Account Name') ;         
        else if(selectedField3 == 'SubjectNameDESC')
    eventResults = Database.query(s + 'ORDER BY Subject DESC') ;                    
       else if(selectedField3 == 'SubjectName')
     eventResults = Database.query(s + 'ORDER BY Subject') ;        
        else if(selectedField3 == 'EndDateTimeDESC')
     eventResults = Database.query(s + 'ORDER BY EndDateTime DESC') ;        
        else if(selectedField3 == 'EndDateTime')
    eventResults = Database.query(s + 'ORDER BY EndDateTime') ; 
 		return null;
 }
    
}