package org.telegram.tgnet;

public class ConnectionsManagerTestable extends ConnectionsManager {
    public ConnectionsManagerTestable(int instance) {
        super(instance);
    }

    public static int nativeGetConnectionState = ConnectionStateConnected;

    @Override
    protected int getNativeGetConnectionState() {
        return nativeGetConnectionState;
    }
}
