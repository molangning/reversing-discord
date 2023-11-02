package p205l0;

import android.content.Context;
import androidx.core.util.C1133b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: l0.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C9994b<D> {

    /* renamed from: a */
    int f25923a;

    /* renamed from: b */
    InterfaceC9995a<D> f25924b;

    /* renamed from: c */
    Context f25925c;

    /* renamed from: d */
    boolean f25926d = false;

    /* renamed from: e */
    boolean f25927e = false;

    /* renamed from: f */
    boolean f25928f = true;

    /* renamed from: g */
    boolean f25929g = false;

    /* renamed from: h */
    boolean f25930h = false;

    /* renamed from: l0.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC9995a<D> {
        /* renamed from: a */
        void mo12637a(C9994b<D> c9994b, D d);
    }

    public C9994b(Context context) {
        this.f25925c = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m12658a() {
        this.f25927e = true;
        m12649j();
    }

    /* renamed from: b */
    public boolean m12657b() {
        return mo12648k();
    }

    /* renamed from: c */
    public void m12656c() {
        this.f25930h = false;
    }

    /* renamed from: d */
    public String m12655d(D d) {
        StringBuilder sb2 = new StringBuilder(64);
        C1133b.m37836a(d, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: e */
    public void m12654e() {
    }

    /* renamed from: f */
    public void m12653f(D d) {
        InterfaceC9995a<D> interfaceC9995a = this.f25924b;
        if (interfaceC9995a != null) {
            interfaceC9995a.mo12637a(this, d);
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo12652g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f25923a);
        printWriter.print(" mListener=");
        printWriter.println(this.f25924b);
        if (this.f25926d || this.f25929g || this.f25930h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f25926d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f25929g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f25930h);
        }
        if (this.f25927e || this.f25928f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f25927e);
            printWriter.print(" mReset=");
            printWriter.println(this.f25928f);
        }
    }

    /* renamed from: h */
    public void m12651h() {
        mo12646m();
    }

    /* renamed from: i */
    public boolean m12650i() {
        return this.f25927e;
    }

    /* renamed from: j */
    protected void m12649j() {
    }

    /* renamed from: k */
    protected boolean mo12648k() {
        throw null;
    }

    /* renamed from: l */
    public void m12647l() {
        if (this.f25926d) {
            m12651h();
        } else {
            this.f25929g = true;
        }
    }

    /* renamed from: m */
    public void mo12646m() {
    }

    /* renamed from: n */
    protected void m12645n() {
    }

    /* renamed from: o */
    protected void mo3091o() {
        throw null;
    }

    /* renamed from: p */
    protected void m12644p() {
    }

    /* renamed from: q */
    public void m12643q(int i, InterfaceC9995a<D> interfaceC9995a) {
        if (this.f25924b == null) {
            this.f25924b = interfaceC9995a;
            this.f25923a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: r */
    public void m12642r() {
        m12645n();
        this.f25928f = true;
        this.f25926d = false;
        this.f25927e = false;
        this.f25929g = false;
        this.f25930h = false;
    }

    /* renamed from: s */
    public void m12641s() {
        if (this.f25930h) {
            m12647l();
        }
    }

    /* renamed from: t */
    public final void m12640t() {
        this.f25926d = true;
        this.f25928f = false;
        this.f25927e = false;
        mo3091o();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        C1133b.m37836a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f25923a);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    public void m12639u() {
        this.f25926d = false;
        m12644p();
    }

    /* renamed from: v */
    public void m12638v(InterfaceC9995a<D> interfaceC9995a) {
        InterfaceC9995a<D> interfaceC9995a2 = this.f25924b;
        if (interfaceC9995a2 != null) {
            if (interfaceC9995a2 == interfaceC9995a) {
                this.f25924b = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }
}