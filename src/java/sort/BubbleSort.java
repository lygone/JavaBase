package sort;

/**
 * Created by panyi on 2018/2/5.
 */
public class BubbleSort {

    public static void bubblesort(int[] x){
        for(int i=0;i<x.length-1;i++){
            for(int j=0;j<x.length-1-i;j++){
                if(x[j]<x[j+1]){
                    int len=0;
                    len=x[j];
                    x[j]=x[j+1];
                    x[j+1]=len;
                }

            }

        }

    }
    public static void main(String[] args) {
        int[] a={7,9,2,5,3,4};
        bubblesort(a);
       for(int s:a){
           System.out.println(s);
       }
    }
}
