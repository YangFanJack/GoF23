package Test;

public class Test2 {
    public static final int M = -1;
    static int[][] map = {
            {0,  5,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {5,  0,  1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  1,  0,  2,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  2,  0,  2,  -1,  -1,  -1,  -1,  -1,  -1,  5,  3,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {10,  5,  4,  2,  0,  10000,  14,  16,  20,  24,  28,  7,  5,  10,  8,  18,  20,  22,  28,  35,  5,  3,  13,  18,  23,  24,  31},
            {-1,  -1,  -1,  -1,  10000,  0,  10000,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  10000,  0,  2,  -1,  -1,  -1,  -1,  -1,  -1,  6,  4,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  2,  0,  4,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  4,  0,  4,  -1,  -1,  -1,  -1,  -1,  2,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  3,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  4,  0,  4,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  4,  0,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  5,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  0,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  3,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  0,  5,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  5,  0,  2,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  6,  -1,  -1,  -1,  -1,  -1,  -1,  2,  0,  -1,  -1,  -1,  -1,  -1,  -1,  5,  5,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  4,  -1,  2,  -1,  -1,  -1,  -1,  -1,  -1,  0,  2,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  6,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  2,  0,  2,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  2,  0,  6,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  6,  0,  7,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  7,  0,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  5,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  0,  -1,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  3,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  5,  -1,  -1,  -1,  -1,  -1,  -1,  0,  -1,  -1,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  5,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  0,  5,  -1,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  5,  0,  5,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  3,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  5,  0,  -1,  -1},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  6,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  0,  7},
            {-1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  7,  0}
    };
    static int n =map.length;       //顶点的个数
    static int[] shortest = new int[n];  //存放从start到其他节点的最短路径
    static boolean[] visited = new boolean[n]; //标记当前该顶点的最短路径是否已经求出，true表示已经求出

    public static void main(String[] args) {
        int orig = 21; //起始点
        //寻找最短路径
        int[] shortPath = dijkstra_alg(orig);

        if(shortPath == null){
            return;
        }

        for(int i=0; i< shortPath.length; i++){
            System.out.println("从" + (orig) + "出发到" + (i) + "的最短距离为："+ shortPath[i]);
        }
    }

    private static int[] dijkstra_alg(int orig) {
        // TODO Auto-generated method stub
        // 初始化，第一个顶点求出
        shortest[orig] = 0;
        visited[orig] = true;

        //存放从start到其他各节点的最短路径
        String[] path = new String[n];
        for(int i = 0; i < n; i++){
            path[i] = new String(orig + "--->" + i);
        }
        for(int count = 0; count != n-1; count ++)
        {
            //选出一个距离初始顶点最近的为标记顶点
            int k = M;
            int min = M;
            for(int i =0; i< n ; i++)//遍历每一个顶点
            {
                if( !visited[i] && map[orig][i] != M) //如果该顶点未被遍历过且与orig相连
                {
                    if(min == -1 || min > map[orig][i]) //找到与orig最近的点
                    {
                        min = map[orig][i];
                        k = i;
                    }
                }
            }
            //正确的图生成的矩阵不可能出现K== M的情况
            if(k == M)
            {
                System.out.println("the input map matrix is wrong!");
                return null;
            }
            shortest[k] = min;
            visited[k] = true;
            //以k为中心点，更新oirg到未访问点的距离
            for (int i = 0; i < n; i++)
            {
                System.out.println("!!!!!!!!!!!!!!!!!");
                System.out.println(n);
                System.out.println(i);
                System.out.println(k);
                if (!visited[i] && map[k][i] != M)
                {
                    System.out.println("map["+k+"]["+i+"]");
                    int callen = min + map[k][i];
                    if (map[orig][i] == M || map[orig][i] > callen)
                    {
                        map[orig][i] = callen;
                        path[i] = path[k] + "--->" + i;
                    }
                }
            }
        }

        for(int i=0;i<n;i++)
            System.out.println("从"+orig+"出发到"+i+"的最短路径为："+path[i]);
        System.out.println("=====================================");

        return shortest;
    }
}
