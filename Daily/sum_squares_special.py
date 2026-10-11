from typing import List

class SumSquares:
    def sumOfSquares(self, nums: List[int]) -> int:
        n = len(nums)
        sum_square = 0

        for i in range(n):
            if n%(i+1) == 0:
                sum_square += nums[i]**2

        return sum_square

nums = [1,2,3,4]

obj = SumSquares()
print(obj.sumOfSquares(nums))