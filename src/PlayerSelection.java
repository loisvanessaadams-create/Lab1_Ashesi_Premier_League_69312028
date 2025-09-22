import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {
        Scanner player =new Scanner(System.in);
         //Declaring variables
        String name;
        int age;
        double height,weight;
        int jersey;

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
        jersey = player.nextInt();

        double pound = 0.45359237;
        double meter = 100;
        double weightInKilo = weight * pound;
        double heightInCenti = height * meter;
        int roundedWeightInKilos = (int)weightInKilo;
        System.out.println("Player Name -" + name);
        System.out.println("Age-" + age );
        if (age < 20){
          System.out.println("Rising Star");
    }
        else if (age >=20 && age <= 30){
          System.out.println("Prime Player");
    }
        else{
          System.out.print("Veteran");
    }
        System.out.println("Height In Centimeter-" + heightInCenti);
        System.out.println("WeightInKilos-" + roundedWeightInKilos);
        System.out.println("Jersey Number-" + jersey);

        switch(jersey) {
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
        if(jersey == 7 || jersey == 9|| jersey==10|| jersey == 11){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }    
        if(age <= 18 || roundedWeightInKilos >= 90){
            System.out.println("Player has a problem(either too young or too heavy)");
        }
        if (weight < 90 && age>=18 && age <=35){
            System.out.println("Player is eligible to play"); 
            }if (age >= 20 && age <= 30){
                if (roundedWeightInKilos < 80){
                    System.out.println("Starting Lineup");
                }else{
                    System.out.println("Bench");
    }       
}    
        String finalStatus = (age >= 18 && age<=35 && roundedWeightInKilos < 90)
        ?"Play"
        :"Rest";
        System.out.println(finalStatus);
    }
}
