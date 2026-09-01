numbers = [1,2,4,1,132,2,2,3,3,3]

def count_freq(numbers):
    freq = {}

    for num in numbers:
        freq[num] = freq.get(num, 0) + 1

    return freq


print(count_freq(numbers))