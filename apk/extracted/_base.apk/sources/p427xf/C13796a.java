package p427xf;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import wf.C13535a;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\r"}, m14357d2 = {"Lxf/a;", "Lwf/a;", "", "version", "", "c", "", "cause", "exception", "", "a", "<init>", "()V", "kotlin-stdlib-jdk7"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: xf.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13796a extends C13535a {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m14357d2 = {"Lxf/a$a;", "", "", "b", "Ljava/lang/Integer;", "sdkVersion", "<init>", "()V", "kotlin-stdlib-jdk7"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: xf.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13797a {

        /* renamed from: a */
        public static final C13797a f35566a = new C13797a();

        /* renamed from: b */
        public static final Integer f35567b;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        static {
            /*
                xf.a$a r0 = new xf.a$a
                r0.<init>()
                p427xf.C13796a.C13797a.f35566a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                p427xf.C13796a.C13797a.f35567b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p427xf.C13796a.C13797a.<clinit>():void");
        }

        private C13797a() {
        }
    }

    /* renamed from: c */
    private final boolean m1519c(int i) {
        Integer num = C13797a.f35567b;
        return num == null || num.intValue() >= i;
    }

    @Override // wf.C13535a
    /* renamed from: a */
    public void mo1520a(Throwable cause, Throwable exception) {
        C9612q.m13917h(cause, "cause");
        C9612q.m13917h(exception, "exception");
        if (m1519c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.mo1520a(cause, exception);
        }
    }
}
