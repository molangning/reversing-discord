package com.discord.snowflake;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9652n;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00060\u0004j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u0010¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/snowflake/SnowflakeUtils;", "", "()V", "DISCORD_EPOCH", "", "SNOWFLAKE_TIMESTAMP_SHIFT", "", "fromTimestamp", "Lcom/discord/snowflake/Snowflake;", "timestamp", "toTimestamp", "snowflake", "Lcom/discord/snowflake/SnowflakePrimitive;", "toTimestampPart", "snowflakeId", "toSnowflake", "", "(Ljava/lang/String;)Ljava/lang/Long;", "snowflake_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SnowflakeUtils {
    private static final long DISCORD_EPOCH = 1420070400000L;
    public static final SnowflakeUtils INSTANCE = new SnowflakeUtils();
    private static final int SNOWFLAKE_TIMESTAMP_SHIFT = 22;

    private SnowflakeUtils() {
    }

    private final long toTimestampPart(SnowflakePrimitive snowflakePrimitive) {
        return snowflakePrimitive.getSnowflake() >>> 22;
    }

    public final long fromTimestamp(long j) {
        return (j - DISCORD_EPOCH) << 22;
    }

    public final Long toSnowflake(String str) {
        Long m13767o;
        boolean z;
        C9612q.m13917h(str, "<this>");
        m13767o = C9652n.m13767o(str);
        if (m13767o != null) {
            if (m13767o.longValue() > DISCORD_EPOCH) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return m13767o;
            }
        }
        return null;
    }

    public final long toTimestamp(SnowflakePrimitive snowflake) {
        C9612q.m13917h(snowflake, "snowflake");
        return toTimestampPart(snowflake) + DISCORD_EPOCH;
    }
}