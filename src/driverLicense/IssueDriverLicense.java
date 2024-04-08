package driverLicense;

public class IssueDriverLicense {
	int ageOfApplicant;
	String currentLicense;
	
	void licenseToIssue() {
		if (currentLicense == "G") {
			System.out.println("Applicant already has a full G license");
		}
		else if (currentLicense == "G2"){
			System.out.println("Applicant is eligible for full G License");
		}
		else if (currentLicense == "G1") {
			System.out.println("Applicant is eligible for G2 License");
		}
		else if (currentLicense == "None"){
			System.out.println("Applicant is eligible for G1 License");
		}
	}
}


