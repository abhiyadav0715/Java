public class Agecalculator11th{
    public static void main(String atgs[]){
        int personAgeAt28 = 30;
        int youngerBrotherAgeAt28 = 25;
        int ageDifference = personAgeAt28 - youngerBrotherAgeAt28;
        int personAgeAt56 = 56 + ageDifference;
        if (ageDifference > 3) {
            int youngerBrotherAgeAt5 = youngerBrotherAgeAt28 - ageDifference + 5;
            System.out.println("The age Of the younger brother when the Older brother was 5:"+youngerBrotherAgeAt5);
        } else {
            System.out.println("The age Of the person when the Older brother is 56: " +personAgeAt56);
        }
    }
}

