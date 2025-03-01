package java_roadmap;
import com.java.datatypes.*;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertFahrenheitToCelsius ftc = new ConvertFahrenheitToCelsius(40);
		ftc.printFahrenheitToCelsius();
		ConvertInchesToMeters itm = new ConvertInchesToMeters(1000);
		itm.printInchesToMeters();
		SumOfDigitsInInteger sdi = new SumOfDigitsInInteger(354);
		sdi.printSumOfDigitsInInteger();
		ConvertMinutesToYearsAndDays mty = new ConvertMinutesToYearsAndDays(3456789);
		mty.printConvertMinutesToYearsAndDays();
		ComputeBMI bmi = new ComputeBMI(72, 452);
		bmi.printComputeBMI();
		CalculateSpeeds cs = new CalculateSpeeds();
		cs.printCalculateSpeeds(5, 56, 23, 2500);
		ComputeSquareCubeandFourthPower csqf = new ComputeSquareCubeandFourthPower();
		csqf.printComputeSquareCubeandFourthPower(15);
		ArithmeticOperationsOnTwoIntegers aoti = new ArithmeticOperationsOnTwoIntegers();
		aoti.printarithmeticOperationsOnTwoIntegers(25, 3);
		BreakIntegerintoDigits butd = new BreakIntegerintoDigits();
		butd.printBreakIntegerintoDigits(123456);
		CheckFiniteFloatingPointValue fpv = new CheckFiniteFloatingPointValue();
		fpv.printCheckFiniteFloatingPointValue(1);
		fpv.printCheckFiniteFloatingPointValue(1.0/0.0);
	}

}
