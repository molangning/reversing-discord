package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int i);

    void setTargets(int i, double d);
}