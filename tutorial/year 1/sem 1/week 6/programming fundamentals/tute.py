import random
import time

def display_intro ():
    print("You are in the Kingdom of Dragons. In front of you, you see two caves.In one cave, the dragon is friendly and will share his treasure with you.The other dragon is hungry and will eat you on sight.") 

def choose_cave ():
    choice_input = input("Which cave you going to chose(cave 1 or cave 2): ")
    if choice_input == "Cave1":
        return 1
    if choice_input == "Cave2":
        return 2
    
def check_cave(chosen_cave):
   import random
   num = random.randint(1,2)
   if num == 1:
        time.sleep(4)
        print("You approach the cave... A large dragon jumps out in front of you! He opens his jaws and...Gobbles you down!")
   else:
        time.sleep(4)
        print("You approach the cave... A large dragon sees you. You get friendly with the dragon and he agrees to share their tressure with you!!")


display_intro()
cave_number = choose_cave()
check_cave(cave_number)

play_again = str(input("Do you want to play again(y or n): "))
if play_again == "y" :
    display_intro()
    cave_Number = choose_cave()
    check_cave(cave_number)

else:
    print("Thank you for playing.Good bye")

import time
def display_intro ():
      print("You are in the Kingdom of Dragons. In front of you, you see two caves.In one cave, the dragon is friendly and will share his treasure with you.The other dragon is hungry and will eat you on sight.")

def chosen_cave ():
      choice_inpput = ("Which cabe you want to enter cave1, cave2, cave3, cave4")
      if choice_input == "Cave1" :
          return 1
      if choice_input == "Cave2" :
          return 2
      if choice_input == "Cave3" :
          return 3
      if choice_input == "Cave4" :
          return 4
def ceck_cave(chosen_cave):
    import random
    num = random.randint(1,4)
    if (num == 1) or (num == 2):
        time.sleep(4)
        print("You approach the cave... A large dragon jumps out in front of you! He opens his jaws and... Gobbles you down! ")
    elif (num == 3) or (num == 4):
        print("You approach the cave... A large dragon sees you. You get friendly with the dragon and he agrees to share their tressure with you!")

display_intro()
cave_number = choose_cave()
check_cave(cave_number)

play_again = str(input("Do you want to play again(y or n):"))
if play_again == "y" :
    display_intro()
    cave_number = choose_cave()
    check_cave(cave_number)
else:
    print("Thank you for playing.Good bye")
        

 
      
  
