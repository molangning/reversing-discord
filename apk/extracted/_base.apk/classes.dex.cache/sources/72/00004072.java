package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C9768d0;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0014\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u0012\u0004\b\u0013\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0007\"\u001a\u0010\u001b\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0017\u0012\u0004\b\u001a\u0010\u0007¨\u0006\u001c"}, m14357d2 = {"", "g", "h", "Lkotlinx/coroutines/internal/d0;", "a", "Lkotlinx/coroutines/internal/d0;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_ALREADY", "b", "getCOMPLETING_WAITING_CHILDREN$annotations", "COMPLETING_WAITING_CHILDREN", "c", "getCOMPLETING_RETRY$annotations", "COMPLETING_RETRY", "d", "getTOO_LATE_TO_CANCEL$annotations", "TOO_LATE_TO_CANCEL", "e", "getSEALED$annotations", "SEALED", "Lkotlinx/coroutines/g1;", "f", "Lkotlinx/coroutines/g1;", "getEMPTY_NEW$annotations", "EMPTY_NEW", "getEMPTY_ACTIVE$annotations", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.f2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9705f2 {

    /* renamed from: a */
    private static final C9768d0 f25451a = new C9768d0("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C9768d0 f25452b = new C9768d0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    private static final C9768d0 f25453c = new C9768d0("COMPLETING_RETRY");

    /* renamed from: d */
    private static final C9768d0 f25454d = new C9768d0("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    private static final C9768d0 f25455e = new C9768d0("SEALED");

    /* renamed from: f */
    private static final C9743g1 f25456f = new C9743g1(false);

    /* renamed from: g */
    private static final C9743g1 f25457g = new C9743g1(true);

    /* renamed from: g */
    public static final Object m13467g(Object obj) {
        return obj instanceof InterfaceC9852s1 ? new C9896t1((InterfaceC9852s1) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m13466h(Object obj) {
        InterfaceC9852s1 interfaceC9852s1;
        C9896t1 c9896t1 = obj instanceof C9896t1 ? (C9896t1) obj : null;
        return (c9896t1 == null || (interfaceC9852s1 = c9896t1.f25761a) == null) ? obj : interfaceC9852s1;
    }
}