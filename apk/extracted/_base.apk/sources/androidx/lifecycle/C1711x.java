package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.p018os.C1055e;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\fB\u001f\b\u0016\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\t\b\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J(\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR(\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00130\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m14357d2 = {"Landroidx/lifecycle/x;", "", "Landroidx/savedstate/SavedStateRegistry$c;", "d", "T", "", "key", "value", "", "f", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "a", "Ljava/util/Map;", "regular", "b", "savedStateProviders", "c", "liveDatas", "Lkotlinx/coroutines/flow/MutableStateFlow;", "flows", "e", "Landroidx/savedstate/SavedStateRegistry$c;", "savedStateProvider", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "lifecycle-viewmodel-savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1711x {

    /* renamed from: f */
    public static final C1712a f4518f = new C1712a(null);

    /* renamed from: g */
    private static final Class<? extends Object>[] f4519g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    private final Map<String, Object> f4520a;

    /* renamed from: b */
    private final Map<String, SavedStateRegistry.InterfaceC1822c> f4521b;

    /* renamed from: c */
    private final Map<String, Object> f4522c;

    /* renamed from: d */
    private final Map<String, MutableStateFlow<Object>> f4523d;

    /* renamed from: e */
    private final SavedStateRegistry.InterfaceC1822c f4524e;

    @Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007R$\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, m14357d2 = {"Landroidx/lifecycle/x$a;", "", "Landroid/os/Bundle;", "restoredState", "defaultState", "Landroidx/lifecycle/x;", "a", "value", "", "b", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1712a {
        private C1712a() {
        }

        public /* synthetic */ C1712a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1711x m36005a(Bundle bundle, Bundle bundle2) {
            boolean z;
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C1711x();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    C9612q.m13918g(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new C1711x(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    if (obj != null) {
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                return new C1711x(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        /* renamed from: b */
        public final boolean m36004b(Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : C1711x.f4519g) {
                C9612q.m13920e(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C1711x(Map<String, ? extends Object> initialState) {
        C9612q.m13917h(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4520a = linkedHashMap;
        this.f4521b = new LinkedHashMap();
        this.f4522c = new LinkedHashMap();
        this.f4523d = new LinkedHashMap();
        this.f4524e = new SavedStateRegistry.InterfaceC1822c() { // from class: androidx.lifecycle.w
            @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1822c
            /* renamed from: a */
            public final Bundle mo35308a() {
                Bundle m36007e;
                m36007e = C1711x.m36007e(C1711x.this);
                return m36007e;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* renamed from: c */
    public static final C1711x m36009c(Bundle bundle, Bundle bundle2) {
        return f4518f.m36005a(bundle, bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final Bundle m36007e(C1711x this$0) {
        Map m6742t;
        C9612q.m13917h(this$0, "this$0");
        m6742t = C11889v.m6742t(this$0.f4521b);
        for (Map.Entry entry : m6742t.entrySet()) {
            this$0.m36006f((String) entry.getKey(), ((SavedStateRegistry.InterfaceC1822c) entry.getValue()).mo35308a());
        }
        Set<String> keySet = this$0.f4520a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f4520a.get(str));
        }
        return C1055e.m37978a(C11591x.m7577a("keys", arrayList), C11591x.m7577a("values", arrayList2));
    }

    /* renamed from: d */
    public final SavedStateRegistry.InterfaceC1822c m36008d() {
        return this.f4524e;
    }

    /* renamed from: f */
    public final <T> void m36006f(String key, T t) {
        MutableLiveData mutableLiveData;
        C9612q.m13917h(key, "key");
        if (f4518f.m36004b(t)) {
            Object obj = this.f4522c.get(key);
            if (obj instanceof MutableLiveData) {
                mutableLiveData = (MutableLiveData) obj;
            } else {
                mutableLiveData = null;
            }
            if (mutableLiveData != null) {
                mutableLiveData.mo35985n(t);
            } else {
                this.f4520a.put(key, t);
            }
            MutableStateFlow<Object> mutableStateFlow = this.f4523d.get(key);
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        C9612q.m13920e(t);
        sb2.append(t.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString());
    }

    public C1711x() {
        this.f4520a = new LinkedHashMap();
        this.f4521b = new LinkedHashMap();
        this.f4522c = new LinkedHashMap();
        this.f4523d = new LinkedHashMap();
        this.f4524e = new SavedStateRegistry.InterfaceC1822c() { // from class: androidx.lifecycle.w
            @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1822c
            /* renamed from: a */
            public final Bundle mo35308a() {
                Bundle m36007e;
                m36007e = C1711x.m36007e(C1711x.this);
                return m36007e;
            }
        };
    }
}
