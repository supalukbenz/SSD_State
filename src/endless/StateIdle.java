package endless;

import endless.model.Player;

public class StateIdle extends State {

    public StateIdle(Player player) {
        super(player);
    }

    public void jumpPressed() {
        player.jump();
        player.setState(new StateJump(player));
    }

    public void crawlPressed() {
        player.setState(new StateCrawl(player));
        player.crawl();
    }

}
