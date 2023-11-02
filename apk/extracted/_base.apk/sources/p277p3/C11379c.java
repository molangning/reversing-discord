package p277p3;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: p3.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11379c {

    /* renamed from: b */
    private static final C11379c f29622b = new C11379c();

    /* renamed from: c */
    private static boolean f29623c = true;

    /* renamed from: a */
    private final Queue<EnumC11380a> f29624a = new ArrayBlockingQueue(20);

    /* renamed from: p3.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC11380a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private C11379c() {
    }

    /* renamed from: a */
    public static C11379c m8197a() {
        return f29623c ? new C11379c() : f29622b;
    }

    /* renamed from: b */
    public void m8196b(EnumC11380a enumC11380a) {
        if (!f29623c) {
            return;
        }
        if (this.f29624a.size() + 1 > 20) {
            this.f29624a.poll();
        }
        this.f29624a.add(enumC11380a);
    }

    public String toString() {
        return this.f29624a.toString();
    }
}
