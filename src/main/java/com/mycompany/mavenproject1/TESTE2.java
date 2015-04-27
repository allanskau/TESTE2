/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author a1505580
 */
public class TESTE2 {

    public static void main(String[] args) {
        /*
         Long a = 1234;
         long b = 3;
         Integer c = 3;
         short d = 123456;
         Character ch1 = '3';
         Boolean e =1;
         char ch2 = "A";
         long f = (long) 9876543210;
         */
        
        
        
        GregorianCalendar d1 = new GregorianCalendar(2014, 11, 25);
        GregorianCalendar d2 = new GregorianCalendar(2014, Calendar.DECEMBER, 24, 23, 59);
        long dif = d1.getTime().getTime() - d2.getTime().getTime();
        boolean natal = d2.after(d1);

        System.out.println(d1.toString());

    }
}
