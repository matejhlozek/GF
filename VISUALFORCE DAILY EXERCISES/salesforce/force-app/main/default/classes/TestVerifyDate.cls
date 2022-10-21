@isTest
public class TestVerifyDate {
    @isTest public static void away30Days()
    {
        Date firsDate = Date.newInstance(21,03,26);
        Date secDate = Date.newInstance(21,05,21);
        Date expDate = Date.newInstance(20,03,31);

        Date foundDate = VerifyDate.CheckDates(firsDate,secDate);
        System.assertEquals(expDate,foundDate);
    }
    
    @isTest public static void withIn30Days()
    {
        Date firsDate = Date.newInstance(21,03,26);
        Date secDate = Date.newInstance(21,03,28);

        Date foundDate = VerifyDate.CheckDates(firsDate,secDate);
        System.assertEquals(secDate,foundDate);

    }
}