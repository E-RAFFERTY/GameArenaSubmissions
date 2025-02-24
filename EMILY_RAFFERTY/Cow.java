public class Cow {
    
    double x;
    double y;
    Ball head;
    Ball rnose;
    Ball lnose;
    Rectangle cnose;
    Ball lhorn;
    Ball rhorn;
    Line lear;
    Line rear;
    Line rearp;
    Line learp;
    Ball leye;
    Ball reye;
    Ball lnos;
    Ball rnos;
    
    public Cow(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double dx, double dy){
        x+=dx;
        y+=dy;
        
    }
    public void remove(GameArena g){
        g.addBall(lhorn);
        g.addBall(rhorn);
        g.addLine(lear);
        g.addLine(rear);
        g.addLine(rearp);
        g.addLine(learp);
        g.addBall(head);
        g.addBall(lnose);
        g.addBall(rnose);
        g.addRectangle(cnose);
        g.addBall(leye);
        g.addBall(reye);
        g.addBall(lnos);
        g.addBall(rnos);
    }
    public Ball getCow(){
        return head;
    }
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
    public void addCow(GameArena g){
         head = new Ball(x, y, 50, "WHITE");
         rnose = new Ball(x+20,y+15,22,"PINK");
         lnose = new Ball(x-20,y+15,22,"PINK");
         cnose = new Rectangle(x-20,y+7,40,18,"PINK");
         lhorn = new Ball(x-12,y-19,15,"#a87132");
         rhorn = new Ball(x+12,y-19,15,"#a87132");
         lear = new Line(x-10,y-8,x-25,y-20,5,"WHITE");
         learp = new Line(x-10,y-8,x-25,y-20,2,"PINK");
         rear = new Line(x+10,y-8,x+25,y-20,5,"WHITE");
         rearp = new Line(x+10,y-8,x+25,y-20,2,"PINK");
         leye = new Ball(x-10,y-4,10,"BLACK");
         reye = new Ball(x+10,y-4,10,"BLACK");
         lnos = new Ball(x-20,y+15,10,"#b5828b");
         rnos = new Ball(x+20,y+15,10,"#b5828b");

        
        g.addBall(lhorn);
        g.addBall(rhorn);
        g.addLine(lear);
        g.addLine(rear);
        g.addLine(rearp);
        g.addLine(learp);
        g.addBall(head);
        g.addBall(lnose);
        g.addBall(rnose);
        g.addRectangle(cnose);
        g.addBall(leye);
        g.addBall(reye);
        g.addBall(lnos);
        g.addBall(rnos);
        
        
       
    }
}
