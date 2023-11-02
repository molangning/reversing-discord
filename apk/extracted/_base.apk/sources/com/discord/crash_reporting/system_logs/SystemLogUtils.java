package com.discord.crash_reporting.system_logs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.File;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9538f;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import kotlin.text.C9649k;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import p355ti.C12785a;
import p355ti.EnumC12793f;
import si.C12552o;
import tf.C12672a;

@Metadata(m14358d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001)B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J,\u0010\u0012\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0019\u0012\u0004\u0012\u00020\u00150\u0018H\u0002J\u001c\u0010\u001a\u001a\u00020\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u00150\u0018J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J-\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b%J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m14357d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogUtils;", "", "()V", "DEFAULT_TAG", "", "LIBDISCORD_VERSION_CATEGORY", "debugPrintables", "Lcom/discord/crash_reporting/system_logs/DebugPrintableCollection;", "logcatPath", "maxLogSize", "", "regexExtractTombstone", "Lkotlin/text/Regex;", "getRegexExtractTombstone$crash_reporting_release$annotations", "getRegexExtractTombstone$crash_reporting_release", "()Lkotlin/text/Regex;", "systemLogCapture", "Lcom/discord/crash_reporting/system_logs/SystemLogCapture;", "fetch", "context", "Landroid/content/Context;", "", "filter", "cb", "Lkotlin/Function1;", "Ljava/util/LinkedList;", "fetchLastTombstone", "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "crashes", "", "hashString", "input", "initSystemLogCapture", "processLogs", "reader", "Ljava/io/BufferedReader;", "output", "processLogs$crash_reporting_release", "waitFor", "process", "Ljava/lang/Process;", "Tombstone", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SystemLogUtils {
    private static final String DEFAULT_TAG = "Discord";
    public static final String logcatPath = "/system/bin/logcat";
    private static final int maxLogSize = 2500000;
    public static final SystemLogUtils INSTANCE = new SystemLogUtils();
    private static final DebugPrintableCollection debugPrintables = new DebugPrintableCollection();
    private static final SystemLogCapture systemLogCapture = new SystemLogCapture();
    private static final String LIBDISCORD_VERSION_CATEGORY = "libdiscord_version";
    private static final Regex regexExtractTombstone = new Regex("(?:^(?:[^\\s]+\\s+){4}F\\s+DEBUG\\s+:\\s(.+))|(^.+(\\[" + Regex.f25372k.m13861c(LIBDISCORD_VERSION_CATEGORY) + "\\].+))");

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m14357d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "", "text", "", "cause", "groupBy", "origin", "groupHash", "textHash", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCause", "()Ljava/lang/String;", "getGroupBy", "getGroupHash", "getOrigin", "getText", "getTextHash", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "crash_reporting_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Tombstone {
        private final String cause;
        private final String groupBy;
        private final String groupHash;
        private final String origin;
        private final String text;
        private final String textHash;

        public Tombstone(String text, String str, String groupBy, String origin, String groupHash, String textHash) {
            C9612q.m13917h(text, "text");
            C9612q.m13917h(groupBy, "groupBy");
            C9612q.m13917h(origin, "origin");
            C9612q.m13917h(groupHash, "groupHash");
            C9612q.m13917h(textHash, "textHash");
            this.text = text;
            this.cause = str;
            this.groupBy = groupBy;
            this.origin = origin;
            this.groupHash = groupHash;
            this.textHash = textHash;
        }

        public static /* synthetic */ Tombstone copy$default(Tombstone tombstone, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tombstone.text;
            }
            if ((i & 2) != 0) {
                str2 = tombstone.cause;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = tombstone.groupBy;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = tombstone.origin;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = tombstone.groupHash;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = tombstone.textHash;
            }
            return tombstone.copy(str, str7, str8, str9, str10, str6);
        }

        public final String component1() {
            return this.text;
        }

        public final String component2() {
            return this.cause;
        }

        public final String component3() {
            return this.groupBy;
        }

        public final String component4() {
            return this.origin;
        }

        public final String component5() {
            return this.groupHash;
        }

        public final String component6() {
            return this.textHash;
        }

        public final Tombstone copy(String text, String str, String groupBy, String origin, String groupHash, String textHash) {
            C9612q.m13917h(text, "text");
            C9612q.m13917h(groupBy, "groupBy");
            C9612q.m13917h(origin, "origin");
            C9612q.m13917h(groupHash, "groupHash");
            C9612q.m13917h(textHash, "textHash");
            return new Tombstone(text, str, groupBy, origin, groupHash, textHash);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Tombstone) {
                Tombstone tombstone = (Tombstone) obj;
                return C9612q.m13922c(this.text, tombstone.text) && C9612q.m13922c(this.cause, tombstone.cause) && C9612q.m13922c(this.groupBy, tombstone.groupBy) && C9612q.m13922c(this.origin, tombstone.origin) && C9612q.m13922c(this.groupHash, tombstone.groupHash) && C9612q.m13922c(this.textHash, tombstone.textHash);
            }
            return false;
        }

        public final String getCause() {
            return this.cause;
        }

        public final String getGroupBy() {
            return this.groupBy;
        }

        public final String getGroupHash() {
            return this.groupHash;
        }

        public final String getOrigin() {
            return this.origin;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTextHash() {
            return this.textHash;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.cause;
            return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.groupBy.hashCode()) * 31) + this.origin.hashCode()) * 31) + this.groupHash.hashCode()) * 31) + this.textHash.hashCode();
        }

        public String toString() {
            String str = this.text;
            String str2 = this.cause;
            String str3 = this.groupBy;
            String str4 = this.origin;
            String str5 = this.groupHash;
            String str6 = this.textHash;
            return "Tombstone(text=" + str + ", cause=" + str2 + ", groupBy=" + str3 + ", origin=" + str4 + ", groupHash=" + str5 + ", textHash=" + str6 + ")";
        }
    }

    private SystemLogUtils() {
    }

    public static /* synthetic */ void getRegexExtractTombstone$crash_reporting_release$annotations() {
    }

    private final String hashString(String str) {
        String m14220Z;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        byte[] bytes = str.getBytes(C12785a.f33142b);
        C9612q.m13918g(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = messageDigest.digest(bytes);
        C9612q.m13918g(bytes2, "bytes");
        m14220Z = C9538f.m14220Z(bytes2, "", null, null, 0, null, SystemLogUtils$hashString$1.INSTANCE, 30, null);
        return m14220Z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void waitFor(Process process) {
        long nanoTime = System.nanoTime() + TimeUnit.SECONDS.toNanos(15L);
        do {
            try {
                process.exitValue();
                return;
            } catch (IllegalThreadStateException unused) {
                Thread.sleep(100L);
                if (System.nanoTime() >= nanoTime) {
                }
            }
        } while (System.nanoTime() >= nanoTime);
    }

    public final String fetch(Context context) {
        C9612q.m13917h(context, "context");
        StringBuilder sb2 = new StringBuilder();
        debugPrintables.debugPrint(context, sb2);
        systemLogCapture.appendOutput(sb2);
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "sb.toString()");
        return sb3;
    }

    public final void fetchLastTombstone(Function1<? super Tombstone, Unit> cb) {
        C9612q.m13917h(cb, "cb");
        fetch(regexExtractTombstone, new SystemLogUtils$fetchLastTombstone$1(cb));
    }

    public final Regex getRegexExtractTombstone$crash_reporting_release() {
        return regexExtractTombstone;
    }

    @SuppressLint({"LogNotTimber"})
    public final void initSystemLogCapture(Context context) {
        C9612q.m13917h(context, "context");
        String libdiscordVersion = DebugPrintableCollection.Companion.libdiscordVersion(context);
        Log.v("Discord", "[" + LIBDISCORD_VERSION_CATEGORY + "]: " + libdiscordVersion);
        systemLogCapture.startThread();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        throw new java.util.NoSuchElementException("List contains no element matching the predicate.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void processLogs$crash_reporting_release(java.io.BufferedReader r10, java.util.LinkedList<java.lang.String> r11, kotlin.text.Regex r12) {
        /*
            r9 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.C9612q.m13917h(r10, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.C9612q.m13917h(r11, r0)
            r0 = 0
            r1 = r0
        Lc:
            r2 = 2500000(0x2625a0, float:3.503246E-39)
            java.lang.String r3 = r10.readLine()     // Catch: java.lang.Exception -> L79
            if (r3 != 0) goto L17
            goto L90
        L17:
            r4 = 0
            r5 = 2
            r6 = 1
            if (r12 == 0) goto L53
            kotlin.text.MatchResult r3 = kotlin.text.Regex.m13872c(r12, r3, r0, r5, r4)     // Catch: java.lang.Exception -> L79
            if (r3 != 0) goto L23
            goto Lc
        L23:
            java.util.List r3 = r3.mo3925b()     // Catch: java.lang.Exception -> L79
            int r7 = r3.size()     // Catch: java.lang.Exception -> L79
            java.util.ListIterator r3 = r3.listIterator(r7)     // Catch: java.lang.Exception -> L79
        L2f:
            boolean r7 = r3.hasPrevious()     // Catch: java.lang.Exception -> L79
            if (r7 == 0) goto L4b
            java.lang.Object r7 = r3.previous()     // Catch: java.lang.Exception -> L79
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L79
            int r8 = r8.length()     // Catch: java.lang.Exception -> L79
            if (r8 <= 0) goto L44
            r8 = r6
            goto L45
        L44:
            r8 = r0
        L45:
            if (r8 == 0) goto L2f
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L79
            goto L53
        L4b:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = "List contains no element matching the predicate."
            r10.<init>(r0)     // Catch: java.lang.Exception -> L79
            throw r10     // Catch: java.lang.Exception -> L79
        L53:
            boolean r7 = kotlin.text.C9642f.m13789w(r3)     // Catch: java.lang.Exception -> L79
            if (r7 != 0) goto Lc
            java.lang.String r7 = "Accessing hidden method"
            boolean r4 = kotlin.text.C9642f.m13829M(r3, r7, r0, r5, r4)     // Catch: java.lang.Exception -> L79
            if (r4 != 0) goto Lc
            int r4 = r3.length()     // Catch: java.lang.Exception -> L79
            int r4 = r4 + r6
            int r1 = r1 + r4
            r11.add(r3)     // Catch: java.lang.Exception -> L79
            if (r1 <= r2) goto Lc
            java.lang.Object r3 = r11.pop()     // Catch: java.lang.Exception -> L79
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L79
            int r2 = r3.length()     // Catch: java.lang.Exception -> L79
            int r2 = r2 - r6
            int r1 = r1 - r2
            goto Lc
        L79:
            r10 = move-exception
            if (r12 != 0) goto L90
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "IOException: "
            r12.append(r0)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.add(r10)
        L90:
            if (r1 <= r2) goto L9b
            java.lang.Object r10 = r11.pop()
            java.lang.String r10 = (java.lang.String) r10
            r10.length()
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.crash_reporting.system_logs.SystemLogUtils.processLogs$crash_reporting_release(java.io.BufferedReader, java.util.LinkedList, kotlin.text.Regex):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Tombstone fetchLastTombstone(Collection<String> collection) {
        boolean m13751w;
        boolean m13751w2;
        Sequence m4851y;
        HashSet m14006e;
        String str;
        String m4853w;
        List<String> mo3925b;
        boolean m13731M;
        boolean m13731M2;
        String str2 = null;
        if (collection.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        String str3 = null;
        String str4 = null;
        for (String str5 : collection) {
            m13731M = C9654p.m13731M(str5, LIBDISCORD_VERSION_CATEGORY, false, 2, null);
            if (m13731M) {
                str3 = str5;
            } else {
                m13731M2 = C9654p.m13731M(str5, "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***", false, 2, null);
                if (m13731M2) {
                    C9649k.m13773i(sb2);
                    str4 = str3;
                }
                sb2.append(str5);
                C9612q.m13918g(sb2, "append(value)");
                sb2.append('\n');
                C9612q.m13918g(sb2, "append('\\n')");
            }
        }
        m13751w = C9653o.m13751w(sb2);
        if (!m13751w) {
            sb2.append('\n');
            C9612q.m13918g(sb2, "append('\\n')");
            sb2.append("Tombstone's libdiscord_version: ");
            if (str4 == null) {
                str4 = "Unknown libdiscord_version";
            }
            sb2.append(str4);
            C9612q.m13918g(sb2, "append(value)");
            sb2.append('\n');
            C9612q.m13918g(sb2, "append('\\n')");
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().also { s…   }\n        }.toString()");
        m13751w2 = C9653o.m13751w(sb3);
        if (m13751w2) {
            return null;
        }
        EnumC12793f enumC12793f = EnumC12793f.MULTILINE;
        Regex regex = new Regex("^Cause: (.+)$", enumC12793f);
        m4851y = C12552o.m4851y(Regex.m13870e(new Regex("^\\s+#\\d+ pc .+/(.+? .+?)\\+?[+)]", enumC12793f), sb3, 0, 2, null), new SystemLogUtils$fetchLastTombstone$extractedGroups$1(new Regex("classes\\d+.dex")));
        m14006e = C9560w.m14006e("libc.so (abort", "libart.so (art::Runtime::Abort(char const*", "libbase.so (android::base::LogMessage::~LogMessage(");
        try {
        } catch (NoSuchElementException unused) {
            str = "Unknown";
        }
        for (Object obj : m4851y) {
            if (!m14006e.contains((String) obj)) {
                str = (String) obj;
                m4853w = C12552o.m4853w(m4851y, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 62, null);
                MatchResult m13872c = Regex.m13872c(regex, sb3, 0, 2, null);
                if (m13872c != null && (mo3925b = m13872c.mo3925b()) != null) {
                    str2 = mo3925b.get(1);
                }
                return new Tombstone(sb3, str2, m4853w, str, hashString(m4853w), hashString(sb3));
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private final void fetch(Regex regex, Function1<? super LinkedList<String>, Unit> function1) {
        LinkedList linkedList = new LinkedList();
        boolean z = regex == null;
        if (!new File(logcatPath).exists()) {
            if (z) {
                linkedList.add("Unable to locate '/system/bin/logcat'");
            }
            function1.invoke(linkedList);
            return;
        }
        C12672a.m4551b(false, false, null, null, 0, new SystemLogUtils$fetch$1(linkedList, regex, z, function1), 31, null);
    }
}
