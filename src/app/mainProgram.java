package app;

public class mainProgram {

    static int productNumber;
    static int days;
    static double productSum;
    static double salesByDay;
    final static String currency = "EUR";

    public static void main(String[] arg) {

        productNumber = 1;
        days = 5;
        productSum = 12153.41;
        salesByDay = productSum / days;

        System.out.printf(
                "%nProduct No %x: smartphone," +
                        "%ntotal sales for %x day is %s %.2f," +
                        "%nsales by day is %s %.2f."
                ,productNumber,days,currency,productSum,currency,salesByDay);

        productNumber = 2;
        days = 7;
        productSum = 10486.85;
        salesByDay = productSum / days;

        System.out.printf(
                "%nProduct No %x: smartphone," +
                        "%ntotal sales for %x day is %s %.2f," +
                        "%nsales by day is %s %.2f."
                ,productNumber,days,currency,productSum,currency,salesByDay);
    }

}
