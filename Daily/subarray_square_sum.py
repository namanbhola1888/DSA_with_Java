from typing import List

class SubarraySqaure:
    def sumCounts(self, nums: List[int]) -> int:
        n = len(nums)
        res = 0

        for i in range(n):
            s = set()
            for j in range(i, n):
                s.add(nums[j])
                d = len(s)
                res += d*d
                
        return res
    
nums = [1,2,1]

obj = SubarraySqaure()
print(obj.sumCounts(nums))