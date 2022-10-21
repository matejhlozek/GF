public class PriceDiscount {    
    
    public static void discountPrice(List<Bicycle__c> bikes){
        for(Bicycle__c bike : bikes){            
            if(bike.isDiscounted__c){
                bike.Price__c = bike.Price__c * 0.9;
            }
        }
    }
    
}