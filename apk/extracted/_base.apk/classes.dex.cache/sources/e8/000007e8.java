package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1785b implements InterfaceC1803h {

    /* renamed from: a */
    final InterfaceC1803h f4885a;

    /* renamed from: b */
    int f4886b = 0;

    /* renamed from: c */
    int f4887c = -1;

    /* renamed from: d */
    int f4888d = -1;

    /* renamed from: e */
    Object f4889e = null;

    public C1785b(InterfaceC1803h interfaceC1803h) {
        this.f4885a = interfaceC1803h;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1803h
    /* renamed from: a */
    public void mo35381a(int i, int i2) {
        int i3;
        if (this.f4886b == 1 && i >= (i3 = this.f4887c)) {
            int i4 = this.f4888d;
            if (i <= i3 + i4) {
                this.f4888d = i4 + i2;
                this.f4887c = Math.min(i, i3);
                return;
            }
        }
        m35429e();
        this.f4887c = i;
        this.f4888d = i2;
        this.f4886b = 1;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1803h
    /* renamed from: b */
    public void mo35380b(int i, int i2) {
        int i3;
        if (this.f4886b == 2 && (i3 = this.f4887c) >= i && i3 <= i + i2) {
            this.f4888d += i2;
            this.f4887c = i;
            return;
        }
        m35429e();
        this.f4887c = i;
        this.f4888d = i2;
        this.f4886b = 2;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1803h
    /* renamed from: c */
    public void mo35379c(int i, int i2, Object obj) {
        int i3;
        if (this.f4886b == 3) {
            int i4 = this.f4887c;
            int i5 = this.f4888d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f4889e == obj) {
                this.f4887c = Math.min(i, i4);
                this.f4888d = Math.max(i5 + i4, i3) - this.f4887c;
                return;
            }
        }
        m35429e();
        this.f4887c = i;
        this.f4888d = i2;
        this.f4889e = obj;
        this.f4886b = 3;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1803h
    /* renamed from: d */
    public void mo35378d(int i, int i2) {
        m35429e();
        this.f4885a.mo35378d(i, i2);
    }

    /* renamed from: e */
    public void m35429e() {
        int i = this.f4886b;
        if (i == 0) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f4885a.mo35379c(this.f4887c, this.f4888d, this.f4889e);
                }
            } else {
                this.f4885a.mo35380b(this.f4887c, this.f4888d);
            }
        } else {
            this.f4885a.mo35381a(this.f4887c, this.f4888d);
        }
        this.f4889e = null;
        this.f4886b = 0;
    }
}