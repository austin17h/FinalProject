package com.example.a1474672.finalproject;

import android.graphics.BitmapFactory;

import java.util.ArrayList;

class Point {
    private int myX;
    private int myY;

    Point(int myX, int myY) {
        this.myX = myX;
        this.myY = myY;
    }

    public int getMyX() {
        return myX;
    }

    public void setMyX(int myX) {
        this.myX = myX;
    }

    public int getMyY() {
        return myY;
    }

    public void setMyY(int myY) {
        this.myY = myY;
    }
}
public class Board {
    final static int UP = 1;
    final static int RIGHT = 2;
    final static int DOWN = 3;
    final static int LEFT = 4;
    final static int dimension = 10;
    ArrayList<Point> player1;
    int player1max = 6;
    ArrayList<Point> player2;
    int player2max = 6;
    ArrayList<Point> player3;
    int player3max = 6;
    Board() {
        player1 = new ArrayList<Point>();
        player2 = new ArrayList<Point>();
        player3 = new ArrayList<Point>();
    }

void makeMove(int player, Point move){
    if(player == 1)
    {
        player1.add(0, move);
        if(player1.size() == player1max)
        {
            player1.remove(player1max-1);
        }
    }
    else if(player == 2)
    {
        player2.add(0, move);
        if(player2.size() == player2max)
        {
            player2.remove(player2max - 1);
        }
    }
    else if(player == 3)
    {
        player3.add(0, move);
        if(player3.size() == player3max)
        {
            player3.remove(player3max - 1);
        }
    }
}
int updateBoard(){

return 0;
}
}
