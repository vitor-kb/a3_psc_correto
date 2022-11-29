package TelaVIEW;

import java.util.Calendar;
public class datatela {
    
    public static void main(String[] args) {
        
        
        Calendar c = Calendar.getInstance();
        
        System.out.println("Dia: "+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Mes: "+c.get(Calendar.MONTH +1));
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        
        
        System.out.println("\nHora: "+c.get(Calendar.HOUR_OF_DAY));         
        System.out.println("Minuto: "+c.get(Calendar.MINUTE));
    }
    
}
