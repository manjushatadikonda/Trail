package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class finalgrades {
public static void main(String[] args)
{
	
	Map<String,Integer> hMap=new HashMap<String,Integer>();
	Map<String,Integer> hMap1=twohashmaps.getOriginalGrades();
	Map<String,Integer> hMap2=twohashmaps.getMakeUpGrades();
	for(String k:hMap1.keySet())
	{
		if(hMap1.get(k)>hMap2.get(k))
			hMap.put(k,hMap1.get(k));
		else
			hMap.put(k,hMap2.get(k));
	}
	System.out.println("Original Marks:"+hMap1);
	System.out.println("MakeUp Marks:"+hMap2);
	System.out.println("Final Marks:"+hMap);
}
}
