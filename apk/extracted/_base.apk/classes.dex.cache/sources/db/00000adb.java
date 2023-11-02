package cf;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: cf.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2523a extends RuntimeException {

    /* renamed from: j */
    private final List<Throwable> f6938j;

    /* renamed from: k */
    private final String f6939k;

    /* renamed from: l */
    private Throwable f6940l;

    /* renamed from: cf.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C2524a extends RuntimeException {
        C2524a() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: cf.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC2525b {
        AbstractC2525b() {
        }

        /* renamed from: a */
        abstract void mo33063a(Object obj);
    }

    /* renamed from: cf.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2526c extends AbstractC2525b {

        /* renamed from: a */
        private final PrintStream f6941a;

        C2526c(PrintStream printStream) {
            this.f6941a = printStream;
        }

        @Override // cf.C2523a.AbstractC2525b
        /* renamed from: a */
        void mo33063a(Object obj) {
            this.f6941a.println(obj);
        }
    }

    /* renamed from: cf.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C2527d extends AbstractC2525b {

        /* renamed from: a */
        private final PrintWriter f6942a;

        C2527d(PrintWriter printWriter) {
            this.f6942a = printWriter;
        }

        @Override // cf.C2523a.AbstractC2525b
        /* renamed from: a */
        void mo33063a(Object obj) {
            this.f6942a.println(obj);
        }
    }

    public C2523a(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: a */
    private void m33068a(StringBuilder sb2, Throwable th2, String str) {
        StackTraceElement[] stackTrace;
        sb2.append(str);
        sb2.append(th2);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            m33068a(sb2, th2.getCause(), "");
        }
    }

    /* renamed from: c */
    private List<Throwable> m33066c(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th2.getCause();
        if (cause != null && cause != th2) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private void m33064e(AbstractC2525b abstractC2525b) {
        StackTraceElement[] stackTrace;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i = 1;
        for (Throwable th2 : this.f6938j) {
            sb2.append("  ComposedException ");
            sb2.append(i);
            sb2.append(" :\n");
            m33068a(sb2, th2, "\t");
            i++;
        }
        abstractC2525b.mo33063a(sb2.toString());
    }

    /* renamed from: b */
    public List<Throwable> m33067b() {
        return this.f6938j;
    }

    /* renamed from: d */
    Throwable m33065d(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause != null && th2 != cause) {
            while (true) {
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
            return cause;
        }
        return th2;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.f6940l == null) {
            C2524a c2524a = new C2524a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f6938j.iterator();
            C2524a c2524a2 = c2524a;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th2 : m33066c(next)) {
                        if (hashSet.contains(th2)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th2);
                        }
                    }
                    try {
                        c2524a2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    c2524a2 = m33065d(c2524a2);
                }
            }
            this.f6940l = c2524a;
        }
        return this.f6940l;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f6939k;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m33064e(new C2526c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m33064e(new C2527d(printWriter));
    }

    public C2523a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th2 : iterable) {
                if (th2 instanceof C2523a) {
                    linkedHashSet.addAll(((C2523a) th2).m33067b());
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
            this.f6938j = unmodifiableList;
            this.f6939k = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}