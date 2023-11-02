package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p052d.C5706a;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class DialogInterfaceC0287a extends DialogC0335p implements DialogInterface {

    /* renamed from: n */
    final AlertController f934n;

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0288a {

        /* renamed from: a */
        private final AlertController.C0278b f935a;

        /* renamed from: b */
        private final int f936b;

        public C0288a(Context context) {
            this(context, DialogInterfaceC0287a.m40725i(context, 0));
        }

        /* renamed from: a */
        public C0288a m40724a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0278b c0278b = this.f935a;
            c0278b.f908w = listAdapter;
            c0278b.f909x = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0288a m40723b(View view) {
            this.f935a.f892g = view;
            return this;
        }

        /* renamed from: c */
        public C0288a m40722c(Drawable drawable) {
            this.f935a.f889d = drawable;
            return this;
        }

        public DialogInterfaceC0287a create() {
            DialogInterfaceC0287a dialogInterfaceC0287a = new DialogInterfaceC0287a(this.f935a.f886a, this.f936b);
            this.f935a.m40748a(dialogInterfaceC0287a.f934n);
            dialogInterfaceC0287a.setCancelable(this.f935a.f903r);
            if (this.f935a.f903r) {
                dialogInterfaceC0287a.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0287a.setOnCancelListener(this.f935a.f904s);
            dialogInterfaceC0287a.setOnDismissListener(this.f935a.f905t);
            DialogInterface.OnKeyListener onKeyListener = this.f935a.f906u;
            if (onKeyListener != null) {
                dialogInterfaceC0287a.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0287a;
        }

        /* renamed from: d */
        public C0288a m40721d(DialogInterface.OnKeyListener onKeyListener) {
            this.f935a.f906u = onKeyListener;
            return this;
        }

        /* renamed from: e */
        public C0288a m40720e(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0278b c0278b = this.f935a;
            c0278b.f908w = listAdapter;
            c0278b.f909x = onClickListener;
            c0278b.f879I = i;
            c0278b.f878H = true;
            return this;
        }

        public Context getContext() {
            return this.f935a.f886a;
        }

        public C0288a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0278b c0278b = this.f935a;
            c0278b.f897l = c0278b.f886a.getText(i);
            this.f935a.f899n = onClickListener;
            return this;
        }

        public C0288a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0278b c0278b = this.f935a;
            c0278b.f894i = c0278b.f886a.getText(i);
            this.f935a.f896k = onClickListener;
            return this;
        }

        public C0288a setTitle(CharSequence charSequence) {
            this.f935a.f891f = charSequence;
            return this;
        }

        public C0288a setView(View view) {
            AlertController.C0278b c0278b = this.f935a;
            c0278b.f911z = view;
            c0278b.f910y = 0;
            c0278b.f875E = false;
            return this;
        }

        public C0288a(Context context, int i) {
            this.f935a = new AlertController.C0278b(new ContextThemeWrapper(context, DialogInterfaceC0287a.m40725i(context, i)));
            this.f936b = i;
        }
    }

    protected DialogInterfaceC0287a(Context context, int i) {
        super(context, m40725i(context, i));
        this.f934n = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: i */
    static int m40725i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5706a.f16061o, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: h */
    public ListView m40726h() {
        return this.f934n.m40771d();
    }

    @Override // androidx.appcompat.app.DialogC0335p, androidx.activity.DialogC0255f, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f934n.m40770e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f934n.m40769f(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f934n.m40768g(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.DialogC0335p, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f934n.m40759p(charSequence);
    }
}