package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C9768d0;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0007\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\" \u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0002\u0012\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0002\u0012\u0004\b\r\u0010\u0006\"\u001a\u0010\u0010\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u0012\u0004\b\u000f\u0010\u0006\"\u001a\u0010\u0014\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u0012\u0004\b\u0013\u0010\u0006¨\u0006\u0015"}, m14357d2 = {"", "a", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "getNOT_SELECTED$annotations", "()V", "NOT_SELECTED", "b", "d", "getALREADY_SELECTED$annotations", "ALREADY_SELECTED", "c", "getUNDECIDED$annotations", "UNDECIDED", "getRESUMED$annotations", "RESUMED", "Lkotlinx/coroutines/selects/f;", "Lkotlinx/coroutines/selects/f;", "getSelectOpSequenceNumber$annotations", "selectOpSequenceNumber", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.selects.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9882e {

    /* renamed from: a */
    private static final Object f25736a = new C9768d0("NOT_SELECTED");

    /* renamed from: b */
    private static final Object f25737b = new C9768d0("ALREADY_SELECTED");

    /* renamed from: c */
    private static final Object f25738c = new C9768d0("UNDECIDED");

    /* renamed from: d */
    private static final Object f25739d = new C9768d0("RESUMED");

    /* renamed from: e */
    private static final C9883f f25740e = new C9883f();

    /* renamed from: d */
    public static final Object m13011d() {
        return f25737b;
    }

    /* renamed from: e */
    public static final Object m13010e() {
        return f25736a;
    }
}