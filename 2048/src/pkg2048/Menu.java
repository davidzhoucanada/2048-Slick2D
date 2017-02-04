package pkg2048;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Menu extends BasicGameState{
    private static StateBasedGame game;
    Image menubackground;
    
    @SuppressWarnings("empty-statement")
    public Menu(int stateID) throws SlickException{
        this.menubackground = new Image ("data\\menuBackground.png");
    }
    
    @Override
    public void enter(GameContainer gc, StateBasedGame sg) throws SlickException {
       this.init(gc, sg);
    }
    
    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        game=sbg;
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        menubackground.draw(0,0);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input=gc.getInput();
        
        if(input.isMouseButtonDown(0)&&input.getMouseX()>=50&&input.getMouseX()<=157&&input.getMouseY()>=210&&input.getMouseY()<=260){
            game.enterState(1,new FadeOutTransition(Color.black),new FadeInTransition(Color.black));
        }
        if(input.isMouseButtonDown(0)&&input.getMouseX()>=50&&input.getMouseX()<=380&&input.getMouseY()>=285&&input.getMouseY()<=335){
            game.enterState(2,new FadeOutTransition(Color.black),new FadeInTransition(Color.black));
        }
        if(input.isMouseButtonDown(0)&&input.getMouseX()>=50&&input.getMouseX()<=162&&input.getMouseY()>=360&&input.getMouseY()<=415){
            gc.exit();
        }
    }
}