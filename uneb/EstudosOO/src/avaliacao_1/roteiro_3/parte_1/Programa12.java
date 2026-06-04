package avaliacao_1.roteiro_3.parte_1;
import java.util.*;

public class Programa12 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   double sb, sr;
   
   System.out.println ("Informa o Salário Base:");
   sb = sc.nextDouble();
   sr = Programa12.calcGratImp(sb); 
   System.out.println ("Salário a receber:" + sr);
   
}

public static double calcGratImp (double sb){
double grat = sb * 5 / 100; // Cálculo da gratificação
        double imp = sb * 7 / 100;  // Cálculo do imposto
        return sb + grat - imp; // Cálculo do salário a receber após dedução
    }
}
  

   
    

