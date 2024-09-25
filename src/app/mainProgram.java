package app;

public class mainProgram {

    static int productNumber;
    static int days;
    static double totalProductSum;
    static double productPrice;
    final static String currency = "EUR";

    public static void main(String[] arg) {

        productNumber = 1;
        days = 5;
        productPrice = 2430.682;
        totalProductSum = productPrice * days;

        System.out.printf(
                "%nProduct No %x: smartphone," +
                "%ntotal sales for %x day is %s %.2f," +
                "%nsales by day is %s %.2f."
                ,productNumber,days,currency,totalProductSum,currency,productPrice);

        productNumber = 2;
        days = 7;
        productPrice = 1498.121;
        totalProductSum = productPrice * days;

        System.out.printf(
                "%nProduct No %x: smartphone," +
                "%ntotal sales for %x day is %s %.2f," +
                "%nsales by day is %s %.2f."
                ,productNumber,days,currency,totalProductSum,currency,productPrice);
    }

}
