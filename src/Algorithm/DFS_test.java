package Algorithm;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class DFS_test {

    private static int n;
//    private static int[] a = new int[4];
//    private static int[] book = new int[4];
    private static int[] a;
    private static int[] book;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = new int[n+1];
        book = new int[n+1];
        dfs(1);
    }

    public static void dfs(int step){
        int i;
        if (step==n+1){
            for (int x : a){
                System.out.print(x);
            }
            System.out.println();
        } else {
            for (i = 1; i <= n; i++){
                if (book[i] ==0){
                    a[step] = i;
                    book[i] = 1;
                    dfs(step+1);
                    book[i]=0;
                }

            }
        }
    }
}
