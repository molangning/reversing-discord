package p091f0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C1500e;

/* renamed from: f0.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C6294e implements KeyListener {

    /* renamed from: a */
    private final KeyListener f17794a;

    /* renamed from: b */
    private final C6295a f17795b;

    /* renamed from: f0.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6295a {
        /* renamed from: a */
        public boolean m23038a(Editable editable, int i, KeyEvent keyEvent) {
            return C1500e.m36652f(editable, i, keyEvent);
        }
    }

    public C6294e(KeyListener keyListener) {
        this(keyListener, new C6295a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f17794a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f17794a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        if (!this.f17795b.m23038a(editable, i, keyEvent) && !this.f17794a.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f17794a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f17794a.onKeyUp(view, editable, i, keyEvent);
    }

    C6294e(KeyListener keyListener, C6295a c6295a) {
        this.f17794a = keyListener;
        this.f17795b = c6295a;
    }
}