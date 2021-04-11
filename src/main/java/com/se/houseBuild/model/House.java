package com.se.houseBuild.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class House  {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String name;
    private double generalArea;
    private int roomsCount;
    private int floorsCount;
    private String style;
    private long cost;

    public House() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGeneralArea() {
        return generalArea;
    }

    public void setGeneralArea(double generalArea) {
        this.generalArea = generalArea;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public int getFloorsCount() {
        return floorsCount;
    }

    public void setFloorsCount(int floorsCount) {
        this.floorsCount = floorsCount;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public House(String name, double generalArea, int roomsCount, int floorsCount, String style, long cost) {
        this.name = name;
        this.generalArea = generalArea;
        this.roomsCount = roomsCount;
        this.floorsCount = floorsCount;
        this.style = style;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", generalArea=" + generalArea +
                ", roomsCount=" + roomsCount +
                ", floorsCount=" + floorsCount +
                ", style='" + style + '\'' +
                ", cost=" + cost +
                '}';
    }
}