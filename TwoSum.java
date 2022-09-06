import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i<nums.length; i++){
	        int comp = target - nums[i];
	        if (map.containsKey(comp)){
	            return new int[] {i, map.get(comp)};
	        }
	        map.put(nums[i],i);
	    }
	    return null;
	}
}
