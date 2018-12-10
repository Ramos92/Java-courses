public class Calculate {

      public static void main(String[] arg)   
      {
           System.out.println("Calculate...");
           double first = Double.valueOf(arg[0]);
           double second = Double.valueOf(arg[1]);
           double summ = first + second;
           double delenie = (double) first/second;
           double stepen = Math.pow(first,second);
           System.out.print("Bo3BeDeHuE B CTeneHb " + stepen + " ");
           System.out.print("Delenie " + delenie + " ");
           System.out.print("Sum " + summ);
      }


}
