public class Main {
    public static void main(String[] args) {

        //Первая задача

        int[] x = new int[] {1,2,3};

        double[] y = new double[] {1.57, 7.654, 9.986};

        String[] z = new String[] {"1","2","3"};

        //Вторая задача

        for(int i = 0;i < x.length;i++){
            System.out.print(x[i]);
            if (i != x.length-1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        for(int i = 0;i < y.length;i++){
            System.out.print(y[i]);
            if (i != y.length-1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        for(int i = 0;i < z.length;i++){
            System.out.print(z[i]);
            if (i != z.length-1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        //Третья задача

        for(int i = x.length;i > 0;i--){
            System.out.print(x[i-1]);
            if (i != 1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        for(int i = y.length;i > 0;i--){
            System.out.print(y[i-1]);
            if (i != 1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        for(int i = z.length;i > 0;i--){
            System.out.print(z[i-1]);
            if (i != 1){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }

        //Задание 4

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 1){
                x[i]++;
            }
            System.out.print(x[i]+" ");
        }
    }
}