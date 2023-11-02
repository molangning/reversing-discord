package p351t9;

import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t9.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12621q extends AbstractC12610f<String> {

    /* renamed from: l */
    final CharSequence f32711l;

    /* renamed from: m */
    final AbstractC12615k f32712m;

    /* renamed from: n */
    final boolean f32713n;

    /* renamed from: o */
    int f32714o = 0;

    /* renamed from: p */
    int f32715p;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12621q(C12622r c12622r, CharSequence charSequence) {
        AbstractC12615k abstractC12615k;
        boolean z;
        abstractC12615k = c12622r.f32716a;
        this.f32712m = abstractC12615k;
        z = c12622r.f32717b;
        this.f32713n = z;
        this.f32715p = ViewDefaults.NUMBER_OF_LINES;
        this.f32711l = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        r3 = r5.f32715p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r3 != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r1 = r5.f32711l.length();
        r5.f32714o = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r1 <= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r5.f32711l.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r5.f32715p = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return r5.f32711l.subSequence(r0, r1).toString();
     */
    @Override // p351t9.AbstractC12610f
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* bridge */ /* synthetic */ java.lang.String mo4712a() {
        /*
            r5 = this;
            int r0 = r5.f32714o
        L2:
            int r1 = r5.f32714o
            r2 = -1
            if (r1 == r2) goto L6c
            int r1 = r5.mo4710e(r1)
            if (r1 != r2) goto L17
            java.lang.CharSequence r1 = r5.f32711l
            int r1 = r1.length()
            r5.f32714o = r2
            r3 = r2
            goto L1d
        L17:
            int r3 = r5.mo4711d(r1)
            r5.f32714o = r3
        L1d:
            if (r3 != r0) goto L2e
            int r3 = r3 + 1
            r5.f32714o = r3
            java.lang.CharSequence r1 = r5.f32711l
            int r1 = r1.length()
            if (r3 <= r1) goto L2
            r5.f32714o = r2
            goto L2
        L2e:
            if (r0 >= r1) goto L35
            java.lang.CharSequence r3 = r5.f32711l
            r3.charAt(r0)
        L35:
            if (r0 >= r1) goto L3e
            java.lang.CharSequence r3 = r5.f32711l
            int r4 = r1 + (-1)
            r3.charAt(r4)
        L3e:
            boolean r3 = r5.f32713n
            if (r3 == 0) goto L47
            if (r0 != r1) goto L47
            int r0 = r5.f32714o
            goto L2
        L47:
            int r3 = r5.f32715p
            r4 = 1
            if (r3 != r4) goto L5e
            java.lang.CharSequence r1 = r5.f32711l
            int r1 = r1.length()
            r5.f32714o = r2
            if (r1 <= r0) goto L61
            java.lang.CharSequence r2 = r5.f32711l
            int r3 = r1 + (-1)
            r2.charAt(r3)
            goto L61
        L5e:
            int r3 = r3 + r2
            r5.f32715p = r3
        L61:
            java.lang.CharSequence r2 = r5.f32711l
            java.lang.CharSequence r0 = r2.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            goto L70
        L6c:
            r5.m4718b()
            r0 = 0
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p351t9.AbstractC12621q.mo4712a():java.lang.Object");
    }

    /* renamed from: d */
    abstract int mo4711d(int i);

    /* renamed from: e */
    abstract int mo4710e(int i);
}
