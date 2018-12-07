package org.blaccspot;
import org.jitsi.jigasi.JvbConference;
import org.jitsi.service.libjitsi.LibJitsi;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;

import net.java.sip.communicator.impl.protocol.jabber.*;


public class XmppTest {

    private String roomName = "";

    public XmppTest(String roomName) {

        this.roomName = roomName;
        Console.Log("Created XmppTest");

    }

    public void ConnectToConference() {
        Console.Log("Connecting to conference: " + roomName);
    }

    private void connect() {
        Console.Log("Connect: " + roomName);
    }
}