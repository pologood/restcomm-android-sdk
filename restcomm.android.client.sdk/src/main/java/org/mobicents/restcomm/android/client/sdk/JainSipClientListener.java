package org.mobicents.restcomm.android.client.sdk;

public interface JainSipClientListener {
    public abstract void onClientOpenedEvent(String id);  // on successful register, onPrivateClientConnectorOpenedEvent
    public abstract void onClientErrorEvent(String id, RCClient.ErrorCodes status, String text);  // mostly on unsuccessful register, onPrivateClientConnectorOpenErrorEvent
    public abstract void onClientClosedEvent(String id);  // on successful unregister, onPrivateClientConnectorClosedEvent

}
