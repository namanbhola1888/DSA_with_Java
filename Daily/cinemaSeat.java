import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class cinemaSeat{

    private boolean isFree(Set<Integer> reserved, int start){

        for(int i=start; i<start+4; i++){
            if(reserved.contains(i)) return false;
        }

        return true;
    }

    public int maxNumberOfFamilies(int n, int[][] reservedSeats){
        HashMap<Integer, Set<Integer>> map = new HashMap<>();

        for(int[] seats: reservedSeats){
            int row = seats[0];
            int col = seats[1];

            map.computeIfAbsent(row, k -> new HashSet<>()).add(col);
        }

        int answer = (n - map.size()) * 2;

        for(Set<Integer> reserved: map.values()){
            boolean left = isFree(reserved, 2);
            boolean middle = isFree(reserved, 4);
            boolean right = isFree(reserved, 6);

            if(left && right) answer += 2;
            else if(left || middle || right) answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 2;

        int[][] seats = {
            {2,1},
            {1,8},
            {2,6}
        };

        cinemaSeat obj = new cinemaSeat();
        System.out.println(obj.maxNumberOfFamilies(n, seats));

    }
}