public class Temperature{
  public double fahrenheit;
  Temperature (){
    fahrenheit = 0;
  }

  Temperature(double f){
    fahrenheit = f;
  }

  void setFahrenheit(double f){
    fahrenheit = f;
  }

  double getFahrenheit(double f){
    return fahrenheit;
  }

  double celsius(){
    return (fahrenheit-32)*1.8;
  }

  double kelvin(){
    return celsius()+273.15;
  }

  public static void main(String[] args) {

  }

}
