package p091f0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.C1138f;
import androidx.emoji2.text.C1500e;

/* renamed from: f0.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C6296f {

    /* renamed from: a */
    private final C6298b f17796a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6297a extends C6298b {

        /* renamed from: a */
        private final TextView f17797a;

        /* renamed from: b */
        private final C6292d f17798b;

        /* renamed from: c */
        private boolean f17799c = true;

        C6297a(TextView textView) {
            this.f17797a = textView;
            this.f17798b = new C6292d(textView);
        }

        /* renamed from: f */
        private InputFilter[] m23032f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f17798b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f17798b;
            return inputFilterArr2;
        }

        /* renamed from: g */
        private SparseArray<InputFilter> m23031g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C6292d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        /* renamed from: h */
        private InputFilter[] m23030h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> m23031g = m23031g(inputFilterArr);
            if (m23031g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - m23031g.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (m23031g.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: j */
        private TransformationMethod m23028j(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C6302h) {
                return ((C6302h) transformationMethod).m23012a();
            }
            return transformationMethod;
        }

        /* renamed from: k */
        private void m23027k() {
            this.f17797a.setFilters(mo23024a(this.f17797a.getFilters()));
        }

        /* renamed from: m */
        private TransformationMethod m23025m(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C6302h) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new C6302h(transformationMethod);
        }

        @Override // p091f0.C6296f.C6298b
        /* renamed from: a */
        InputFilter[] mo23024a(InputFilter[] inputFilterArr) {
            if (!this.f17799c) {
                return m23030h(inputFilterArr);
            }
            return m23032f(inputFilterArr);
        }

        @Override // p091f0.C6296f.C6298b
        /* renamed from: b */
        public boolean mo23023b() {
            return this.f17799c;
        }

        @Override // p091f0.C6296f.C6298b
        /* renamed from: c */
        void mo23022c(boolean z) {
            if (z) {
                m23026l();
            }
        }

        @Override // p091f0.C6296f.C6298b
        /* renamed from: d */
        void mo23021d(boolean z) {
            this.f17799c = z;
            m23026l();
            m23027k();
        }

        @Override // p091f0.C6296f.C6298b
        /* renamed from: e */
        TransformationMethod mo23020e(TransformationMethod transformationMethod) {
            if (this.f17799c) {
                return m23025m(transformationMethod);
            }
            return m23028j(transformationMethod);
        }

        /* renamed from: i */
        void m23029i(boolean z) {
            this.f17799c = z;
        }

        /* renamed from: l */
        void m23026l() {
            this.f17797a.setTransformationMethod(mo23020e(this.f17797a.getTransformationMethod()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6298b {
        C6298b() {
        }

        /* renamed from: a */
        InputFilter[] mo23024a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* renamed from: b */
        public boolean mo23023b() {
            throw null;
        }

        /* renamed from: c */
        void mo23022c(boolean z) {
            throw null;
        }

        /* renamed from: d */
        void mo23021d(boolean z) {
            throw null;
        }

        /* renamed from: e */
        TransformationMethod mo23020e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6299c extends C6298b {

        /* renamed from: a */
        private final C6297a f17800a;

        C6299c(TextView textView) {
            this.f17800a = new C6297a(textView);
        }

        /* renamed from: f */
        private boolean m23019f() {
            return !C1500e.m36650h();
        }

        @Override // p091f0.C6296f.C6298b
        /* renamed from: a */
        InputFilter[] mo23024a(InputFilter[] inputFilterArr) {
            if (m23019f()) {
                return inputFilterArr;
            }
            return this.f17800a.mo23024a(inputFilterArr);
        }

        @Override // p091f0.C6296f.C6298b
        /* renamed from: b */
        public boolean mo23023b() {
            return this.f17800a.mo23023b();
        }

        @Override // p091f0.C6296f.C6298b
        /* renamed from: c */
        void mo23022c(boolean z) {
            if (m23019f()) {
                return;
            }
            this.f17800a.mo23022c(z);
        }

        @Override // p091f0.C6296f.C6298b
        /* renamed from: d */
        void mo23021d(boolean z) {
            if (m23019f()) {
                this.f17800a.m23029i(z);
            } else {
                this.f17800a.mo23021d(z);
            }
        }

        @Override // p091f0.C6296f.C6298b
        /* renamed from: e */
        TransformationMethod mo23020e(TransformationMethod transformationMethod) {
            if (m23019f()) {
                return transformationMethod;
            }
            return this.f17800a.mo23020e(transformationMethod);
        }
    }

    public C6296f(TextView textView, boolean z) {
        C1138f.m37823g(textView, "textView cannot be null");
        if (!z) {
            this.f17796a = new C6299c(textView);
        } else {
            this.f17796a = new C6297a(textView);
        }
    }

    /* renamed from: a */
    public InputFilter[] m23037a(InputFilter[] inputFilterArr) {
        return this.f17796a.mo23024a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m23036b() {
        return this.f17796a.mo23023b();
    }

    /* renamed from: c */
    public void m23035c(boolean z) {
        this.f17796a.mo23022c(z);
    }

    /* renamed from: d */
    public void m23034d(boolean z) {
        this.f17796a.mo23021d(z);
    }

    /* renamed from: e */
    public TransformationMethod m23033e(TransformationMethod transformationMethod) {
        return this.f17796a.mo23020e(transformationMethod);
    }
}