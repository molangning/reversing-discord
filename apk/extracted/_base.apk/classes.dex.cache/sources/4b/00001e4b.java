package com.discord.reactevents;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.WritableMap;
import fj.AbstractC6480a;
import kotlin.Metadata;
import p470zi.C14285j;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m14357d2 = {"Lcom/discord/reactevents/ReactEvent;", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "react_events_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public interface ReactEvent {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public static final class DefaultImpls {
        public static WritableMap serialize(ReactEvent reactEvent) {
            return NativeMapExtensionsKt.toNativeMap(AbstractC6480a.f18197b.m22638e(C14285j.m255d(reactEvent.getClass()), reactEvent));
        }
    }

    WritableMap serialize();
}