public class CheckTypeCasting {


    public static void main(String[] args) {
        char butterfly = 'A';
        byte anthouse = 10;
        short cockrochouse = 100;
        int lizardhouse = 21324343;
        float rathouse = 23.12f;
        long froghouse = 3243253555l;
        double snakeHouse = 43432243d;
        System.out.println ("Welcome to my house>> anthouse" + anthouse + "\n" +
                "Welcome to my house>> cockrochouse" + cockrochouse + "\n" +
                "Welcome to my house>> lizardhouse" + lizardhouse + "\n" +
                "Welcome to my house>> Rathouse" + rathouse + "\n" +
                "Welcome to my house>> froghouse" + froghouse + "\n" +
                "Welcome to my house>> snakeHouse" + snakeHouse);


        //Let's us consider that SNake arrange party where he can se who can come in his party

        System.out.println ("Snake Decided to invite So he visit Everyone house for welcome:");

        //Implicitly they join Snak's house party
        System.out.println ("Enjoy the Party Guys Snake >" + snakeHouse + "\n" +
                "welcome ant in my house >" + (double) anthouse + "\n" +
                "welcome cocroah in my house >" + (double) cockrochouse + "\n" +
                "welcome lizard in my house >" + (double) lizardhouse + "\n" +
                "welcome rat in my house >" + (double) rathouse + "\n" +
                "welcome frog in my house >" + (double) froghouse);

        System.out.println ("  Frog  Decided to throw a party  he visited Everyone house for welcome:");
        System.out.println ("Enjoy the Party Guys Frog >" + froghouse + "\n" +
                "welcome ant in my house >" + (long) anthouse + "\n" +
                "welcome cocroah in my house >" + (long) cockrochouse + "\n" +
                "welcome lizard in my house >" + (long) lizardhouse + "\n" +
                "welcome rat in my house >" + (long) rathouse + "\n" +
                "welcome Snake in my house >" + (long) snakeHouse);

        System.out.println ("  Rat  Decided to throw a party  he visited Everyone house for welcome:");
        System.out.println ("Enjoy the Party Guys Rat >" + rathouse + "\n" +
                "welcome ant in my house >" + (float) anthouse + "\n" +
                "welcome cocroah in my house >" + (float) cockrochouse + "\n" +
                "welcome lizard in my house >" + (float) lizardhouse + "\n" +
                "welcome rat in my house >" + (float) froghouse + "\n" +
                "welcome Snake in my house >" + (float) snakeHouse);

        System.out.println ("  Lizard  Decided to throw a party  he visited Everyone house for welcome:");
        System.out.println ("Enjoy the Party Guys Lizard >" + lizardhouse + "\n" +
                "welcome ant in my house >" + (int) anthouse + "\n" +
                "welcome cocroah in my house >" + (int) cockrochouse + "\n" +
                "welcome lizard in my house >" + (int) rathouse + "\n" +
                "welcome rat in my house >" + (int) froghouse + "\n" +
                "welcome Snake in my house >" + (int) snakeHouse );

        System.out.println (" Cockroch  Decided to throw a party  he visited Everyone house for welcome:");
        System.out.println ("Enjoy the Party Guys Cockroch >" + cockrochouse + "\n" +
                "welcome ant in my house >" + (short) anthouse + "\n" +
                "welcome lizardhouse in my house >" + (short) lizardhouse + "\n" +
                "welcome lizard in my house >" + (short) rathouse + "\n" +
                "welcome rat in my house >" + (short) froghouse + "\n" +
                "welcome Snake in my house >" + (short) snakeHouse );

        System.out.println (" Ant  Decided to throw a party  he visited Everyone house for welcome:");
        System.out.println ("Enjoy the Party Guys Ant >" + anthouse + "\n" +
                "welcome ant in my house >" + (byte) cockrochouse + "\n" +
                "welcome lizardhouse in my house >" + (byte) lizardhouse + "\n" +
                "welcome lizard in my house >" + (byte) rathouse + "\n" +
                "welcome rat in my house >" + (byte) froghouse + "\n" +
                "welcome Snake in my house >" + (byte) snakeHouse );

        System.out.println (" butterfly  Decided to throw a party  he visited Everyone house for welcome:");
        System.out.println (" butterfly  Surpise  Party>>" +butterfly);
        System.out.println ("Enjoy the Party Guys butterfly >" + (char) anthouse + "\n" +
                "welcome ant in my house >" + (char) cockrochouse + "\n" +
                "welcome lizardhouse in my house >" + (char) lizardhouse + "\n" +
                "welcome lizard in my house >" + (char) rathouse + "\n" +
                "welcome rat in my house >" + (char) froghouse + "\n" +
                "welcome Snake in my house >" + (char) snakeHouse );

    }
}
