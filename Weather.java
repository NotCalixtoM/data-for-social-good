public class Weather {
  private String location;
  private String condition;
  //in farenheit
  private double temperature;
  /*
  Creates a weather object with the given information
  */
  public Weather(String location, String condition, double temperature) {
    this.location = location;
    this.condition = condition;
    this.temperature = temperature;
  }
  /*
  Gets the location for the weather
  */
  public String getLocation() {
    return location;
  }
  /*
  Gets the weather condition
  */
  public String getCondition() {
    return condition;
  }
  /*
  Gets the temperature of the weather
  */
  public double getTemperature() {
    return temperature;
  }
  /*
  toString override to return weather data
  */
  public String toString() {
    return location + ": " + condition + " with a temperature of " + temperature + "F";
  }
}