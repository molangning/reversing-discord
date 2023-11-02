package p091f0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C1500e;
import com.facebook.react.uimanager.ViewDefaults;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f0.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C6300g implements TextWatcher {

    /* renamed from: j */
    private final EditText f17801j;

    /* renamed from: k */
    private final boolean f17802k;

    /* renamed from: l */
    private C1500e.AbstractC1506e f17803l;

    /* renamed from: m */
    private int f17804m = ViewDefaults.NUMBER_OF_LINES;

    /* renamed from: n */
    private int f17805n = 0;

    /* renamed from: o */
    private boolean f17806o = true;

    /* renamed from: f0.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6301a extends C1500e.AbstractC1506e {

        /* renamed from: a */
        private final Reference<EditText> f17807a;

        C6301a(EditText editText) {
            this.f17807a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C1500e.AbstractC1506e
        /* renamed from: b */
        public void mo23013b() {
            super.mo23013b();
            C6300g.m23016c(this.f17807a.get(), 1);
        }
    }

    public C6300g(EditText editText, boolean z) {
        this.f17801j = editText;
        this.f17802k = z;
    }

    /* renamed from: a */
    private C1500e.AbstractC1506e m23018a() {
        if (this.f17803l == null) {
            this.f17803l = new C6301a(this.f17801j);
        }
        return this.f17803l;
    }

    /* renamed from: c */
    static void m23016c(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C1500e.m36656b().m36643o(editableText);
            C6292d.m23040b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: e */
    private boolean m23014e() {
        return (this.f17806o && (this.f17802k || C1500e.m36650h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    /* renamed from: b */
    public boolean m23017b() {
        return this.f17806o;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: d */
    public void m23015d(boolean z) {
        if (this.f17806o != z) {
            if (this.f17803l != null) {
                C1500e.m36656b().m36638t(this.f17803l);
            }
            this.f17806o = z;
            if (z) {
                m23016c(this.f17801j, C1500e.m36656b().m36654d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f17801j.isInEditMode() && !m23014e() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int m36654d = C1500e.m36656b().m36654d();
            if (m36654d != 0) {
                if (m36654d != 1) {
                    if (m36654d != 3) {
                        return;
                    }
                } else {
                    C1500e.m36656b().m36640r((Spannable) charSequence, i, i + i3, this.f17804m, this.f17805n);
                    return;
                }
            }
            C1500e.m36656b().m36639s(m23018a());
        }
    }
}