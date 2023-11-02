package com.discord.chatreplay.logger;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m14357d2 = {"outputStream", "Ljava/io/FileOutputStream;", "Ljava/io/File;", "append", "", "chat_replay_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DebugRowLoggerKt {
    public static final FileOutputStream outputStream(File file, boolean z) {
        C9612q.m13917h(file, "<this>");
        return new FileOutputStream(file, z);
    }
}
