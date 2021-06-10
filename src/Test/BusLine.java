package Test;

import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class BusLine {
    //线路编号
    private int lineNum;
    //线路票价
    private double linePrice;
    //线路组合点集合
    private ArrayList<Point> points = new ArrayList<Point>();
    //线路车站集合
    private ArrayList<Point> pointStations = new ArrayList<Point>();
    //线路车站间的距离
    private ArrayList<Integer> distance = new ArrayList<>();
    //线路的组合点，车站，交叉点整
    private ArrayList<Point> allPoints = new ArrayList<Point>();

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    public double getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(double linePrice) {
        this.linePrice = linePrice;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public ArrayList<Point> getPointStations() {
        return pointStations;
    }

    public void setPointStations(ArrayList<Station> stations) {
        for(int i =0;i<points.size()-1;i++){
            boolean b = false;
            for(Station s : stations){
                //添加组合点到pointStation
                if(points.get(i).equals(s)){
                    pointStations.add(s);
                    b = true;
                    break;
                }
            }
            if(!b){
                pointStations.add(points.get(i));
            }
            int ix = points.get(i).getX();
            int i1x = points.get(i + 1).getX();
            int iy = points.get(i).getY();
            int i1y = points.get(i+1).getY();
            for(Station s : stations){
                //判断是否在同一直线
                boolean isStraight = (s.getX()-ix)*(iy-i1y) == (ix-i1x)*(s.getY()-iy);
                if(isStraight){
                    //判断是纵线 or 横线
                    if(iy == i1y){//横线
                        int gt = Math.max(ix, i1x);
                        int lt = Math.min(ix, i1x);
                        if(s.getY()==iy && s.getX()>lt && s.getX()<gt){
                            //添加车站到pointStation
                            pointStations.add(s);
                        }
                    }
                    else{//纵线
                        int gt = Math.max(iy,i1y);
                        int lt = Math.min(iy,i1y);
                        if(s.getX()==ix && s.getY()>lt && s.getY()<gt){
                            //添加车站到pointStation
                            pointStations.add(s);
                        }
                    }
                }
            }
        }
        //添加最后一个组合点到pointStation
        Point lastPoint = points.get(points.size()-1);
        boolean b = false;
        for(Station s : stations){
            //添加组合点到pointStation
            if(lastPoint.equals(s)){
                pointStations.add(s);
                b = true;
                break;
            }
        }
        if(!b){
            pointStations.add(lastPoint);
        }
    }

    public ArrayList<Integer> getDistance() {
        return distance;
    }

    public void setDistance() {
        for(int i=0;i<allPoints.size()-1;i++){
            int distanceX = Math.abs(allPoints.get(i).getX() - allPoints.get(i+1).getX());
            int distanceY = Math.abs(allPoints.get(i).getY() - allPoints.get(i+1).getY());
            distance.add(distanceX+distanceY);
        }
    }

    public ArrayList<Point> getAllPoints() {
        return allPoints;
    }

    public void setAllPoints(Map map) {
        for(int i=0;i<pointStations.size()-1;i++){
            int ix = pointStations.get(i).getX();
            int iy = pointStations.get(i).getY();
            int i1x = pointStations.get(i+1).getX();
            int i1y = pointStations.get(i+1).getY();

            //添加组合点 or 车站 到allPoints
            allPoints.add(pointStations.get(i));

            for(BusLine b : map.getBusLines()){
                if(b.getLineNum() != this.lineNum){
                    for(int j=0;j<b.pointStations.size()-1;j++){
                        int jx = b.pointStations.get(j).getX();
                        int jy = b.pointStations.get(j).getY();
                        int j1x = b.pointStations.get(j+1).getX();
                        int j1y = b.pointStations.get(j+1).getY();

                        if(jy == j1y && ix == i1x){//纵横相交
                            if(ix<=Math.max(j1x,jx) && ix>=Math.min(j1x,jx) && jy<Math.max(i1y,iy) && jy>Math.min(i1y,iy)){
                                Point point = new Point(ix, jy, 3);
                                //添加一个判断（不能重复添加）
                                boolean isExists = false;
                                for(Point p : allPoints){
                                    if(p.equals(point)){
                                        isExists = true;
                                    }
                                }
                                if(!isExists){
                                    allPoints.add(point);
                                }
                            }
                        }
                        else if(jx == j1x && iy == i1y){//横纵相交
                            if(jx<Math.max(i1x,ix) && jx>Math.min(i1x,ix) && iy<=Math.max(j1y,jy) && iy>=Math.min(j1y,jy)){
                                Point point = new Point(jx, iy, 3);
                                //添加一个判断（不能重复添加）
                                boolean isExists = false;
                                for(Point p : allPoints){
                                    if(p.equals(point)){
                                        isExists = true;
                                    }
                                }
                                if(!isExists){
                                    allPoints.add(point);
                                }
                            }
                        }
                    }
                }
            }
        }
        //添加最后一个组合点 or 车站 到allPoints
        allPoints.add(pointStations.get(pointStations.size()-1));
    }

    @Override
    public String toString() {
        return "BusLine{" +
                "lineNum=" + lineNum +
                ", linePrice=" + linePrice +
                ", points=" + points +
                ", pointStations=" + pointStations +
                ", distance=" + distance +
                ", allPoints=" + allPoints +
                '}';
    }

}
