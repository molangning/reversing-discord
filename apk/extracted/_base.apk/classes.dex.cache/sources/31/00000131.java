package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m14357d2 = {"Landroidx/activity/result/contract/ActivityResultContract;", "I", "O", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;", "", "resultCode", "intent", "c", "(ILandroid/content/Intent;)Ljava/lang/Object;", "Landroidx/activity/result/contract/ActivityResultContract$a;", "b", "(Landroid/content/Context;Ljava/lang/Object;)Landroidx/activity/result/contract/ActivityResultContract$a;", "<init>", "()V", "activity_release"}, m14356k = 1, m14355mv = {1, 7, 1})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class ActivityResultContract<I, O> {

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, m14357d2 = {"Landroidx/activity/result/contract/ActivityResultContract$a;", "T", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "activity_release"}, m14356k = 1, m14355mv = {1, 7, 1})
    /* renamed from: androidx.activity.result.contract.ActivityResultContract$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0273a<T> {

        /* renamed from: a */
        private final T f821a;

        public C0273a(T t) {
            this.f821a = t;
        }

        /* renamed from: a */
        public final T m40780a() {
            return this.f821a;
        }
    }

    /* renamed from: a */
    public abstract Intent mo33578a(Context context, I i);

    /* renamed from: b */
    public C0273a<O> mo33583b(Context context, I i) {
        C9612q.m13917h(context, "context");
        return null;
    }

    /* renamed from: c */
    public abstract O mo33577c(int i, Intent intent);
}