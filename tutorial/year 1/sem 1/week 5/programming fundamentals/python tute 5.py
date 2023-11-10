# #Question 2
# for i in range(1,100):
#
#     for j in range(1,50):
#
#         print(str(i)+" "+str(j))
#

#Question 3
# import random
#
# count = 0
# for i in range(50):
#     dice1 = random.randint(1, 6)
#     dice2 = random.randint(1, 6)
#     if dice1 == dice2:
#         count += 1
#
# print("Out of 50 you rolled {} doubles.".format(count))


# Question 4
#
# number = int(input("Enter number"))
#
# for i in range(1,number+1):
#     print(i, "x" , i, "x", i, "=",(i*i*i))

#Question 5

# for i in range(5,0,-1):
#     print(i * '5')

#Question 5b


# rows = int(input("Enter number of rows: "))
#
# k = 0
#
# for i in range(1, rows+1):
#     for space in range(1, (rows-i)+1):
#         print(end="  ")
#
#     while k!=(2*i-1):
#         print("* ", end="")
#         k += 1
#
#     k = 0
#     print()

#Question 5c
'''k = 0
rows = 8

for i in range(1,rows + 1):
   for space in range(1, (rows-i)+1):k!=(2*i-1)
   print(end="")
   while k!=(2*i-1):
      print("*", end="")
      k +=1
      k=0
      print()'''


#Question 6

# number = int(input("Enter the number"))
# fac = 1
#
# for i in range(number,1,-1):
#     print(i, '*',end="")
#     fac = fac * i
# print("1=" , fac)

#Question 7

# import random
# random_number = random.randint(0,10)
# guess_count = 0
# guess_left = 10
# while guess_count < guess_left:
#     guess = int(input("Guess the number"))
#     guess_count += 1
#     if guess == random_number:
#       print("You win")
#       break
#     else:
#       print("You lose")

# items=[1,2,3,40]
# counter=0
# while counter<len(items):
#     print(items[counter])
#     counter += 1

# counter = 2
# number = 100
# while counter < 10:
#     print(counter+number)
#     counter += 1
#
# counter = 2
# while counter < 100:
#     print(counter)
#     counter += 1
#
#
# letter = "b"
# if letter == "a":
#     print("Letter is a")
#     print ("inside if branch")
# print("Outside if")

number = 100
for i in range(2,10):
    print(i+number)

for i in range(2,100):
    print(i)