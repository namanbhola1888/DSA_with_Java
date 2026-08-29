numbers = [1,2,3,4,5]

def sum_array(numbers):
    sum = 0

    for num in numbers:
        sum += num

    return sum

print(sum_array(numbers))