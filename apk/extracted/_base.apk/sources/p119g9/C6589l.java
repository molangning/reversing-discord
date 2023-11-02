package p119g9;

import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: g9.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6589l {

    /* renamed from: a */
    private static final Pattern f18730a = Pattern.compile("\\$\\{(.*?)\\}");

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* renamed from: a */
    public static boolean m22355a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
