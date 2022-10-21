public class CollectionPractice {
    
    public List<Integer> reverse(List<Integer> test){
        List<Integer> reversedList = new List<Integer>();
        for(Integer i = test.size()-1; i>=0; i--){
            reversedList.add(test.get(i));
        }
        
        System.debug('List of numbers: ' + reversedList);
        return reversedList;
    } 
    
    public static Set<Integer> createSet(List<Integer> test){
        
        Set<Integer> myset = new Set<Integer>();
		myset.addAll(test);     	        
        System.debug('Set of numbers: ' + myset);
        return myset;
    }  
    public static Map<Integer, Integer> createMap(List<Integer> test){
        
        Map<Integer, Integer> mapOfNums = new Map<Integer, Integer>();
        
        for(Integer i = 0; i<test.size(); i++)
		mapOfNums.put(i, test.get(i));   	        
        System.debug('Set of numbers: ' + mapOfNums);
        return mapOfNums;
    }   
 
}