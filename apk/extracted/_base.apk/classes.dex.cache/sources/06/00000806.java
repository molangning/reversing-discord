package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1815o {

    /* renamed from: a */
    final InterfaceC1817b f4973a;

    /* renamed from: b */
    C1816a f4974b = new C1816a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1816a {

        /* renamed from: a */
        int f4975a = 0;

        /* renamed from: b */
        int f4976b;

        /* renamed from: c */
        int f4977c;

        /* renamed from: d */
        int f4978d;

        /* renamed from: e */
        int f4979e;

        C1816a() {
        }

        /* renamed from: a */
        void m35329a(int i) {
            this.f4975a = i | this.f4975a;
        }

        /* renamed from: b */
        boolean m35328b() {
            int i = this.f4975a;
            if ((i & 7) != 0 && (i & (m35327c(this.f4978d, this.f4976b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f4975a;
            if ((i2 & 112) != 0 && (i2 & (m35327c(this.f4978d, this.f4977c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4975a;
            if ((i3 & 1792) != 0 && (i3 & (m35327c(this.f4979e, this.f4976b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4975a;
            if ((i4 & 28672) != 0 && (i4 & (m35327c(this.f4979e, this.f4977c) << 12)) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        int m35327c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        void m35326d() {
            this.f4975a = 0;
        }

        /* renamed from: e */
        void m35325e(int i, int i2, int i3, int i4) {
            this.f4976b = i;
            this.f4977c = i2;
            this.f4978d = i3;
            this.f4979e = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1817b {
        /* renamed from: a */
        int mo35324a(View view);

        /* renamed from: b */
        int mo35323b();

        /* renamed from: c */
        int mo35322c();

        /* renamed from: d */
        int mo35321d(View view);

        View getChildAt(int i);
    }

    public C1815o(InterfaceC1817b interfaceC1817b) {
        this.f4973a = interfaceC1817b;
    }

    /* renamed from: a */
    public View m35331a(int i, int i2, int i3, int i4) {
        int i5;
        int mo35323b = this.f4973a.mo35323b();
        int mo35322c = this.f4973a.mo35322c();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View childAt = this.f4973a.getChildAt(i);
            this.f4974b.m35325e(mo35323b, mo35322c, this.f4973a.mo35324a(childAt), this.f4973a.mo35321d(childAt));
            if (i3 != 0) {
                this.f4974b.m35326d();
                this.f4974b.m35329a(i3);
                if (this.f4974b.m35328b()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                this.f4974b.m35326d();
                this.f4974b.m35329a(i4);
                if (this.f4974b.m35328b()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean m35330b(View view, int i) {
        this.f4974b.m35325e(this.f4973a.mo35323b(), this.f4973a.mo35322c(), this.f4973a.mo35324a(view), this.f4973a.mo35321d(view));
        if (i != 0) {
            this.f4974b.m35326d();
            this.f4974b.m35329a(i);
            return this.f4974b.m35328b();
        }
        return false;
    }
}