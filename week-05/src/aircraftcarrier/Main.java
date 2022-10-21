package aircraftcarrier;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Carrier carrier = new Carrier();
        Carrier carrier2 = new Carrier();
        F16 slowJet1 = new F16();
        F16 slowJet2 = new F16();
        F35 fastJet1 = new F35();
        F35 fastJet2 = new F35();
        carrier.add(slowJet1);
        carrier.add(slowJet2);
        carrier.add(fastJet1);
        carrier.add(fastJet2);

        F16 carrier2Jet1 = new F16();
        F35 carrier2Jet2 = new F35();

        carrier2.add(carrier2Jet1);
        carrier2.add(carrier2Jet2);


        carrier.fill();
        carrier2.fill();

        // slowJet1.fight();
        // carrier.fight(carrier2);

        System.out.println(carrier.getStatus());
        System.out.println(carrier2.getStatus());


    }
}
