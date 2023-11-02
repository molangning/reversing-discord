package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p373ui.EnumC12982c;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¨\u0006\t"}, m14357d2 = {"", "shortName", "Lui/c;", "e", "", "isoChar", "", "isTimeComponent", "d", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/time/DurationUnitKt")
/* renamed from: kotlin.time.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
class C9664c extends C9663b {
    /* renamed from: d */
    public static final EnumC12982c m13599d(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return EnumC12982c.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        } else if (c == 'H') {
            return EnumC12982c.HOURS;
        } else {
            if (c == 'M') {
                return EnumC12982c.MINUTES;
            }
            if (c == 'S') {
                return EnumC12982c.SECONDS;
            }
            throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
        }
    }

    /* renamed from: e */
    public static final EnumC12982c m13598e(String shortName) {
        C9612q.m13917h(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && shortName.equals("us")) {
                                    return EnumC12982c.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return EnumC12982c.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return EnumC12982c.MILLISECONDS;
                        }
                    } else if (shortName.equals("s")) {
                        return EnumC12982c.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return EnumC12982c.MINUTES;
                }
            } else if (shortName.equals("h")) {
                return EnumC12982c.HOURS;
            }
        } else if (shortName.equals("d")) {
            return EnumC12982c.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
