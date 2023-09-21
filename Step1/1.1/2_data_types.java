import java.util.Scanner;
public class Solution {
    public static int dataTypes(String type) {
        //you should not use == as it will check for reference equality.
        if (type.equals("Integer") || type.equals("Float")){
            return 4;
        }
        else if (type.equals("Long") || type.equals("Double")){
            return 8;
        }
        else{
            return 1;
        }
    }
}
