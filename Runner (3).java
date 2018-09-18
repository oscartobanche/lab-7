import java.util.Arrays;

public class Runner1 {

    private static final String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";


    public static String randomAlphaNumeric(int count) {

        StringBuilder builder = new StringBuilder();
	int a = count--
        while (a!= 0) {
            int n = (int) (Math.random() * s.length());
            builder.append(s.charAt(n));
        }
        return builder.toString();
    }

    public static String[] CopyArray(String[] values) {

            return Arrays.copyOf(values, values.length);
    }

  
    public static int random() {

        int randomN = (Math.random() + 2);

        return randomN;
    }

    public static void bubbleSort(String A[]) {
        
        for (int i = 0; i < A.length; i++) {
            for (int k = 1; k < (A.length - i); k++) {

                if (A[k - 1].compareTo(A[k])<0) {

                    // swap elements
                    String temp = A[k - 1];
                    A[k - 1] = A[k];
                    A[k] = temp;
                }

            }
        }
    }

    public static void selectionSort(String[] B){
        for (int i = 0; i < B.length - 1; i++)
        {
            int temp = i;
            for (int k = i + 1; k < B.length; k++){
                if (B[k].compareTo(B[temp])<0){
                    temp = k;
                }
            }
            String smallest = B[temp];
            B[temp] = B[i];
            B[i] = smallest;
        }
    }


    public static void main(String[] args) {
        String RandomArray[] = new String[20];
        String RandomArray2[] = new String[20];
      
        for(int i=0;i<randomArray.length;i++)
        {
            randomArray[i] = randomAlphaNumeric(random());
        }
      
        randomArray2 = CopyArray(randomArray);
      
        System.out.println("Input Array1:");
        System.out.println(java.util.Arrays.toString(randomArray));
        bubbleSort(randomArray);
        System.out.println("Sorted Array1:");
        System.out.println(java.util.Arrays.toString(randomArray));
      
      
        System.out.println("Input Array2:");
        System.out.println(java.util.Arrays.toString(randomArray2));
        selectionSort(randomArray2);
        System.out.println("Sorted Array2:");
        System.out.println(java.util.Arrays.toString(randomArray2));
  
    }
    
}