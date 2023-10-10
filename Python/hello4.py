# Loops:

x = 0

while x < 5:
    print(x)
    x += 1

for x in range(5,10):
    print(x)

days = ["Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"]

for d in days:
    if (d == "Thur") : continue  # continue means skip
        # break
    print(d)

