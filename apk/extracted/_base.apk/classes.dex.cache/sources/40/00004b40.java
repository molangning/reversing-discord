package p314r4;

import com.facebook.common.references.CloseableReference;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import p004a3.C0017d;
import p004a3.InterfaceC0016c;
import p334s4.InterfaceC12396a;
import p414x2.C13677a;

/* renamed from: r4.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12048a {

    /* renamed from: a */
    private final CloseableReference.InterfaceC3564c f31134a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C12049a implements CloseableReference.InterfaceC3564c {

        /* renamed from: a */
        final /* synthetic */ InterfaceC12396a f31135a;

        C12049a(InterfaceC12396a interfaceC12396a) {
            C12048a.this = r1;
            this.f31135a = interfaceC12396a;
        }

        @Override // com.facebook.common.references.CloseableReference.InterfaceC3564c
        /* renamed from: a */
        public void mo6464a(C0017d<Object> c0017d, Throwable th2) {
            String str;
            this.f31135a.mo5411b(c0017d, th2);
            Object m41392f = c0017d.m41392f();
            if (m41392f != null) {
                str = m41392f.getClass().getName();
            } else {
                str = "<value is null>";
            }
            C13677a.m1868J("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(c0017d)), str, C12048a.m6465d(th2));
        }

        @Override // com.facebook.common.references.CloseableReference.InterfaceC3564c
        /* renamed from: b */
        public boolean mo6463b() {
            return this.f31135a.mo5412a();
        }
    }

    public C12048a(InterfaceC12396a interfaceC12396a) {
        this.f31134a = new C12049a(interfaceC12396a);
    }

    /* renamed from: d */
    public static String m6465d(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public <U extends Closeable> CloseableReference<U> m6467b(U u) {
        return CloseableReference.m31725S(u, this.f31134a);
    }

    /* renamed from: c */
    public <T> CloseableReference<T> m6466c(T t, InterfaceC0016c<T> interfaceC0016c) {
        return CloseableReference.m31723V(t, interfaceC0016c, this.f31134a);
    }
}