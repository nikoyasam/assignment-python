public class Person {
    private double weightInPounds;
    private double heightInInches;


    public Person(double weightInPounds,double heightInInches){
        this.weightInPounds = weightInPounds;
        this.heightInInches = heightInInches;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public void calculateBMI(){
        double BMI = (weightInPounds * 703)/(heightInInches * heightInInches);
        System.out.println("BMI is " + BMI);

        if(BMI >0 && BMI <=18.5){
            System.out.println("It is underweight");
        }
        else if(BMI>18.5 && BMI<=24.9){
            System.out.println("It is normal");
        }
        else if(BMI>=25 && BMI<=29.9){
            System.out.println("It is overweight");
        }
        else if(BMI>=30){
            System.out.println("It is obese");
        }
        else{
            System.out.println("Enter a value greater than zero");
        }
    }
}
