package runtime.test;

public class RuntimeExceptiontest {

    public static void main(String[] args) {
        // Checked e Uncheked
        Object object = null;
        System.out.println(object.toString());
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()
        // " because "object" is null

        int[] nums = {1,2};
        System.out.println(nums[2]);
       // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 2 out of bounds for length 2

    }



}
