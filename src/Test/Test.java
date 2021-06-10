package Test;

import sun.text.CodePointIterator;

import javax.swing.text.SimpleAttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        //创建公交地图
        Map map = new Map();
        map.setCityName("Jack's city");

        //公交线路1
        BusLine busLine1 = new BusLine();
        busLine1.setLineNum(Map.lineCount++);
        busLine1.setLinePrice(2.0);
        //添加组合点
        ArrayList<Point> points1 = busLine1.getPoints();
        points1.add(new Point(1,1,1));
        points1.add(new Point(6,1,1));
        points1.add(new Point(6,12,1));
        points1.add(new Point(16,12,1));
        points1.add(new Point(16,20,1));
        points1.add(new Point(20,20,1));
        //融合组合点 & 车站
        ArrayList<Station> stationList1 = new ArrayList<Station>();
        stationList1.add(new Station(1,1,2));
        stationList1.add(new Station(6,2,2));
        stationList1.add(new Station(6,6,2));
        stationList1.add(new Station(6,12,2));
        stationList1.add(new Station(14,12,2));
        stationList1.add(new Station(16,16,2));
        stationList1.add(new Station(20,20,2));
        busLine1.setPointStations(stationList1);



        //公交线路2
        BusLine busLine2 = new BusLine();
        busLine2.setLineNum(Map.lineCount++);
        busLine2.setLinePrice(2.0);
        //添加组合点
        ArrayList<Point> points2 = busLine2.getPoints();
        points2.add(new Point(1,4,1));
        points2.add(new Point(14,4,1));
        points2.add(new Point(14,20,1));
        points2.add(new Point(1,20,1));
        //融合组合点 & 车站
        ArrayList<Station> stationList2 = new ArrayList<Station>();
        stationList2.add(new Station(1,4,2));
        stationList2.add(new Station(9,4,2));
        stationList2.add(new Station(14,6,2));
        stationList2.add(new Station(14,12,2));
        stationList2.add(new Station(14,18,2));
        stationList2.add(new Station(8,20,2));
        stationList2.add(new Station(1,20,2));
        busLine2.setPointStations(stationList2);



        //公交线路3
        BusLine busLine3 = new BusLine();
        busLine3.setLineNum(Map.lineCount++);
        busLine3.setLinePrice(2.0);
        //添加组合点
        ArrayList<Point> points3 = busLine3.getPoints();
        points3.add(new Point(1,6,1));
        points3.add(new Point(19,6,1));
        points3.add(new Point(19,16,1));
        points3.add(new Point(1,16,1));
        //融合组合点 & 车站
        ArrayList<Station> stationList3 = new ArrayList<Station>();
        stationList3.add(new Station(1,6,2));
        stationList3.add(new Station(9,6,2));
        stationList3.add(new Station(19,6,2));
        stationList3.add(new Station(19,11,2));
        stationList3.add(new Station(16,16,2));
        stationList3.add(new Station(8,16,2));
        stationList3.add(new Station(1,16,2));
        busLine3.setPointStations(stationList3);



        //添加公交线路到map公交地图中
        ArrayList<BusLine> busLines = map.getBusLines();
        busLines.add(busLine1);
        busLines.add(busLine2);
        busLines.add(busLine3);

        //融合组合点 & 车站 & 交叉点 并 完成计算相邻点之间距离
        busLine1.setAllPoints(map);
        busLine2.setAllPoints(map);
        busLine3.setAllPoints(map);
        busLine1.setDistance();
        busLine2.setDistance();
        busLine3.setDistance();

        //将地图中所有点加入map的pointSet集合中
        map.setAllPointSet();
        //点编号：点的hashmap
        map.setCountPointHash();
        //填写邻接矩阵
        map.setMap();


        //打印每条公交线路的组合点
        for(int i=0;i<map.getBusLines().size();i++){
            System.out.println(map.getBusLines().get(i).getPoints());
        }
        //打印每条公交线路的组合点 & 公交点
        for(int i=0;i<map.getBusLines().size();i++){
            System.out.println(map.getBusLines().get(i).getPointStations());
        }
        //打印每条公交线路的所有点（组合点，公交点，交叉点）
        for(int i=0;i<map.getBusLines().size();i++){
            System.out.println(map.getBusLines().get(i).getAllPoints());
            System.out.println(map.getBusLines().get(i).getDistance());
        }
        //打印allPointSet集合
        for(Point p : map.getAllPointSet()){
            System.out.println(p);
        }
        //打印点编号：点的hashmap
        for(java.util.Map.Entry e : map.getCountPointHash().entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        //打印邻接矩阵
        int[][] m = map.getMap();
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }

        //使用Dijkstra算法实现最短路径推荐
        map.recommend();
    }
}
