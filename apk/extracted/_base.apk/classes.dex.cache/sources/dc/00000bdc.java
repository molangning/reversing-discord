package com.airbnb.android.react.lottie;

import android.net.Uri;
import android.widget.ImageView;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.util.RNLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.text.Regex;
import p073e1.C6053j;
import p073e1.C6093x0;
import p073e1.C6095y0;
import p073e1.EnumC6090w0;
import p073e1.InterfaceC6071o0;
import p167j1.C8784e;
import p311r1.C12022c;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bX\u0010YJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\rR.\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R$\u0010)\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u00100\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b+\u0010/R$\u00103\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u0010/R$\u0010:\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010A\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b<\u0010@R$\u0010D\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0012\u001a\u0004\bC\u0010\u0014\"\u0004\b\u0011\u0010\u0016R$\u0010G\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0012\u001a\u0004\bF\u0010\u0014\"\u0004\b\u001f\u0010\u0016R$\u0010J\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0012\u001a\u0004\bH\u0010\u0014\"\u0004\bI\u0010\u0016R$\u0010P\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010L\u001a\u0004\bM\u0010N\"\u0004\bE\u0010OR$\u0010R\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010$\u001a\u0004\bQ\u0010&\"\u0004\bB\u0010(R$\u0010U\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010$\u001a\u0004\bT\u0010&\"\u0004\b#\u0010(R$\u0010W\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010L\u001a\u0004\bV\u0010N\"\u0004\bS\u0010O¨\u0006Z"}, m14357d2 = {"Lcom/airbnb/android/react/lottie/h;", "", "Lcom/facebook/react/bridge/ReadableMap;", "colorFilter", "Le1/j;", "view", "", "b", "a", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "viewWeakReference", "", "Z", "animationNameDirty", "", "value", "c", "Ljava/lang/String;", "getAnimationName", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "animationName", "Landroid/widget/ImageView$ScaleType;", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "n", "(Landroid/widget/ImageView$ScaleType;)V", "scaleType", "e", "getImageAssetsFolder", "i", "imageAssetsFolder", "f", "Ljava/lang/Boolean;", "getEnableMergePaths", "()Ljava/lang/Boolean;", "h", "(Ljava/lang/Boolean;)V", "enableMergePaths", "Lcom/facebook/react/bridge/ReadableArray;", "g", "Lcom/facebook/react/bridge/ReadableArray;", "getColorFilters", "()Lcom/facebook/react/bridge/ReadableArray;", "(Lcom/facebook/react/bridge/ReadableArray;)V", "colorFilters", "getTextFilters", "q", "textFilters", "Le1/w0;", "Le1/w0;", "getRenderMode", "()Le1/w0;", "m", "(Le1/w0;)V", "renderMode", "", "j", "Ljava/lang/Integer;", "getLayerType", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "layerType", "k", "getAnimationJson", "animationJson", "l", "getAnimationURL", "animationURL", "getSourceDotLottie", "o", "sourceDotLottie", "", "Ljava/lang/Float;", "getProgress", "()Ljava/lang/Float;", "(Ljava/lang/Float;)V", "progress", "getLoop", "loop", "p", "getAutoPlay", "autoPlay", "getSpeed", "speed", "<init>", "(Le1/j;)V", "lottie-react-native_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.airbnb.android.react.lottie.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2706h {

    /* renamed from: a */
    private final WeakReference<C6053j> f7219a;

    /* renamed from: b */
    private boolean f7220b;

    /* renamed from: c */
    private String f7221c;

    /* renamed from: d */
    private ImageView.ScaleType f7222d;

    /* renamed from: e */
    private String f7223e;

    /* renamed from: f */
    private Boolean f7224f;

    /* renamed from: g */
    private ReadableArray f7225g;

    /* renamed from: h */
    private ReadableArray f7226h;

    /* renamed from: i */
    private EnumC6090w0 f7227i;

    /* renamed from: j */
    private Integer f7228j;

    /* renamed from: k */
    private String f7229k;

    /* renamed from: l */
    private String f7230l;

    /* renamed from: m */
    private String f7231m;

    /* renamed from: n */
    private Float f7232n;

    /* renamed from: o */
    private Boolean f7233o;

    /* renamed from: p */
    private Boolean f7234p;

    /* renamed from: q */
    private Float f7235q;

    public C2706h(C6053j view) {
        C9612q.m13917h(view, "view");
        this.f7219a = new WeakReference<>(view);
    }

    /* renamed from: b */
    private final void m32664b(ReadableMap readableMap, C6053j c6053j) {
        int i;
        List m14104i;
        boolean z;
        if (readableMap.getType(ViewProps.COLOR) == ReadableType.Map) {
            Integer color = ColorPropConverter.getColor(readableMap.getMap(ViewProps.COLOR), c6053j.getContext());
            C9612q.m13918g(color, "{\n            ColorPropC…, view.context)\n        }");
            i = color.intValue();
        } else {
            i = readableMap.getInt(ViewProps.COLOR);
        }
        String quote = Pattern.quote(".");
        C9612q.m13918g(quote, "quote(\".\")");
        List<String> m13865j = new Regex(quote).m13865j(readableMap.getString("keypath") + ".**", 0);
        if (!m13865j.isEmpty()) {
            ListIterator<String> listIterator = m13865j.listIterator(m13865j.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    m14104i = C9553r.m14027w0(m13865j, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        m14104i = C9545j.m14104i();
        String[] strArr = (String[]) m14104i.toArray(new String[0]);
        c6053j.m23809k(new C8784e((String[]) Arrays.copyOf(strArr, strArr.length)), InterfaceC6071o0.f17256K, new C12022c(new C6093x0(i)));
    }

    /* renamed from: a */
    public final void m32665a() {
        Object m7596b;
        int i;
        C6053j c6053j = this.f7219a.get();
        if (c6053j == null) {
            return;
        }
        ReadableArray readableArray = this.f7226h;
        if (readableArray != null && readableArray.size() > 0) {
            C6095y0 c6095y0 = new C6095y0(c6053j);
            ReadableArray readableArray2 = this.f7226h;
            C9612q.m13920e(readableArray2);
            int size = readableArray2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ReadableArray readableArray3 = this.f7226h;
                C9612q.m13920e(readableArray3);
                ReadableMap map = readableArray3.getMap(i2);
                C9612q.m13918g(map, "textFilters!!.getMap(i)");
                c6095y0.m23583e(map.getString("find"), map.getString("replace"));
            }
            c6053j.setTextDelegate(c6095y0);
        }
        String str = this.f7229k;
        if (str != null) {
            c6053j.m23794z(str, String.valueOf(str.hashCode()));
            this.f7229k = null;
        }
        String str2 = this.f7230l;
        if (str2 != null) {
            c6053j.m23821A(str2, String.valueOf(str2.hashCode()));
            this.f7230l = null;
        }
        String str3 = this.f7231m;
        if (str3 != null) {
            try {
                C11583s.C11584a c11584a = C11583s.f30090k;
                m7596b = C11583s.m7596b(Uri.parse(str3).getScheme());
            } catch (Throwable th2) {
                C11583s.C11584a c11584a2 = C11583s.f30090k;
                m7596b = C11583s.m7596b(C11586t.m7587a(th2));
            }
            if (C11583s.m7591g(m7596b)) {
                m7596b = null;
            }
            if (((String) m7596b) != null) {
                c6053j.setAnimationFromUrl(str3);
                this.f7231m = null;
                return;
            }
            int identifier = c6053j.getResources().getIdentifier(str3, "raw", c6053j.getContext().getPackageName());
            if (identifier == 0) {
                RNLog.m30236e("Animation for " + str3 + " was not found in raw resources");
                return;
            }
            c6053j.setAnimation(identifier);
            this.f7220b = false;
            this.f7231m = null;
        }
        if (this.f7220b) {
            c6053j.setAnimation(this.f7221c);
            this.f7220b = false;
        }
        Float f = this.f7232n;
        if (f != null) {
            c6053j.setProgress(f.floatValue());
            this.f7232n = null;
        }
        Boolean bool = this.f7233o;
        if (bool != null) {
            if (bool.booleanValue()) {
                i = -1;
            } else {
                i = 0;
            }
            c6053j.setRepeatCount(i);
            this.f7233o = null;
        }
        Boolean bool2 = this.f7234p;
        if (bool2 != null && bool2.booleanValue() && !c6053j.m23801s()) {
            c6053j.playAnimation();
        }
        Float f2 = this.f7235q;
        if (f2 != null) {
            c6053j.setSpeed(f2.floatValue());
            this.f7235q = null;
        }
        ImageView.ScaleType scaleType = this.f7222d;
        if (scaleType != null) {
            c6053j.setScaleType(scaleType);
            this.f7222d = null;
        }
        EnumC6090w0 enumC6090w0 = this.f7227i;
        if (enumC6090w0 != null) {
            c6053j.setRenderMode(enumC6090w0);
            this.f7227i = null;
        }
        Integer num = this.f7228j;
        if (num != null) {
            c6053j.setLayerType(num.intValue(), null);
        }
        String str4 = this.f7223e;
        if (str4 != null) {
            c6053j.setImageAssetsFolder(str4);
            this.f7223e = null;
        }
        Boolean bool3 = this.f7224f;
        if (bool3 != null) {
            c6053j.m23805o(bool3.booleanValue());
            this.f7224f = null;
        }
        ReadableArray readableArray4 = this.f7225g;
        if (readableArray4 != null && readableArray4.size() > 0) {
            int size2 = readableArray4.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ReadableMap map2 = readableArray4.getMap(i3);
                C9612q.m13918g(map2, "colorFilters.getMap(i)");
                m32664b(map2, c6053j);
            }
        }
    }

    /* renamed from: c */
    public final void m32663c(String str) {
        this.f7229k = str;
    }

    /* renamed from: d */
    public final void m32662d(String str) {
        this.f7221c = str;
        this.f7220b = true;
    }

    /* renamed from: e */
    public final void m32661e(String str) {
        this.f7230l = str;
    }

    /* renamed from: f */
    public final void m32660f(Boolean bool) {
        this.f7234p = bool;
    }

    /* renamed from: g */
    public final void m32659g(ReadableArray readableArray) {
        this.f7225g = readableArray;
    }

    /* renamed from: h */
    public final void m32658h(Boolean bool) {
        this.f7224f = bool;
    }

    /* renamed from: i */
    public final void m32657i(String str) {
        this.f7223e = str;
    }

    /* renamed from: j */
    public final void m32656j(Integer num) {
        this.f7228j = num;
    }

    /* renamed from: k */
    public final void m32655k(Boolean bool) {
        this.f7233o = bool;
    }

    /* renamed from: l */
    public final void m32654l(Float f) {
        this.f7232n = f;
    }

    /* renamed from: m */
    public final void m32653m(EnumC6090w0 enumC6090w0) {
        this.f7227i = enumC6090w0;
    }

    /* renamed from: n */
    public final void m32652n(ImageView.ScaleType scaleType) {
        this.f7222d = scaleType;
    }

    /* renamed from: o */
    public final void m32651o(String str) {
        this.f7231m = str;
    }

    /* renamed from: p */
    public final void m32650p(Float f) {
        this.f7235q = f;
    }

    /* renamed from: q */
    public final void m32649q(ReadableArray readableArray) {
        this.f7226h = readableArray;
    }
}