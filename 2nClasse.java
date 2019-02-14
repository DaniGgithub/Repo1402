public class ShowMeTheMoney2{
  static double interesCompuesto(double monto, float tasa, int períodos){
     for(int n = 1; n <= períodos; n++ ){
        monto += monto * tasa / 100;
     }
     return monto;
  }
  public static void main(String args[]){
     int meses = 12;
     float interesBanco1 = 1f;
     float bonificBanco1 = 5f;
     float interesBanco2 = 1.5f;
     double monto = 10000;
     double montoBanco1 = monto;
     double montoBanco2 = monto;
     montoBanco1 = interesCompuesto( montoBanco1, interesBanco1, meses );
     montoBanco1 += montoBanco1 * bonificBanco1 /100;
     montoBanco2 = interesCompuesto( montoBanco2, interesBanco2, meses );
     System.out.println("Importe final del banco1 : " + montoBanco1);
     System.out.println("Importe final del banco2 : " + montoBanco2);
     
     //OJOOOO COMO CONTROLO EL JAVA PAPA
     int numero = 1;
     System.out.println("MODIFICACIO DE LA RAMA DEVEL2, JO, DANI" + numero);
  }
}