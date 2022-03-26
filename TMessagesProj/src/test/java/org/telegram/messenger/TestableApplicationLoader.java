package org.telegram.messenger;

public class TestableApplicationLoader extends ApplicationLoader {
    @Override
    protected void setupConnectionsManager() {
        /* bypass loading native libraries */
    }
}
