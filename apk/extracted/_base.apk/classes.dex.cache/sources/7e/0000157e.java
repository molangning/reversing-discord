package com.discord.chat.reactevents;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapSeparatorData;", "Lcom/discord/reactevents/ReactEvent;", "type", "", "context", "(Ljava/lang/String;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapSeparatorData implements ReactEvent {
    private final String context;
    private final String type;

    public TapSeparatorData(String type, String str) {
        C9612q.m13917h(type, "type");
        this.type = type;
        this.context = str;
    }

    public static /* synthetic */ TapSeparatorData copy$default(TapSeparatorData tapSeparatorData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapSeparatorData.type;
        }
        if ((i & 2) != 0) {
            str2 = tapSeparatorData.context;
        }
        return tapSeparatorData.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.context;
    }

    public final TapSeparatorData copy(String type, String str) {
        C9612q.m13917h(type, "type");
        return new TapSeparatorData(type, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapSeparatorData) {
            TapSeparatorData tapSeparatorData = (TapSeparatorData) obj;
            return C9612q.m13922c(this.type, tapSeparatorData.type) && C9612q.m13922c(this.context, tapSeparatorData.context);
        }
        return false;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.context;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        WritableNativeMap nativeMapOf = NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("type", this.type));
        String str = this.context;
        if (str != null) {
            nativeMapOf.putString("context", str);
        }
        return nativeMapOf;
    }

    public String toString() {
        String str = this.type;
        String str2 = this.context;
        return "TapSeparatorData(type=" + str + ", context=" + str2 + ")";
    }

    public /* synthetic */ TapSeparatorData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}