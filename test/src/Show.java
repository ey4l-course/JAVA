import java.time.LocalDate;
import java.util.ArrayList;

public class Show {
    private static int idcounter = 0;
    private int id;
    private String name;
    private LocalDate date;
    private int seatsInRow;
    private int numberOfRows;
    private ArrayList<boolean[]> availableSeats;
    private double revenue = 0;

    public Show(String name, LocalDate date, int seatsInRow, int numberOfRows) {
        this.idcounter += 1;
        this.id = idcounter;
        this.name = name;
        this.date = date;
        this.seatsInRow = seatsInRow;
        this.numberOfRows = numberOfRows;
        this.availableSeats = new ArrayList<>();

        for (int i = 0; i < numberOfRows; i ++){
            boolean[] row = new boolean[seatsInRow];
            for (int j = 0; j < seatsInRow; j ++){
                row[j] = true;
            }
            availableSeats.add(row);
        }
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getSeatsInRow() {
        return seatsInRow;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public boolean getAvailableSeats(int row, int seat) {
        return availableSeats.get(row)[seat];
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public boolean buyTicket (int seat, int row, double price){
        boolean seatBooked;
        if (availableSeats.get(row)[seat] == true){
            availableSeats.get(row)[seat] = false;
//            revenue += price;
            seatBooked = true;
            System.out.printf("Thank you for ordering ticket to %s. \n Your order for seat %d in row %d is registered, the ticket price is %.2f $\n", this.name, seat, row, price);
        }else{
            System.out.println("Apologies, this seat is taken. please choose another seat");
            seatBooked = false;
        }
        return seatBooked;
    }

    @Override
    public String toString() {
        return "Show{" +
                "ID:=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", seatsInRow=" + seatsInRow +
                ", numberOfRows=" + numberOfRows +
                '}';
    }
}
