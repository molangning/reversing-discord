package p433y0;

/* renamed from: y0.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C13862g<TResult> {

    /* renamed from: a */
    private final C13857f<TResult> f35684a = new C13857f<>();

    /* renamed from: a */
    public C13857f<TResult> m1373a() {
        return this.f35684a;
    }

    /* renamed from: b */
    public void m1372b() {
        if (m1369e()) {
            return;
        }
        throw new IllegalStateException("Cannot cancel a completed task.");
    }

    /* renamed from: c */
    public void m1371c(Exception exc) {
        if (m1368f(exc)) {
            return;
        }
        throw new IllegalStateException("Cannot set the error on a completed task.");
    }

    /* renamed from: d */
    public void m1370d(TResult tresult) {
        if (m1367g(tresult)) {
            return;
        }
        throw new IllegalStateException("Cannot set the result of a completed task.");
    }

    /* renamed from: e */
    public boolean m1369e() {
        return this.f35684a.m1378p();
    }

    /* renamed from: f */
    public boolean m1368f(Exception exc) {
        return this.f35684a.m1377q(exc);
    }

    /* renamed from: g */
    public boolean m1367g(TResult tresult) {
        return this.f35684a.m1376r(tresult);
    }
}
