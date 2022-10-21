trigger EmailTrigger on Account (after insert, after update, before delete) {
    
    List<Messaging.SingleEmailMessage> mails =  new List<Messaging.SingleEmailMessage>();
    List<String> sendTo = new List<String>();
    sendTo.add('matej.hlozek@gmail.com');
    
    if(trigger.isDelete){
        for(Account acc : trigger.old){
            Messaging.SingleEmailMessage mail =  new Messaging.SingleEmailMessage();
            mail.setToAddresses(sendTo);
            if(Trigger.isDelete){
                mail.setSubject('The ' + acc.Name + ' account was deleted.');
                String body = 'The ' + acc.Name + ' account was deleted in the system by ' 
                    + acc.LastModifiedById; 
                mail.setHtmlBody(body);
                mails.add(mail);            
            } 
        } Messaging.sendEmail(mails);
    }else{       
        
        for(Account acc : trigger.new){
            Messaging.SingleEmailMessage mail =  new Messaging.SingleEmailMessage();
            mail.setToAddresses(sendTo);
            
            if(Trigger.isInsert){
                mail.setSubject('The ' + acc.Name + ' account was inserted.');
                String body = 'The ' + acc.Name + ' account was inserted in the system by ' 
                    + acc.OwnerId + ' with the Id: ' + acc.Id;  
                mail.setHtmlBody(body);
                mails.add(mail);
                
            } else if(Trigger.isUpdate){
                mail.setSubject('The ' + acc.Name + ' account was updated.');
                String body = 'The ' + acc.Name + ' account was updated in the system by ' 
                    + acc.LastModifiedById + ' with the Id: ' + acc.Id;  
                mail.setHtmlBody(body);
                mails.add(mail);
            }
        } Messaging.sendEmail(mails);
    }
}