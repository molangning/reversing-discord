package com.facebook.react.bridge;

import java.util.Map;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface PerformanceCounter {
    Map<String, Long> getPerformanceCounters();

    void profileNextBatch();
}
