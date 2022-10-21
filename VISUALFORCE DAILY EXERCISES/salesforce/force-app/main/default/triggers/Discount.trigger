trigger Discount on Bicycle__c (before insert, before update) {   
    
    List<Bicycle__c> bikes = new List<Bicycle__c>();    
    
    for(Bicycle__c bike: Trigger.new){
        bikes.add(bike);
        
    }      
    PriceDiscount.discountPrice(bikes);
    System.debug(bikes);
}