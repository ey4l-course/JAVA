import java.time.LocalDate;

public class Ticket {
    private static int id = 0;
    private String showName;
    private LocalDate showDate;
    private int row;
    private int seat;
    private String customerName;
    private double price;
    private boolean isVIP;
    private double discount;

    public Ticket(String showName, LocalDate showDate, int row, int seat, String customerName, double price, boolean isVIP, double discount) {
        this.id += 1;
        this.showName = showName;
        this.showDate = showDate;
        this.row = row;
        this.seat = seat;
        this.customerName = customerName;
        this.isVIP = isVIP;
        this.discount = discount;
        this.price = calcDiscount(price);
    }
    private double calcDiscount(double origPrice){
        if (isVIP == true){
//            System.out.println("Calc");
            return origPrice * (1 - (discount / 100));
        }else {
            return origPrice;
        }
    }

    public int getId() {
        return id;
    }

    public String getShowName() {
        return showName;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVIP() {
        return isVIP;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ID =" + id +
                ", showName='" + showName + '\'' +
                ", showDate=" + showDate +
                ", row=" + row +
                ", seat=" + seat +
                ", customerName='" + customerName + '\'' +
                ", price=" + price +
                ", isVIP=" + isVIP +
                ", Discount=" + discount +
                '}';
    }
}

