package p091f0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C1500e;

/* renamed from: f0.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C6290c extends InputConnectionWrapper {

    /* renamed from: a */
    private final TextView f17788a;

    /* renamed from: b */
    private final C6291a f17789b;

    /* renamed from: f0.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6291a {
        /* renamed from: a */
        public boolean m23043a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return C1500e.m36653e(inputConnection, editable, i, i2, z);
        }

        /* renamed from: b */
        public void m23042b(EditorInfo editorInfo) {
            if (C1500e.m36650h()) {
                C1500e.m36656b().m36637u(editorInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6290c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C6291a());
    }

    /* renamed from: a */
    private Editable m23044a() {
        return this.f17788a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        if (!this.f17789b.m23043a(this, m23044a(), i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (!this.f17789b.m23043a(this, m23044a(), i, i2, true) && !super.deleteSurroundingTextInCodePoints(i, i2)) {
            return false;
        }
        return true;
    }

    C6290c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, C6291a c6291a) {
        super(inputConnection, false);
        this.f17788a = textView;
        this.f17789b = c6291a;
        c6291a.m23042b(editorInfo);
    }
}
