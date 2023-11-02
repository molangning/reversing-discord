package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0287a;
import androidx.appcompat.view.menu.InterfaceC0405m;
import p052d.C5712g;

/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class DialogInterface$OnKeyListenerC0392h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0405m.InterfaceC0406a {

    /* renamed from: j */
    private C0389g f1356j;

    /* renamed from: k */
    private DialogInterfaceC0287a f1357k;

    /* renamed from: l */
    C0386e f1358l;

    /* renamed from: m */
    private InterfaceC0405m.InterfaceC0406a f1359m;

    public DialogInterface$OnKeyListenerC0392h(C0389g c0389g) {
        this.f1356j = c0389g;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m.InterfaceC0406a
    /* renamed from: a */
    public void mo39969a(C0389g c0389g, boolean z) {
        if (z || c0389g == this.f1356j) {
            m40346c();
        }
        InterfaceC0405m.InterfaceC0406a interfaceC0406a = this.f1359m;
        if (interfaceC0406a != null) {
            interfaceC0406a.mo39969a(c0389g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m.InterfaceC0406a
    /* renamed from: b */
    public boolean mo39968b(C0389g c0389g) {
        InterfaceC0405m.InterfaceC0406a interfaceC0406a = this.f1359m;
        if (interfaceC0406a != null) {
            return interfaceC0406a.mo39968b(c0389g);
        }
        return false;
    }

    /* renamed from: c */
    public void m40346c() {
        DialogInterfaceC0287a dialogInterfaceC0287a = this.f1357k;
        if (dialogInterfaceC0287a != null) {
            dialogInterfaceC0287a.dismiss();
        }
    }

    /* renamed from: d */
    public void m40345d(IBinder iBinder) {
        C0389g c0389g = this.f1356j;
        DialogInterfaceC0287a.C0288a c0288a = new DialogInterfaceC0287a.C0288a(c0389g.m40352u());
        C0386e c0386e = new C0386e(c0288a.getContext(), C5712g.f16194j);
        this.f1358l = c0386e;
        c0386e.mo40296c(this);
        this.f1356j.m40370b(this.f1358l);
        c0288a.m40724a(this.f1358l.m40401i(), this);
        View m40348y = c0389g.m40348y();
        if (m40348y != null) {
            c0288a.m40723b(m40348y);
        } else {
            c0288a.m40722c(c0389g.m40350w()).setTitle(c0389g.m40349x());
        }
        c0288a.m40721d(this);
        DialogInterfaceC0287a create = c0288a.create();
        this.f1357k = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1357k.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1357k.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1356j.m40386L((C0393i) this.f1358l.m40401i().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1358l.mo39992a(this.f1356j, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1357k.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1357k.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1356j.m40364e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1356j.performShortcut(i, keyEvent, 0);
    }
}