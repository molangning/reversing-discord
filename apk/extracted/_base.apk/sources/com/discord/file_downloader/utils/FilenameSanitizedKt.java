package com.discord.file_downloader.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.Regex;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m14357d2 = {"filenameSanitized", "", "", "file_downloader_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class FilenameSanitizedKt {
    public static final String filenameSanitized(CharSequence charSequence) {
        C9612q.m13917h(charSequence, "<this>");
        return new Regex("[/\\\\]").m13867h(charSequence, "_");
    }
}
