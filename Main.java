import java.util.Arrays;

public class  Main{

    public static void main(String[] args) {
        Product product = new Product("TOYOTA Rav4", "02.12.2008", "TOYOTA, TMC",
            "Japan", 11000, true);
        product.getInfo();

        System.out.println("------");

        Product[] productArray = new Product[5];
        productArray[0] = new Product("TOYOTA Rav4", "02.12.2008", "TOYOTA, TMC",
                "Japan", 11000, true);
        productArray[1] = new Product("TOYOTA Rav4", "09.10.2014", "TOYOTA, TMC",
                "Japan", 14000, false);
        productArray[2] = new Product("TOYOTA Corolla", "30.12.2020", "TOYOTA, TMC",
                "Japan", 15000, true);
        productArray[3] = new Product("BMW X5", "17.04.2015", "TBMW AG",
                "Germany", 12000, false);
        productArray[4] = new Product("BMW M5", "10.01.2020", "TBMW AG",
                "Germany", 110000, false);

        for (var prod : productArray){
            prod.getInfo();
            System.out.println("");
        }

        Park.Attraction super8 = new Park().new Attraction("Super 8, 1998",
                "Every day from 9am to 8pm", 300);
        super8.getAttracionInfo();

    }
}
