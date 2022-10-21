@isTest
private class TestBmiCalculator {
    
    @isTest static void testWithCorrectOutputOne(){
        System.assertEquals('Overweight', BmiCalculator.bmiCategory(90.0, 1.8));
    }
        @isTest static void testWithICorrectOutputTwo(){
        System.assertEquals('Normal', BmiCalculator.bmiCategory(70.0, 1.8));
    }
      @isTest static void testWithICorrectOutputThree(){
        System.assertEquals('Thinness', BmiCalculator.bmiCategory(50.0, 1.8));
    }
       @isTest static void testWithICorrectOutputFour(){
        System.assertEquals('Obese', BmiCalculator.bmiCategory(120.0, 1.8));
    }
          @isTest static void testWithICorrectOutputFive(){
        System.assertEquals('Overweight', BmiCalculator.bmiCategory(95.0, 1.8));
    }
}