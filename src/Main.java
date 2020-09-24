public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 77.5;
        double height = 1.68;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
