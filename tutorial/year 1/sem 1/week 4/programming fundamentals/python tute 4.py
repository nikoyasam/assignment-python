
#Question 1
# num = int(input("Enter number: "))
# for i in range(1, 11):
#     print(num,"X" ,i, "=",num * i)

#Question 2   
# total = 0
# number = 0
# while number!= -1:
#    number = int(input("Enter Number: "))
#    total = total + number
# print(total)

#Question 3

# secret_number = 5
# score = 100
# guess_count = 0
# guess_limit = 20
#
# while guess_count <= guess_limit:
#     guess = int(input("guess the number: "))
#     guess_count += 1
#     if guess == secret_number:
#        print("Won")
#        break;
#     else:
#        print("Failed")

#Question 4

# import random
# secret_number = random.randint(1,100)
# guess_count = 0
# guess_limit = 5
#
# while guess_count < guess_limit:
#     guess = int(input("guess the number: "))
#     guess_count += 1
#     if guess == secret_number:
#        print("Won")
#        break
#     else:
#        print("Failed")
# if guess_count == guess_limit:
#     print("Sorry, you have run out of guesses. The number was", secret_number)

# #Question 5
# i = 1
# while i<=6:
#      j = 1
#      while j <=i:
#          print(j, end="")
#          j += 1
#      i += 1
#      print()

#Question 6

# counter = 1
# while counter != 100:
#     print(counter)
#     counter+=1


# import random as rand
# var = 10
# gen_num = rand.randint(1,150)
# while gen_num != 2:
#  print('Random num is not 2')
#  gen_num = rand.randint(1,150)
# else:
#  print('Finally it is 2')

# #Question 7
# count = 1
# while count <= 3:
#     p = int(input("enter value for p: "))
#     n = int(input("Enter value for n: "))
#     r = int(input("Enter value for r: "))
#
#     si = p*n*r/100
#     print(si)
#     count += 1
#     break;



#Question 8

# count = 9
# while count >= 0:
#     if count == 5:
#         break
#     print('current value :',count)
#     count -= 1


# with break and else
# for i in range(9, -1, -1):
#     if i == 5:
#         break
#     print("Current value :", i)
#
# else:
#     print("bye")

              
# for i in range(9, -1, -1):
#     if i == 5:
#         continue
#     print("Current value :", i)
# else:
#     print("bye")

count = 9
for i in range(9,-1,-1):
    if (i==5):
        break
    print("'Current value is: ',",str(i))

count = 9
for i in range(9,-1,-1):
    if (i==5):
        continue
    print("'Current value is: ',",str(i))
else:
    print("bye!")