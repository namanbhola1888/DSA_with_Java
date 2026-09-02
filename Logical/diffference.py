num = [23,14,329,283,239,32,43]

def max_min_diff(num):
    max_num = max(num)
    min_num = min(num)

    return max_num - min_num

print(max_min_diff(num))