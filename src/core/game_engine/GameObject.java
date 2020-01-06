package core.game_engine;

import processing.core.PApplet;
import processing.core.PVector;

public class GameObject
{
    public PApplet parent;
    public PVector position;

    public GameObject()
    {

    }

    public GameObject(PApplet p)
    {
        this.parent = p;
        this.position = new PVector(0,0,0);
    }

    public void update()
    {
        this.position.x += 1;
        this.position.y += 3;
        parent.ellipse(this.position.x,this.position.y,30,30);
    }

}
