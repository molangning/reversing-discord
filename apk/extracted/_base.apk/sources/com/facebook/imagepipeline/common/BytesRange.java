package com.facebook.imagepipeline.common;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.regex.Pattern;
import p075e3.C6099b;
import p394w2.C13379j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class BytesRange {

    /* renamed from: c */
    private static Pattern f10281c;

    /* renamed from: a */
    public final int f10282a;

    /* renamed from: b */
    public final int f10283b;

    public BytesRange(int i, int i2) {
        this.f10282a = i;
        this.f10283b = i2;
    }

    /* renamed from: b */
    public static BytesRange m31199b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        return new BytesRange(i, ViewDefaults.NUMBER_OF_LINES);
    }

    /* renamed from: c */
    public static BytesRange m31198c(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        if (str == null) {
            return null;
        }
        if (f10281c == null) {
            f10281c = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f10281c.split(str);
            if (split.length == 4) {
                z = true;
            } else {
                z = false;
            }
            C13379j.m2682b(Boolean.valueOf(z));
            C13379j.m2682b(Boolean.valueOf(split[0].equals("bytes")));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            if (parseInt2 > parseInt) {
                z2 = true;
            } else {
                z2 = false;
            }
            C13379j.m2682b(Boolean.valueOf(z2));
            if (parseInt3 > parseInt2) {
                z3 = true;
            } else {
                z3 = false;
            }
            C13379j.m2682b(Boolean.valueOf(z3));
            if (parseInt2 < parseInt3 - 1) {
                return new BytesRange(parseInt, parseInt2);
            }
            return new BytesRange(parseInt, ViewDefaults.NUMBER_OF_LINES);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", str), e);
        }
    }

    /* renamed from: e */
    public static BytesRange m31196e(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        return new BytesRange(0, i);
    }

    /* renamed from: f */
    private static String m31195f(int i) {
        if (i == Integer.MAX_VALUE) {
            return "";
        }
        return Integer.toString(i);
    }

    /* renamed from: a */
    public boolean m31200a(BytesRange bytesRange) {
        return bytesRange != null && this.f10282a <= bytesRange.f10282a && this.f10283b >= bytesRange.f10283b;
    }

    /* renamed from: d */
    public String m31197d() {
        return String.format(null, "bytes=%s-%s", m31195f(this.f10282a), m31195f(this.f10283b));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BytesRange)) {
            return false;
        }
        BytesRange bytesRange = (BytesRange) obj;
        if (this.f10282a == bytesRange.f10282a && this.f10283b == bytesRange.f10283b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6099b.m23581a(this.f10282a, this.f10283b);
    }

    public String toString() {
        return String.format(null, "%s-%s", m31195f(this.f10282a), m31195f(this.f10283b));
    }
}
