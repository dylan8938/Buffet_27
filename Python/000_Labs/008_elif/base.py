first_number = int(input("Please enter a number: "))
operation = input("Please enter an operation: ")
second_number = int(input("Please enter another number: "))

if operation == "+":
	result = first_number + second_number
elif operation == "-":
	result = first_number - second_number
elif operation == "*":
	result = first_number * second_number
elif operation == "/":
	result = first_number / second_number

print(str(first_number) + str(operation) + str(second_number) + " = " + str(result))