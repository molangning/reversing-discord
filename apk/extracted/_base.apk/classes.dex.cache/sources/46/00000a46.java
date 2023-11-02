package p032c;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.C0267a;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, m14357d2 = {"Lc/b;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Landroidx/activity/result/a;", "Landroid/content/Context;", "context", "input", "d", "", "resultCode", "intent", "e", "<init>", "()V", "a", "activity_release"}, m14356k = 1, m14355mv = {1, 7, 1})
/* renamed from: c.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2374b extends ActivityResultContract<Intent, C0267a> {

    /* renamed from: a */
    public static final C2375a f6493a = new C2375a(null);

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lc/b$a;", "", "", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "Ljava/lang/String;", "<init>", "()V", "activity_release"}, m14356k = 1, m14355mv = {1, 7, 1})
    /* renamed from: c.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2375a {
        private C2375a() {
        }

        public /* synthetic */ C2375a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: d */
    public Intent mo33578a(Context context, Intent input) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(input, "input");
        return input;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: e */
    public C0267a mo33577c(int i, Intent intent) {
        return new C0267a(i, intent);
    }
}