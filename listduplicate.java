import java.util.*;
class testcase{
    public static void main(String[]args){
        List<Integer> num1 =new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(1);
        num1.add(2);
        HashSet<Integer> num2 =new HashSet<>(num1);
        num1.clear();
        num2.addAll(num2);
        System.out.println(num2);

    }
}