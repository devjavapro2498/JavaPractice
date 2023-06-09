import java.util.Scanner;

class MenuAndBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int qty, magenta;
        int price = 0;

        char order = 'y';

        while (order == 'y') {
            System.out.println ("For Having food Press-1\nFor HoteL Booking Press-2\n Press any Option");
            magenta = scanner.nextInt ();
            if (magenta == 1) {
                System.out.println ("For Staters press 1\nFor Lunch press 2\nFor Dinner press 3\nPress any Option:");
                int violet = scanner.nextInt ();
                switch (violet) {
                    case 1:
                        System.out.println ("Welcome To Staters Menu :");
                        System.out.println ("For Veg press 1\nFor Non-Veg press 2\nPress any Option:");
                        int blue = scanner.nextInt ();
                        switch (blue) {
                            case 1:
                                System.out.println ("Welcome to Veg Starters\nSpring-roll Press-1\nFinger-Chips Press-2\nPanner-pakora Press-3\nNoodles Press-4\nChow Press-5\nGol-Gappe Press-6\nPanner Tikka Press-7\nIdli Sambar Press-8\nPanner Pakora Press-9\nNoodles Press-10");
                                int green = scanner.nextInt ();
                                if (green >= 1 && green <= 3) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 100;
                                } else if (green >= 4 && green <= 6) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 200;
                                } else if (green >= 7 && green <= 10) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 300;
                                } else {
                                    System.out.println ("You haven't choose any Veg Item");
                                }
                                break;
                            case 2:
                                System.out.println ("Welcome to Non-Veg Starters\nNon-Veg Spring-roll Press-1\nNon-Veg Chicken-Chips Press-2\nNon-Veg Chicken Prantha Press-3\nNon-Veg Noodles Press-4\nNon-Veg Chicken Chowmin Press-5\nNon-Veg Tandoori Press-6\nNon-Veg Chicken Tikka Press-7\nNon-Veg Press-8\nNon-Veg Chicken Pakora Press-9\nNon-Veg Lolip Press-10");
                                int yellow = scanner.nextInt ();
                                if (yellow >= 1 && yellow <= 3) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 100;
                                } else if (yellow >= 4 && yellow <= 6) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 200;
                                } else if (yellow >= 7 && yellow <= 10) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 300;
                                } else {
                                    System.out.println ("You haven't choose any Non-Veg Item");
                                }
                                break;
                            default:
                                System.out.println ("You haven't choosen the Starters Option");
                        }
                        break;

                    case 2:
                        System.out.println ("Welcome To Lunch Menu :");
                        System.out.println ("For Veg press 1\nFor Non-Veg press 2\nPress any Option:");
                        int orange = scanner.nextInt ();
                        switch (orange) {
                            case 1:
                                System.out.println ("Welcome to Veg Lunch\nDal-Makhni Press-1\nRice-kadiPress-2\nRajma Rice Press-3\nDal-ROTI Press-4\nKoftaMalai-Roti Press-5\nAloo Prantha Press-6\nGobhi prantha Press-7\nAlomutor- roti Press-8\nPannerpyaza Press-9\nShahePaneer Press-10");
                                int green = scanner.nextInt ();
                                if (green >= 1 && green <= 3) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 100;
                                } else if (green >= 4 && green <= 6) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 200;
                                } else if (green >= 7 && green <= 10) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 300;
                                } else {
                                    System.out.println ("You haven't choose any Veg Item");
                                }
                                break;
                            case 2:
                                System.out.println ("Welcome to Non -Veg Lunch\nChicken Press-1\nRice-ChickenkadiPress-2\nChicken Rice Press-3\nChicken-ROTI Press-4\nChickenKoftaMalai-Roti Press-5\nChicken Prantha Press-6\nChickenCurry prantha Press-7\nMutoon- roti Press-8\nFish Press-9\nEgg Press-10");
                                int yellow = scanner.nextInt ();
                                if (yellow >= 1 && yellow <= 3) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 100;
                                } else if (yellow >= 4 && yellow <= 6) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 200;
                                } else if (yellow >= 7 && yellow <= 10) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 300;
                                } else {
                                    System.out.println ("You haven't choose any Non-Veg Item");
                                }
                                break;
                            default:
                                System.out.println ("You haven't choosen Any lunch Item Option");
                        }
                        break;
                    case 3:
                        System.out.println ("Welcome To Dinner Menu :");
                        System.out.println ("For Veg Dinner press 1\nFor Non-Veg Dinner press 2\nPress any Option:");
                        int Red = scanner.nextInt ();
                        switch (Red) {
                            case 1:
                                System.out.println ("Welcome to Veg Dinner\nDal-Makhni Press-1\nRice-kadiPress-2\nRajma Rice Press-3\nDal-ROTI Press-4\nKoftaMalai-Roti Press-5\nAloo Prantha Press-6\nGobhi prantha Press-7\nAlomutor- roti Press-8\nPannerpyaza Press-9\nShahePaneer Press-10");
                                int green = scanner.nextInt ();
                                if (green >= 1 && green <= 3) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 100;
                                } else if (green >= 4 && green <= 6) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 200;
                                } else if (green >= 7 && green <= 10) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 300;
                                } else {
                                    System.out.println ("You haven't choose any Veg Item");
                                }
                                break;
                            case 2:
                                System.out.println ("Welcome to Non -Veg Dinner\nChicken Press-1\nRice-ChickenkadiPress-2\nChicken Rice Press-3\nChicken-ROTI Press-4\nChickenKoftaMalai-Roti Press-5\nChicken Prantha Press-6\nChickenCurry prantha Press-7\nMutoon- roti Press-8\nFish Press-9\nEgg Press-10");
                                int yellow = scanner.nextInt ();
                                if (yellow >= 1 && yellow <= 3) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 100;
                                } else if (yellow >= 4 && yellow <= 6) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 200;
                                } else if (yellow >= 7 && yellow <= 10) {
                                    System.out.println ("Quanty:");
                                    qty = scanner.nextInt ();
                                    price = price + qty * 300;
                                } else {
                                    System.out.println ("You haven't choose any Non-Veg Item");
                                }
                                break;
                            default:
                                System.out.println ("You haven't choosen Any Dinner Item Option");
                        }
                        break;
                    default:
                        System.out.println ("You haven't choosen a correct option to order Food Option please choose it wisely");

                }
            } else if (magenta == 2) {
                System.out.println ("For 7* room press 1\nFor 5* press 2\nFor 3*  press 3\nPress any Option:");
                int violet = scanner.nextInt ();
                switch (violet) {
                    case 1:
                        System.out.println ("Welcome To 7*  HotelBookings :");
                        System.out.println ("For Super Delux press 1\nFor Delux press 2\nPress any Option:");
                        int blue = scanner.nextInt ();
                        switch (blue) {
                            case 1:
                                System.out.println ("Welcome to For 7*  Super Delux rooms\nSingle Person Press-1\nCouples Press-2\nTrio Memebers Press-3\nFour members Press-4\nFor 5 family Membbers Press-5\nFor 6 family Membbers Press-6\n For 7 family MembbersPress-7\n For 8 family Membbers Press-8\n For 9 family MembbersPress-9\n For 10 family Membberss Press-10");
                                int green = scanner.nextInt ();
                                if (green >= 1 && green <= 3) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 1000;
                                    int count=0;
                                    int  rooms[]= new int[10];
                                    for (int i=0;i<rooms.length; i++){
                                        System.out.println ("Enter the Number of person:");
                                        rooms[i]=scanner.nextInt ();
                                        if(rooms[i]<=10){
                                            count++;
                                        }
                                    }
                                    System.out.println ("Room1>" +rooms[0]);
                                    System.out.println ("Room2>" +rooms[1]);
                                    System.out.println ("Room3>" +rooms[2]);
                                    System.out.println ("Room4>" +rooms[3]);
                                    System.out.println ("Room5" +rooms[4]);
                                    System.out.println ("This flor is full" +count);

                                } else if (green >= 4 && green <= 6) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 2000;
                                } else if (green >= 7 && green <= 10) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 2000;
                                } else {
                                    System.out.println ("You haven't choose any Super Delux Roooms");
                                }
                                break;
                            case 2:
                                System.out.println ("Welcome to For 7* Delux rooms\nSingle Person Press-1\nCouples Press-2\nTrio Memebers Press-3\nFour members Press-4\nFor 5 family Membbers Press-5\nFor 6 family Membbers Press-6\n For 7 family MembbersPress-7\n For 8 family Membbers Press-8\n For 9 family MembbersPress-9\n For 10 family Membberss Press-10");
                                int yellow = scanner.nextInt ();
                                if (yellow >= 1 && yellow <= 3) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 500;
                                } else if (yellow >= 4 && yellow <= 6) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 1000;
                                } else if (yellow >= 7 && yellow <= 10) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 1500;
                                } else {
                                    System.out.println ("You haven't choose any Delux Rooms");
                                }
                                break;
                            default:
                                System.out.println ("You haven't choosen the 7* SuperDelux/Delux Rooms Rooms Option");
                        }
                        break;

                    case 2:
                        System.out.println ("Welcome To 5*  HotelBookings :");
                        System.out.println ("For Super Delux press 1\nFor Delux press 2\nPress any Option:");
                        int orange = scanner.nextInt ();
                        switch (orange) {
                            case 1:
                                System.out.println ("Welcome to For 5*  Super Delux rooms\nSingle Person Press-1\nCouples Press-2\nTrio Memebers Press-3\nFour members Press-4\nFor 5 family Membbers Press-5\nFor 6 family Membbers Press-6\n For 7 family MembbersPress-7\n For 8 family Membbers Press-8\n For 9 family MembbersPress-9\n For 10 family Membberss Press-10");
                                int green = scanner.nextInt ();
                                if (green >= 1 && green <= 3) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 700;
                                } else if (green >= 4 && green <= 6) {

                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 900;
                                } else if (green >= 7 && green <= 10) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 1000;
                                } else {
                                    System.out.println ("You haven't choose any Super Delux Room");
                                }
                                break;
                            case 2:
                                System.out.println ("Welcome to 5* Delux rooms\nSingle Person Press-1\nCouples Press-2\nTrio Memebers Press-3\nFour members Press-4\nFor 5 family Membbers Press-5\nFor 6 family Membbers Press-6\n For 7 family MembbersPress-7\n For 8 family Membbers Press-8\n For 9 family MembbersPress-9\n For 10 family Membberss Press-10");
                                int yellow = scanner.nextInt ();
                                if (yellow >= 1 && yellow <= 3) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 500;
                                } else if (yellow >= 4 && yellow <= 6) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 800;
                                } else if (yellow >= 7 && yellow <= 10) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 900;
                                } else {
                                    System.out.println ("You haven't choose any 5* Delux rooms");
                                }
                                break;
                            default:
                                System.out.println ("You haven't choosen Any 5* rooms Option");
                        }
                        break;
                    case 3:
                        System.out.println ("Welcome To 3*  HotelBookings :");
                        System.out.println ("For Super Delux press 1\nFor Delux press 2\nPress any Option:");
                        int Red = scanner.nextInt ();
                        switch (Red) {
                            case 1:
                                System.out.println ("Welcome to For 3*  Super Delux rooms\nSingle Person Press-1\nCouples Press-2\nTrio Memebers Press-3\nFour members Press-4\nFor 5 family Membbers Press-5\nFor 6 family Membbers Press-6\n For 7 family MembbersPress-7\n For 8 family Membbers Press-8\n For 9 family MembbersPress-9\n For 10 family Membberss Press-10");
                                int green = scanner.nextInt ();
                                if (green >= 1 && green <= 3) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 400;
                                } else if (green >= 4 && green <= 6) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 700;
                                } else if (green >= 7 && green <= 10) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 500;
                                } else {
                                    System.out.println ("You haven't choose any SuperDelux Rooms");
                                }
                                break;
                            case 2:
                                System.out.println ("Welcome to 3* Delux rooms\nSingle Person Press-1\nCouples Press-2\nTrio Memebers Press-3\nFour members Press-4\nFor 5 family Membbers Press-5\nFor 6 family Membbers Press-6\n For 7 family MembbersPress-7\n For 8 family Membbers Press-8\n For 9 family MembbersPress-9\n For 10 family Membberss Press-10");
                                int yellow = scanner.nextInt ();
                                if (yellow >= 1 && yellow <= 3) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 300;
                                } else if (yellow >= 4 && yellow <= 6) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 600;
                                } else if (yellow >= 7 && yellow <= 10) {
                                    System.out.println ("Enter the Number of person:");
                                    qty= scanner.nextInt ();
                                    price = price +qty* 700;
                                } else {
                                    System.out.println ("You haven't choose any 3* Delux rooms");
                                }
                                break;
                            default:
                                System.out.println ("You haven't choosen Any 3* rooms Option");
                        }
                        break;
                    default:
                        System.out.println ("You haven't choosen a correct option for Hotel Booking Option please choose it wisely");

                }
            } else {
                System.out.println ("You haven't choose correct option");
            }
            System.out.println ("Do u want Any other food items/Book room then say 'y'");
            order = scanner.next ().charAt (0);
            System.out.println ("Total Bil:" + price);
        }
    }
}


