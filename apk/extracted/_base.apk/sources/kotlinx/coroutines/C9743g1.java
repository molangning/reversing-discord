package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lkotlinx/coroutines/g1;", "Lkotlinx/coroutines/s1;", "", "toString", "", "j", "Z", "a", "()Z", "isActive", "Lkotlinx/coroutines/j2;", "d", "()Lkotlinx/coroutines/j2;", "list", "<init>", "(Z)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.g1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9743g1 implements InterfaceC9852s1 {

    /* renamed from: j */
    private final boolean f25540j;

    public C9743g1(boolean z) {
        this.f25540j = z;
    }

    @Override // kotlinx.coroutines.InterfaceC9852s1
    /* renamed from: a */
    public boolean mo13099a() {
        return this.f25540j;
    }

    @Override // kotlinx.coroutines.InterfaceC9852s1
    /* renamed from: d */
    public C9813j2 mo13098d() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(mo13099a() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
