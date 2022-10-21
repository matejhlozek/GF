public class BmiCalculator {
    
    public static String bmiCategory(Decimal weight, Decimal height) {
        Decimal bmi = weight / ( height * height) ;
        String statusOfBmi = '';
        if(bmi < 18.5){
            statusOfBmi = 'Thinness';
        } else if(bmi < 25){
            statusOfBmi = 'Normal';
        } else if(bmi < 30){
            statusOfBmi = 'Overweight';
                } else {statusOfBmi = 'Obese';}
        return statusOfBmi;
    } 
}