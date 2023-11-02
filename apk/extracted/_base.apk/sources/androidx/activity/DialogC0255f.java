package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0015J\b\u0010\n\u001a\u00020\bH\u0015J\b\u0010\u000b\u001a\u00020\bH\u0015J\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\bH\u0017R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, m14357d2 = {"Landroidx/activity/f;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/k;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onStart", "onStop", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "onBackPressed", "Landroidx/lifecycle/LifecycleRegistry;", "j", "Landroidx/lifecycle/LifecycleRegistry;", "_lifecycleRegistry", "k", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "()V", "onBackPressedDispatcher", "b", "()Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "activity_release"}, m14356k = 1, m14355mv = {1, 7, 1})
/* renamed from: androidx.activity.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class DialogC0255f extends Dialog implements LifecycleOwner, InterfaceC0260k {

    /* renamed from: j */
    private LifecycleRegistry f780j;

    /* renamed from: k */
    private final OnBackPressedDispatcher f781k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0255f(Context context, int i) {
        super(context, i);
        C9612q.m13917h(context, "context");
        this.f781k = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.e
            @Override // java.lang.Runnable
            public final void run() {
                DialogC0255f.m40817c(DialogC0255f.this);
            }
        });
    }

    /* renamed from: b */
    private final LifecycleRegistry m40818b() {
        LifecycleRegistry lifecycleRegistry = this.f780j;
        if (lifecycleRegistry == null) {
            LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
            this.f780j = lifecycleRegistry2;
            return lifecycleRegistry2;
        }
        return lifecycleRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m40817c(DialogC0255f this$0) {
        C9612q.m13917h(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return m40818b();
    }

    @Override // androidx.activity.InterfaceC0260k
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f781k;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f781k.m40830f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f781k.m40829g(getOnBackInvokedDispatcher());
        }
        m40818b().m36118h(Lifecycle.EnumC1651b.ON_CREATE);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        m40818b().m36118h(Lifecycle.EnumC1651b.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStop() {
        m40818b().m36118h(Lifecycle.EnumC1651b.ON_DESTROY);
        this.f780j = null;
        super.onStop();
    }
}
