package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pe.C11504d;
import pe.InterfaceC11513h;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u0014\u0010\b\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004J\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0002J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0006J\u001a\u0010\u0012\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R$\u0010\u001b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00110\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u001e"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/h;", "Lpe/h;", "", "viewTag", "Lpe/d;", "handler", "", "k", "d", "j", "handlerTag", "h", "actionType", "", "c", "g", "f", "Ljava/util/ArrayList;", "i", "Landroid/view/View;", "view", "a", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "handlers", "b", "attachedTo", "handlersForView", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.gesturehandler.react.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5559h implements InterfaceC11513h {

    /* renamed from: a */
    private final SparseArray<C11504d<?>> f15573a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<Integer> f15574b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<ArrayList<C11504d<?>>> f15575c = new SparseArray<>();

    /* renamed from: d */
    private final synchronized void m25019d(final C11504d<?> c11504d) {
        Integer num = this.f15574b.get(c11504d.m7942P());
        if (num != null) {
            this.f15574b.remove(c11504d.m7942P());
            ArrayList<C11504d<?>> arrayList = this.f15575c.get(num.intValue());
            if (arrayList != null) {
                synchronized (arrayList) {
                    arrayList.remove(c11504d);
                }
                if (arrayList.size() == 0) {
                    this.f15575c.remove(num.intValue());
                }
            }
        }
        if (c11504d.m7939S() != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.g
                @Override // java.lang.Runnable
                public final void run() {
                    C5559h.m25018e(C11504d.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m25018e(C11504d handler) {
        C9612q.m13917h(handler, "$handler");
        handler.m7911o();
    }

    /* renamed from: k */
    private final synchronized void m25012k(int i, C11504d<?> c11504d) {
        boolean z;
        if (this.f15574b.get(c11504d.m7942P()) == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f15574b.put(c11504d.m7942P(), Integer.valueOf(i));
            ArrayList<C11504d<?>> arrayList = this.f15575c.get(i);
            if (arrayList == null) {
                ArrayList<C11504d<?>> arrayList2 = new ArrayList<>(1);
                arrayList2.add(c11504d);
                this.f15575c.put(i, arrayList2);
            } else {
                synchronized (arrayList) {
                    arrayList.add(c11504d);
                }
            }
        } else {
            throw new IllegalStateException(("Handler " + c11504d + " already attached").toString());
        }
    }

    @Override // pe.InterfaceC11513h
    /* renamed from: a */
    public synchronized ArrayList<C11504d<?>> mo7829a(View view) {
        C9612q.m13917h(view, "view");
        return m25014i(view.getId());
    }

    /* renamed from: c */
    public final synchronized boolean m25020c(int i, int i2, int i3) {
        boolean z;
        C11504d<?> c11504d = this.f15573a.get(i);
        if (c11504d != null) {
            m25019d(c11504d);
            c11504d.m7912n0(i3);
            m25012k(i2, c11504d);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public final synchronized void m25017f() {
        this.f15573a.clear();
        this.f15574b.clear();
        this.f15575c.clear();
    }

    /* renamed from: g */
    public final synchronized void m25016g(int i) {
        C11504d<?> c11504d = this.f15573a.get(i);
        if (c11504d != null) {
            m25019d(c11504d);
            this.f15573a.remove(i);
        }
    }

    /* renamed from: h */
    public final synchronized C11504d<?> m25015h(int i) {
        return this.f15573a.get(i);
    }

    /* renamed from: i */
    public final synchronized ArrayList<C11504d<?>> m25014i(int i) {
        return this.f15575c.get(i);
    }

    /* renamed from: j */
    public final synchronized void m25013j(C11504d<?> handler) {
        C9612q.m13917h(handler, "handler");
        this.f15573a.put(handler.m7942P(), handler);
    }
}
