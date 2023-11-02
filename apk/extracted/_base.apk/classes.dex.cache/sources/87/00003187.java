package dj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11549b0;
import pf.C11555d0;
import pf.C11563g0;
import pf.C11593z;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m14357d2 = {"Ldj/q;", "Ldj/h;", "", "v", "", "h", "", "i", "", "d", "", "k", "", "c", "Z", "forceQuoting", "Ldj/k0;", "writer", "<init>", "(Ldj/k0;Z)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6011q extends C5988h {

    /* renamed from: c */
    private final boolean f17079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6011q(InterfaceC5997k0 writer, boolean z) {
        super(writer);
        C9612q.m13917h(writer, "writer");
        this.f17079c = z;
    }

    @Override // dj.C5988h
    /* renamed from: d */
    public void mo23893d(byte b) {
        boolean z = this.f17079c;
        String m7572e = C11593z.m7572e(C11593z.m7575b(b));
        if (z) {
            mo23939m(m7572e);
        } else {
            m23943j(m7572e);
        }
    }

    @Override // dj.C5988h
    /* renamed from: h */
    public void mo23892h(int i) {
        boolean z = this.f17079c;
        int m7686b = C11549b0.m7686b(i);
        if (z) {
            mo23939m(C5998l.m23918a(m7686b));
        } else {
            m23943j(C6000m.m23911a(m7686b));
        }
    }

    @Override // dj.C5988h
    /* renamed from: i */
    public void mo23891i(long j) {
        String m23898a;
        String m23896a;
        boolean z = this.f17079c;
        long m7661b = C11555d0.m7661b(j);
        if (z) {
            m23896a = C6009p.m23896a(m7661b, 10);
            mo23939m(m23896a);
            return;
        }
        m23898a = C6006o.m23898a(m7661b, 10);
        m23943j(m23898a);
    }

    @Override // dj.C5988h
    /* renamed from: k */
    public void mo23890k(short s) {
        boolean z = this.f17079c;
        String m7631e = C11563g0.m7631e(C11563g0.m7634b(s));
        if (z) {
            mo23939m(m7631e);
        } else {
            m23943j(m7631e);
        }
    }
}