package io.sentry.internal.gestures;

import io.sentry.util.C8229o;
import java.lang.ref.WeakReference;

/* renamed from: io.sentry.internal.gestures.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7981b {

    /* renamed from: a */
    final WeakReference<Object> f21651a;

    /* renamed from: b */
    final String f21652b;

    /* renamed from: c */
    final String f21653c;

    /* renamed from: d */
    final String f21654d;

    /* renamed from: e */
    final String f21655e;

    /* renamed from: io.sentry.internal.gestures.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC7982a {
        CLICKABLE,
        SCROLLABLE
    }

    public C7981b(Object obj, String str, String str2, String str3, String str4) {
        this.f21651a = new WeakReference<>(obj);
        this.f21652b = str;
        this.f21653c = str2;
        this.f21654d = str3;
        this.f21655e = str4;
    }

    /* renamed from: a */
    public String m19106a() {
        return this.f21652b;
    }

    /* renamed from: b */
    public String m19105b() {
        String str = this.f21653c;
        if (str != null) {
            return str;
        }
        return (String) C8229o.m18169c(this.f21654d, "UiElement.tag can't be null");
    }

    /* renamed from: c */
    public String m19104c() {
        return this.f21655e;
    }

    /* renamed from: d */
    public String m19103d() {
        return this.f21653c;
    }

    /* renamed from: e */
    public String m19102e() {
        return this.f21654d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7981b.class != obj.getClass()) {
            return false;
        }
        C7981b c7981b = (C7981b) obj;
        if (C8229o.m18171a(this.f21652b, c7981b.f21652b) && C8229o.m18171a(this.f21653c, c7981b.f21653c) && C8229o.m18171a(this.f21654d, c7981b.f21654d)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Object m19101f() {
        return this.f21651a.get();
    }

    public int hashCode() {
        return C8229o.m18170b(this.f21651a, this.f21653c, this.f21654d);
    }
}