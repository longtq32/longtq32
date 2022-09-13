public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word =  "bottles";

        while (bottlesNum >0){
            if(bottlesNum == 1) {
                word = "bottle";
            }

            System.out.println(bottlesNum + " green " + ", hanging on the");
            System.out.println("And if on green bottle should acidentally fall");
            bottlesNum = bottlesNum - 1;

            if(bottlesNum > 0) {
                System.out.println("there'll be " + bottlesNum + " green " + word + " hanging on the wall");
            } else {
                System.out.println(" there 'll be no green bottles, hanging on the");
            }
        }
        System.out.println(word);
    }
}