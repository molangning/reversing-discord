package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C9768d0;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\"\u001a\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0016\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u0012\u0004\b\u0018\u0010\u0007¨\u0006\u001a"}, m14357d2 = {"", "locked", "Lkotlinx/coroutines/sync/b;", "a", "Lkotlinx/coroutines/internal/d0;", "Lkotlinx/coroutines/internal/d0;", "getLOCK_FAIL$annotations", "()V", "LOCK_FAIL", "b", "getUNLOCK_FAIL$annotations", "UNLOCK_FAIL", "c", "getLOCKED$annotations", "LOCKED", "d", "getUNLOCKED$annotations", "UNLOCKED", "Lkotlinx/coroutines/sync/a;", "e", "Lkotlinx/coroutines/sync/a;", "getEMPTY_LOCKED$annotations", "EMPTY_LOCKED", "f", "getEMPTY_UNLOCKED$annotations", "EMPTY_UNLOCKED", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.sync.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9893d {

    /* renamed from: a */
    private static final C9768d0 f25754a = new C9768d0("LOCK_FAIL");

    /* renamed from: b */
    private static final C9768d0 f25755b = new C9768d0("UNLOCK_FAIL");

    /* renamed from: c */
    private static final C9768d0 f25756c;

    /* renamed from: d */
    private static final C9768d0 f25757d;

    /* renamed from: e */
    private static final C9884a f25758e;

    /* renamed from: f */
    private static final C9884a f25759f;

    static {
        C9768d0 c9768d0 = new C9768d0("LOCKED");
        f25756c = c9768d0;
        C9768d0 c9768d02 = new C9768d0("UNLOCKED");
        f25757d = c9768d02;
        f25758e = new C9884a(c9768d0);
        f25759f = new C9884a(c9768d02);
    }

    /* renamed from: a */
    public static final InterfaceC9885b m12998a(boolean z) {
        return new C9886c(z);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9885b m12997b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m12998a(z);
    }
}