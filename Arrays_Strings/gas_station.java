// 14

public class gas_station {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total_gas =0, start=0,tank=0;
        int sum_gas=0, sum_cost=0;
        for(int i=0;i<gas.length;i++){
            sum_gas += gas[i];
            sum_cost += cost[i]; 
        }

        if((sum_gas - sum_cost) < 0){
            return -1;
        }

        for(int i=0; i<gas.length;i++){
            total_gas += gas[i] - cost[i];
            tank += gas[i] - cost[i];

            if(tank <0){
                start = i+1;
                tank =0;
            }
        }
        
        return total_gas >=0 ? start : -1;
    }

    public static void main(String[] args) {
        // int[] gas = {1,2,3,4,5};
        // int[] cost = {3,4,5,1,2};

        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        gas_station obj = new gas_station();
        int c = obj.canCompleteCircuit(gas, cost);
        System.out.println(c);
    }
}
