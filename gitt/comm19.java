public class comm19 {

    static boolean check(int grade) {
        if(grade >=70) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int x = 89;
        if(check(x) == true) {
            System.out.println("Congrats!");
        }
    }
}
