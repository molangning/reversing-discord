package p136hc;

/* renamed from: hc.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC7067m extends Exception {

    /* renamed from: j */
    protected static final boolean f19350j;

    /* renamed from: k */
    protected static final StackTraceElement[] f19351k;

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        f19350j = z;
        f19351k = new StackTraceElement[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC7067m() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC7067m(Throwable th2) {
        super(th2);
    }
}
