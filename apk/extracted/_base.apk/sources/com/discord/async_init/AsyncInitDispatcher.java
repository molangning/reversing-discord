package com.discord.async_init;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.logging.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J&\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\u000e\b\u0004\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086\bø\u0001\u0000J(\u0010 \u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086\bø\u0001\u0000J\u0006\u0010\"\u001a\u00020\nJ\u0006\u0010#\u001a\u00020\nR#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, m14357d2 = {"Lcom/discord/async_init/AsyncInitDispatcher;", "", ZeroconfModule.KEY_SERVICE_NAME, "", "longDispatchThresholdMs", "", "(Ljava/lang/String;J)V", "delayedTasks", "", "Lkotlin/Function0;", "", "getDelayedTasks$annotations", "()V", "getDelayedTasks", "()Ljava/util/List;", "initStartMs", "value", "", "initialized", "getInitialized", "()Z", "setInitialized", "(Z)V", "threadChecker", "Lcom/discord/async_init/AsyncInitThreadChecker;", "onInit", "numTasks", "", "onInitFinish", "post", "validate", "task", "postOrElse", "fallback", "reset", "validateState", "async_init_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class AsyncInitDispatcher {
    private final List<Function0<Unit>> delayedTasks;
    private long initStartMs;
    private boolean initialized;
    private final long longDispatchThresholdMs;
    private final String name;
    private final AsyncInitThreadChecker threadChecker;

    public AsyncInitDispatcher(String name, long j) {
        C9612q.m13917h(name, "name");
        this.name = name;
        this.longDispatchThresholdMs = j;
        this.delayedTasks = new ArrayList();
        this.threadChecker = new AsyncInitThreadChecker(name);
    }

    public static /* synthetic */ void getDelayedTasks$annotations() {
    }

    private final void onInit(int i) {
        if (i > 0) {
            this.initStartMs = System.currentTimeMillis();
        }
        Log log = Log.INSTANCE;
        String str = this.name;
        Log.i$default(log, str, "Initializing async dispatcher for " + str + ", " + i + " queued tasks", (Throwable) null, 4, (Object) null);
    }

    private final void onInitFinish() {
        if (this.initStartMs == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.initStartMs;
        long j = this.longDispatchThresholdMs;
        if (currentTimeMillis < j) {
            Log log = Log.INSTANCE;
            String str = this.name;
            Log.i$default(log, str, str + ": queued tasks  took " + currentTimeMillis + " ms", (Throwable) null, 4, (Object) null);
            return;
        }
        Log log2 = Log.INSTANCE;
        String str2 = this.name;
        Log.w$default(log2, str2, str2 + ": running queued tasks on init took " + currentTimeMillis + " ms which exceeds threshold=" + j + " ms", (Throwable) null, 4, (Object) null);
    }

    public static /* synthetic */ void post$default(AsyncInitDispatcher asyncInitDispatcher, boolean z, Function0 task, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        C9612q.m13917h(task, "task");
        if (z) {
            asyncInitDispatcher.validateState();
        }
        if (asyncInitDispatcher.getInitialized()) {
            task.invoke();
        } else {
            asyncInitDispatcher.getDelayedTasks().add(new AsyncInitDispatcher$post$1(task));
        }
    }

    public final List<Function0<Unit>> getDelayedTasks() {
        return this.delayedTasks;
    }

    public final boolean getInitialized() {
        return this.initialized;
    }

    public final void post(boolean z, Function0<Unit> task) {
        C9612q.m13917h(task, "task");
        if (z) {
            validateState();
        }
        if (getInitialized()) {
            task.invoke();
        } else {
            getDelayedTasks().add(new AsyncInitDispatcher$post$1(task));
        }
    }

    public final void postOrElse(Function0<Unit> task, Function0<Unit> fallback) {
        C9612q.m13917h(task, "task");
        C9612q.m13917h(fallback, "fallback");
        validateState();
        if (getInitialized()) {
            task.invoke();
        } else {
            fallback.invoke();
        }
    }

    public final void reset() {
        this.threadChecker.detachThread();
        setInitialized(false);
        this.delayedTasks.clear();
        this.initStartMs = 0L;
    }

    public final void setInitialized(boolean z) {
        validateState();
        if (this.initialized != z) {
            if (z) {
                onInit(this.delayedTasks.size());
                Iterator<T> it = this.delayedTasks.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.delayedTasks.clear();
                onInitFinish();
            }
            this.initialized = z;
        }
    }

    public final void validateState() {
        this.threadChecker.checkIsOnValidThread();
    }

    public /* synthetic */ AsyncInitDispatcher(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 1000L : j);
    }
}
