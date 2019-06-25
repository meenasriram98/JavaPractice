import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Convert {
	
	public void convertListToMap(List<Level> list)
	{
		
		Map<Integer,Map<Integer,Integer>> map=new TreeMap<>();
		
		
		//iterates through the list and creates a map with id as key
        for (Level level : list) {
        	map.put(level.id, new HashMap(){{put(level.id,level.parentId);}});
			
		}
		
		
        for (Map.Entry<Integer, Map<Integer,Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
		
	}

}
