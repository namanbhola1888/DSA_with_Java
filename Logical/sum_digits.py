st = "2ha34"

def count_digits(st):
    count = 0

    for char in st:
        if char.isdigit():
            count+=1

    return count


def sum_digits(st):
    total = 0

    for char in st:
        if char.isdigit():
            total+= int(char)

    return total

print(count_digits(st))

print(sum_digits(st))

