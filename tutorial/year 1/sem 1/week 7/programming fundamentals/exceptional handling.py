#Question 2a
'''try:
    print("I am trying to do something")
    raise TypeError("Type error was raised")
except TypeError:
    print("Type error captured")
else:
    print("Type error was not captured")
finally:
    print("This always executes")'''

#Question2b

'''try:
 print("I am trying to do something")
except TypeError:
 print("Typer error captured")
else:
 print("Type error was not captured")
finally:
 print("This always excutes")'''

#Question 3a

'''try:
    x = 5
    y = 0
    assert y != 0, "Invalid"
    print(x / y)'''


#3b
'''try:
    x = 5
    y = 0
    z = x/y
except ValueError as z:
 print(z)'''



















#Question 5
certainnumber = 5
class error(Exception):
    pass
class InputTooLarge(error):
    pass
class InputTooSmall(error):
    pass
try:
    num = int(input("Enter a number"))
    if num > certainnumber:
      raise InputTooLarge
    if num < certainnumber:
      raise InputTooSmall
except InputTooLarge:
    print("Value too large")
except InputTooSmall:
    print("Value too small")


#Question 6


