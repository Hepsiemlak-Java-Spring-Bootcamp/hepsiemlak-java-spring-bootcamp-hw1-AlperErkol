
package part1;


public class part1 {

    
    
    // Helper method for getting reverse of a given number
    public static int getReverse(int value){
        int reversedNumber = 0;
        while(value != 0)   
        {  
            // We use modulus operator to take last element.
            int lastChar = value % 10;
            
            reversedNumber = reversedNumber * 10 + lastChar;  
            
            //We drop last element by divding the number by 10.
            value = value/10;  
        }
        return reversedNumber;
    }
    
    // Checks that whether given number is palindrome or not.
    public static boolean isPalindrome(int value){
        return getReverse(value) == value;
    }
    
    public static void sumTwoNumber(int value, int chainNumber){
        
        int reversed = getReverse(value);
        // int data type can not store variable which is more than 2,147,483,647. 
        // If this number exceeds, it stores negative number.
        if(reversed < 0){
            System.out.println(" --> There is no palindrome for this number for Integer data type.");
            return;
        }
        int sum = value + reversed;
        // Exiting condition
        if(isPalindrome(sum)){
            System.out.println(" --> Max chain number :"+chainNumber);
            return;
        }
        else{
            // Recursion
            sumTwoNumber(sum,++chainNumber);
        }
        
        return;
    }
    
    
    
    public static void main(String[] args) {
        
        int i = 10;
        int chainNumber = 1;
        int sum = 0;
        
        
        while(i<=100){
            
            System.out.print("For number : "+i);
            sumTwoNumber(i, chainNumber);
            i++;
        }
        
        
        
        
    }
    
}
