public class Runner2 {

    public static void main(String[] args) {

        int strings[]= {2000,3000,4000,5000,6000,7000};

        long start,end,total;

        for(int i=0; i < strings.length;i++) {

            String array1[]= new String[strings[i]];
            String array2[]= new String[strings[i]];

            for(int j=0;j< strings[i];j++)
            {
                array1[j] = Runner1.randomAlphaNumeric(Runner1.random());
            }  

            array2 = Runner1.CopyArray(array1);

            System.out.println("\n\nTotal number of strings to be sorted: "+lengths[i]);

            start = System.nanoTime();

            Runner1.bubbleSort(array1);

            end = System.nanoTime();

            total = stopTime - startTime;

            System.out.println("Bubble sort takes: "+ total/1000000 + "milliseconds. ");
          
            start = System.nanoTime();

            Runner1.selectionSort(array2);

            end = System.nanoTime();

            total = end - start;

            System.out.println("Selection sort takes: "+ total/1000000+ " milliseconds.");
        }
    }
}