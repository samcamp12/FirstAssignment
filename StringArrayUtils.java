 

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int strLen = array.length;
        return array[(strLen-1)];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int strLen = array.length;
        return array[(strLen-2)];
    }
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        int Counter=0; 
        for(String i:array){
            if (i==value){
            Counter++;
        }
    }
        if(Counter>0){
            return true;
        }else{
            return false;
        }
       
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray;
        int indexNA = 0;
        newArray = new String[array.length];
        for(int i=array.length-1; i>=0; i--){
        newArray[indexNA] = array[i];
        indexNA++;
    }
        return newArray;   
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int arrayLen = array.length;
        int pali = 0;
        for (int i=0; i<arrayLen/2; i++){
            if (array[i] != array[arrayLen-i-1]){
                pali++;
            }
        }
        if(pali==0){
            return true;
        }else{
            return false;
        }
   
    }
    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] mark = new boolean[26];
        int outcome = 0;
        int index = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length(); j++){
            if ('a' <= array[i].charAt(j) && array[i].charAt(j) <= 'z') {
                index = array[i].charAt(j) - 'a'; 
    }
    else{mark[index]=true;}
}
}
        
        for (int i = 0; i <= 25; i++) {
            if (mark[i] == false){
                outcome++; 
            }
        }  
            if (outcome == 0){
                
              return true;
            }else{
                return false;
            }
           
                
            
            
        
              
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int Occu = 0;
        for(int i=0; i<array.length; i++){
            if (array[i]==value){
                Occu++;
            }
        }
        return Occu;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int Counter = 1;
        for(int i=0;i<array.length;i++){
            if(array[i]!=valueToRemove){
                Counter++;
            }
        }
        String[] afterDel = new String[Counter-1];
        for (int i=0,j=0; i<afterDel.length&&j<array.length;i++){
            if(array[i]==valueToRemove){
                afterDel[i]=array[j+1];
                j=j+2;
            }else{
                afterDel[i]=array[j];
                j++;
            }
        }
        return afterDel;
                
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] duprem = new String[array.length];
        int j=0;
         for (int i=0; i<array.length-1; i++){  
            if (array[i] != array[i+1]){  
                duprem[j++] = array[i];  
            }  
         } 
         duprem[j++] = array[array.length-1]; 
         for (int i=0; i<j; i++){  
            array[i] = duprem[i];  
        }  

        return duprem;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
