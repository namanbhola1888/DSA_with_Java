class MaxSumDigits:
    def maxSumOfSquares(self, num: int, sum: int) -> str:
        if sum == 0 or sum > num * 9:
            return ""

        result = ""

        for i in range(num):
            digit = min(9, sum)
            result += str(digit)
            sum -= digit

        return result

num = 2
sum_ = 3

obj = MaxSumDigits()
print(obj.maxSumOfSquares(num, sum_))