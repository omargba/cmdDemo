public class Lista {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Flatan argumentos" );
            System.exit(1);

        }
        int suma=0;
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for (String arg : args) {
            int x = 0;
            try {
                x = Integer.parseInt(arg);
            } catch (NumberFormatException ex) {
                System.out.println("Error el formato de numeros");
                System.exit(2);
            }
            min = Math.min(min, x);
            max = Math.max(max, x);
            suma = suma + x;

        }
        System.out.println("suma: " + suma);
        System.out.println("Min: " + min);
        System.out.println("Max" +  max);
        System.out.println("Media" + (suma/ args.length));
    }
}
