package de.flashheart.lara.interfaces;

import java.util.EventListener;

/**
 * Created by tloehr on 29.06.17.
 */
public interface GametimerListenerInterface extends EventListener {
    void healthChangedBy(long deltaHealth);
}