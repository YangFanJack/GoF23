package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class Station extends Point{
    //车站编号
    private int stationNum;
    //车站名
    private String stationName;
    //经过该车站的线路集合
    private ArrayList<BusLine> busLines = new ArrayList<BusLine>();

    public Station(int x, int y, int pointType) {
        super(x, y, pointType);
        this.stationNum=stationNum;
    }

    public Station() {
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public ArrayList<BusLine> getBusLines() {
        return busLines;
    }

    public void setBusLines(ArrayList<BusLine> busLines) {
        this.busLines = busLines;
    }

    public int getStationNum() {
        return stationNum;
    }

    public void setStationNum(int stationNum) {
        this.stationNum = stationNum;
    }

    @Override
    public String toString() {
        return "Station{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                "，stationName='" + stationName + '\'' +
                ", busLines=" + busLines +
                ", pointType=" + getPointType() +
                ", pointNum=" + getPointNum() +
                '}';
    }
}
