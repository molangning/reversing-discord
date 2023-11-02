package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p052d.C5715j;
import p091f0.C6286a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class AppCompatEmojiEditTextHelper {

    /* renamed from: a */
    private final EditText f1530a;

    /* renamed from: b */
    private final C6286a f1531b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatEmojiEditTextHelper(EditText editText) {
        this.f1530a = editText;
        this.f1531b = new C6286a(editText, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public KeyListener m40215a(KeyListener keyListener) {
        if (m40214b(keyListener)) {
            return this.f1531b.m23052a(keyListener);
        }
        return keyListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m40214b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m40213c() {
        return this.f1531b.m23051b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m40212d(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1530a.getContext().obtainStyledAttributes(attributeSet, C5715j.f16376g0, i, 0);
        try {
            int i2 = C5715j.f16446u0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            m40210f(z);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public InputConnection m40211e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1531b.m23050c(inputConnection, editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m40210f(boolean z) {
        this.f1531b.m23049d(z);
    }
}
