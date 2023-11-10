public class pattern2 {
    public static void main(String[] args){
        int numSpaces = 4;
        int numAsterisk = 1;
        for(int i=0; i<5; i++){
            for(int j = 0; j<numSpaces; j++){
                System.out.println(" ");
            }
            for (int j = 0; j < numAsterisk; j++) {
                System.out.print("*"); // Print asterisk and space
            }
            System.out.println();
            numSpaces--;
            numAsterisk += 2;




        }
    }
}
