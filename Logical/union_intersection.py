num1 = [1,2,3,4]
num2 = [3,4,6,5]

def symmetric_difference(num1, num2):
    return list(set(num1) ^ set(num2))
    
def union(num1, num2):
    return list(set(num1) | set(num2))

def intersection(num1, num2):
    return list(set(num1) & set(num2))


print(symmetric_difference(num1, num2))

print(union(num1, num2))

print(intersection(num1, num2))