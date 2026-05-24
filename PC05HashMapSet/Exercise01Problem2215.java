package PC05HashMapSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise01Problem2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        ans.add(new ArrayList<Integer>());

        for(int i : nums1) {
            s1.add(i);
        }

        for(int i : nums2) {
            s2.add(i);
        }

        for(int element : s1) {
            if(!s2.contains(element)) {
                ans.get(0).add(element);
            }
        }

        for(int element : s2) {
            if(!s1.contains(element)) {
                ans.get(1).add(element);
            }
        }

        return ans;

    }
}
