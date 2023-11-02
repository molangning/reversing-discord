package wf;

import eg.AbstractC6221c;
import eg.C6219b;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m14357d2 = {"Lwf/a;", "", "", "cause", "exception", "", "a", "Leg/c;", "b", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: wf.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13535a {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, m14357d2 = {"Lwf/a$a;", "", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "addSuppressed", "c", "getSuppressed", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: wf.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13536a {

        /* renamed from: a */
        public static final C13536a f34903a = new C13536a();

        /* renamed from: b */
        public static final Method f34904b;

        /* renamed from: c */
        public static final Method f34905c;

        /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[LOOP:0: B:3:0x0015->B:13:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[EDGE_INSN: B:24:0x0043->B:15:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                wf.a$a r0 = new wf.a$a
                r0.<init>()
                wf.C13535a.C13536a.f34903a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.C9612q.m13918g(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.C9612q.m13922c(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.C9612q.m13918g(r7, r8)
                java.lang.Object r7 = kotlin.collections.C9533b.m14306i0(r7)
                boolean r7 = kotlin.jvm.internal.C9612q.m13922c(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = r3
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                wf.C13535a.C13536a.f34904b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.C9612q.m13922c(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                wf.C13535a.C13536a.f34905c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wf.C13535a.C13536a.<clinit>():void");
        }

        private C13536a() {
        }
    }

    /* renamed from: a */
    public void mo1520a(Throwable cause, Throwable exception) {
        C9612q.m13917h(cause, "cause");
        C9612q.m13917h(exception, "exception");
        Method method = C13536a.f34904b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    /* renamed from: b */
    public AbstractC6221c mo899b() {
        return new C6219b();
    }
}
