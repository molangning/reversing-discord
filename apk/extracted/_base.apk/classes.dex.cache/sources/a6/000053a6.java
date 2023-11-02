package p467zf;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0006"}, m14357d2 = {"Ljava/io/File;", "Lzf/i;", "direction", "Lzf/h;", "e", "f", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/io/FilesKt")
/* renamed from: zf.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14197m extends C14196l {
    /* renamed from: e */
    public static final C14185h m486e(File file, EnumC14193i direction) {
        C9612q.m13917h(file, "<this>");
        C9612q.m13917h(direction, "direction");
        return new C14185h(file, direction);
    }

    /* renamed from: f */
    public static final C14185h m485f(File file) {
        C9612q.m13917h(file, "<this>");
        return m486e(file, EnumC14193i.BOTTOM_UP);
    }
}