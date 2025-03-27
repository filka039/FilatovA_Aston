public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private int price;
    private boolean buyerReservationStatus;

    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin,
                   int price, boolean buyerReservationStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.buyerReservationStatus = buyerReservationStatus;
    }

    public void getInfo(){
        System.out.printf("Name: %s \nProduction date: %s \nManufacturer: %s \n" +
                        "Country Of Origin: %s \nPrice: %d \nBuyer reservation status: %b \n",
                name, productionDate, manufacturer, countryOfOrigin, price, buyerReservationStatus);
    }
}
