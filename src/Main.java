public class Main {
    public static void main(String[] args) {

        //Первая задача

        int[] INT = new int[] {1,2,3};

        double[] DOUBLE = {1.57, 7.654, 9.986};

        String[] strings = new String[] {"1","2","3"};

        //Вторая задача

        for(int i = 0;i < INT.length;i++){
            System.out.print(INT[i]);
            if (i != INT.length-1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        for(int i = 0;i < DOUBLE.length;i++){
            System.out.print(DOUBLE[i]);
            if (i != DOUBLE.length-1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        for(int i = 0;i < strings.length;i++){
            System.out.print(strings[i]);
            if (i != strings.length-1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        //Третья задача

        for(int i = INT.length;i > 0;i--){
            System.out.print(INT[i-1]);
            if (i != 1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        for(int i = DOUBLE.length;i > 0;i--){
            System.out.print(DOUBLE[i-1]);
            if (i != 1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        for(int i = strings.length;i > 0;i--){
            System.out.print(strings[i-1]);
            if (i != 1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        //Задание 4

        for (int i = 0; i < INT.length; i++) {
            if (INT[i] % 2 == 1){
                INT[i]++;
            }
            System.out.print(INT[i]+" ");
        }
    }
}