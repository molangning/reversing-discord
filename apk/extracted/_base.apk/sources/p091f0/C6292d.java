package p091f0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C1500e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: f0.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C6292d implements InputFilter {

    /* renamed from: a */
    private final TextView f17790a;

    /* renamed from: b */
    private C1500e.AbstractC1506e f17791b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6293a extends C1500e.AbstractC1506e {

        /* renamed from: a */
        private final Reference<TextView> f17792a;

        /* renamed from: b */
        private final Reference<C6292d> f17793b;

        C6293a(TextView textView, C6292d c6292d) {
            this.f17792a = new WeakReference(textView);
            this.f17793b = new WeakReference(c6292d);
        }

        /* renamed from: c */
        private boolean m23039c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.C1500e.AbstractC1506e
        /* renamed from: b */
        public void mo23013b() {
            CharSequence text;
            CharSequence m36643o;
            super.mo23013b();
            TextView textView = this.f17792a.get();
            if (!m23039c(textView, this.f17793b.get()) || !textView.isAttachedToWindow() || text == (m36643o = C1500e.m36656b().m36643o((text = textView.getText())))) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(m36643o);
            int selectionEnd = Selection.getSelectionEnd(m36643o);
            textView.setText(m36643o);
            if (m36643o instanceof Spannable) {
                C6292d.m23040b((Spannable) m36643o, selectionStart, selectionEnd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6292d(TextView textView) {
        this.f17790a = textView;
    }

    /* renamed from: a */
    private C1500e.AbstractC1506e m23041a() {
        if (this.f17791b == null) {
            this.f17791b = new C6293a(this.f17790a, this);
        }
        return this.f17791b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m23040b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f17790a.isInEditMode()) {
            return charSequence;
        }
        int m36654d = C1500e.m36656b().m36654d();
        if (m36654d != 0) {
            boolean z = true;
            if (m36654d != 1) {
                if (m36654d != 3) {
                    return charSequence;
                }
            } else {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f17790a.getText()) {
                    z = false;
                }
                if (z && charSequence != null) {
                    if (i != 0 || i2 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i, i2);
                    }
                    return C1500e.m36656b().m36642p(charSequence, 0, charSequence.length());
                }
                return charSequence;
            }
        }
        C1500e.m36656b().m36639s(m23041a());
        return charSequence;
    }
}
