public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!\n");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print(i+"*"+j+"="+i*j+"\n");
                }
                else {
                    System.out.print(i+"*"+j+"="+i*j+"\t");
                }
            }
        }
    }
}