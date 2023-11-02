package com.discord.crash_reporting.system_logs;

import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.text.Regex;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SystemLogUtils$fetch$1 extends AbstractC9614s implements Function0<Unit> {
    final /* synthetic */ Function1<LinkedList<String>, Unit> $cb;
    final /* synthetic */ Regex $filter;
    final /* synthetic */ boolean $logErrors;
    final /* synthetic */ LinkedList<String> $output;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SystemLogUtils$fetch$1(LinkedList<String> linkedList, Regex regex, boolean z, Function1<? super LinkedList<String>, Unit> function1) {
        super(0);
        this.$output = linkedList;
        this.$filter = regex;
        this.$logErrors = z;
        this.$cb = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f25302a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
        if (r0 != null) goto L7;
     */
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2() {
        /*
            r8 = this;
            r0 = 0
            java.lang.ProcessBuilder r1 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.String r2 = "/system/bin/logcat"
            java.lang.String r3 = "-d"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r2 = 1
            java.lang.ProcessBuilder r1 = r1.redirectErrorStream(r2)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.Process r0 = r1.start()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            com.discord.crash_reporting.system_logs.SystemLogUtils r1 = com.discord.crash_reporting.system_logs.SystemLogUtils.INSTANCE     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            com.discord.crash_reporting.system_logs.SystemLogUtils.access$waitFor(r1, r0)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.io.InputStream r2 = r0.getInputStream()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.String r3 = "logcatProcess.inputStream"
            kotlin.jvm.internal.C9612q.m13918g(r2, r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.nio.charset.Charset r3 = p355ti.C12785a.f33142b     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            boolean r2 = r4 instanceof java.io.BufferedReader     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r2 == 0) goto L33
            java.io.BufferedReader r4 = (java.io.BufferedReader) r4     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            goto L3b
        L33:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r4 = r2
        L3b:
            java.util.LinkedList<java.lang.String> r2 = r8.$output     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            kotlin.text.Regex r3 = r8.$filter     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r1.processLogs$crash_reporting_release(r4, r2, r3)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r4.close()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
        L45:
            r0.destroy()
            goto L99
        L49:
            r1 = move-exception
            goto La1
        L4b:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L49
            boolean r2 = r8.$logErrors     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L96
            java.util.LinkedList<java.lang.String> r2 = r8.$output     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r3.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "Exception getting system logs '"
            r3.append(r4)     // Catch: java.lang.Throwable -> L49
            r3.append(r1)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L49
            r2.add(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "e.stackTrace"
            kotlin.jvm.internal.C9612q.m13918g(r1, r2)     // Catch: java.lang.Throwable -> L49
            java.util.LinkedList<java.lang.String> r2 = r8.$output     // Catch: java.lang.Throwable -> L49
            int r3 = r1.length     // Catch: java.lang.Throwable -> L49
            r4 = 0
        L7b:
            if (r4 >= r3) goto L96
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r6.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = "    "
            r6.append(r7)     // Catch: java.lang.Throwable -> L49
            r6.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L49
            r2.add(r5)     // Catch: java.lang.Throwable -> L49
            int r4 = r4 + 1
            goto L7b
        L96:
            if (r0 == 0) goto L99
            goto L45
        L99:
            kotlin.jvm.functions.Function1<java.util.LinkedList<java.lang.String>, kotlin.Unit> r0 = r8.$cb
            java.util.LinkedList<java.lang.String> r1 = r8.$output
            r0.invoke(r1)
            return
        La1:
            if (r0 == 0) goto La6
            r0.destroy()
        La6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.crash_reporting.system_logs.SystemLogUtils$fetch$1.invoke2():void");
    }
}