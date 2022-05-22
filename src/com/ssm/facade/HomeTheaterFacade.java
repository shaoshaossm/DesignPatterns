package com.ssm.facade;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/5/22 15:03
 */
public class HomeTheaterFacade {
    //定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Screen screen;
    private DVDPlayer dVDPlayer;

    public HomeTheaterFacade() {

        this.dVDPlayer = DVDPlayer.getInstance();
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
    }
    //操作分成 4 步

    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        dVDPlayer.on();
        theaterLight.dim();
    }

    public void play() {
        dVDPlayer.play();
    }

    public void pause() {
        dVDPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        dVDPlayer.off();
    }
}
