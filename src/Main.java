public class Main {
    public static void main(String[] args) {

        //Первая задача

        int[] first_variable = new int[] {1,2,3};

        double[] second_variable;
        second_variable = new double[3];
        second_variable[0] = 1.57;
        second_variable[1] = 7.654;
        second_variable[2] = 9.986;

        String[] strings = new String[] {"1","2","3"};

        //Вторая задача

        for(int i = 0;i < first_variable.length;i++){
            System.out.print(first_variable[i]);
            if (i != first_variable.length-1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        for(int i = 0;i < second_variable.length;i++){
            System.out.print(second_variable[i]);
            if (i != second_variable.length-1){
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

        for(int i = first_variable.length;i > 0;i--){
            System.out.print(first_variable[i-1]);
            if (i != 1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        for(int i = second_variable.length;i > 0;i--){
            System.out.print(second_variable[i-1]);
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

        for (int i = 0; i < first_variable.length; i++) {
            if (first_variable[i] % 2 == 1){
                first_variable[i]++;
            }
            System.out.print(first_variable[i]+" ");
        }
    }
}