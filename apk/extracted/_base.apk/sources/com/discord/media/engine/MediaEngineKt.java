package com.discord.media.engine;

import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m14357d2 = {"getMediaEngine", "Lcom/discord/media/engine/MediaEngine;", "Lcom/facebook/react/bridge/ReactContext;", "media_engine_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaEngineKt {
    public static final MediaEngine getMediaEngine(ReactContext reactContext) {
        MediaEngine mediaEngine;
        C9612q.m13917h(reactContext, "<this>");
        MediaEngineModule mediaEngineModule = (MediaEngineModule) reactContext.getNativeModule(MediaEngineModule.class);
        if (mediaEngineModule != null && (mediaEngine = mediaEngineModule.getMediaEngine()) != null) {
            return mediaEngine;
        }
        throw new IllegalStateException("Unable to get MediaEngine native module".toString());
    }
}
