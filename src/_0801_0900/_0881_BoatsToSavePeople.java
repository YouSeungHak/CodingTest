package _0801_0900;

import java.util.*;
import java.util.stream.Collectors;

public class _0881_BoatsToSavePeople {
//    public int numRescueBoats(int[] people, int limit) {
//        int count = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//
//        Arrays.sort(people);
//        for (int i = 0; i < people.length; i++) {
//            map.put(i, people[i]);
//        }
//
//        for (int i = (people.length - 1); i >= 0; i--) {
//            if(map.get(i) < 0)
//                continue;
//            if(people[i] < limit)
//            {
//                for (int j = (i - 1); j >= 0; j--) {
//                    if(map.get(j) < 0)
//                        continue;
//
//                    if(people[i] + people[j] <= limit)
//                    {
//                        map.put(j, -1);
//                        break;
//                    }
//                }
//            }
//
//            count++;
//        }
//
//        return count;
//    }

    public int numRescueBoats(int[] people, int limit) {
        int count = 0;

        ArrayList<Integer> peopleList = new ArrayList<>();
        for (int weight : people) {
            peopleList.add(weight);
        }
        Collections.sort(peopleList, Collections.reverseOrder());

        while(count < peopleList.size()) {
            if(peopleList.get(count) < limit) {
                for (int j = count + 1; j < peopleList.size(); j++) {
                    if (peopleList.get(count) + peopleList.get(j) <= limit) {
                        peopleList.remove(j);
                        break;
                    }
                }
            }
            count++;
        }

        return count;
    }
}
