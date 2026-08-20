import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashmapApproach {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void frequencyOfEachElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (var entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Element occurs only once is:" + entry.getKey());
            }
        }
    }

    public static void findMostFrequent(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0;
        int element = 0;
        for (var entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                element = entry.getKey();
            }
        }
        System.out.println(element + " that appears most times in array is:" + maxFreq);
    }

    public static ArrayList<Integer> twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int need = target - current;
            if (map.containsKey(need)) {
                index.add(i);
                index.add(map.get(need));
                return index;
            } else {
                map.put(current, i);
            }
        }
        index.add(-1);
        index.add(-1);
        return index;
    }

    public static void findFirstRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                System.out.println("First Repeating Element:" + arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 1, 5, 4, 7 };

        System.out.println("Original Array:");
        printArray(arr);
        findFirstRepeatingElement(arr);
    }
}
