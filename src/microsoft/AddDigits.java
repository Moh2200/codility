/* *
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:
Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*  */


package microsoft;


public class AddDigits {

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        while (num >= 10) {
            int temp = 0;
            while (num > 0) {
                temp = num % 10; // addition of digits
                num = num / 10; // take a digits
            }
            num = temp;
        }

        return num;
    }
}
