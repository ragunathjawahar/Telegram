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

    @Override
    public int getCurrentTime() {
        return (int) System.currentTimeMillis();
    }

    @Override
    protected void nativeInit(int version,
                              int layer,
                              int apiId,
                              String deviceModel,
                              String systemVersion,
                              String appVersion,
                              String langCode,
                              String systemLangCode,
                              String configPath,
                              String logPath,
                              String regId,
                              String cFingerprint,
                              int timezoneOffset,
                              long userId,
                              boolean enablePushConnection,
                              String installer,
                              String packageId) {
        /* no-op */
    }

    @Override
    public void checkConnection() {
        /* no-op */
    }

    @Override
    public void updateDcSettings() {
        /* no-op */
    }

    @Override
    protected void nativeResumeNetwork() {
        /* no-op */
    }

    @Override
    public int sendRequest(final TLObject object,
                           final RequestDelegate onComplete,
                           final RequestDelegateTimestamp onCompleteTimestamp,
                           final QuickAckDelegate onQuickAck,
                           final WriteToSocketDelegate onWriteToSocket,
                           final int flags,
                           final int datacenterId,
                           final int connetionType,
                           final boolean immediate) {
        return 1;
    }
}
