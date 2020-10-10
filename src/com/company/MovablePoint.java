package com.company;

public abstract class MovablePoint implements Moveble {
    protected int x = 0;
    protected int y = 0;
    protected int xSpeed = 0;
    protected int ySpeed = 0;

    public MovablePoint (int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString()
    {
        return String.format("str : %d,%d,%d,%d", (int)x, (int)y, (int)xSpeed, (int)ySpeed);
    }

    public MovablePoint ()
    {

    }

    public void setX(int x)
    {
        this.x = x;
    }


    public void setY(int y)
    {
        this.y = y;
    }


    public void setxSpeed(int xSpeed)
    {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed)
    {
        this.ySpeed = ySpeed;
    }



}
