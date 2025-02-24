public class Sample
{
   

    public static void main(String[] args)
    {
        GameArena arena = new GameArena(500, 500);
        Rectangle back = new Rectangle(0,0,500,500,"YELLOW");
        double speed=7;
        Ball b = new Ball(250, 150, 20, "GREEN");
        Cow c = new Cow(300,300);
        arena.addRectangle(back);
        arena.addBall(b);
        c.addCow(arena);
        
        while(true){
            //move(b);
            arena.pause();
            double movex;
            double movey;
            int x_mouse = arena.getMousePositionX();
            int y_mouse = arena.getMousePositionY();
            double x_ball =  b.getXPosition();
            double y_ball =  b.getYPosition();
            double cx = c.getX();
            double cy = c.getY();
            //if(x_ball>x_mouse){movex =-speed;}
            //else{movex = speed;}
            //if(y_ball>y_mouse){movey =-speed;}
            //else{movey = speed;}
            if(cx>x_mouse){movex =-speed;}
            else{movex = speed;}
            if(cy>y_mouse){movey =-speed;}
            else{movey = speed;}
            arena.clearGameArena();
            arena.addBall(b);
            
            c.move(movex,movey);
            c.addCow(arena);
            double pSpeed =2.5;
            if(arena.letterPressed('w')){b.move(0,-pSpeed);}
            if(arena.letterPressed('a')){b.move(-pSpeed,0);}
            if(arena.letterPressed('d')){b.move(pSpeed,0);}
            if(arena.letterPressed('s')){b.move(0,pSpeed);}
        }

    
    }
}
    