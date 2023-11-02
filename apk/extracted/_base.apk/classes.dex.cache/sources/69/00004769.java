package org.webrtc;

import android.content.Context;
import org.webrtc.NetworkChangeDetector;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface NetworkChangeDetectorFactory {
    NetworkChangeDetector create(NetworkChangeDetector.Observer observer, Context context);
}