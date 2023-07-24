package _0001_0100;

public class _0075_SortColors {
    public void printIntArrayData(int title, int[] nums) {
        if(title >= 0)
            System.out.print(title + " : ");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public int[] insertionSort(int[] nums) {
        printIntArrayData(-1, nums);
        for(int i = 1; i < nums.length; i++) {
            for(int j = i; j > 0; j--) {
                if(nums[j - 1] > nums[j]) {
                    int key = nums[j - 1];
                    nums[j- 1] = nums[j];
                    nums[j] = key;
                } else {
                    break;
                }
            }
            printIntArrayData(i, nums);
        }

        return nums;
    }

    public int[] selectionSort(int[] nums) {
        printIntArrayData(-1, nums);
        for(int i = 0; i < nums.length - 1; i++) {
            int selectIndex = -1;
            int minNum = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < minNum) {
                    minNum = nums[j];
                    selectIndex = j;
                }
            }
            if(selectIndex != -1) {
                int key = nums[i];
                nums[i] = nums[selectIndex];
                nums[selectIndex] = key;
            }
            printIntArrayData(i, nums);
        }

        return nums;
    }

    public int[] bubbleSort(int[] nums) {
        printIntArrayData(-1, nums);
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j + 1] < nums[j]) {
                    int key = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = key;
                }
            }
            printIntArrayData(i, nums);
        }

        return nums;
    }

    public int[] shellSort(int[] nums) {
        for(int gap = nums.length / 2; gap > 0; gap = gap / 2) {
            if((gap % 2) == 0) {
                gap++; // gap을 홀수로 만든다.
            }

            // 부분 리스트의 개수는 gap과 같다.
            for(int i = 0; i < gap; i++) {
                // 부분 리스트에 대한 삽입 정렬 수행
                for (int j = i +gap; j <= nums.length-  1; j = j + gap) {
                    for(int k = j; k > gap - 1; k = k -gap) {
                        if(nums[k - gap] > nums[k]) {
                            int key = nums[k - gap];
                            nums[k- gap] = nums[k];
                            nums[k] = key;
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        return nums;
    }

    public int[] sortColors(int[] nums) {
//        return insertionSort(nums);
//        return selectionSort(nums);
//        return bubbleSort(nums);
        return shellSort(nums);
    }
}
