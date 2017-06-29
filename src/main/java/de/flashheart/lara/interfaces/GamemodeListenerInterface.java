package main.java.de.flashheart.lara.interfaces;



import java.util.EventListener;

/**
 * Created by tloehr on 29.06.17.
 */
public interface GamemodeListenerInterface extends EventListener {
    void targetDestroyed();
    void targetDefended();
    void gamemodeButtonPressed();
}