package p164j$.util.stream;

import p164j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8715q1 extends AbstractC8720r1 {

    /* renamed from: h */
    private final Object[] f22922h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8715q1(Spliterator spliterator, AbstractC8744w0 abstractC8744w0, Object[] objArr) {
        super(objArr.length, spliterator, abstractC8744w0);
        this.f22922h = objArr;
    }

    C8715q1(C8715q1 c8715q1, Spliterator spliterator, long j, long j2) {
        super(c8715q1, spliterator, j, j2, c8715q1.f22922h.length);
        this.f22922h = c8715q1.f22922h;
    }

    @Override // p164j$.util.stream.AbstractC8720r1
    /* renamed from: a */
    final AbstractC8720r1 mo17404a(Spliterator spliterator, long j, long j2) {
        return new C8715q1(this, spliterator, j, j2);
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f22931f;
        if (i >= this.f22932g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f22931f));
        }
        Object[] objArr = this.f22922h;
        this.f22931f = i + 1;
        objArr[i] = obj;
    }
}
