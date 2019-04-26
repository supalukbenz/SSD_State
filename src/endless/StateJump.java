package endless;

import endless.model.Player;

public class StateJump extends State {

    public StateJump(Player player) {
        super(player);
    }

    public void enterGround() {
        player.enterGround();
        player.setState(new StateIdle(player));
    }

    public void jumpPressed() {
        player.jump();
        player.setState(new StateJump2(player));
    }

}
