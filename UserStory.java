import java.util.Scanner;

public class UserStory {

  private Weather[] forecasts;

  /*
  creates the userstory with the given files used as all the information fo the weather
  */
  public UserStory(String locationFile, String conditionFile, String temperatureFile) {
    forecasts = createWeather(locationFile, conditionFile, temperatureFile);
  }

  /*
  creates weather objects based on given files and returns an array of them
  */
  public Weather[] createWeather(String locationFile, String conditionFile, String temperatureFile) {
    String[] locations = FileReader.toStringArray(locationFile);
    String[] conditions = FileReader.toStringArray(conditionFile);
    double[] temperatures = FileReader.toDoubleArray(temperatureFile);

    Weather[] weatherArray = new Weather[locations.length];

    //i got tired of waiting and wanted to see progress
    
    int numperpercent = locations.length / 100;
    for (int i = 0; i < locations.length; i++) {
      weatherArray[i] = new Weather(locations[i], conditions[i], temperatures[i]);
      if (i % numperpercent == 0) {
        //printing progress
        //System.out.println("" + (i / numperpercent) + "%");
      }
    }
    
    return weatherArray;
  }
  /*
  Returns average temperature
  */
  public double getAverageTemperature() {
    double sum = 0;
    for (Weather forecast : forecasts) {
      sum += forecast.getTemperature();
    }
    return sum / forecasts.length;
  }
  /*
  toString override that returns information on the weather
  */
  public String toString() {
    //a regular for loop does not work, since the program times out
    //i assumed the string got to long to add to 100 thousand times so i split it up into 101 string and put them together at the end, and it worked 
    String allWeathers = "Weather forecasts by location:\n";
    //how close do we get
    int numperpercent = forecasts.length / 100;
    String[] segments = new String[101];

    for (int i = 0; i < forecasts.length; i++) {
      segments[i / numperpercent] += forecasts[i] + "\n";
      if (i % numperpercent == 0) {
        //printing progress
        //System.out.println("" + (i / numperpercent) + "% toString");
      }
    }
    for (String part : segments) {
      allWeathers += part;
    }
    return allWeathers;
  }
  
}