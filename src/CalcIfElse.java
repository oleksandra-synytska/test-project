public class CalcIfElse {
    public static void main(String[] args){
        calc(5, 2,'+');
        calc(5,2,'-');
        calc(5,2,'/');
        calc( 5,2,'*');
        calc(5,2,'?');
    }

    static double calc(double paramA, double paramB, char operation){
        double result = 0;
        if(operation == '+'){
        result = paramA + paramB;
        } else if(operation == '-'){
            result = paramA - paramB;
        }else if(operation == '/'){
            result = paramA / paramB;
        }else if(operation == '*'){
            result = paramA * paramB;
        } else{
            System.out.println("INCORRECT OPERATION!");
        }
        System.out.println("Calc result: " + result);
        return result;
        }

    }





