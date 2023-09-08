/**
 * 
 * This picture depicts a king throwing a magenta ball at a creeper from minecraft
 * 
 * @author  Joshua Klenk
 * @version 09/08/2023
 */
public class Picture
{
    private Square sky;
    private Square head;
    private Square eye1;
    private Square eye2;
    private Square mouth1;
    private Square mouth2;
    private Square mouth3;
    private Square body1;
    private Square body2;
    private Square body3;
    private Square foot1;
    private Square foot2;
    private Square ground;
    private Triangle crown1;
    private Triangle crown2;
    private Triangle crown3;
    private Circle orb;
    private Person hero;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        ground = new Square();
        sky = new Square();
        head = new Square();
        eye1 = new Square();
        eye2 = new Square();
        mouth1 = new Square();
        mouth2 = new Square();
        mouth3 = new Square();
        body1 = new Square();
        body2 = new Square();
        body3 = new Square();
        foot1 = new Square();
        foot2 = new Square();
        hero = new Person();
        crown1 = new Triangle();  
        crown2 = new Triangle();  
        crown3 = new Triangle();  
        orb = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            sky.changeColor("blue");
            sky.changeSize(9000);
            sky.moveHorizontal(-800);
            sky.moveVertical(-150);
            sky.makeVisible();
            
            ground.changeColor("brown");
            ground.changeSize(1000);
            ground.moveHorizontal(-350);
            ground.moveVertical(100);
            ground.makeVisible();
            
            head.changeColor("green");
            head.moveHorizontal(-290);
            head.moveVertical(-80);
            head.changeSize(80);
            head.makeVisible();
            
            eye1.changeColor("black");
            eye1.moveHorizontal(-244);
            eye1.moveVertical(-60);
            eye1.changeSize(20);
            eye1.makeVisible();
            
            eye2.changeColor("black");
            eye2.moveHorizontal(-280);
            eye2.moveVertical(-60);
            eye2.changeSize(20);
            eye2.makeVisible();
            
            mouth1.changeColor("black");
            mouth1.moveHorizontal(-259);
            mouth1.moveVertical(-40);
            mouth1.changeSize(15);
            mouth1.makeVisible();
            
            mouth2.changeColor("black");
            mouth2.moveHorizontal(-250);
            mouth2.moveVertical(-30);
            mouth2.changeSize(15);
            mouth2.makeVisible();
            
            mouth3.changeColor("black");
            mouth3.moveHorizontal(-268);
            mouth3.moveVertical(-30);
            mouth3.changeSize(15);
            mouth3.makeVisible();
            
            body1.changeColor("green");
            body1.moveHorizontal(-275);
            body1.moveVertical(-8);
            body1.changeSize(50);
            body1.makeVisible();
            
            body2.changeColor("green");
            body2.moveHorizontal(-275);
            body2.moveVertical(40);
            body2.changeSize(50);
            body2.makeVisible();
            
            body3.changeColor("green");
            body3.moveHorizontal(-275);
            body3.moveVertical(80);
            body3.changeSize(50);
            body3.makeVisible();
            
            foot1.changeColor("green");
            foot1.moveHorizontal(-260);
            foot1.moveVertical(120);
            foot1.changeSize(50);
            foot1.makeVisible();
            
            foot2.changeColor("green");
            foot2.moveHorizontal(-290);
            foot2.moveVertical(120);
            foot2.changeSize(50);
            foot2.makeVisible();
            
            hero.changeColor("red");
            hero.moveHorizontal(160);
            hero.moveVertical(20);
            hero.changeSize(100,50);
            hero.makeVisible();
    
            crown1.changeColor("grey");
            crown1.changeSize(20,20);
            crown1.moveHorizontal(220);
            crown1.moveVertical(30);
            crown1.makeVisible();
            
            crown2.changeColor("grey");
            crown2.changeSize(20,20);
            crown2.moveHorizontal(230);
            crown2.moveVertical(30);
            crown2.makeVisible();
            
            crown3.changeColor("grey");
            crown3.changeSize(20,20);
            crown3.moveHorizontal(240);
            crown3.moveVertical(30);
            crown3.makeVisible();
    
            orb.changeColor("magenta");
            orb.moveHorizontal(110);
            orb.moveVertical(80);
            orb.changeSize(80);
            orb.makeVisible();
            orb.slowMoveHorizontal(-260);
            for(int i = 0; i < 300; i++)
            {
            orb.slowMoveVertical(-1);
            orb.slowMoveHorizontal(1);
            }
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
            sky.changeColor("white");
            ground.changeColor("grey");
            head.changeColor("black");
            eye1.changeColor("white");
            eye2.changeColor("white");
            mouth1.changeColor("white");
            mouth2.changeColor("white");
            mouth3.changeColor("white");
            body1.changeColor("black");
            body2.changeColor("black");
            body3.changeColor("black");
            foot1.changeColor("black");
            foot2.changeColor("black");
            hero.changeColor("black");
            orb.changeColor("black");
            crown1.changeColor("black");
            crown2.changeColor("black");
            crown3.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
            sky.changeColor("blue");
            ground.changeColor("brown");
            head.changeColor("green");
            eye1.changeColor("black");
            eye2.changeColor("black");
            mouth1.changeColor("black");
            mouth2.changeColor("black");
            mouth3.changeColor("black");
            body1.changeColor("green");
            body2.changeColor("green");
            body3.changeColor("green");
            foot1.changeColor("green");
            foot2.changeColor("green");
            hero.changeColor("red");
            orb.changeColor("blue");
            crown1.changeColor("grey");
            crown2.changeColor("grey");
            crown3.changeColor("grey");
    }
}
