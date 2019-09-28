package temp;
public class Temperature{
  public double fahrenheit;
  public Temperature (){
    fahrenheit = 0;
  }

  public Temperature(double f){
    fahrenheit = f;
  }

  public void setFahrenheit(double f){
    fahrenheit = f;
  }

  public double getFahrenheit(){
    return fahrenheit;
  }

  public double celsius(){
    return (fahrenheit-32)*5.0/9.0;
  }

  public double kelvin(){
    return celsius()+273.15;
  }

  public static void main(String[] args) {

  }

}
