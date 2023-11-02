package fi;

import gi.InterfaceC6821n;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import p325rg.InterfaceC12149c;

/* renamed from: fi.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6479n extends C6426a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6479n(InterfaceC6821n storageManager, Function0<? extends List<? extends InterfaceC12149c>> compute) {
        super(storageManager, compute);
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(compute, "compute");
    }

    @Override // fi.C6426a, p325rg.InterfaceC12155g
    public boolean isEmpty() {
        return false;
    }
}