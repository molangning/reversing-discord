package com.dooboolab.RNIap;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, m14357d2 = {"Lcom/dooboolab/RNIap/a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "code", "b", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "react-native-iap_playRelease"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.dooboolab.RNIap.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C3544a {

    /* renamed from: a */
    private final String f9640a;

    /* renamed from: b */
    private final String f9641b;

    public C3544a(String code, String message) {
        C9612q.m13917h(code, "code");
        C9612q.m13917h(message, "message");
        this.f9640a = code;
        this.f9641b = message;
    }

    /* renamed from: a */
    public final String m31786a() {
        return this.f9640a;
    }

    /* renamed from: b */
    public final String m31785b() {
        return this.f9641b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3544a) {
            C3544a c3544a = (C3544a) obj;
            return C9612q.m13922c(this.f9640a, c3544a.f9640a) && C9612q.m13922c(this.f9641b, c3544a.f9641b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f9640a.hashCode() * 31) + this.f9641b.hashCode();
    }

    public String toString() {
        return "BillingResponse(code=" + this.f9640a + ", message=" + this.f9641b + ')';
    }
}
