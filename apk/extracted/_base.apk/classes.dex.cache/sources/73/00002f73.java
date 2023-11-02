package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.C11504d;
import pe.C11519m;
import pe.InterfaceC11508e;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u001a\u0010\u000e\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J \u0010\u0012\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J \u0010\u0013\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J \u0010\u0014\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\u0006\u0010\u0015\u001a\u00020\nR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017¨\u0006\u001c"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/f;", "Lpe/e;", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "key", "", "f", "", "handlerTag", "", "g", "Lpe/d;", "handler", "e", "otherHandler", "", "d", "c", "b", "a", "h", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "waitForRelations", "simultaneousRelations", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.gesturehandler.react.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5556f implements InterfaceC11508e {

    /* renamed from: c */
    public static final C5557a f15569c = new C5557a(null);

    /* renamed from: a */
    private final SparseArray<int[]> f15570a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<int[]> f15571b = new SparseArray<>();

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/f$a;", "", "", "KEY_SIMULTANEOUS_HANDLERS", "Ljava/lang/String;", "KEY_WAIT_FOR", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5557a {
        private C5557a() {
        }

        public /* synthetic */ C5557a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    private final int[] m25024f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        C9612q.m13920e(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    @Override // pe.InterfaceC11508e
    /* renamed from: a */
    public boolean mo7876a(C11504d<?> handler, C11504d<?> otherHandler) {
        boolean z;
        C9612q.m13917h(handler, "handler");
        C9612q.m13917h(otherHandler, "otherHandler");
        int[] iArr = this.f15571b.get(handler.m7942P());
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i == otherHandler.m7942P()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // pe.InterfaceC11508e
    /* renamed from: b */
    public boolean mo7875b(C11504d<?> handler, C11504d<?> otherHandler) {
        C9612q.m13917h(handler, "handler");
        C9612q.m13917h(otherHandler, "otherHandler");
        if (otherHandler instanceof C11519m) {
            return ((C11519m) otherHandler).m7816K0();
        }
        return false;
    }

    @Override // pe.InterfaceC11508e
    /* renamed from: c */
    public boolean mo7874c(C11504d<?> handler, C11504d<?> otherHandler) {
        C9612q.m13917h(handler, "handler");
        C9612q.m13917h(otherHandler, "otherHandler");
        return false;
    }

    @Override // pe.InterfaceC11508e
    /* renamed from: d */
    public boolean mo7873d(C11504d<?> handler, C11504d<?> otherHandler) {
        boolean z;
        C9612q.m13917h(handler, "handler");
        C9612q.m13917h(otherHandler, "otherHandler");
        int[] iArr = this.f15570a.get(handler.m7942P());
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i == otherHandler.m7942P()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void m25025e(C11504d<?> handler, ReadableMap config) {
        C9612q.m13917h(handler, "handler");
        C9612q.m13917h(config, "config");
        handler.m7900u0(this);
        if (config.hasKey("waitFor")) {
            this.f15570a.put(handler.m7942P(), m25024f(config, "waitFor"));
        }
        if (config.hasKey("simultaneousHandlers")) {
            this.f15571b.put(handler.m7942P(), m25024f(config, "simultaneousHandlers"));
        }
    }

    /* renamed from: g */
    public final void m25023g(int i) {
        this.f15570a.remove(i);
        this.f15571b.remove(i);
    }

    /* renamed from: h */
    public final void m25022h() {
        this.f15570a.clear();
        this.f15571b.clear();
    }
}