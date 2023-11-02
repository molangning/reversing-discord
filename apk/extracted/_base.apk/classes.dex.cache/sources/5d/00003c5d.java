package p164j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;

/* renamed from: j$.util.stream.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8698n {

    /* renamed from: a */
    public static final /* synthetic */ int f22895a = 0;

    static {
        EnumC8678j enumC8678j = EnumC8678j.CONCURRENT;
        EnumC8678j enumC8678j2 = EnumC8678j.UNORDERED;
        EnumC8678j enumC8678j3 = EnumC8678j.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC8678j, enumC8678j2, enumC8678j3));
        Collections.unmodifiableSet(EnumSet.of(enumC8678j, enumC8678j2));
        Collections.unmodifiableSet(EnumSet.of(enumC8678j3));
        Collections.unmodifiableSet(EnumSet.of(enumC8678j2, enumC8678j3));
        Collections.emptySet();
    }

    /* renamed from: a */
    public static void m17425a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}