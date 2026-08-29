numbers = [2,1,4,1,23]

def check_sorted(numbers):
    n = len(numbers)

    for i in range(n-1):
        if numbers[i] < numbers[i + 1]:
            return False

    return True



def sort_list(numbers):
    return sorted(numbers)


print(check_sorted(numbers))

print(sort_list(numbers))