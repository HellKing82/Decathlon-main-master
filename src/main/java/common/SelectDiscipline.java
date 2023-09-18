package common;

import java.util.Scanner;

import decathlon.Deca100M;
import decathlon.Deca1500M;
import decathlon.Deca110MHurdles;
import decathlon.Deca400M;
import decathlon.DecaDiscusThrow;
import decathlon.DecaHighJump;
import decathlon.DecaJavelinThrow;
import decathlon.DecaLongJump;
import decathlon.DecaShotPut;
import decathlon.DecaPoleVault;

import heptathlon.Hep100MHurdles;
import heptathlon.Hep200M;
import heptathlon.Hep800M;
import heptathlon.HeptHightJump;
import heptathlon.HeptJavelinThrow;
import heptathlon.HeptLongJump;
import heptathlon.HeptShotPut;

public class SelectDiscipline {

	int disciplineSelected;
	InputResult inputResult = new InputResult();
	Scanner sc = new Scanner(System.in);
	Deca100M deca100M = new Deca100M();
	Deca400M deca400M = new Deca400M();
	Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
	Deca1500M deca1500M = new Deca1500M();
	DecaLongJump decaLongJump = new DecaLongJump();
	DecaHighJump highJump = new DecaHighJump();
	DecaDiscusThrow discusThrow = new DecaDiscusThrow();
	DecaShotPut decaShotPut = new DecaShotPut();
	DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
	DecaPoleVault poleVault = new DecaPoleVault();

	Hep200M hep200M = new Hep200M();
	Hep800M hep800M = new Hep800M();
	Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
	HeptHightJump hepHighJump = new HeptHightJump();
	HeptLongJump hepLongJump = new HeptLongJump();
	HeptShotPut hepShotPut = new HeptShotPut();
	HeptJavelinThrow hepJavelinThrow = new HeptJavelinThrow();

	//Receive input	of selection of discipline.

	public void inputSelection() {
		System.out.println("Select discipline.");
		printDisciplines();

		try {

			disciplineSelected = Integer.parseInt(sc.nextLine());
			makeSelection();

		} catch (Exception e) {
			System.out.println("Invalid input, try again.");
			System.out.println("");
			inputSelection();
		}

	}

	// Check input of discipline.
	public void makeSelection() {
		switch (disciplineSelected) {
			case 1:
				System.out.println("You have selected Deca 100M, input your result in seconds");
				deca100M.calculateResult(inputResult.enterResult());
				break;
			case 2:
				System.out.println("You have selected Deca 400M, input your result in seconds");
				deca400M.calculateResult(inputResult.enterResult());
				break;
			case 3:
				System.out.println("You have selected Deca 110M Hurdles, input your result in seconds");
				deca110MHurdles.calculateResult(inputResult.enterResult());
				break;
			case 4:
				System.out.println("You have selected Deca 1500M, input your result in seconds");
				deca1500M.calculateResult(inputResult.enterResult());
				break;
			case 5:
				System.out.println("You have selected Deca Long Jump, input your result in meters");
				decaLongJump.calculateResult(inputResult.enterResult());
				break;
			case 6:
				System.out.println("You have selected Deca High Jump, input your result in meters");
				highJump.calculateResult(inputResult.enterResult());
				break;
			case 7:
				System.out.println("You have selected Deca Pole Vault, input your result in meters");
				poleVault.calculateResult(inputResult.enterResult());
				break;
			case 8:
				System.out.println("You have selected Deca Discus Throw, input your result in meters");
				discusThrow.calculateResult(inputResult.enterResult());
				break;
			case 9:
				System.out.println("You have selected Deca Javelin Throw, input your result in meters");
				decaJavelinThrow.calculateResult(inputResult.enterResult());
				break;
			case 10:
				System.out.println("You have selected Deca Shot Put, input your result in meters");
				decaShotPut.calculateResult(inputResult.enterResult());
				break;
			case 11:
				System.out.println("You have selected Hep 200M, input your result in seconds");
				hep200M.calculateResult(inputResult.enterResult());
				break;
			case 12:
				System.out.println("You have selected Hep 800M, input your result in seconds");
				hep800M.calculateResult(inputResult.enterResult());
				break;
			case 13:
				System.out.println("You have selected Hep 100M Hurdles, input your result in seconds");
				hep100MHurdles.calculateResult(inputResult.enterResult());
				break;
			case 14:
				System.out.println("You have selected Hep High Jump, input your result in meters");
				hepHighJump.calculateResult(inputResult.enterResult());
				break;
			case 15:
				System.out.println("You have selected Hep Long Jump, input your result in meters");
				hepLongJump.calculateResult(inputResult.enterResult());
				break;
			case 16:
				System.out.println("You have selected Hep Shot Put, input your result in meters");
				hepShotPut.calculateResult(inputResult.enterResult());
				break;
			case 17:
				System.out.println("You have selected Hep Javelin Throw, input your result in meters");
				hepJavelinThrow.calculateResult(inputResult.enterResult());
				break;
			default:
				System.out.println("Invalid input, try again.");
				System.out.println("");
				inputSelection();
				break;
		}
	}

	// Needs more stuff.
	public void printDisciplines() {
		System.out.println("1. Decathlon 100 meters.");
		System.out.println("2. Decathlon 400 meters.");
		System.out.println("3. Decathlon 110 meters hurdles.");
		System.out.println("4. Decathlon 1500 meters.");
		System.out.println("5. Decathlon Long Jump.");
		System.out.println("6. Decathlon High Jump.");
		System.out.println("7. Decathlon Pole Vault.");
		System.out.println("8. Decathlon Discus Throw.");
		System.out.println("9. Decathlon Javelin Throw.");
		System.out.println("10. Decathlon Shot Put.");
		System.out.println();
		System.out.println("11. Heptathlon 200 meters.");
		System.out.println("12. Heptathlon 800 meters.");
		System.out.println("13. Heptathlon 100 meters hurdles.");
		System.out.println("14. Heptathlon High Jump.");
		System.out.println("15. Heptathlon Long Jump.");
		System.out.println("16. Heptathlon Shot Put.");
		System.out.println("17. Heptathlon Javelin Throw.");
	}

}