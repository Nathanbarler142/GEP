import core.game.TestGame;
import core.game_engine.GameManager;
import core.game_engine.GameObject;
import processing.core.PApplet;


public class Main extends PApplet
{
    private int WIDTH = 600, HEIGHT = 600;
    private TestGame testGame;

    public void settings()
    {
        size(WIDTH , HEIGHT);
    }

    public void setup()
    {
        background(0);
        testGame = new TestGame(this);
        testGame.start();
    }

    public void draw()
    {
        background(0);
        testGame.update();
    }


    public static void main(String args[])
    {
       PApplet.main("Main");
    }

}
