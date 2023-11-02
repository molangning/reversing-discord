package p091f0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.C1138f;
import com.facebook.react.uimanager.ViewDefaults;

/* renamed from: f0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C6286a {

    /* renamed from: a */
    private final C6288b f17780a;

    /* renamed from: b */
    private int f17781b = ViewDefaults.NUMBER_OF_LINES;

    /* renamed from: c */
    private int f17782c = 0;

    /* renamed from: f0.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C6287a extends C6288b {

        /* renamed from: a */
        private final EditText f17783a;

        /* renamed from: b */
        private final C6300g f17784b;

        C6287a(EditText editText, boolean z) {
            this.f17783a = editText;
            C6300g c6300g = new C6300g(editText, z);
            this.f17784b = c6300g;
            editText.addTextChangedListener(c6300g);
            editText.setEditableFactory(C6289b.getInstance());
        }

        @Override // p091f0.C6286a.C6288b
        /* renamed from: a */
        KeyListener mo23048a(KeyListener keyListener) {
            if (keyListener instanceof C6294e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new C6294e(keyListener);
        }

        @Override // p091f0.C6286a.C6288b
        /* renamed from: b */
        boolean mo23047b() {
            return this.f17784b.m23017b();
        }

        @Override // p091f0.C6286a.C6288b
        /* renamed from: c */
        InputConnection mo23046c(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof C6290c) {
                return inputConnection;
            }
            return new C6290c(this.f17783a, inputConnection, editorInfo);
        }

        @Override // p091f0.C6286a.C6288b
        /* renamed from: d */
        void mo23045d(boolean z) {
            this.f17784b.m23015d(z);
        }
    }

    /* renamed from: f0.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C6288b {
        C6288b() {
        }

        /* renamed from: a */
        KeyListener mo23048a(KeyListener keyListener) {
            throw null;
        }

        /* renamed from: b */
        boolean mo23047b() {
            throw null;
        }

        /* renamed from: c */
        InputConnection mo23046c(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        /* renamed from: d */
        void mo23045d(boolean z) {
            throw null;
        }
    }

    public C6286a(EditText editText, boolean z) {
        C1138f.m37823g(editText, "editText cannot be null");
        this.f17780a = new C6287a(editText, z);
    }

    /* renamed from: a */
    public KeyListener m23052a(KeyListener keyListener) {
        return this.f17780a.mo23048a(keyListener);
    }

    /* renamed from: b */
    public boolean m23051b() {
        return this.f17780a.mo23047b();
    }

    /* renamed from: c */
    public InputConnection m23050c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f17780a.mo23046c(inputConnection, editorInfo);
    }

    /* renamed from: d */
    public void m23049d(boolean z) {
        this.f17780a.mo23045d(z);
    }
}
