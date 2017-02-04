package pkg2048;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class x2048 extends StateBasedGame{
    
    public x2048(String name)
    {
        super(name);
    }
    
    @Override
    public void initStatesList(GameContainer gc) throws SlickException 
    {
        this.addState(new Menu(0));
        this.addState(new Play(1));
        this.addState(new HighScores(2));
    }

    
    public static void main(String[] args) throws SlickException 
    {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new x2048("2048"));
            appgc.setDisplayMode(1200,800,false);
            appgc.setTargetFrameRate(59);
            appgc.setShowFPS(true);
            appgc.setVSync(true);
            appgc.start();
    }
}