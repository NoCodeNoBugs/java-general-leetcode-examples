package javaprep;

/**
 * Created by pmukkamala on 7/31/18.
 */
public class MergeAndAppendStrings {


        public static String getMergedString(String a,String b){
            String mergedString="";
// in case of String a and String b are null, return null
            if(a==null && b == null) {
                return null;
            }

            for(int i=0;i<a.length();i++){
                mergedString=mergedString+a.charAt(i);
                if(i<b.length()){
                    mergedString=mergedString+b.charAt(i);
                }
            }
            if(a.length()<b.length()){
                mergedString=mergedString+b.substring(a.length());
            }
            return mergedString;
        }
    public static void main(String[] args) {
        String ms=getMergedString(null,null);
        System.out.print("Merged String:"+ms);

    }
}
