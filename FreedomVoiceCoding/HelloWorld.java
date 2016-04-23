import java.util.HashMap; 

public class HelloWorld{

     public static void main(String []args){
        String templateString = "Dear %FIRSTNAME% %LASTNAME%, I hope " + 
            "your stay at %RESORT% was pleasant.  I'd like to offer you " + 
            "a 10% discount for your next visit to %RESORT%.";
        HashMap<String,String> replacement = new HashMap<>();
        replacement.put("FIRSTNAME","Chris");
        replacement.put("LASTNAME","Li");
        replacement.put("RESORT","San Diego");
        System.out.println(replaceStuff(templateString, replacement));
     }
     
     public static String replaceStuff(String templateString, 
        HashMap<String,String> replacement) {
         String res = new String(templateString);
         for (String key : replacement.keySet()) {
             String macro = "%" + key + "%";
             res = res.replaceAll(macro, replacement.get(key));
         }
         return res;
     }
}
