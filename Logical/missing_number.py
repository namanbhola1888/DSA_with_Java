nums = [2,4,3,5,7,1]

def missing_number(nums: list) -> int:
    n = len(nums) + 1
    expected_sum = n * (n + 1) // 2
    actual_sum = sum(nums)

    return expected_sum - actual_sum


print(missing_number(nums))
