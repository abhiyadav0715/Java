public class middleofevennumbers {
    public static void main(String[] args){
        int[] nums = new int[]{2,4,6,8,10};
        if (nums.length %2 == 0){
            System.out.println("The middle elements are: ");
            int x = nums[(nums.length/2) - 1];
            System.out.println(x);
            int y = nums[nums.length/2];
            System.out.println(y);
        }
        else {
            int z = nums[nums.length/2];
            System.out.println("The middle elements is: ");
            System.out.println(z);
        }
    }
}
