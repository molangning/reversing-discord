package com.facebook.react.devsupport.interfaces;

import org.json.JSONObject;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface StackFrame {
    int getColumn();

    String getFile();

    String getFileName();

    int getLine();

    String getMethod();

    boolean isCollapsed();

    JSONObject toJSON();
}