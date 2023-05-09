package Algorithm;

import java.util.Scanner;

public class DFS {

    private static int min = 999999;
    private static int p;//目标点x坐标
    private static int q;//目标点y坐标
    private static int m;//列数
    private static int n;//行数
    private static int[][] a = new int[51][51];
    private static int[][] book = new int[51][51];

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("target x position is: ");
        p = scanner.nextInt();
        System.out.println("target y position is: ");
        q = scanner.nextInt();
        System.out.println("map's column is: ");
        m = scanner.nextInt();
        System.out.println("map's row is: ");
        n = scanner.nextInt();
        System.out.println("please input all points in this map: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        book[1][1] = 1;
        dfs(1,1,0);

        System.out.println("The shortest route is: "+min);
    }

    private static void dfs(int x, int y, int step){
        int next[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        if (x==p && y==q){
            if (step < min){
                min = step;
            }
        } else {
            for (int k=0; k<=next.length; k++){
                int tx = x + next[k][0];
                int ty = y + next[k][1];
                if (tx<1 || tx>n || ty<1 || ty>m){
                    continue;
                }
                if (a[tx][ty]==0 && book[tx][ty]==0){
                    book[tx][ty]=1;
                    dfs(tx,ty,step+1);
                    book[tx][ty]=0;
                }
            }
        }
    }
}
