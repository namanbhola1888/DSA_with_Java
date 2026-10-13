from typing import List

class AlternateMaxSum:
    def maxAlternatingSum(self, nums: List[int]) -> int:
        squares = sorted(x*x for x in nums)
        n = len(squares)
        k = (n + 1) // 2

        return sum(squares[n-k:]) - sum(squares[:n-k])

nums = [1,-1,2,-2,3,-3]

obj = AlternateMaxSum()
print(obj.maxAlternatingSum(nums))