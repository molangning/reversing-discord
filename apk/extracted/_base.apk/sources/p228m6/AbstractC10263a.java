package p228m6;

/* renamed from: m6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC10263a {

    /* renamed from: j */
    private int f26729j;

    /* renamed from: e */
    public final void m11993e(int i) {
        this.f26729j = i | this.f26729j;
    }

    /* renamed from: f */
    public void mo3126f() {
        this.f26729j = 0;
    }

    /* renamed from: g */
    public final void m11992g(int i) {
        this.f26729j = (~i) & this.f26729j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean m11991h(int i) {
        return (this.f26729j & i) == i;
    }

    /* renamed from: i */
    public final boolean m11990i() {
        return m11991h(268435456);
    }

    /* renamed from: k */
    public final boolean m11989k() {
        return m11991h(Integer.MIN_VALUE);
    }

    /* renamed from: l */
    public final boolean m11988l() {
        return m11991h(4);
    }

    /* renamed from: m */
    public final boolean m11987m() {
        return m11991h(1);
    }

    /* renamed from: n */
    public final void m11986n(int i) {
        this.f26729j = i;
    }
}
