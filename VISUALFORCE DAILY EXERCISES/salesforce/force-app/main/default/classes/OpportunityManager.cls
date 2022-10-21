public class OpportunityManager {
    
    public static Opportunity insertOpportunity(
        String accName, 
        String oppName,         
    	String oppStage, 
        Integer oppAmount, 
        Date oppCloseDate)  {                              
        
            Account acct = new Account();
            acct.name = accName;  
            insert acct;
            
            Opportunity opp = new Opportunity();
            opp.Name = oppName;
            opp.StageName = oppStage;
            opp.Amount = oppAmount;
            opp.CloseDate = oppCloseDate;
            opp.AccountId = acct.id;
            insert opp;
            
            System.debug(acct);
            System.debug(opp);
            return opp;
    }
}