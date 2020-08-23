package br.com.artesoftware.cursocomplexidade;

/**
 * @see https://docs.sonarqube.org/latest/user-guide/metric-definitions/
 */
public class ExemploSonar { // Exemplo antigo do Sonar com contagem do return interno

	public void process(Car myCar) { // +1
		if (myCar.isNotMine()) { // +1
			System.out.println("abc");
			return; // +1 (contado pelas versões antigas do Sonar)
		}
		myCar.paint("red");
		myCar.changeWheel();
		while (myCar.hasGazol() && myCar.getDriver() != null) { // +2
			myCar.drive();
		}
		return;
	}
}
