package P1;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,3,2,1};
		Map<Integer,Integer> findOcc=new HashMap<>();
		for(int num:arr)
		{
			findOcc.put(num,findOcc.getOrDefault(num, 0)+1 );
		}
		for(Map.Entry<Integer, Integer> entry:findOcc.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}
	}

}

