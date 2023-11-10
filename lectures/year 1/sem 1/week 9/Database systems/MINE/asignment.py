
def STF ():
    global newline
    file1 = open("Driver_details.txt", "w")
    for k in players:
        file1.write(k)
    file1.close()
        

#++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
def ADD ():
    
    name = str(input("Enter Driver's name"))
    age =  int(input("Enter Driver's age"))
    team = str(input("Enter Driver's team"))
    car =  str(input("Enter Driver's car"))
    current_points = int(input("Enter Driver's current points"))
    newline = name+","+str(age)+","+team+","+car+","+str(current_points)
    newline=newline+"\n"
    players.append(newline)
    
    x=False
    while x == False:
        res=input("Do you want to enter more records(YES)(if not press NO): ")
        if res=="YES":
            ADD()
        else:
            x=True
#++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++        

def DDD():
    print(players)
    searchname = input("Enter the name you want to delete")
    for n in range(len(players)):
        if searchname == players[n]:
            players.remove(n)
            print("driver found and deleted")

    print("driver not found")
        
#+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++        
    '''file1 = 
    line = file1.readline()
    x = len(searchname)

    while len(line)>0:
        name = line[:x]
        if name.upper() != searchname.upper():
            file2 = open("NewDriver_details.txt","a")
            file2.write(line)
            file2.close()
        line = file1.readline()    
    file1.close()'''
#+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
def UDD():#WRONG 
    res = input("Do you need to update the driver details?")
    if res == "yes":
        searchname = input("Enter Driver's Name")
        found = False
        file1 = open("Driver_details.txt","r")
        line = file1.readlines()
        while len(line) > 0:#this is wrong
            x = 0
            name = " "
            while line[x] != ",":
                print(x)
                name = name + line[x]
                x = x + 1
            if name == searchname:
                confirm = input("The record found.....Are you sure you want to change this record")
                if confirm == "yes":
                    change = input("Enter the data item you want to change")
            line = file1.readline()
        file1.close()
            
#++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
       
def VCT ():
    
    myarray = []
    file1 = open("NewDriver_details.txt","r")
    line = file1.readline().rstrip("\n")
    c = 0
    while  c < 5:
     
        myarray[c] = line
        c = c + 1
        line = file1.readline().rstrip("\n")
    file1.close()

    swap = False
    max1 = 4
    temp = ""
    while swap == False:
        swap = True
        
        for c in range(max1):
            f = myarray[c][-2:]
            s = myarray[c + 1][-2:]
            if int(f) < int(s):
                temp = myarray[c]
                myarray[c] = myarray[c + 1]
                myarray[c + 1] = temp
                swap = False
        max1 = max1 - 1

    table = [myarray]
    for row in table:
        print('{:<5} {:<5} {:>5} {:<5}'.format(*row))
        print("\n")
   

#++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
def SRR ():
    from random import randint
    file2 = open("racedetails.txt","a")
    for c in range(5):
        position = randint(1,5)
        date =input("Enter the date")
        location = input("Enter the location")
        if position == 1:
            points = 10
        elif position == 2:
            points = 7
        elif position == 3:
            points = 5
        else:
            points = 0
        line = date +" " + location +" " + str(position) +" " + str(points)
        file2.write(line)
        file2.write("\n")
    file2.write("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _")
    file2.close()

#+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
def VRL ():
    print("Races in the championship.....!!!")
    file2 = open("racedetails.txt","r")
    myarray = [""]*5
    x = 0
    line = file2.readline().rstrip("/n")
    while len(line)>0:
        myarray[x] = line
        x = x + 1
        line = file2.readline().rstrip("/n")
    file2.close()

    swap = False
    max1 = 4
    temp = ""
    while swap == False:
        swap = True
        for c in range(max1):
             f = myarray[c][:2]
             s = myarray[c + 1][:2]
             if int(f) > int(s):
                 temp = myarray[c]
                 myarray[c] = myarray[c + 1]
                 myarray[c + 1] = temp
                 swap = False
        max1 = max1 - 1
    print("Race Date",'  ',"Race Location",'  ',"Driver's Position",'  ',"Driver's Points")
    for i in range(5):
        print(myarray[i].rstrip(","))


#++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
def RFF():
    file1 = open("NewDriver_details.txt","r")
    player = file1.readlines()
    file1.close()
#+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
def RACES():
    file2 = open("racedetails.txt","r")
    line = file2.readline()
    while len(line)>0:
        line = file2.readline()
    file2.close()
     
#+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
#main shit



print("Type DDD for deleting")
print("Type UDD for updating driver details")
print("Type VCT for viewing the rally cross standings table")
print("Type SRR for stimulating a race")
print("Type VRL for viewing race table sorted according to a date")
print("Type STF to save the current data from saved text file")
print("Type ESC to exit the program")
print("Type RFF to load previous data")

RACES()
print("==================================================================")

players=[]    
attempt=input("which function do you want to do: ")
while attempt!="ESC":
    if attempt=="ADD":
        ADD()
        attempt=input("which function do you want to do: ")
    elif attempt=="DDD":
        DDD()
        attempt=input("which function do you want to do: ")
    elif attempt=="UDD":
        UDD()
        attempt=input("which function do you want to do: ")
    elif attempt=="VCT":
        VCT()
        attempt=input("which function do you want to do: ")
    elif attempt=="SRR":
        SRR()
        attempt=input("which function do you want to do: ")
    elif attempt=="VRL":
        VRL()
        attempt=input("which function do you want to do: ")
    elif attempt=="STF":
        STF()
        print("done saving")
        attempt=input("which function do you want to do: ")
    elif attempt=="RFF":
        RFF()
        print("done loading")
        attempt=input("which function do you want to do: ")
    else:
        print("NOT A PROPER FUNCTION ENTERED. PLEASE TRY AGAIN!!!")
        attempt=input("which function do you want to do: ")

print("program over")
    
    
            
        
        

        
            
    
            
  
    
    
    
    
    
    
    





    
    
    



    
