class fan {
    int getPrice() {
        int Servicecharge = 50;
        int Gstcharge = 95;
        int transportcharge = 523;
        int electrictycharge = 543;

        return Servicecharge + Gstcharge + transportcharge + electrictycharge;
    }
}

class cooler {

    int getPrice() {
        int Servicecharge = 500;
        int Gstcharge = 950;
        int transportcharge = 5230;
        int electrictycharge = 54233;

        return Servicecharge + Gstcharge + transportcharge + electrictycharge;
    }
}

class fridge {
    int getPrice() {
        int Servicecharge = 5232;
        int Gstcharge = 95044;
        int transportcharge = 52330;
        int electrictycharge = 54333;

        return Servicecharge + Gstcharge + transportcharge + electrictycharge;
    }
}

class Tv {
    int getPrice() {
        int Servicecharge = 52332;
        int Gstcharge = 9544;
        int transportcharge = 5330;
        int electrictycharge = 5433;

        return Servicecharge + Gstcharge + transportcharge + electrictycharge;
    }
}

class Hometheater {
    int getPrice() {
        int Servicecharge = 5332;
        int Gstcharge = 9544;
        int transportcharge = 5630;
        int electrictycharge = 543233;

        return Servicecharge + Gstcharge + transportcharge + electrictycharge;
    }
}

public class ElectronicItems {
    public static void main(String[] args) {
        Hometheater hometheater = new Hometheater ();
        Tv tv = new Tv ();
        fan fan = new fan ();
        fridge fridge = new fridge ();
        cooler c1 = new cooler ();

        System.out.println ("Hometheater>" + hometheater.getPrice () + "\nTV>" + tv.getPrice () + "\nFridge>" + fridge.getPrice () + "\nCooler>" + c1.getPrice () + "\nFAN>" + fan.getPrice ());
    }
}
