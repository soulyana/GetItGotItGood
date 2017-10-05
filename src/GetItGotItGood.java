public class GetItGotItGood {
    public static void main(String args[]) {
        int counter = 1;
        String result = "";
        for (int i = 1; i <= 100; i++) {
            if(counter % 3 == 0) {
                result += "Get it ";
            }
            if(counter % 5 == 0) {
                result += "Got it ";
            }
            if(counter % 10 == 0) {
                result += "Good ";
            }
            if(counter % 3 != 0 && counter % 5 != 0 && counter % 10 != 0) {
                result += counter;
            }
            counter++;
            System.out.println(result);
            result = "";
        }

    }
}