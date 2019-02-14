public class ShowMeTheMoney{
    public static void main(String args[]){
       int meses = 12;
       float interesBanco1 = 1f;
       float bonificBanco1 = 5f;
       float interesBanco2 = 1.5f;
       double monto = 10000;
       double montoBanco1 = monto;
       double montoBanco2 = monto;
       for ( int n = 1; n <= meses; n++){
          montoBanco1 += montoBanco1 * interesBanco1 / 100;
       }
       montoBanco1 += montoBanco1 * bonificBanco1 /100;
       for ( int n = 1; n <= meses; n++){
          montoBanco2 += montoBanco2 * interesBanco2 / 100;
       }
       System.out.println("Importe final del banco1 : " + montoBanco1);
       System.out.println("Importe final del banco2 : " + montoBanco2);
    }
 }