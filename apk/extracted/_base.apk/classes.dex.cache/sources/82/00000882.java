package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.C0624a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p342t0.InterfaceC12569b;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC1926a {

    /* renamed from: a */
    protected final C0624a<String, Method> f5320a;

    /* renamed from: b */
    protected final C0624a<String, Method> f5321b;

    /* renamed from: c */
    protected final C0624a<String, Class> f5322c;

    public AbstractC1926a(C0624a<String, Method> c0624a, C0624a<String, Method> c0624a2, C0624a<String, Class> c0624a3) {
        this.f5320a = c0624a;
        this.f5321b = c0624a2;
        this.f5322c = c0624a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m35002N(InterfaceC12569b interfaceC12569b) {
        try {
            mo34982I(m35001c(interfaceC12569b.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(interfaceC12569b.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m35001c(Class<? extends InterfaceC12569b> cls) {
        Class cls2 = this.f5322c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f5322c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    /* renamed from: d */
    private Method m35000d(String str) {
        Method method = this.f5320a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC1926a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1926a.class);
            this.f5320a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: e */
    private Method m34999e(Class cls) {
        Method method = this.f5321b.get(cls.getName());
        if (method == null) {
            Class m35001c = m35001c(cls);
            System.currentTimeMillis();
            Method declaredMethod = m35001c.getDeclaredMethod("write", cls, AbstractC1926a.class);
            this.f5321b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: A */
    protected abstract void mo34986A(byte[] bArr);

    /* renamed from: B */
    public void m35010B(byte[] bArr, int i) {
        mo34972w(i);
        mo34986A(bArr);
    }

    /* renamed from: C */
    protected abstract void mo34985C(CharSequence charSequence);

    /* renamed from: D */
    public void m35009D(CharSequence charSequence, int i) {
        mo34972w(i);
        mo34985C(charSequence);
    }

    /* renamed from: E */
    protected abstract void mo34984E(int i);

    /* renamed from: F */
    public void m35008F(int i, int i2) {
        mo34972w(i2);
        mo34984E(i);
    }

    /* renamed from: G */
    protected abstract void mo34983G(Parcelable parcelable);

    /* renamed from: H */
    public void m35007H(Parcelable parcelable, int i) {
        mo34972w(i);
        mo34983G(parcelable);
    }

    /* renamed from: I */
    protected abstract void mo34982I(String str);

    /* renamed from: J */
    public void m35006J(String str, int i) {
        mo34972w(i);
        mo34982I(str);
    }

    /* renamed from: K */
    protected <T extends InterfaceC12569b> void m35005K(T t, AbstractC1926a abstractC1926a) {
        try {
            m34999e(t.getClass()).invoke(null, t, abstractC1926a);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: L */
    public void m35004L(InterfaceC12569b interfaceC12569b) {
        if (interfaceC12569b == null) {
            mo34982I(null);
            return;
        }
        m35002N(interfaceC12569b);
        AbstractC1926a mo34980b = mo34980b();
        m35005K(interfaceC12569b, mo34980b);
        mo34980b.mo34981a();
    }

    /* renamed from: M */
    public void m35003M(InterfaceC12569b interfaceC12569b, int i) {
        mo34972w(i);
        m35004L(interfaceC12569b);
    }

    /* renamed from: a */
    protected abstract void mo34981a();

    /* renamed from: b */
    protected abstract AbstractC1926a mo34980b();

    /* renamed from: f */
    public boolean m34998f() {
        return false;
    }

    /* renamed from: g */
    protected abstract boolean mo34979g();

    /* renamed from: h */
    public boolean m34997h(boolean z, int i) {
        if (!mo34976m(i)) {
            return z;
        }
        return mo34979g();
    }

    /* renamed from: i */
    protected abstract byte[] mo34978i();

    /* renamed from: j */
    public byte[] m34996j(byte[] bArr, int i) {
        if (!mo34976m(i)) {
            return bArr;
        }
        return mo34978i();
    }

    /* renamed from: k */
    protected abstract CharSequence mo34977k();

    /* renamed from: l */
    public CharSequence m34995l(CharSequence charSequence, int i) {
        if (!mo34976m(i)) {
            return charSequence;
        }
        return mo34977k();
    }

    /* renamed from: m */
    protected abstract boolean mo34976m(int i);

    /* renamed from: n */
    protected <T extends InterfaceC12569b> T m34994n(String str, AbstractC1926a abstractC1926a) {
        try {
            return (T) m35000d(str).invoke(null, abstractC1926a);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: o */
    protected abstract int mo34975o();

    /* renamed from: p */
    public int m34993p(int i, int i2) {
        if (!mo34976m(i2)) {
            return i;
        }
        return mo34975o();
    }

    /* renamed from: q */
    protected abstract <T extends Parcelable> T mo34974q();

    /* renamed from: r */
    public <T extends Parcelable> T m34992r(T t, int i) {
        if (!mo34976m(i)) {
            return t;
        }
        return (T) mo34974q();
    }

    /* renamed from: s */
    protected abstract String mo34973s();

    /* renamed from: t */
    public String m34991t(String str, int i) {
        if (!mo34976m(i)) {
            return str;
        }
        return mo34973s();
    }

    /* renamed from: u */
    public <T extends InterfaceC12569b> T m34990u() {
        String mo34973s = mo34973s();
        if (mo34973s == null) {
            return null;
        }
        return (T) m34994n(mo34973s, mo34980b());
    }

    /* renamed from: v */
    public <T extends InterfaceC12569b> T m34989v(T t, int i) {
        if (!mo34976m(i)) {
            return t;
        }
        return (T) m34990u();
    }

    /* renamed from: w */
    protected abstract void mo34972w(int i);

    /* renamed from: x */
    public void m34988x(boolean z, boolean z2) {
    }

    /* renamed from: y */
    protected abstract void mo34971y(boolean z);

    /* renamed from: z */
    public void m34987z(boolean z, int i) {
        mo34972w(i);
        mo34971y(z);
    }
}