
public class WeatherApp {
	public static void main(String[] args) {
		System.out.println("heelo");
	}
	WeatherData weatherData;
	
	public void setWeather(WeatherData weatherData) {
		this.weatherData = weatherData;
	}
	
	public int compareTemperature(int temperature){
		int beforeTemperature = weatherData.getTemperature();
		if(beforeTemperature > temperature) {
			System.out.println("Temperature : "+ (beforeTemperature-temperature)+" degrees hotter.");
			return (beforeTemperature-temperature);
		}
		else if(beforeTemperature == temperature) {
			System.out.println("Temperature : same");
			return 0;
		}
		else {
			System.out.println("Temperature : "+ (temperature- beforeTemperature)+ " degrees cooler.");
			return (temperature- beforeTemperature);
		}
	}
	
	public int compareHumidity(int humidity) {
		int beforHumidity = weatherData.getHumidity();
		if(beforHumidity > humidity) {
			System.out.println("Humidity :  "+(beforHumidity-humidity)+" degrees more humid");
			return (beforHumidity-humidity);
		}
		else if(beforHumidity == humidity) {
			System.out.println("Humidity : same");
			return 0;
		}
		else {
			System.out.println("Humidity : "+(beforHumidity-humidity)+" degrees drier");
			return (humidity-beforHumidity);
		}
	}
	
}




