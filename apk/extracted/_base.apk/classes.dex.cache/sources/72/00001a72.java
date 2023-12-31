package com.discord.misc.utilities.backoff;

import gg.C6759j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J,\u0010\u0011\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0015JY\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172\u001c\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00132\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u000fH\u0002J\u0006\u0010\u001e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m14357d2 = {"Lcom/discord/misc/utilities/backoff/ExponentialBackoff;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "initialDelay", "", "maxDelay", "maxAttempts", "", "(Lkotlinx/coroutines/CoroutineScope;JJI)V", "currentAttempt", "currentDelay", "job", "Lkotlinx/coroutines/Job;", "cancel", "", "cancelCurrentJob", "fail", "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;)V", "performBackoff", "T", "networkRequest", "shouldRetry", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "succeed", "misc_utilities_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class ExponentialBackoff {
    private int currentAttempt;
    private long currentDelay;
    private final long initialDelay;
    private Job job;
    private final int maxAttempts;
    private final long maxDelay;
    private final CoroutineScope scope;

    public ExponentialBackoff(CoroutineScope scope, long j, long j2, int i) {
        C9612q.m13917h(scope, "scope");
        this.scope = scope;
        this.initialDelay = j;
        this.maxDelay = j2;
        this.maxAttempts = i;
        this.currentAttempt = 1;
    }

    private final void cancelCurrentJob() {
        Job job = this.job;
        if (job != null) {
            Job.C9668a.m13594a(job, null, 1, null);
        }
    }

    private final void reset() {
        cancelCurrentJob();
        this.currentDelay = 0L;
        this.currentAttempt = 1;
    }

    public final void cancel() {
        reset();
    }

    public final void fail(Function1<? super Continuation<? super Unit>, ? extends Object> action) {
        long j;
        long m21925h;
        Job m13179d;
        C9612q.m13917h(action, "action");
        cancelCurrentJob();
        if (this.currentAttempt <= this.maxAttempts) {
            long j2 = this.currentDelay;
            if (j2 == 0) {
                j = C6759j.m21929d(this.initialDelay, 1L);
            } else {
                j = j2 * 2;
            }
            m21925h = C6759j.m21925h(j, this.maxDelay);
            this.currentDelay = m21925h;
            this.currentAttempt++;
            m13179d = C9818l.m13179d(this.scope, null, null, new ExponentialBackoff$fail$1(this, action, null), 3, null);
            this.job = m13179d;
            return;
        }
        throw new MaxAttemptsExceededException();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x00ed -> B:62:0x003d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object performBackoff(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r13, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r14, kotlin.coroutines.Continuation<? super T> r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.misc.utilities.backoff.ExponentialBackoff.performBackoff(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void succeed() {
        reset();
    }

    public /* synthetic */ ExponentialBackoff(CoroutineScope coroutineScope, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (i2 & 2) != 0 ? 1000L : j, (i2 & 4) != 0 ? 300000L : j2, (i2 & 8) != 0 ? 10 : i);
    }
}