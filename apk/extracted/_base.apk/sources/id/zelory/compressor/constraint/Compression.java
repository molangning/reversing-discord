package id.zelory.compressor.constraint;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p426xe.InterfaceC13793a;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m14357d2 = {"Lid/zelory/compressor/constraint/Compression;", "", "Lxe/a;", "constraint", "", "a", "", "Ljava/util/List;", "b", "()Ljava/util/List;", "constraints", "<init>", "()V", "compressor_release"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class Compression {

    /* renamed from: a */
    private final List<InterfaceC13793a> f20726a = new ArrayList();

    /* renamed from: a */
    public final void m20558a(InterfaceC13793a constraint) {
        C9612q.m13916i(constraint, "constraint");
        this.f20726a.add(constraint);
    }

    /* renamed from: b */
    public final List<InterfaceC13793a> m20557b() {
        return this.f20726a;
    }
}
