package Lab4.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Exceptions {
    public static void check(String s) throws ParseException {
        boolean letter=true;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c) && letter){
                throw new ParseException(s,i);
            }else if(Character.isLetter(c) && !letter)
                throw new ParseException(s,i);
            letter = !letter;
        }
    }
    public static void check(List<String> strings){
        for(String s:strings){
            try{
                check(s);
            }catch(ParseException e){
                strings.remove(s);
            }
        }
    }
    public static boolean checkInterval(String begin, String end) throws ParseException{
       SimpleDateFormat reader=new SimpleDateFormat("dd/MM/yyyy");
       Date date1=reader.parse(begin);
       Date date2=reader.parse(end);
       if(date1.before(date2))
           return true;
       else
           return false;
    }
    public static boolean checkInterval_alternative(String begin,String end){
        try{
            if(checkInterval(begin,end))
                return true;
            return false;
        } catch (ParseException e) {
            return false;
        }
    }
    public static double divide(double a, double b)  {
        try{
            return a/b;
        }catch(IllegalArgumentException e){
            throw new IllegalArgumentException("division by zero",e);
        }
    }
    public static double compute(double a, double b) {
        try {
            return Math.pow(divide(a, b), 2);
        } catch (IllegalArgumentException e) {
            return 0.0;
        }
    }
    public static String completeDelegation(String filename) throws IOException{
        BufferedReader r=new BufferedReader(new FileReader(filename));
        String linea=r.readLine();
        r.close();
        return linea;
    }
    public static String noDelegation(String filename){
        try{
            String linea=completeDelegation(filename);
            return linea;
        }catch(IOException e){
            return null;
        }
    }
    public static String partialDelegation(String filename){
        try{
            String linea=completeDelegation(filename);
            return linea;
        }catch(IOException e){
            throw new RuntimeException();
        }
    }

}
