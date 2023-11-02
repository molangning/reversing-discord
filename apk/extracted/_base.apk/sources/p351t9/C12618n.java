package p351t9;

/* renamed from: t9.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12618n extends AbstractC12621q {

    /* renamed from: q */
    final /* synthetic */ C12619o f32707q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12618n(C12619o c12619o, C12622r c12622r, CharSequence charSequence) {
        super(c12622r, charSequence);
        this.f32707q = c12619o;
    }

    @Override // p351t9.AbstractC12621q
    /* renamed from: d */
    final int mo4711d(int i) {
        return i + 1;
    }

    @Override // p351t9.AbstractC12621q
    /* renamed from: e */
    final int mo4710e(int i) {
        AbstractC12615k abstractC12615k = this.f32707q.f32708a;
        CharSequence charSequence = this.f32711l;
        int length = charSequence.length();
        C12617m.m4714a(i, length, "index");
        while (i < length) {
            if (!abstractC12615k.mo4717a(charSequence.charAt(i))) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}
