import java.util.Arrays;

public class Seminar02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // конструктор
        sb.append(25);

//        String name = new String();
//        name.charAt(0);
//        // складывать строки в цикле - это плохо
        int[] nums = {1, 2, 3, 4};
        //System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        // sayHello("Gb");
    }
    // <доступ> <static, если есть> <возвращаемый тип> <имя>
//    public static void sayHello(String name){
//        System.out.println("Hello, " + name + "!");
//    }
        public static void sayHello(int count){
            if (count == 500){
                return;
            }
        // System.out.println("Hello " + count + " time");
        }
    // sayHello(count + 1);
//    System.out.println("Hello " + sayHello(count + 1) + " time");



}
