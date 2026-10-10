class MinSquareDiff:
    def minSumSquareDiff(self, nums1: list[int], nums2: list[int], k1: int, k2: int) -> int:
        diff = [abs(a - b) for a, b in zip(nums1, nums2)]
        k = k1 + k2

        if k >= sum(diff):
            return 0

        left, right = 0, max(diff)

        while left < right:
            mid = (left + right) // 2
            operations = sum(max(d - mid, 0) for d in diff)

            if operations <= k:
                right = mid
            else:
                left = mid + 1

        level = left

        remaining = k - sum(max(d - level, 0) for d in diff)

        diff = [min(d, level) for d in diff]

        for i in range(len(diff)):
            if remaining > 0 and diff[i] == level:
                diff[i] -= 1
                remaining -= 1

        return sum(d * d for d in diff)



num1 = [1,2,3,4]
num2 = [2,10,20,19]

k1 = 0
k2 = 0

obj = MinSquareDiff()
print(obj.minSumSquareDiff(num1, num2, k1, k2))