package TelaVIEW;

import java.util.Calendar;
public class setData {

    public setData(String[] args) {


        Calendar c = Calendar.getInstance();

        int mes = c.get(Calendar.MONTH) +1;

        System.out.println("Dia: "+c.get(Calendar.DAY_OF_MONTH));

        System.out.println("Mes: "+mes);

        System.out.println("Ano"+c.get(Calendar.YEAR));

        System.out.println("\nHora: "+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minutos: "+c.get(Calendar.MINUTE));
        System.out.println("Segundos: "+c.get(Calendar.SECOND));
        

    }
}

