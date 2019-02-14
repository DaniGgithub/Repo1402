double interesCompuesto(double monto, float tasa, int períodos){
    for(int n = 1; n <= períodos; n++ ){
       monto += monto * tasa / 100;
    }
    return monto;
 }