package p144i;

import java.util.concurrent.Executor;

/* renamed from: i.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C7365a extends AbstractC7371d {

    /* renamed from: c */
    private static volatile C7365a f19835c;

    /* renamed from: d */
    private static final Executor f19836d = new ExecutorC7366a();

    /* renamed from: e */
    private static final Executor f19837e = new ExecutorC7367b();

    /* renamed from: a */
    private AbstractC7371d f19838a;

    /* renamed from: b */
    private AbstractC7371d f19839b;

    /* renamed from: i.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class ExecutorC7366a implements Executor {
        ExecutorC7366a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C7365a.m20832d().mo20827c(runnable);
        }
    }

    /* renamed from: i.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class ExecutorC7367b implements Executor {
        ExecutorC7367b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C7365a.m20832d().mo20829a(runnable);
        }
    }

    private C7365a() {
        C7369c c7369c = new C7369c();
        this.f19839b = c7369c;
        this.f19838a = c7369c;
    }

    /* renamed from: d */
    public static C7365a m20832d() {
        if (f19835c != null) {
            return f19835c;
        }
        synchronized (C7365a.class) {
            if (f19835c == null) {
                f19835c = new C7365a();
            }
        }
        return f19835c;
    }

    @Override // p144i.AbstractC7371d
    /* renamed from: a */
    public void mo20829a(Runnable runnable) {
        this.f19838a.mo20829a(runnable);
    }

    @Override // p144i.AbstractC7371d
    /* renamed from: b */
    public boolean mo20828b() {
        return this.f19838a.mo20828b();
    }

    @Override // p144i.AbstractC7371d
    /* renamed from: c */
    public void mo20827c(Runnable runnable) {
        this.f19838a.mo20827c(runnable);
    }
}
