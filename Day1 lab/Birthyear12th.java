public class Birthyear12th{
    public static void main(String[] args) {
        int currentYear = 2073;
        int eligibilityAge = 21;
        int voteEligibleYear;
        int birthYear = currentYear - eligibilityAge;
        if (birthYear > 2060) {
            voteEligibleYear = currentYear - eligibilityAge;
            int yearsBetween = voteEligibleYear - 2023;
            System.out.println("Years between vote-eligible year and 2023: " + yearsBetween);
        } else {
            int median = (birthYear + 2023) / 2;
            System.out.println("Median of birth year and 2023: " + median);
        }
    }
}
