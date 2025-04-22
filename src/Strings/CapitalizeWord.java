package Strings;

public class CapitalizeWord {

    public static void main(String[] args) {
        
        String str = "hello my name";
        System.out.println(capWord(str));
    }

    public static String capWord(String str){

        String words[] = str.split("\\s");

        String cap = "";

        for(String w : words ){
            String first = w.substring(0,1);
            String second = w.substring(1);
            cap += first.toUpperCase()+second+" ";
        }
    
    return cap.trim();
    }


}

