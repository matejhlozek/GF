public without sharing class LeadProcessor implements Database.Batchable<sObject>, Database.Stateful{
    
    public Integer recordCount = 0;
    
    public Database.QueryLocator start(Database.BatchableContext dbc){
        return Database.getQueryLocator([SELECT Id, Name FROM Lead]);
    }
    
    public void execute(Database.BatchableContext dbc, List<Lead> leads){
        for(Lead l : leads){
            l.leadSource = 'Dreamforce';
        }
        update leads;
        recordCount += leads.size();
        System.debug('Total records processed' + recordCount);
    }
    
    public void finish(Database.BatchableContext dbc){
        System.debug('Total records processed' + recordCount);
    }

}