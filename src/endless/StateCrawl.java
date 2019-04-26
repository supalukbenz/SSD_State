package endless;

import endless.model.Player;

public class StateCrawl extends State {

    public StateCrawl(Player player) {
        super(player);
    }

    @Override
    public void crawlReleased() {
        player.setState(new StateIdle(player));
        player.stopCrawling();
    }
}
