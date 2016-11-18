package game;

import game.monsters.Monster;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;


public class GameOverState extends BasicGameState {

    private static Monster monsterP1;
    private static Monster monsterP2;

    @Override
    public int getID() {
        return BeatBitBeatMain.getGameOver();
    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {

    }
    
    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.setColor(Color.white);
        g.drawString("Game over!", 300, 300);

    }

    public static void setMonsterP1(Monster monsterP1) {
        GameOverState.monsterP1 = monsterP1;
    }

    public static void setMonsterP2(Monster monsterP2) {
        GameOverState.monsterP2 = monsterP2;
    }

    
}