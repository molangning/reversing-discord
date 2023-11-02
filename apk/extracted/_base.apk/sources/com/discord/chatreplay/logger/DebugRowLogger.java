package com.discord.chatreplay.logger;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.C9653o;
import p355ti.C12785a;
import p467zf.C14180c;
import p467zf.C14202q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/chatreplay/logger/DebugRowLogger;", "Lcom/discord/chatreplay/logger/RowLogger;", "logsFolderPath", "Ljava/nio/file/Path;", "tag", "", "(Ljava/nio/file/Path;I)V", "jsonFile", "Ljava/io/File;", "lastUpdateTimestamp", "", "Ljava/lang/Long;", "replayFile", "appendLine", "", "line", "", "logRowsClear", "logRowsUpdate", "rowsJson", "maybeInsertDelay", "writeJson", "chat_replay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DebugRowLogger implements RowLogger {
    private final File jsonFile;
    private Long lastUpdateTimestamp;
    private final File replayFile;

    public DebugRowLogger(Path logsFolderPath, int i) {
        C9612q.m13917h(logsFolderPath, "logsFolderPath");
        String obj = logsFolderPath.toString();
        new File(obj, i + ".replay").delete();
        String obj2 = logsFolderPath.toString();
        new File(obj2, i + ".json").delete();
        String obj3 = logsFolderPath.toString();
        this.replayFile = new File(obj3, i + ".replay");
        String obj4 = logsFolderPath.toString();
        this.jsonFile = new File(obj4, i + ".json");
    }

    private final void appendLine(String str) {
        boolean m13751w;
        m13751w = C9653o.m13751w(str);
        if (!m13751w) {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(DebugRowLoggerKt.outputStream(this.replayFile, true), C12785a.f33142b);
            try {
                outputStreamWriter.write(str + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                outputStreamWriter.flush();
                Unit unit = Unit.f25302a;
                C14180c.m514a(outputStreamWriter, null);
                writeJson();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C14180c.m514a(outputStreamWriter, th2);
                    throw th3;
                }
            }
        }
    }

    private final void maybeInsertDelay() {
        long currentTimeMillis = System.currentTimeMillis();
        Long l = this.lastUpdateTimestamp;
        if (l != null) {
            appendLine("{\"delayMs\":" + (currentTimeMillis - l.longValue()) + "}");
        }
        this.lastUpdateTimestamp = Long.valueOf(currentTimeMillis);
    }

    private final void writeJson() {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        FileOutputStream fileOutputStream = new FileOutputStream(this.jsonFile);
        Charset charset = C12785a.f33142b;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, charset);
        try {
            outputStreamWriter.write("[\n");
            C14202q.m471c(new InputStreamReader(new FileInputStream(this.replayFile), charset), new DebugRowLogger$writeJson$1$1(ref$BooleanRef, outputStreamWriter));
            outputStreamWriter.write("\n]");
            outputStreamWriter.flush();
            Unit unit = Unit.f25302a;
            C14180c.m514a(outputStreamWriter, null);
        } finally {
        }
    }

    @Override // com.discord.chatreplay.logger.RowLogger
    public void logRowsClear() {
        maybeInsertDelay();
        appendLine("{\"type\":\"clear\"}");
    }

    @Override // com.discord.chatreplay.logger.RowLogger
    public void logRowsUpdate(String rowsJson) {
        C9612q.m13917h(rowsJson, "rowsJson");
        maybeInsertDelay();
        appendLine(rowsJson);
    }
}
