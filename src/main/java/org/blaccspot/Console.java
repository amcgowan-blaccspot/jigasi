package org.blaccspot;

public class Console {
    public static void Log(String msg) {
        msg = "[DEBUGLOG] " + msg;
        if (System.console() != null) {
            System.console().writer().println(msg);
        } else {
            System.out.println(msg);
        }
    }
}