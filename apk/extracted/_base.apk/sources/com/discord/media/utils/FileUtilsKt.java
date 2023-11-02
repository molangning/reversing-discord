package com.discord.media.utils;

import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import okio.BufferedSink;
import p122gk.C6840m;
import p122gk.C6841n;
import p467zf.C14180c;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, m14357d2 = {"writeTo", "Ljava/io/File;", "Ljava/io/InputStream;", "outputFile", "media_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class FileUtilsKt {
    public static final File writeTo(InputStream inputStream, File outputFile) {
        C9612q.m13917h(inputStream, "<this>");
        C9612q.m13917h(outputFile, "outputFile");
        BufferedSink m21830c = C6840m.m21830c(C6841n.m21813g(outputFile, false, 1, null));
        try {
            m21830c.mo8606O(C6840m.m21821l(inputStream));
            Unit unit = Unit.f25302a;
            C14180c.m514a(m21830c, null);
            return outputFile;
        } finally {
        }
    }
}
