/*
Problem : Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 */
public class lcd_7_reverseInteger {
    public int reverse(int x) {
        boolean isNegative = x<0;
        if(isNegative){
            x = x*-1;
        }
        long rev = 0;
        while(x>0){
            rev = rev*10 + (x%10);
            if(rev>=Integer.MAX_VALUE || rev<=Integer.MIN_VALUE) 
                return 0;
            
            x /= 10;
        }    
            return isNegative ? (int)rev*-1 : (int)rev;
    }
}

/* 
Solution :
1. boolean isNegative = x < 0;: Yeh check karta hai ki number negative hai ya nahi.

2. if (isNegative) { x = x * -1; }: Agar number negative hai, toh usse positive bana deta hai.

3. long rev = 0;: Yeh variable reversed number ko store karega.

4.  while (x > 0) { rev = rev * 10 + (x % 10); x /= 10; }: Yeh loop number ke har digit ko reverse karta hai. Har iteration mein, 
    last digit ko rev mein add kar deta hai aur x ko ek digit chhota kar deta hai.

5.  if (rev >= Integer.MAX_VALUE || rev <= Integer.MIN_VALUE) return 0;: Agar reversed number integer limits ke bahar chala jaye, 
    toh 0 return kar deta hai.

6.  return isNegative ? (int)rev * -1 : (int)rev;: Agar original number negative tha, toh reversed number ko bhi negative bana deta hai, 
    warna positive hi return karta hai.
*/

