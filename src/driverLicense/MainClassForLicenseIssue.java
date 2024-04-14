package driverLicense;

public class MainClassForLicenseIssue {
	
public static void main(String[] args) {
	
	IssueDriverLicense License = new IssueDriverLicense ();
	
	License.ageOfApplicant = 19;
	License.currentLicense = "None";
	
	System.out.println("Age of Applicant is = " + License.ageOfApplicant);
	System.out.println("Current Level of License = " + License.currentLicense);
	
		if (License.ageOfApplicant >= 16) {
			License.licenseToIssue();
		} else {
			System.out.println("Applicant is not old enough to have a License");
		}
	
	
	
}
}
