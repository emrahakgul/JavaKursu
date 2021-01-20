package RepitSorular;


/*
Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
Sonuç böyle olmalıdır.

                      *
                    * *
                  * * *
                * * * *
              * * * * *



*/
public class for_Loops_1 {
    public static void main(String[] args) {

        int i, j;
        int n=5; // satir
        for(i=0; i<n; i++)  // outer loop to handle number of rows    //  n in this case
        {
            for(j=2*(n-i); j>=0; j--)    // values changing acc. to requirement    // inner loop to handle number spaces
            {
                System.out.print(" ");   // printing spaces
            }
            for(j=0; j<=i; j++)   //  inner loop to handle number of columns   //  values changing acc. to outer loop
            {
                System.out.print("* ");   // printing stars
            }

            System.out.println();   // ending line after each row
        }
    }

}

