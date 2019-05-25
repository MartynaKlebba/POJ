/*
Autorzy: Martyna Klebba
	Aleksander Ostasz 

zadanie4  

*/
public class myRectangle {

    private MyPoint a1;
    private MyPoint a2;

    public myRectangle(int x1, int y1,int x2,int y2)
    {
        this.a1=new MyPoint(x1,y1);
        this.a2=new MyPoint(x2,y2);
    }
    public myRectangle(MyPoint a1,MyPoint a2)
    {
        this.a1=a1;
        this.a2=a2;
    }
    public double getarea()
    {
        return a1.distance(a2.getX(),a1.gety())*a2.distance(a1.getx(),a2.gety());
    }
    public String toString()
    {
        return "MyRectangle[a1=" + a1.toString()+", a2="+a2.toString()+"]";
    }
}
