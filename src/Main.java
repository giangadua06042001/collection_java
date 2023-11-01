import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//
//        int[]arrayTestHasMap={1,1,1,2,2,33,44,44,33,55};
//          Map<Integer, Integer> map=new HashMap<>();
//        for (int i =0 ;i<arrayTestHasMap.length; i++){
//            map.put(i,arrayTestHasMap.length);
//        }
//        System.out.println(map);
//        for (int i = 0; i<arrayTestHasMap.length; i++){
//            int arrayMap=arrayTestHasMap[i];
//            map.put(arrayMap,map.getOrDefault(arrayMap,2)+1);
//        }
//        System.out.println(map);
        Queue<String>testQueue=new LinkedList<>();
        testQueue.add("Tao la con ca");
        testQueue.add("Tao la con thu 2");
        testQueue.add("Tao la con thu 3");
        String test= testQueue.poll();
        String test2=testQueue.poll();
        System.out.println(test);
        System.out.println(test2);
        System.out.println("==========================================");
        System.out.println(testQueue);
    }
}