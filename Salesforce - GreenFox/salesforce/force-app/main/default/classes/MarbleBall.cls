public class MarbleBall {
    
       
    public static List<String> labelMarbleBalls(Integer num){
        String[] labels;
        labels = new List<String>();
        
        for(Integer i = 0; i<=num; i++)
      	  {            
       	  if (math.mod(i, 2) == 0){
                labels.add('pink');}
          if (math.mod(i, 3) == 0){
            labels.add('blue');
      	  } 
          else {
            labels.add('yellow');
        }    
        }system.debug(labels);
        return labels;      
    }
}