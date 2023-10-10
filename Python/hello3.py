## functions:
'''there is nothing wortten == almost like a comment'''

# printkevin()  # function declaration here  <-- throws error

# print("Kevin has a nice channel")
# print("Kevin has a nice channel")
# print("Kevin has a nice channel")
# print("Kevin has a nice channel")

def printkevin(text=""):
    print("Kevin has a nice channel")
    # text = "sample text here"
    i = 1
    while(i <= 10):
        print(text)
        i+=1

printkevin("Kevin Levin has a great channel")

def school_age_calculation(age, name):
    if age <5 :
        print("Enjoy the time, you are still young. ", name, "is only ", age)
    elif age==5:
        print("Enjoy Kindergarden, ", name)
    else:
        print("they grow up so fast!!")


school_age_calculation(3, "Thomas")
school_age_calculation(10, "Thomas")

def add_10_to_age(age):
    new_age = age + 10
    print(new_age)
    return new_age

age_after_ten = add_10_to_age(3)
print(age_after_ten)