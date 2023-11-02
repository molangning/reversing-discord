package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.C4907l;
import com.google.android.material.textfield.TextInputLayout;
import p155ia.C7483e;
import p155ia.C7487i;

/* renamed from: com.google.android.material.textfield.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5007k extends AbstractC4999f {

    /* renamed from: e */
    private final TextWatcher f14110e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC4966f f14111f;

    /* renamed from: g */
    private final TextInputLayout.InterfaceC4967g f14112g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5008a extends C4907l {
        C5008a() {
            C5007k.this = r1;
        }

        @Override // com.google.android.material.internal.C4907l, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C5007k c5007k = C5007k.this;
            c5007k.f14076c.setChecked(!c5007k.m26565g());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5009b implements TextInputLayout.InterfaceC4966f {
        C5009b() {
            C5007k.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4966f
        /* renamed from: a */
        public void mo26563a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            C5007k c5007k = C5007k.this;
            c5007k.f14076c.setChecked(!c5007k.m26565g());
            editText.removeTextChangedListener(C5007k.this.f14110e);
            editText.addTextChangedListener(C5007k.this.f14110e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.k$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5010c implements TextInputLayout.InterfaceC4967g {

        /* renamed from: com.google.android.material.textfield.k$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class RunnableC5011a implements Runnable {

            /* renamed from: j */
            final /* synthetic */ EditText f14116j;

            RunnableC5011a(EditText editText) {
                C5010c.this = r1;
                this.f14116j = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f14116j.removeTextChangedListener(C5007k.this.f14110e);
            }
        }

        C5010c() {
            C5007k.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4967g
        /* renamed from: a */
        public void mo26562a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new RunnableC5011a(editText));
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.k$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class View$OnClickListenerC5012d implements View.OnClickListener {
        View$OnClickListenerC5012d() {
            C5007k.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C5007k.this.f14074a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (C5007k.this.m26565g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            C5007k.this.f14074a.m26739U();
        }
    }

    public C5007k(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.f14110e = new C5008a();
        this.f14111f = new C5009b();
        this.f14112g = new C5010c();
    }

    /* renamed from: g */
    public boolean m26565g() {
        EditText editText = this.f14074a.getEditText();
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m26564h(EditText editText) {
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.AbstractC4999f
    /* renamed from: a */
    public void mo26568a() {
        TextInputLayout textInputLayout = this.f14074a;
        int i = this.f14077d;
        if (i == 0) {
            i = C7483e.f20178a;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f14074a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C7487i.f20263p));
        this.f14074a.setEndIconVisible(true);
        this.f14074a.setEndIconCheckable(true);
        this.f14074a.setEndIconOnClickListener(new View$OnClickListenerC5012d());
        this.f14074a.m26721g(this.f14111f);
        this.f14074a.m26719h(this.f14112g);
        EditText editText = this.f14074a.getEditText();
        if (m26564h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}