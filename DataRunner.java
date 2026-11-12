import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    UserStory person = new UserStory("Location.txt", "Condition.txt", "Temperature.txt");

    System.out.println(person);

    System.out.println(person.getAverageTemperature());




    


    
    
    
  }
}