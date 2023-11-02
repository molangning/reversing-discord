package p366u9;

import java.util.NoSuchElementException;

/* renamed from: u9.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12933u extends AbstractC12896b0 {

    /* renamed from: j */
    private boolean f33638j;

    /* renamed from: k */
    private final /* synthetic */ Object f33639k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12933u(Object obj) {
        this.f33639k = obj;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final boolean hasNext() {
        return !this.f33638j;
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final Object next() {
        if (!this.f33638j) {
            this.f33638j = true;
            return this.f33639k;
        }
        throw new NoSuchElementException();
    }
}
