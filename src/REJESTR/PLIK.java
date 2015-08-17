package REJESTR;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;



/**
 * http://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/
 * @author edatabit
 */
public class PLIK {
    
    public static String PlikiLog = "LOG//";
    public static int j = 0;
    public static int ll = 0;
    public static String[][] daneLog;
    public static String[] systemInfo;
   
      
    public static String podajDate(){
        String s = "";
        String s1 = "";
        int m = 0;
        
        Calendar cal = new GregorianCalendar();

        m = cal.get(Calendar.MONTH);
        m = m + 1;
        if (m<10){
            s = "0" + Integer.toString(m);
        }else{
            s = Integer.toString(m);
        }
        m = cal.get(Calendar.DATE);
        if (m<10){
            s1 = "0" + Integer.toString(m);
        }else{
            s1 = Integer.toString(m);
        }
        s = s1+"-"+s+"-"+Integer.toString(cal.get(Calendar.YEAR));
        return s;
    }
    
    private static String podajCzas(){
        
                String s = "";
        String s1 = "";
        int m = 0;
        
        Calendar cal = new GregorianCalendar();

        // WYŚWIETLANIE GODZINY
        m = cal.get(Calendar.HOUR_OF_DAY);
        if (m<10){
            s = "0"+Integer.toString(m);
        }else{
            s = Integer.toString(m);
        }
        s1 = s;
        m = cal.get(Calendar.MINUTE);
        if (m<10){
            s = "0"+Integer.toString(m);
        }else{
            s = Integer.toString(m);
        }        
        s1 = s1+":"+s;
        m = cal.get(Calendar.SECOND);
        if (m<10){
            s = "0"+Integer.toString(m);
        }else{
            s = Integer.toString(m);
        }  
         s = s1 + ":"+s;
        
        return s;
    }
        
    public static void doLogu(String stat, String kom) {
        String s = "";
        String data = podajDate();
        String godzina = podajCzas();
        String plik = PlikiLog + data+".log";
        String text = " "+stat+"    |   "+data+"    |   "+godzina+" |   "+kom;
        try{

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(plik,true), "UTF-8"));
            out.append(text).append("\r\n");
            out.flush();
            out.close();
                      
        }catch (Exception e){
              System.out.println("Coś poszło nie tak !!!");
        }
    };
    
    public static void SystemInfo(){
        String[] wyj = {"0","1","2","3","4"};
        double d;
        
        wyj[0] = Integer.toString(Runtime.getRuntime().availableProcessors());
        d = Runtime.getRuntime().freeMemory();
        wyj[1] = new DecimalFormat("#.###").format(d/1000000);

        d = Runtime.getRuntime().maxMemory();
        wyj[2] = new DecimalFormat("#.###").format(d/1000000);
        
        d = Runtime.getRuntime().totalMemory();
        wyj[3] = new DecimalFormat("#.###").format(d/1000000);

        systemInfo = wyj;
    }
    
    
}
