numbers = [1,2,3,4,5,82,23]

def reverse_array(numbers):
    start = 0
    end = len(numbers) - 1

    while start < end:
        curr = numbers[start]
        numbers[start] = numbers[end]
        numbers[end] = curr

        start+=1
        end-=1

    return numbers

print(reverse_array(numbers))