import java.util.Scanner;
public  class FootbalPlayer{
    public static void main(String[] args) {
         Scanner player =new Scanner(System.in);
        //Declaring variables
        String name;
        int age;
        double height,weight;
        int jerseyNumber;

        //Inputing player name
        System.out.println("Enter your name: ");
        name = player.nextLine();
        //Inputing player age
        System.out.println("Enter your age: ");
        age = player.nextInt();
        //Inputing player height
        System.out.println("Enter your height: ");
        height = player.nextDouble();
        //Inputing player weight
        System.out.println("Enter your weight: ");
        weight = player.nextDouble();
        //Inputing player number
        System.out.println("Enter you jersey number: ");
        jerseyNumber = player.nextInt();

        //TASK 2
        
        double pound = 0.45359237;
        double meter = 100;
        double weightInKilo = weight * pound;
        double heightInCenti = height * meter;
        int roundedWeightInKilos = (int)weightInKilo;
        System.out.println("Player Name -" + name);
        System.out.println("Age-" + age );
        System.out.println("Height In Centimeter-" + heightInCenti);
        System.out.println("WeightInKilos-" + roundedWeightInKilos);
        System.out.println("Jersey Number-" + jerseyNumber);
 
       //TASK 3
        System.out.println("Age-" + age++ );
        System.out.println("Age-" + age );
        System.out.println("Jersey number-" + jerseyNumber--);
        System.out.println("Jersey number" +jerseyNumber);

       //TASK 4 
      //if (age >= 18 && age <= 35) {
      //System.out.println("Player is eligible to play");
      //}
        if(!(age >= 18 && age <= 35)){
          System.out.println("Not Eligible to play");
      }
        if(age <= 18 || roundedWeightInKilos >= 90){
          System.out.println("Player has a problem(either too young or too heavy)");
      }
        if (weight < 90 && age>=18 && age <=35){
          System.out.println("Player is eligible to play"); 
      }
    

    //TASK 5
        if (age < 20){
          System.out.println("Rising Star");
    }
        else if (age >=20 && age <= 30){
          System.out.println("Prime Player");
    }
        else{
          System.out.print("Veteran");
    }

    //TASK 6
        switch(jerseyNumber) {
          case 1:
              System.out.println("Position:Goalkeeper");
              break;
          case 2: 
              System.out.println("Position:defender");
              break;
          case 6: 
              System.out.println("Position:midfielder");
              break;
          case 7:
              System.out.println("Position:winger");
              break;
          case 9:  
              System.out.println("Position:Striker");
              break;
          case 10:  
              System.out.println("Position:PlayMaker");
              break;
          case 11:
              System.out.println("Position:Winger");
              break;
          case 5:
              System.out.println("Position:Defender");
              break;
          case 8:
              System.out.println("Position:Midfielder");
              break;
          default:
              System.out.println("The player number not found");
              break;    
        }
    
    //TASK 7a
        switch(jerseyNumber) {
            case 2:
                System.out.println("Defender");
            case 6:
                System.out.println("Midfielder");
            case 7:
                System.out.println("Winger");
            default: 
                System.out.println("Player Position not known");
        
       }
    
    //TASK 7b
        switch(jerseyNumber) {
            case 2:
            case 5:
                System.out.println("Defender");
                break;
            case 6:
            case 8:
                System.out.println("Midfielder");
                break;
            case 7:
            case 11:
                System.out.println("Winger");
                break;
            default: 
                System.out.println("Player Position not known");
                break;

        }
    
        
    //TASK 8
    if (age >= 20 && age <= 30){
        if (roundedWeightInKilos < 80){
            System.out.println("Starting Lineup");
        }else{
            System.out.println("Bench");
        
        }
    }

    //TASK 9
    String finalStatus = (age >= 18 && age<=35 && roundedWeightInKilos < 90)
    ?"Play"
    :"Rest";
    System.out.println("finalStatus");

    //TASK 10
    
    }
 {
    
}

        
    }


