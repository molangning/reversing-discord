package p447yf;

import eg.AbstractC6221c;
import kotlin.Metadata;
import p107fg.C6423a;
import p427xf.C13796a;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, m14357d2 = {"Lyf/a;", "Lxf/a;", "", "version", "", "c", "Leg/c;", "b", "<init>", "()V", "a", "kotlin-stdlib-jdk8"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: yf.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14017a extends C13796a {

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m14357d2 = {"Lyf/a$a;", "", "", "b", "Ljava/lang/Integer;", "sdkVersion", "<init>", "()V", "kotlin-stdlib-jdk8"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: yf.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14018a {

        /* renamed from: a */
        public static final C14018a f36013a = new C14018a();

        /* renamed from: b */
        public static final Integer f36014b;

        /* JADX WARN: Removed duplicated region for block: B:29:0x0022  */
        static {
            /*
                yf.a$a r0 = new yf.a$a
                r0.<init>()
                p447yf.C14017a.C14018a.f36013a = r0
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
                p447yf.C14017a.C14018a.f36014b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p447yf.C14017a.C14018a.<clinit>():void");
        }

        private C14018a() {
        }
    }

    /* renamed from: c */
    private final boolean m898c(int i) {
        Integer num = C14018a.f36014b;
        return num == null || num.intValue() >= i;
    }

    @Override // wf.C13535a
    /* renamed from: b */
    public AbstractC6221c mo899b() {
        return m898c(34) ? new C6423a() : super.mo899b();
    }
}