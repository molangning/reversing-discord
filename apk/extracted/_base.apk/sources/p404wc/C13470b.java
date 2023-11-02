package p404wc;

import lc.C10119a;

/* renamed from: wc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13470b extends AbstractC13474f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C13470b(C10119a c10119a) {
        super(c10119a);
    }

    @Override // p404wc.AbstractC13477i
    /* renamed from: h */
    protected void mo2417h(StringBuilder sb2, int i) {
        if (i < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // p404wc.AbstractC13477i
    /* renamed from: i */
    protected int mo2416i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
