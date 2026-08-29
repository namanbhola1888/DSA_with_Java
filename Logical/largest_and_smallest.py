numbers = [-2,34,2,19,12]

def largest_smallest(numbers):
    max = numbers[0]
    min = numbers[0]

    for num in numbers:
        if num > max:
            max = num

        if num < min:
            min = num

    return max, min


def second_largest_smallest(numbers):
    max = numbers[0]
    min = numbers[0]
    sec_max = numbers[1]
    sec_min = numbers[1]

    for num in numbers:
        if num > max:
            sec_max = max
            max = num
        
        elif num > sec_max and num != max:
            sec_max = num

        if num < min:
            sec_min = min
            min = num

        elif num < sec_min and num != min:
            sec_min = num

    return sec_max, sec_min


print(largest_smallest(numbers))

print(second_largest_smallest(numbers))