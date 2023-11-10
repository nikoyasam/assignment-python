number_of_rolls = 100 
number_of_doubles = 0 
die_number_of_sides = 6 
for i == 1 to number_of_rolls 
    first_die = int(ran() * die_number_of_sides) + 1 
    second_die = int(ran() * die_number_of_sides) + 1 
    if (first_die = second_die) then 
        number_of_doubles = number_of_doubles + 1 
    end if 
next i 
print ("Number of rolled doubles is ", number_of_doubles)
