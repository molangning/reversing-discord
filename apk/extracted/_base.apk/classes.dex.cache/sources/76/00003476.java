package gg;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, m14357d2 = {"", "isPositive", "", "step", "", "a", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/ranges/RangesKt")
/* renamed from: gg.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6758i {
    /* renamed from: a */
    public static final void m21932a(boolean z, Number step) {
        C9612q.m13917h(step, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}