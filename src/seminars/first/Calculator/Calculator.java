package src.seminars.first.Calculator;

public class Calculator {
//    public static int calculation(int firstOperand, int secondOperand, char operator) {
//        int result;
//
//        switch (operator) {
//            case '+':
//                result = firstOperand + secondOperand;
//                break;
//            case '-':
//                result = firstOperand - secondOperand;
//                break;
//            case '*':
//                result = firstOperand * secondOperand;
//                break;
//            case '/':
//                if (secondOperand != 0) {
//                    result = firstOperand / secondOperand;
//                    break;
//                } else {
//                    throw new ArithmeticException("Division by zero is not possible");
//                }
//            default:
//                throw new IllegalStateException("Unexpected value operator: " + operator);
//        }
//        return result;
//    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
//    public static double squareRootExtraction(double num) {
////        double result = 0;
////          0
////          Отрицательные числа
////          Дробные значения корней
//        //  Целые
//            if(num < 0) {
//                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
//            }
//            result = Math.sqrt(num);
//            return result;
//    }
//
    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, double discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double purchaseSum = 0;
        if (discountAmount <= 0) {
            throw new ArithmeticException("the arguments are wrong");
        }
        return purchaseSum = purchaseAmount - (purchaseAmount * (discountAmount / 100));
    }


}