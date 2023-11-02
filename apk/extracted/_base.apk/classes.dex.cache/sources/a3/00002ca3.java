package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C4907l;
import com.google.android.material.internal.C4911o;
import com.google.android.material.textfield.TextInputLayout;
import p155ia.C7484f;
import p155ia.C7486h;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: j */
    private final Chip f14127j;

    /* renamed from: k */
    private final TextInputLayout f14128k;

    /* renamed from: l */
    private final EditText f14129l;

    /* renamed from: m */
    private TextWatcher f14130m;

    /* renamed from: n */
    private TextView f14131n;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5017b extends C4907l {
        private C5017b() {
            ChipTextInputComboView.this = r1;
        }

        @Override // com.google.android.material.internal.C4907l, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f14127j.setText(ChipTextInputComboView.this.m26528c("00"));
            } else {
                ChipTextInputComboView.this.f14127j.setText(ChipTextInputComboView.this.m26528c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public String m26528c(CharSequence charSequence) {
        return C5034d.m26490a(getResources(), charSequence);
    }

    /* renamed from: d */
    private void m26527d() {
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.f14129l.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f14127j.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m26527d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int i;
        this.f14127j.setChecked(z);
        EditText editText = this.f14129l;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        editText.setVisibility(i);
        Chip chip = this.f14127j;
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            C4911o.m26930h(this.f14129l);
            if (!TextUtils.isEmpty(this.f14129l.getText())) {
                EditText editText2 = this.f14129l;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f14127j.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f14127j.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f14127j.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C7486h.f20236g, (ViewGroup) this, false);
        this.f14127j = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C7486h.f20237h, (ViewGroup) this, false);
        this.f14128k = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f14129l = editText;
        editText.setVisibility(4);
        C5017b c5017b = new C5017b();
        this.f14130m = c5017b;
        editText.addTextChangedListener(c5017b);
        m26527d();
        addView(chip);
        addView(textInputLayout);
        this.f14131n = (TextView) findViewById(C7484f.f20212l);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}