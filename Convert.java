import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Convert {
	
	Map<Integer,List<Map<Integer,Object>>> map=new TreeMap<>();
	
	public void convertListToMap(List<Level> list)
	{
		int key;
		for(Level level:list)
		{
			List<Map<Integer,Object>> valueList=new ArrayList<>();
			if(level.parentId==-1)
			{
				key=level.id;
				for(Level l:list)
				{
					if(l.parentId==key)
					{
						Map<Integer,Object> value=fillMap(l.id,list);
						valueList.add(value);
					}
				}
				if(valueList.isEmpty())
				{
					map.put(key, null);
				}
				else
				{
					map.put(key, valueList);
					
				}
			}
		}
		
		for (Map.Entry<Integer, List<Map<Integer,Object>>> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}
	
	public Map<Integer,Object> fillMap(int key,List<Level> list)
	{
		int flag=0;
		Map<Integer,Object> m=new HashMap<>();
		for(Level l:list)
		{
			if(l.parentId==key)
			{
				flag=1;
				m.put(key,fillMap(l.id,list));
				
			}
		}
		if(flag==0)
		{
			m.put(key, null);
		}
		return m;
	}

}



