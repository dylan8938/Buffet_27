import random
count = int(input("How many random numbers would you like? "))
numbers = [random.randint(1, 10) for i in range(count)]
print("Your numbers are:",", ".join(str(n) for n in numbers))