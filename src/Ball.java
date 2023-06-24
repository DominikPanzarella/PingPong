import java.awt.*;
import java.util.*;

public class Ball extends Rectangle
{

    private Random random;
    private int xVelocity;
    private int yVelocity;
    private final int INITIAL_SPEED = 3;

    public Ball(final int x, final int y,final int width, final int height)
    {
        super(x,y,width,height);
        random = new Random();

        int randomXDirection = random.nextInt(2);   //0 = left; 1 = right
        if(randomXDirection == 0) randomXDirection--;
        setXDirection(randomXDirection * INITIAL_SPEED);

        int randomYDirection = random.nextInt(2);   //0 = left; 1 = right
        if(randomYDirection == 0) randomYDirection--;
        setYDirection(randomYDirection * INITIAL_SPEED);
    }

    public void setYDirection(int randomYDirection)
    {
        yVelocity = randomYDirection;
    }

    public void setXDirection(int randomXDirection)
    {
        xVelocity = randomXDirection;
    }

    public void move()
    {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.white);
        g.fillOval(x,y,width,height);
    }

    public int getYVelocity()
    {
        return yVelocity;
    }

    public int getXVelocity()
    {
        return xVelocity;
    }

    public void setXVelocity(final int xV)
    {
        xVelocity = xV;
    }
    public void setYVelocity(final int yV)
    {
        yVelocity = yV;
    }

}
