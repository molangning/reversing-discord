package p229m7;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p229m7.InterfaceC10341s;
import p229m7.InterfaceC10353z;
import p259o6.InterfaceC11045v;

/* renamed from: m7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC10277a implements InterfaceC10341s {

    /* renamed from: j */
    private final ArrayList<InterfaceC10341s.InterfaceC10343b> f26767j = new ArrayList<>(1);

    /* renamed from: k */
    private final HashSet<InterfaceC10341s.InterfaceC10343b> f26768k = new HashSet<>(1);

    /* renamed from: l */
    private final InterfaceC10353z.C10354a f26769l = new InterfaceC10353z.C10354a();

    /* renamed from: m */
    private final InterfaceC11045v.C11046a f26770m = new InterfaceC11045v.C11046a();

    /* renamed from: n */
    private Looper f26771n;

    /* renamed from: o */
    private Timeline f26772o;

    /* renamed from: A */
    protected abstract void mo11739A(InterfaceC7472x interfaceC7472x);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final void m11958B(Timeline timeline) {
        this.f26772o = timeline;
        Iterator<InterfaceC10341s.InterfaceC10343b> it = this.f26767j.iterator();
        while (it.hasNext()) {
            it.next().mo11722a(this, timeline);
        }
    }

    /* renamed from: C */
    protected abstract void mo11738C();

    @Override // p229m7.InterfaceC10341s
    /* renamed from: a */
    public final void mo11736a(InterfaceC10341s.InterfaceC10343b interfaceC10343b) {
        this.f26767j.remove(interfaceC10343b);
        if (this.f26767j.isEmpty()) {
            this.f26771n = null;
            this.f26772o = null;
            this.f26768k.clear();
            mo11738C();
            return;
        }
        mo11724r(interfaceC10343b);
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: b */
    public final void mo11735b(Handler handler, InterfaceC10353z interfaceC10353z) {
        C9149a.m16448e(handler);
        C9149a.m16448e(interfaceC10353z);
        this.f26769l.m11699g(handler, interfaceC10353z);
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: c */
    public final void mo11734c(InterfaceC10341s.InterfaceC10343b interfaceC10343b) {
        C9149a.m16448e(this.f26771n);
        boolean isEmpty = this.f26768k.isEmpty();
        this.f26768k.add(interfaceC10343b);
        if (isEmpty) {
            mo11925y();
        }
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: d */
    public final void mo11733d(InterfaceC10353z interfaceC10353z) {
        this.f26769l.m11709C(interfaceC10353z);
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: i */
    public final void mo11730i(InterfaceC10341s.InterfaceC10343b interfaceC10343b, InterfaceC7472x interfaceC7472x) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f26771n;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        C9149a.m16452a(z);
        Timeline timeline = this.f26772o;
        this.f26767j.add(interfaceC10343b);
        if (this.f26771n == null) {
            this.f26771n = myLooper;
            this.f26768k.add(interfaceC10343b);
            mo11739A(interfaceC7472x);
        } else if (timeline != null) {
            mo11734c(interfaceC10343b);
            interfaceC10343b.mo11722a(this, timeline);
        }
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: l */
    public final void mo11729l(Handler handler, InterfaceC11045v interfaceC11045v) {
        C9149a.m16448e(handler);
        C9149a.m16448e(interfaceC11045v);
        this.f26770m.m9283g(handler, interfaceC11045v);
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: n */
    public /* synthetic */ boolean mo11727n() {
        return C10337r.m11740b(this);
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: p */
    public /* synthetic */ Timeline mo11726p() {
        return C10337r.m11741a(this);
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: r */
    public final void mo11724r(InterfaceC10341s.InterfaceC10343b interfaceC10343b) {
        boolean z = !this.f26768k.isEmpty();
        this.f26768k.remove(interfaceC10343b);
        if (z && this.f26768k.isEmpty()) {
            mo11926x();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final InterfaceC11045v.C11046a m11957s(int i, InterfaceC10341s.C10342a c10342a) {
        return this.f26770m.m9270t(i, c10342a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final InterfaceC11045v.C11046a m11956t(InterfaceC10341s.C10342a c10342a) {
        return this.f26770m.m9270t(0, c10342a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final InterfaceC10353z.C10354a m11955u(int i, InterfaceC10341s.C10342a c10342a, long j) {
        return this.f26769l.m11706F(i, c10342a, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final InterfaceC10353z.C10354a m11954v(InterfaceC10341s.C10342a c10342a) {
        return this.f26769l.m11706F(0, c10342a, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final InterfaceC10353z.C10354a m11953w(InterfaceC10341s.C10342a c10342a, long j) {
        C9149a.m16448e(c10342a);
        return this.f26769l.m11706F(0, c10342a, j);
    }

    /* renamed from: x */
    protected void mo11926x() {
    }

    /* renamed from: y */
    protected void mo11925y() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean m11952z() {
        return !this.f26768k.isEmpty();
    }
}
