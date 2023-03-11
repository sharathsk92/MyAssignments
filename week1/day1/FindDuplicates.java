package week1.day1;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int nums [] = {2,3,4,4,6,9,2};
			for (int i=0; i< nums.length;i++)
			{
				for(int j=i+1; j<nums.length;j++)
				{
					if(nums[i]==nums[j])
					{
						System.out.println(nums[j]);
					}
				}
			}
	}

}
