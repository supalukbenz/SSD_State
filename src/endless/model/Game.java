package endless.model;
import java.util.Observable;

public class Game extends Observable {

	public static final int FPS = 60;
	public static final float GRAVITY = -600;
	
	private Player player;
	private boolean running;
	private Thread gameThread;
	
	public Game() {
		player = new Player(0, 0);
	}
	
	public void start() {
		running = true;
		gameThread = new Thread() {
			@Override
			public void run() {
				super.run();
				while(running) {
					singleFrame();
					try {
						Thread.sleep(1000 / FPS);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
				}
			}
		};
		gameThread.start();
	}
	
	private void singleFrame() {
		player.update();
		setChanged();
		notifyObservers();
	}
	
	public int getPlayerX() {
		return player.getX();
	}
	
	public int getPlayerY() {
		return player.getY();
	}
	
	public int getPlayerWidth() {
		return player.getWidth();
	}
	
	public int getPlayerHeight() {
		return player.getHeight();
	}
	
	public void jumpPressed() {
		player.jumpPressed();
	}
	
	public void crawlPressed() {
		player.crawlPressed();
	}
	
	public void crawlReleased() {
		player.crawlReleased();
	}
	
}
