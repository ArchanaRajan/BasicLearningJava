import java.util.Arrays;

public class IndicesInAnArray {

	public int[] twoSum(int[] nums, int target)
	{
		for (int i = 0; i < nums.length; i++) 
		{
			for (int j = i+1; j < nums.length; j++) 
			{
				if( !(nums[i] + nums[j] == target))
					continue;

				int[] indices = {i, j};
				return indices;
			}
		}
		
		return null;
	}
	
	public static void main(String[] args) 
	{
		IndicesInAnArray indiceInAnArray = new IndicesInAnArray();
		int num[] = {2, 5, 11, 15};
		int index[] = indiceInAnArray.twoSum(num, 26); 
		System.out.println("Index : "+Arrays.toString(index));
	}

}
