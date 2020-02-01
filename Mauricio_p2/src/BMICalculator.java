import java.util.Scanner;
import java.util.function.DoubleFunction;

public class BMICalculator {

	// Initializing all variables and scanner
	private float weight;
	private float height;
	private int measurementType;
	private double bmi;
	private String bmiCategory;
	Scanner scan = new Scanner(System.in);

	// Determine unit type from user and weight and height in said unit type for BMI calculation
	public void readUserData() {
		readUnitType();
		readMeasurementData();
	}

	private void readUnitType() {
		System.out.printf("Enter 0 for Imperial units or 1 for Metric units: ");
		measurementType = scan.nextInt();
	}
	
	private void readMeasurementData() {
		if(measurementType == 0) {
			readImperialData();;
		}

		else if(measurementType == 1) {
			readMetricData();
		}

		else {
			System.out.printf("\nIncorrect Value!");
			System.exit(0);
		}
	}
	
	private void readMetricData() {
		System.out.printf("Enter your Weight in Kilograms: ");
		weight = scan.nextFloat();

		if(weight < 0) {
			System.out.printf("\nNegative numbers are invalid!");
			System.exit(0);
		}

		System.out.printf("Enter your Height in Meters: ");
		height = scan.nextFloat();

		if(height < 0) {
			System.out.printf("\nNegative numbers are invalid!");
			System.exit(0);
		}
	}
	
	private void readImperialData() {
		System.out.printf("Enter your Weight in Pounds: ");
		weight = scan.nextInt();

		if(weight < 0) {
			System.out.printf("\nNegative numbers are invalid!");
			System.exit(0);
		}

		System.out.printf("Enter your Height in Inches: ");
		height = scan.nextInt();

		if(height < 0) {
			System.out.printf("\nNegative numbers are invalid!");
			System.exit(0);
		}
	}

	// Calculate the BMI and the Category
	public void calculateBmi() {
		if(measurementType == 0) {
			bmi = (703 * weight) / (height * height);
		}

		else if(measurementType == 1) {
			bmi = (weight) / (height * height);
		}

		calculateBmiCategory();
	}
	
	private void calculateBmiCategory() {
		if(bmi < 18.5) {
			bmiCategory = "Underweight";
		}

		else if(bmi > 18.5 && bmi < 24.9) {
			bmiCategory = "Normal Weight";
		}

		else if(bmi > 25 && bmi < 29.9) {
			bmiCategory = "Overweight";
		}

		else if(bmi >= 30) {
			bmiCategory = "Obese";
		}
	}

	// Print the results back to the user
	public void displayBmi() {
		System.out.printf("\nYour BMI is %.1f and your Category is %s\n", bmi, bmiCategory);
	}
	
	public float getWeight() {
		return weight;
	}
	
	private void setWeight(float weight) {
		this.weight = weight;
	}
	
	public float getHeight() {
		return height;
	}
	
	private void setHeight(float height) {
		this.height = height;
	}
	
	public double getBmi() {
		return bmi;
	}
	
	public String getBmiCategory() {
		return bmiCategory;
	}
}
