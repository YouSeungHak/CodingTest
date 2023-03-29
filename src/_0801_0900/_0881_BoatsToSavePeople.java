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

//    public int numRescueBoats(int[] people, int limit) {
//        int count = 0;
//
//        ArrayList<Integer> peopleList = new ArrayList<>();
//        for (int weight : people) {
//            peopleList.add(weight);
//        }
//        Collections.sort(peopleList, Collections.reverseOrder());
//
//        while(count < peopleList.size()) {
//            if(peopleList.get(count) < limit) {
//                for (int j = count + 1; j < peopleList.size(); j++) {
//                    if (peopleList.get(count) + peopleList.get(j) <= limit) {
//                        peopleList.remove(j);
//                        break;
//                    }
//                }
//            }
//            count++;
//        }
//
//        return count;
//    }

    public int numRescueBoats(int[] people, int limit) {
        // 배열 내림차순으로 정렬하기
        Integer[] weight = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(weight, Collections.reverseOrder());

        // 앞 인덱스와 뒤 인덱스가 같아지는 순간까지 돌리면 된다.
        int count = 0;
        int lastIndex = weight.length;
        for(int i = 0; i < lastIndex; i++) {
            if(weight[i] + weight[lastIndex -1] <= limit) {
                lastIndex--;
            }
            count++;
        }

        return count;
    }
}
