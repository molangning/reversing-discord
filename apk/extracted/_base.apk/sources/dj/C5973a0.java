package dj;

import gg.C6759j;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a \u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a \u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000\u001a \u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0016\u0010\u0019\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u001a"}, m14357d2 = {"", "offset", "", "message", "Ldj/w;", "d", "", "input", "e", "", "value", "output", "Ldj/y;", "b", "Ldj/a;", "result", "", "i", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDescriptor", "c", "key", "a", "j", "f", "g", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: dj.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5973a0 {
    /* renamed from: a */
    public static final C6023w m24017a(Number value, String key, String output) {
        C9612q.m13917h(value, "value");
        C9612q.m13917h(key, "key");
        C9612q.m13917h(output, "output");
        return m24014d(-1, m24008j(value, key, output));
    }

    /* renamed from: b */
    public static final C6026y m24016b(Number value, String output) {
        C9612q.m13917h(value, "value");
        C9612q.m13917h(output, "output");
        return new C6026y("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m24010h(output, 0, 1, null)));
    }

    /* renamed from: c */
    public static final C6026y m24015c(SerialDescriptor keyDescriptor) {
        C9612q.m13917h(keyDescriptor, "keyDescriptor");
        return new C6026y("Value of type '" + keyDescriptor.mo12682i() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.mo12684g() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* renamed from: d */
    public static final C6023w m24014d(int i, String message) {
        C9612q.m13917h(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        return new C6023w(message);
    }

    /* renamed from: e */
    public static final C6023w m24013e(int i, String message, CharSequence input) {
        C9612q.m13917h(message, "message");
        C9612q.m13917h(input, "input");
        return m24014d(i, message + "\nJSON input: " + ((Object) m24011g(input, i)));
    }

    /* renamed from: f */
    public static final C6023w m24012f(String key, String input) {
        C9612q.m13917h(key, "key");
        C9612q.m13917h(input, "input");
        return m24014d(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) m24010h(input, 0, 1, null)));
    }

    /* renamed from: g */
    private static final CharSequence m24011g(CharSequence charSequence, int i) {
        String str;
        int m21930c;
        int m21926g;
        int length;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i == -1) {
            if (charSequence.length() - 60 <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i2 = i - 30;
        int i3 = i + 30;
        if (i2 > 0) {
            str = ".....";
        } else {
            str = "";
        }
        if (i3 >= charSequence.length()) {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        m21930c = C6759j.m21930c(i2, 0);
        m21926g = C6759j.m21926g(i3, charSequence.length());
        sb2.append(charSequence.subSequence(m21930c, m21926g).toString());
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: h */
    static /* synthetic */ CharSequence m24010h(CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return m24011g(charSequence, i);
    }

    /* renamed from: i */
    public static final Void m24009i(AbstractC5972a abstractC5972a, Number result) {
        C9612q.m13917h(abstractC5972a, "<this>");
        C9612q.m13917h(result, "result");
        AbstractC5972a.m24019y(abstractC5972a, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new C11568i();
    }

    /* renamed from: j */
    private static final String m24008j(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m24010h(str2, 0, 1, null));
    }
}
