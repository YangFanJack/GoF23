package Test;

import java.util.*;

public class Map {
    public static final int M = -1;
    //map集合中所有点编号和线编号的计数器
    public static int pointCount = 0;
    public static int lineCount =0;

    //公交地图表示的城市名
    private String cityName;
    //公交地图以车站为横纵方向数组的邻接矩阵
    private int[][] map;

    //公交地图以所有公交线路组成的集合
    private ArrayList<BusLine> busLines = new ArrayList<BusLine>();
    //所有公交站点集合
    private LinkedHashSet<Point> allPointSet = new LinkedHashSet<Point>();
    //点编号：编号对应的点的集合
    private HashMap<Integer,ArrayList<Point>> countPointHash = new HashMap<>();


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int[][] getMap() {
        return map;
    }

    //完成map邻接矩阵
    public void setMap() {
        map = new int[allPointSet.size()][allPointSet.size()];
        //初始化邻接矩阵
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                  if(i==j){
                      map[i][j]=0;
                  }
                  else{
                      map[i][j]=M;
                  }
            }
        }
        for(int i=0;i<this.getBusLines().size();i++){
            ArrayList<Point> allPoints = this.getBusLines().get(i).getAllPoints();
            ArrayList<Integer> distance = this.getBusLines().get(i).getDistance();
            for(int j=0;j<allPoints.size()-1;j++){
                map[allPoints.get(j).getPointNum()][allPoints.get(j+1).getPointNum()] = distance.get(j);
                map[allPoints.get(j+1).getPointNum()][allPoints.get(j).getPointNum()] = distance.get(j);
            }
        }
    }

    public ArrayList<BusLine> getBusLines() {
        return busLines;
    }

    public void setBusLines(ArrayList<BusLine> busLines) {
        this.busLines = busLines;
    }

    public LinkedHashSet<Point> getAllPointSet() {
        return allPointSet;
    }

    public void setAllPointSet() {
        //添加所有点（组合点，车站，交叉点）到点set集合中
        for(int i=0;i<this.getBusLines().size();i++){
            ArrayList<Point> allPoints = this.getBusLines().get(i).getAllPoints();
            for(Point p : allPoints){
                addPoint(p);
            }
        }
    }

    /**
     * 获得图中指定两个相邻站点之间的距离
     * @param k1
     * @param k2
     * @return
     */
    public int getMapValue(int k1,int k2){
        return map[k1][k2];
    }

    /**
     * 给图中指定两个相邻站点间赋距离值
     * @param k1
     * @param k2
     * @param value
     */
    public void setMapValue(int k1,int k2,int value){
        map[k1][k2]=value;
    }

    /**
     * 添加点到map对象的Set集合(确保唯一性)中
     * @param point
     */
    private void addPoint(Point point){
        boolean b = this.allPointSet.add(point);
        if(b){
            point.setPointNum(Map.pointCount);
            Map.pointCount++;
        }
        else{
            Point point1 = findPoint(point);
            point.setPointNum( point1.getPointNum());
        }
    }

    /**
     * 根据x，y坐标查找点（组合点，车站，交叉点）
     * @param point
     * @return
     */
    private Point findPoint(Point point){
        for(Point p : allPointSet){
            if(p.getX()==point.getX() && p.getY()==point.getY()){
                return p;
            }
        }
        return null;
    }

    public HashMap<Integer, ArrayList<Point>> getCountPointHash() {
        return countPointHash;
    }

    public void setCountPointHash() {
        for(int i=1;i<=allPointSet.size();i++){
            countPointHash.put(i,findPointByCount(i));
        }
    }

    //通过点编号找到点
    private ArrayList<Point> findPointByCount(int count){
        ArrayList<Point> points = new ArrayList<Point>();
        for(int i=0;i<this.getBusLines().size();i++){
            ArrayList<Point> allPoints = this.getBusLines().get(i).getAllPoints();
            for(Point p : allPoints){
                if(p.getPointNum() == count){
                    points.add(p);
                }
            }
        }
        return points;
    }

    //Dijkstra算法求最短路径
    public void recommend(){
        int orig = 0; //起始点
        //寻找最短路径
        int[] shortPath = dijkstra_alg(orig);

        if(shortPath == null){
            return;
        }

        for(int i=0; i< shortPath.length; i++){
            System.out.println("从" + (orig) + "出发到" + (i) + "的最短距离为："+ shortPath[i]);
        }
    }
    private int[] dijkstra_alg(int orig) {

        int n =map.length;                  //顶点的个数
        int[] shortest = new int[n];        //存放从start到其他节点的最短路径
        boolean[] visited = new boolean[n]; //标记当前该顶点的最短路径是否已经求出，true表示已经求出


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
                if (!visited[i] && map[k][i] != M)
                {
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

    @Override
    public String toString() {
        return "Map{" +
                "cityName='" + cityName + '\'' +
                ", map=" + Arrays.toString(map) +
                ", busLines=" + busLines +
                ", allPointSet=" + allPointSet +
                ", countPointHash=" + countPointHash +
                '}';
    }
}
