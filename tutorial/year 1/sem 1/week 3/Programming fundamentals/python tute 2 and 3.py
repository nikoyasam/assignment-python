
#Question 2
value = 100
#print - version
print('value is')
print(value)

#print - version 2
print('value is',value)

#print - version 3 - To suppress printing of a new line, use end=' '
print('value is ', end=' ')
print(value)


#Question 3
print("I'm a student........")
print("This is a 'great' website")
print("\n is the character to enter a new line")
print('This is a "great" website')
print("test\\test2\\answers.txt")
print("'\ is called a backslash")



#Question 5
number = int(input("Whats the number?"))
if number > 0 :
        print("positive")
else:
    print("negative")

#Question 6
number = int(input("Whats the number"))
if number%2 == 0:
    print("The number is even")
else:
    print("The number is odd")

#Question 7
mark = int(input("Enter the mark"))
if mark<0 or mark>100:
    print('invalid mark')
elif mark >=70:
    print('Exceptional result!')
elif mark >= 40:
    print('Satisfactory result!')
else:
    print('You have failed.')

#Question 8
marks = int(input("Enter marks"))
if marks < 25:
    print("F")
elif 25<=marks<45:
    print("E")
elif 45<=marks<50:
    print("D")
elif 50<=marks<60:
    print("C")
elif 60<=marks<80:
    print("B")
elif marks>80:
    print("A")
    
#Question 9
number_1 = int(input('Enter your first number: '))
number_2 = int(input('Enter your second number: '))

print(number_1 + number_2)

print('{} + {} = '.format(number_1, number_2))
print(number_1 + number_2)

number_1 = int(input('Enter your first number: '))
number_2 = int(input('Enter your second number: '))

print('{} * {} = '.format(number_1, number_2))
print(number_1 * number_2)


number_1 = int(input('Enter your first number: '))
number_2 = int(input('Enter your second number: '))

print('{} / {} = '.format(number_1, number_2))
print(number_1 / number_2)

number_1 = float(input('Enter your first number: '))
number_2 = float(input('Enter your second number: '))

print('{} - {} = '.format(number_1, number_2))
print(number_1 - number_2)

#Question 10
age1=int(input("enter age of person 1: "))
age2=int(input("enter age of person 2: "))
age3=int(input("enter age of person 3: "))
if age1>age2 and age1>age3:
    print("age1 is oldest")
elif age2>age1 and age2>age3:
    print("age2 is oldest")
else:
    print("age3 is oldest")
if age1<age2 and age1<age3:
    print("age1 is youngest")
elif age2<age1 and age2<age3:
    print("age2 is youngest")
else:
    print("age3 is youngest")
    
#Question 11
temp = float(input("Temperature of water :"))
if temp<=0:
    print("Frozen")
elif temp<=12:
    print("Cold")
elif temp<=25:
    print("Warm")
elif temp<=75:
    print("Hot")
elif temp<=100:
    print("very hot")
else:
    print("Burning")


#Question 12
a=100
b=105

if a>50 and a<200:
 print("both conditions are true")
#This will not execute
if a==50 and b==105:
 print("first condition false, second true")
#This will not execute
if a>=100 and b<100:
 print("first condition true, second false")
#This will not execute
if a!=100 and b==100:
 print("both false")
if a>=100 or b<200:
  print("both conditions are true")
if a==100 or b==100:
  print("first condition true, second false")
if a<1000 or b<200:
  print("first condition false, second true")
if a<1000 or b<1000:
  print("both conditions are false")

if(not(a==50 and b==105)):
 print("Evaluate opposite boolean value")


a=105
b=100

if a>50 and a<200:
 print("both conditions are true")
#This will not execute
if a==50 and b==105:
 print("first condition false, second true")
#This will not execute
if a>=100 and b<100:
 print("first condition true, second false")
#This will not execute
if a!=100 and b==100:
 print("both false")
 if a>=100 or b<200:
  print("both conditions are true")
if a==100 or b==100:
  print("first condition true, second false")
if a<1000 or b<200:
  print("first condition false, second true")
if a<1000 or b<1000:
  print("both conditions are false")

if(not(a==50 and b==105)):
  print("Evaluate opposite boolean value")


#Question 13
x = 10
y = 20
z = 30

if x == 10:
    print(" Nested If")
    if y == 20:
        print(" End of Nested If Block ")
    else:
        print(" End of Nested If-Else Block ")
elif y == 20:
    print(" Elif block ")
else:
    print(" Nested If")
    if z == 30:
        print(" End of Nested If Block ")
    else:
        print(" End of Nested If-Else Block ")









