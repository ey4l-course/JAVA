import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create date list
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String[] StringShowDates = {"09/01/2004", "06/08/2015", "30/10/2003", "29/04/2002", "13/11/2005", "04/12/2016", "14/06/2011", "22/03/2018", "25/07/2019", "20/03/2014"};
        LocalDate[] showDates = new LocalDate[10];
        for (int i = 0; i < 10; i ++){
            showDates[i] = LocalDate.parse(StringShowDates[i], formatter);
        }
        Show[] availableShows = new Show[10];
        Customer[] customers = new Customer[10];
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int show = 0;

        //create customers
        try {
            customers[0] = new Customer("Alice", "Johnson", "alice.johnson@example.com", "123 Maple St, NYC", true, 15);
            customers[1] = new Customer("Bob", "Smith", "bob.smith@example.com", "456 Oak St, NYC", false, 0);
            customers[2] = new Customer("Carol", "Williams", "carol.williams@example.com", "789 Pine St, NYC", true, 10);
            customers[3] = new Customer("David", "Brown", "david.brown@example.com", "101 Birch St, NYC", true, 18);
            customers[4] = new Customer("Eva", "Davis", "eva.davis@example.com", "202 Cedar St, NYC", false, 0);
            customers[5] = new Customer("Frank", "Miller", "frank.miller@example.com", "303 Elm St, NYC", true, 12);
            customers[6] = new Customer("Grace", "Wilson", "grace.wilson@example.com", "404 Willow St, NYC", true, 9);
            customers[7] = new Customer("Henry", "Moore", "henry.moore@example.com", "505 Aspen St, NYC", false, 0);
            customers[8] = new Customer("Ivy", "Taylor", "ivy.taylor@example.com", "606 Maple St, NYC", true, 16);
            customers[9] = new Customer("Jack", "Anderson", "jack.anderson@example.com", "707 Oak St, NYC", true, 20);

        }catch (DateTimeException e){
            System.out.println("Error: invalid date format. Please use dd/MM/yyyy (i.e.: 01/01/2000" + e.getMessage());
        }
        // Create Shows
        try {
            availableShows[0] = new Show("The Phantom of the Opera",showDates[0], 34, 21);
            availableShows[1] = new Show("Hamilton", showDates[1], 47, 38);
            availableShows[2] = new Show("Wicked", showDates[2], 43, 29);
            availableShows[3] = new Show("Rent", showDates[3], 36, 22);
            availableShows[4] = new Show("The Lion King", showDates[4], 48, 30);
            availableShows[5] = new Show("Dear Evan Hansen", showDates[5], 25, 15);
            availableShows[6] = new Show("Spider-Man: Turn Off the Dark", showDates[6], 32, 20);
            availableShows[7] = new Show("Frozen", showDates[7], 29, 19);
            availableShows[8] = new Show("Moulin Rouge! The Musical", showDates[8], 38, 24);
            availableShows[9] = new Show("Aladdin", showDates[9], 35, 27);
        }catch (DateTimeException e){
            System.out.println("Error: invalid date format. Please use dd/MM/yyyy (i.e.: 01/01/2000" + e.getMessage());
        }

//        for ( int i = 0; i < 10; i ++) {
//            System.out.println(availableShows[i]);
//            System.out.println(customers[i]);
//        }

                while (num != 99) {
                    System.out.println("Hello, please enter your customer ID (1-10) or 100 for admin or 99 to exit:");
                    num = scanner.nextInt();
                    if (num < 10) {         //If regular customer (not admin)
                        Customer currentCustomer = customers[num - 1];
                        System.out.printf("Hello %s, Please choose a show: (Enter show number):\n\n", currentCustomer.getGivenName());

                        //Print shows
                        for (Show shows : availableShows){
                            System.out.println(shows.getId() + " " + shows.getName() + " Show date: " + shows.getDate());
                            }

                        //Get order details
                        show = scanner.nextInt();
                        Show chosenShow = availableShows[show-1];
                        System.out.printf("Show %s was selected. This show have %d rows of %d seats.", chosenShow.getName(), chosenShow.getNumberOfRows(), chosenShow.getSeatsInRow());
                        System.out.print("Please select row:");
                        int chosenRow = scanner.nextInt();
                        if (chosenRow > chosenShow.getNumberOfRows()){
                            System.out.println("Row doesn't exist");
                            System.out.print("Please select row:");
                            chosenRow = scanner.nextInt();
                        }
                        System.out.print("Please select seat:");
                        int chosenSeat = scanner.nextInt();
                        if (chosenSeat > chosenShow.getSeatsInRow()){
                            System.out.println("seat doesn't exist");
                            System.out.print("Please select seat:");
                            chosenSeat = scanner.nextInt();
                        }
                        System.out.print("Please enter ticket price:");  //It makes more sense to have the price in the show - but these are the instructions.
                        double showPrice = scanner.nextDouble();

                        if (chosenShow.buyTicket(chosenSeat, chosenRow, showPrice) == true){
                            Ticket newTicket = new Ticket(chosenShow.getName(),chosenShow.getDate(), chosenRow, chosenSeat, currentCustomer.getGivenName()+currentCustomer.getSurName(), showPrice, currentCustomer.isVip(), currentCustomer.getVipDiscount());
                            chosenShow.setRevenue(newTicket.getPrice());
                            System.out.println(newTicket + "\n\n");
                            System.out.println("Would you like a Pizza voucher?(y/n)");
                            if (scanner.hasNextLine()){
                                scanner.nextLine();
                            }
                            String inpt = scanner.nextLine().trim().toLowerCase();
                            if (inpt.equals("y")){
                                currentCustomer.giveVoucher(new Pizza());
                                currentCustomer.useVoucher();
                            }
                        }
                    }else {
                        if (num == 100){
                            System.out.println("Admin menu");
                            while (true){
                                System.out.println("Choose an option:");
                                System.out.println("1. Show revenue");
                                System.out.println("2. Show customers list");
                                System.out.println("0. Exit");
                                int choise = scanner.nextInt();
                                if (choise == 1){
                                    for (Show shows : availableShows){
                                        System.out.println(shows.getName() + " Revenue: " + shows.getRevenue());
                                    }
                                }
                                if (choise == 2){
                                    for (Customer customer : customers){
                                        System.out.println(customer);
                                    }
                                }
                                if (choise == 0){
                                    break;
                                }

                            }
                        }
                    }
                }
    }
}