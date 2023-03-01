package ex1;

public class Dreptunghi {
   private double lungime;
   private double latime;

   public Dreptunghi(double lungime, double latime){
       this.lungime = lungime;
       this.latime = latime;
   }

   public double Aria(){
       return lungime * latime;
   }
   public double Perimetrul(){
       return 2*lungime + 2*latime;
   }

}