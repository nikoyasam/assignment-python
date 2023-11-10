def STF ():  
    res = input("Do you need to save current details???")
    if res == "yes":
         
        file1 = open("Driver_details", "a")
        for x in driverlist:
            
            file1.write(str(x))
            file1.write("\n")
        file1.close()
        print("The driver details are successfully saved")
        
       
def ADD ():
    num = int(input("How many records do you need to add???"))
   
    for i in range(num):
        name = str(input("Enter Driver's name"))
        for i in driverlist:
            if i.split(",")[0] == name:
                name =str(input("Driver name already exist....Enter another name")) #Handles duplicate records
                x = 0 #Position of each letter
                found = False
                size = len(name)
                while found == False and x < size:
                    if name[x]<'a' or name[x]>'z': #assuming to use simple letters
                        found = True
                    x = x + 1
                if found == True: #validates drivers name
                    name = input("Invalid name entered......Enter drivers name again!!!!")
        age =  int(input("Enter Driver's age"))
        team = str(input("Enter Driver's team"))
        car =  str(input("Enter Driver's car"))
        current_points = int(input("Enter Driver's current points"))
        newline = name+","+str(age)+","+team+","+car+","+str(current_points) #concatanating(joining all strings together)
        driverlist.append(newline) #line created put into a list
        print("The driver details are successfully added")
        print("" )
    print(" ****SELECT STF FUNCTION TO SAVE PERMANANTLY****")
    print("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _")
    print(" ")
    
   

def DDD(): #DONE
    searchname = input("Enter the name you want to delete")
    for x in driverlist:
        if searchname in x.split(",")[0]:
            driverlist.remove(x)
            print("The record is successfully deleted")
    print("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _")
    print(" ")
            
    

def UDD():
    found = False
    res = input("Do you need to update the driver details?")
    while res == "yes":
        searchname = input("Enter Driver's Name")
        for x in driverlist:
            if searchname == x.split(",")[0]:
                found=True
        if found==True:       
                driverlist.remove(x)
                print("You can now update the record")
                name = str(input("Enter Driver's name"))
                age =  int(input("Enter Driver's age"))
                team = str(input("Enter Driver's team"))
                car =  str(input("Enter Driver's car"))
                current_points = int(input("Enter Driver's current points"))
                newline = name+","+str(age)+","+team+","+car+","+str(current_points) #concatanating(joining all strings together)
                driverlist.append(newline)
                print("The record is successfully updated")
                
        else:
                print("Driver's name you entered does not exist")

        res = input("Do you need to update another record?")

    print("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _")
    print(" ")


    
       
def VCT ():
    
    swap = False
    max1 = len(driverlist)
    temp = ""
    while swap == False:
        swap = True
        
        for c in range(max1 - 1):
            firstvalue = driverlist[c].split(",")[4]
            secondvalue = driverlist[c + 1].split(",")[4]
            if int(firstvalue) < int(secondvalue):
                temp = driverlist[c]
                driverlist[c] = driverlist[c + 1]
                driverlist[c + 1] = temp
                swap = False
        max1 = max1 - 1
      
    print("{:<20}  {:<7}  {:<10}  {:<8}  {:<15}".format("Name","Age","Team","Car","Current points"))#FOR THE HEADINGS
    for n in driverlist:
        val = n.split(',')
        print("{:<20}  {:<7}  {:<10}  {:<8}  {:<15}".format(val[0],val[1],val[2],val[3],val[4][:-1]))
   
    print("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _")
    print(" ")


def SRR ():
    from random import randint
    points = 0
    racelist2 = []
    
    location=["norway","Barcelona","Riga","Hojles","Nyrad"]
    no_of_drivers=len(driverlist)
    y = 0
    position = [""]*no_of_drivers #array
    
    date=randint(1,31) #generates a random date
    inc = 4
    for x in range (no_of_drivers-1):

        randompos = randint(0,no_of_drivers -  1)# generates a random position
        found = False
        while found == False:
            try:
                if position[randompos] == "":
                    position[randompos] = driverlist[x].split(",")[0]
                    found = True
                else:
                    randompos = randompos + 1
            except:
                continue
        
        loc=randint(0,len(location)-1)# generates a random location
        name = driverlist[x].split(",")[0] #name extracted from driver list
        try:
            points=int(racelist[y].split(",")[inc])
            inc = inc + 4
        except:
            print("Race list is currently empty")
        
        if randompos == 1:
            points = points+10
        elif randompos == 2:
            points = points+7
        elif randompos == 3:
            points = points+5
        else:
            points = points+0

        line =name + ","  + location[loc] +"," + str(randompos + 1) +"," + str(points)
        racelist2.append(line)
        y = y + 1
        
    line2 = "2022/12/" + str(date) + "," + str(",".join(racelist2)) #.join is used to remove square brackets and store values
    file2 = open("racedetails.txt",'a')
    file2.write(line2)
    file2.write("\n")
    file2.close()
    print("Race details are successfully saved")
    print("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _")
    print(" ")


def VRL ():
    print("Races in the championship.....!!!")
    swap = False
    max1 = len(racelist)
    temp = ""
    while swap == False:
        swap = True
        
        for c in range(max1 - 1):
            firstvalue = racelist[c].split(",")[0]
            secondvalue = racelist[c + 1].split(",")[0]
            if int(firstvalue) < int(secondvalue):
                temp = racelist[c]
                racelist[c] = racelist[c + 1]
                racelist[c + 1] = temp
                swap = False
        max1 = max1 - 1
      
    print("{:<20}  {:<7}  {:<10}  {:<8}  {:<15}".format("TName","Age","Team","Car","Current points"))#FOR THE HEADINGS
    for n in racelist:
        val = n.split(',')
        print("{:<20}  {:<7}  {:<10}  {:<8}  {:<15}".format(val[0],val[1],val[2],val[3],val[4][:-1]))
   
    print("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _")
    print(" ")



def RFF():
    
    file1 = open("Driver_details","r")
    line=file1.readline( )
    while len(line)>0:
        driverlist.append(line)
        line=file1.readline()
    file1.close()
    print("******Driver details  are successfully loaded*******")
    try:
       f=open("racedetails.txt","r")
       line=f.readline().rstrip("\n")
       while len(line)>0:
           racelist.append(line)
           line=f.readline().rstrip("\n")
       f.close()
       print("******Race details are successfully loaded*******")
    except:
        print("Race details are currently unavailable")
        
    
       

#the main program starts here

global driverlist
global racelist
driverlist = []
racelist=[]

print("WELCOME TO WORLD RALLY CROSS CHAMPIONSHIP MANAGEMENT SYSTEM")
print(" ")
print("Type RFF to load driver details")
print("Type ADD for adding driver details")
print("Type DDD for deleting")
print("Type UDD for updating driver details")
print("Type VCT for viewing the rally cross standings table")
print("Type SRR for stimulating a race")
print("Type VRL for viewing race table sorted according to a date")
print("Type STF to save the current data from saved text file")
print("Type ESC to exit the program")
print(" ")
res2 = input("Do you need to start a  function???")
while res2 == "yes":
       

        res3 = str(input("Enter your choice"))

        if res3 == "ADD":
            ADD()

        if res3 == "DDD":
            DDD()

        if res3 == "UDD":
            UDD()

        if res3 == "VCT":
            VCT()

        if res3 == "SRR":
            SRR()

        if res3 == "VRL":
            VRL()

        if res3 == "STF":
            STF()

        if res3 =="ESC":
            exit( )

        if res3 =="RFF":
            RFF()

        res2 = input("Do you need to start a new function???")
    

    
    
    



    
