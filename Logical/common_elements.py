num1 = [1,2,3,14]
num2 = [3,14,5,6]

def common_elements(num1, num2):
    return list(set(num1) & set(num2))

def common_elements_loop(num1, num2):
    set2 = set(num2)
    common = set()

    for num in num1:
        if num in set2:
            common.add(num)

    return common


print(common_elements(num1, num2))

print(common_elements_loop(num1, num2))