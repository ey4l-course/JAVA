public class Customer {
    private static int idcounter = 0;
    private int id;
    private String givenName;
    private  String surName;
    private String eMail;
    private String deliveryAddress;
    private boolean vip;
    private int vipDiscount;
    private Foodable foodVoucher = null;

    public Customer(String givenName, String surName, String eMail, String deliveryAddress, boolean vip, int vipDiscount) {
        this.idcounter += 1;
        this.id = idcounter;
        this.givenName = givenName;
        this.surName = surName;
        this.eMail = eMail;
        this.deliveryAddress = deliveryAddress;
        this.vip = vip;
        this.vipDiscount = vipDiscount;
    }

    public void giveVoucher(Foodable foodVoucher){
        this.foodVoucher = foodVoucher;
    }

    public void useVoucher(){
        if (foodVoucher != null){
            foodVoucher.useVoucher();
        }else {
            System.out.println("Sorry, no voucher available");
        }
    }

    public int getId() {
        return id;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public String geteMail() {
        return eMail;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isVip() {
        return vip;
    }

    public int getVipDiscount() {
        return vipDiscount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Given Name='" + givenName + '\'' +
                ", Surname='" + surName + '\'' +
                ", E-mail='" + eMail + '\'' +
                ", Delivery address='" + deliveryAddress + '\'' +
                ", is VIP?=" + vip +
                ", VIP discount=" + vipDiscount +
                '}';
    }
}
