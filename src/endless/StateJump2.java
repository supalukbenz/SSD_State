package endless;

import endless.model.Player;

public class StateJump2 extends State {

    public StateJump2(Player player) {
        super(player);
    }

    public void enterGround() {
        player.enterGround();
        player.setState(new StateIdle(player));
    }


}
