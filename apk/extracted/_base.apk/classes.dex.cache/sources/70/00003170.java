package dj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0016R\u0014\u0010\u001f\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010%\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00188\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010!\u001a\u0004\b\u001d\u0010\"\"\u0004\b#\u0010$¨\u0006("}, m14357d2 = {"Ldj/h;", "", "", "b", "p", "c", "o", "", "v", "e", "", "j", "", "g", "", "f", "", "d", "", "k", "", "h", "", "i", "", "l", "value", "m", "Ldj/k0;", "a", "Ldj/k0;", "writer", "<set-?>", "Z", "()Z", "n", "(Z)V", "writingFirst", "<init>", "(Ldj/k0;)V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C5988h {

    /* renamed from: a */
    public final InterfaceC5997k0 f17034a;

    /* renamed from: b */
    private boolean f17035b;

    public C5988h(InterfaceC5997k0 writer) {
        C9612q.m13917h(writer, "writer");
        this.f17034a = writer;
        this.f17035b = true;
    }

    /* renamed from: a */
    public final boolean m23947a() {
        return this.f17035b;
    }

    /* renamed from: b */
    public void mo23879b() {
        this.f17035b = true;
    }

    /* renamed from: c */
    public void mo23878c() {
        this.f17035b = false;
    }

    /* renamed from: d */
    public void mo23893d(byte b) {
        this.f17034a.writeLong(b);
    }

    /* renamed from: e */
    public final void m23946e(char c) {
        this.f17034a.mo23921a(c);
    }

    /* renamed from: f */
    public void m23945f(double d) {
        this.f17034a.mo23919c(String.valueOf(d));
    }

    /* renamed from: g */
    public void m23944g(float f) {
        this.f17034a.mo23919c(String.valueOf(f));
    }

    /* renamed from: h */
    public void mo23892h(int i) {
        this.f17034a.writeLong(i);
    }

    /* renamed from: i */
    public void mo23891i(long j) {
        this.f17034a.writeLong(j);
    }

    /* renamed from: j */
    public final void m23943j(String v) {
        C9612q.m13917h(v, "v");
        this.f17034a.mo23919c(v);
    }

    /* renamed from: k */
    public void mo23890k(short s) {
        this.f17034a.writeLong(s);
    }

    /* renamed from: l */
    public void m23942l(boolean z) {
        this.f17034a.mo23919c(String.valueOf(z));
    }

    /* renamed from: m */
    public void mo23939m(String value) {
        C9612q.m13917h(value, "value");
        this.f17034a.mo23920b(value);
    }

    /* renamed from: n */
    public final void m23941n(boolean z) {
        this.f17035b = z;
    }

    /* renamed from: o */
    public void mo23877o() {
    }

    /* renamed from: p */
    public void mo23876p() {
    }
}