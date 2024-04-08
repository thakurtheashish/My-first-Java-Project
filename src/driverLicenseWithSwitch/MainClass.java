package driverLicenseWithSwitch;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scan_age = new Scanner(System.in);
		System.out.print("Enter your age = ");
		int ageOfApplicant = scan_age.nextInt();

		if (ageOfApplicant < 16) {
			System.out.println("You are not old enough to apply for a license");
		} else {
			Scanner scanCurrentLicense = new Scanner(System.in);
			System.out.print("Enter your current License status = ");
			String currentLicense = scanCurrentLicense.nextLine();

			switch (currentLicense) {
			case "G":
				System.out.println("Applicant already has a full G license");
				break;
			case "G2":
				System.out.println("Applicant is eligible for full G License");
				break;
			case "G1":
				System.out.println("Applicant is eligible for G2 License");
				break;
			default:
				System.out.println("Applicant is eligible for G1 License");
			}

		}

	}

}
