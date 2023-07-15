import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EquilibriumIndex {

    public static int Equilibrium(int[] array,int size)
    {
        int p[] = new int[size];
        p[0] = array[0];

        for(int i=1;i<size;i++)
        {
            p[i] = p[i-1] + array[i];
        }
        for(int i=1;i<size;i++)
        {
            if(p[i-1] == p[size-1]-p[i]){

                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(Equilibrium(array,size));
    }
}
     
