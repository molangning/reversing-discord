package com.otaliastudios.zoom;

import android.util.Log;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0012\u001a\u00020\f2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\f2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0013J#\u0010\u0015\u001a\u00020\f2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0019"}, m14357d2 = {"Lcom/otaliastudios/zoom/ZoomLogger;", "", "", "messageLevel", "", "c", "", "ofData", "", "d", "(I[Ljava/lang/Object;)Ljava/lang/String;", "message", "", "e", "(Ljava/lang/String;)V", "a", "g", "data", "f", "([Ljava/lang/Object;)V", "b", "h", "Ljava/lang/String;", "mTag", "<init>", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ZoomLogger {

    /* renamed from: b */
    public static final C5364a f15197b = new C5364a(null);

    /* renamed from: c */
    private static int f15198c = 3;

    /* renamed from: d */
    private static String f15199d;

    /* renamed from: e */
    private static String f15200e;

    /* renamed from: a */
    private final String f15201a;

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, m14357d2 = {"Lcom/otaliastudios/zoom/ZoomLogger$a;", "", "", "tag", "Lcom/otaliastudios/zoom/ZoomLogger;", "a", "(Ljava/lang/String;)Lcom/otaliastudios/zoom/ZoomLogger;", "", "LEVEL_ERROR", "I", "LEVEL_INFO", "LEVEL_VERBOSE", "LEVEL_WARNING", "level", "<init>", "()V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomLogger$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5364a {
        private C5364a() {
        }

        public /* synthetic */ C5364a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ZoomLogger m25354a(String tag) {
            C9612q.m13917h(tag, "tag");
            return new ZoomLogger(tag, null);
        }
    }

    private ZoomLogger(String str) {
        this.f15201a = str;
    }

    public /* synthetic */ ZoomLogger(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: c */
    private final boolean m25360c(int i) {
        return f15198c <= i;
    }

    /* renamed from: d */
    private final String m25359d(int i, Object... objArr) {
        String m14217c0;
        if (m25360c(i)) {
            m14217c0 = C9538f.m14217c0(objArr, " ", null, null, 0, null, null, 62, null);
            return m14217c0;
        }
        return "";
    }

    /* renamed from: a */
    public final void m25362a(String message) {
        C9612q.m13917h(message, "message");
        if (m25360c(1)) {
            Log.i(this.f15201a, message);
            f15199d = message;
            f15200e = this.f15201a;
        }
    }

    /* renamed from: b */
    public final void m25361b(Object... data) {
        C9612q.m13917h(data, "data");
        m25362a(m25359d(1, Arrays.copyOf(data, data.length)));
    }

    /* renamed from: e */
    public final void m25358e(String message) {
        C9612q.m13917h(message, "message");
        if (m25360c(0)) {
            Log.v(this.f15201a, message);
            f15199d = message;
            f15200e = this.f15201a;
        }
    }

    /* renamed from: f */
    public final void m25357f(Object... data) {
        C9612q.m13917h(data, "data");
        m25358e(m25359d(0, Arrays.copyOf(data, data.length)));
    }

    /* renamed from: g */
    public final void m25356g(String message) {
        C9612q.m13917h(message, "message");
        if (m25360c(2)) {
            Log.w(this.f15201a, message);
            f15199d = message;
            f15200e = this.f15201a;
        }
    }

    /* renamed from: h */
    public final void m25355h(Object... data) {
        C9612q.m13917h(data, "data");
        m25356g(m25359d(2, Arrays.copyOf(data, data.length)));
    }
}