length = int(input("Please enter line length: "))
width = input("Do you want a horizontal or vertical line? ").strip().lower()
if width == "horizontal":
    for i in range(length):
        print("*", end="")
    print()
elif width == "vertical":
    for _ in range(length):
        print("*")
else:
    print("Invalid choice. Please enter horizontal or vertical.")