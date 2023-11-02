package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p303qe.C11847j;
import p303qe.C11849k;
import p303qe.C11851l;
import p303qe.C11853m;
import p303qe.C11855n;
import p303qe.C11857o;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002YZB\u0011\u0012\b\u0010V\u001a\u0004\u0018\u00010U¢\u0006\u0004\bW\u0010XJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0014\u0010\u0012\u001a\u00020\u00022\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u0006\u0010\u0015\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\nJ\u0010\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00101\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R$\u00107\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R$\u0010:\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010,\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\"\u0010@\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010F\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010I\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER\"\u0010L\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010A\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010NR\u0016\u0010P\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010AR\u0016\u0010T\u001a\u0004\u0018\u00010Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006["}, m14357d2 = {"Lcom/swmansion/rnscreens/f0;", "Lcom/facebook/react/views/view/ReactViewGroup;", "", "z", "Landroidx/appcompat/widget/SearchView;", "searchView", "setSearchViewListeners", "", "newText", "r", "", "hasFocus", "n", "m", "p", "s", "Lcom/facebook/react/uimanager/events/Event;", "event", "v", "u", "onAttachedToWindow", "l", "o", "k", "flag", "t", "text", "q", "Lcom/swmansion/rnscreens/f0$b;", "j", "Lcom/swmansion/rnscreens/f0$b;", "getInputType", "()Lcom/swmansion/rnscreens/f0$b;", "setInputType", "(Lcom/swmansion/rnscreens/f0$b;)V", "inputType", "Lcom/swmansion/rnscreens/f0$a;", "Lcom/swmansion/rnscreens/f0$a;", "getAutoCapitalize", "()Lcom/swmansion/rnscreens/f0$a;", "setAutoCapitalize", "(Lcom/swmansion/rnscreens/f0$a;)V", "autoCapitalize", "", "Ljava/lang/Integer;", "getTextColor", "()Ljava/lang/Integer;", "setTextColor", "(Ljava/lang/Integer;)V", "textColor", "getTintColor", "setTintColor", "tintColor", "getHeaderIconColor", "setHeaderIconColor", "headerIconColor", "getHintTextColor", "setHintTextColor", "hintTextColor", "Ljava/lang/String;", "getPlaceholder", "()Ljava/lang/String;", "setPlaceholder", "(Ljava/lang/String;)V", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Z", "getShouldOverrideBackButton", "()Z", "setShouldOverrideBackButton", "(Z)V", "shouldOverrideBackButton", "getAutoFocus", "setAutoFocus", "autoFocus", "getShouldShowHintSearchIcon", "setShouldShowHintSearchIcon", "shouldShowHintSearchIcon", "Lcom/swmansion/rnscreens/g0;", "Lcom/swmansion/rnscreens/g0;", "mSearchViewFormatter", "mAreListenersSet", "Lcom/swmansion/rnscreens/q;", "getScreenStackFragment", "()Lcom/swmansion/rnscreens/q;", "screenStackFragment", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "a", "b", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.swmansion.rnscreens.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5609f0 extends ReactViewGroup {

    /* renamed from: j */
    private EnumC5611b f15622j;

    /* renamed from: k */
    private EnumC5610a f15623k;

    /* renamed from: l */
    private Integer f15624l;

    /* renamed from: m */
    private Integer f15625m;

    /* renamed from: n */
    private Integer f15626n;

    /* renamed from: o */
    private Integer f15627o;

    /* renamed from: p */
    private String f15628p;

    /* renamed from: q */
    private boolean f15629q;

    /* renamed from: r */
    private boolean f15630r;

    /* renamed from: s */
    private boolean f15631s;

    /* renamed from: t */
    private C5620g0 f15632t;

    /* renamed from: u */
    private boolean f15633u;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m14357d2 = {"Lcom/swmansion/rnscreens/f0$a;", "", "<init>", "(Ljava/lang/String;I)V", "j", "k", "l", "m", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.f0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC5610a {
        NONE,
        WORDS,
        SENTENCES,
        CHARACTERS
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m14357d2 = {"Lcom/swmansion/rnscreens/f0$b;", "", "Lcom/swmansion/rnscreens/f0$a;", "capitalize", "", "b", "<init>", "(Ljava/lang/String;I)V", "j", "k", "l", "m", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.f0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class EnumC5611b {

        /* renamed from: j */
        public static final EnumC5611b f15639j = new C5615d("TEXT", 0);

        /* renamed from: k */
        public static final EnumC5611b f15640k = new C5614c("PHONE", 1);

        /* renamed from: l */
        public static final EnumC5611b f15641l = new C5613b("NUMBER", 2);

        /* renamed from: m */
        public static final EnumC5611b f15642m = new C5612a("EMAIL", 3);

        /* renamed from: n */
        private static final /* synthetic */ EnumC5611b[] f15643n = m24938a();

        @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m14357d2 = {"Lcom/swmansion/rnscreens/f0$b$a;", "Lcom/swmansion/rnscreens/f0$b;", "Lcom/swmansion/rnscreens/f0$a;", "capitalize", "", "b", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: com.swmansion.rnscreens.f0$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        static final class C5612a extends EnumC5611b {
            C5612a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.swmansion.rnscreens.C5609f0.EnumC5611b
            /* renamed from: b */
            public int mo24937b(EnumC5610a capitalize) {
                C9612q.m13917h(capitalize, "capitalize");
                return 32;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m14357d2 = {"Lcom/swmansion/rnscreens/f0$b$b;", "Lcom/swmansion/rnscreens/f0$b;", "Lcom/swmansion/rnscreens/f0$a;", "capitalize", "", "b", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: com.swmansion.rnscreens.f0$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        static final class C5613b extends EnumC5611b {
            C5613b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.swmansion.rnscreens.C5609f0.EnumC5611b
            /* renamed from: b */
            public int mo24937b(EnumC5610a capitalize) {
                C9612q.m13917h(capitalize, "capitalize");
                return 2;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m14357d2 = {"Lcom/swmansion/rnscreens/f0$b$c;", "Lcom/swmansion/rnscreens/f0$b;", "Lcom/swmansion/rnscreens/f0$a;", "capitalize", "", "b", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: com.swmansion.rnscreens.f0$b$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        static final class C5614c extends EnumC5611b {
            C5614c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.swmansion.rnscreens.C5609f0.EnumC5611b
            /* renamed from: b */
            public int mo24937b(EnumC5610a capitalize) {
                C9612q.m13917h(capitalize, "capitalize");
                return 3;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m14357d2 = {"Lcom/swmansion/rnscreens/f0$b$d;", "Lcom/swmansion/rnscreens/f0$b;", "Lcom/swmansion/rnscreens/f0$a;", "capitalize", "", "b", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: com.swmansion.rnscreens.f0$b$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        static final class C5615d extends EnumC5611b {

            @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
            /* renamed from: com.swmansion.rnscreens.f0$b$d$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
            public /* synthetic */ class C5616a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f15644a;

                static {
                    int[] iArr = new int[EnumC5610a.values().length];
                    try {
                        iArr[EnumC5610a.NONE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC5610a.WORDS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC5610a.SENTENCES.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC5610a.CHARACTERS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f15644a = iArr;
                }
            }

            C5615d(String str, int i) {
                super(str, i, null);
            }

            @Override // com.swmansion.rnscreens.C5609f0.EnumC5611b
            /* renamed from: b */
            public int mo24937b(EnumC5610a capitalize) {
                C9612q.m13917h(capitalize, "capitalize");
                int i = C5616a.f15644a[capitalize.ordinal()];
                if (i == 1) {
                    return 1;
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        }
                        throw new C11581q();
                    }
                    return 16384;
                }
                return 8192;
            }
        }

        private EnumC5611b(String str, int i) {
        }

        public /* synthetic */ EnumC5611b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        /* renamed from: a */
        private static final /* synthetic */ EnumC5611b[] m24938a() {
            return new EnumC5611b[]{f15639j, f15640k, f15641l, f15642m};
        }

        public static EnumC5611b valueOf(String str) {
            return (EnumC5611b) Enum.valueOf(EnumC5611b.class, str);
        }

        public static EnumC5611b[] values() {
            return (EnumC5611b[]) f15643n.clone();
        }

        /* renamed from: b */
        public abstract int mo24937b(EnumC5610a enumC5610a);
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lcom/swmansion/rnscreens/c;", "newSearchView", "", "a", "(Lcom/swmansion/rnscreens/c;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.f0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C5617c extends AbstractC9614s implements Function1<C5601c, Unit> {
        C5617c() {
            super(1);
        }

        /* renamed from: a */
        public final void m24936a(C5601c newSearchView) {
            C5644q screenStackFragment;
            C5601c m24842D;
            C9612q.m13917h(newSearchView, "newSearchView");
            if (C5609f0.this.f15632t == null) {
                C5609f0.this.f15632t = new C5620g0(newSearchView);
            }
            C5609f0.this.m24940z();
            if (C5609f0.this.getAutoFocus() && (screenStackFragment = C5609f0.this.getScreenStackFragment()) != null && (m24842D = screenStackFragment.m24842D()) != null) {
                m24842D.m24971p0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5601c c5601c) {
            m24936a(c5601c);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, m14357d2 = {"com/swmansion/rnscreens/f0$d", "Landroidx/appcompat/widget/SearchView$m;", "", "newText", "", "a", "query", "b", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.f0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5618d implements SearchView.InterfaceC0452m {
        C5618d() {
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0452m
        /* renamed from: a */
        public boolean mo24935a(String str) {
            C5609f0.this.m24948r(str);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0452m
        /* renamed from: b */
        public boolean mo24934b(String str) {
            C5609f0.this.m24947s(str);
            return true;
        }
    }

    public C5609f0(ReactContext reactContext) {
        super(reactContext);
        this.f15622j = EnumC5611b.f15639j;
        this.f15623k = EnumC5610a.NONE;
        this.f15628p = "";
        this.f15629q = true;
        this.f15631s = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C5644q getScreenStackFragment() {
        C5649s config;
        ViewParent parent = getParent();
        if (!(parent instanceof C5651t) || (config = ((C5651t) parent).getConfig()) == null) {
            return null;
        }
        return config.getScreenFragment();
    }

    /* renamed from: m */
    private final void m24953m() {
        m24944v(new C11851l(getId()));
    }

    /* renamed from: n */
    private final void m24952n(boolean z) {
        m24944v(z ? new C11853m(getId()) : new C11847j(getId()));
    }

    /* renamed from: p */
    private final void m24950p() {
        m24944v(new C11855n(getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m24948r(String str) {
        m24944v(new C11849k(getId(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m24947s(String str) {
        m24944v(new C11857o(getId(), str));
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new C5618d());
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.swmansion.rnscreens.c0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C5609f0.m24943w(C5609f0.this, view, z);
            }
        });
        searchView.setOnCloseListener(new SearchView.InterfaceC0451l() { // from class: com.swmansion.rnscreens.d0
            @Override // androidx.appcompat.widget.SearchView.InterfaceC0451l
            /* renamed from: a */
            public final boolean mo24969a() {
                boolean m24942x;
                m24942x = C5609f0.m24942x(C5609f0.this);
                return m24942x;
            }
        });
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5609f0.m24941y(C5609f0.this, view);
            }
        });
    }

    /* renamed from: v */
    private final void m24944v(Event<?> event) {
        Context context = getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m24943w(C5609f0 this$0, View view, boolean z) {
        C9612q.m13917h(this$0, "this$0");
        this$0.m24952n(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final boolean m24942x(C5609f0 this$0) {
        C9612q.m13917h(this$0, "this$0");
        this$0.m24953m();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m24941y(C5609f0 this$0, View view) {
        C9612q.m13917h(this$0, "this$0");
        this$0.m24950p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final void m24940z() {
        C5601c c5601c;
        C5644q screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            c5601c = screenStackFragment.m24842D();
        } else {
            c5601c = null;
        }
        if (c5601c != null) {
            if (!this.f15633u) {
                setSearchViewListeners(c5601c);
                this.f15633u = true;
            }
            c5601c.setInputType(this.f15622j.mo24937b(this.f15623k));
            C5620g0 c5620g0 = this.f15632t;
            if (c5620g0 != null) {
                c5620g0.m24926h(this.f15624l);
            }
            C5620g0 c5620g02 = this.f15632t;
            if (c5620g02 != null) {
                c5620g02.m24925i(this.f15625m);
            }
            C5620g0 c5620g03 = this.f15632t;
            if (c5620g03 != null) {
                c5620g03.m24929e(this.f15626n);
            }
            C5620g0 c5620g04 = this.f15632t;
            if (c5620g04 != null) {
                c5620g04.m24928f(this.f15627o);
            }
            C5620g0 c5620g05 = this.f15632t;
            if (c5620g05 != null) {
                c5620g05.m24927g(this.f15628p, this.f15631s);
            }
            c5601c.setOverrideBackAction(this.f15629q);
        }
    }

    public final EnumC5610a getAutoCapitalize() {
        return this.f15623k;
    }

    public final boolean getAutoFocus() {
        return this.f15630r;
    }

    public final Integer getHeaderIconColor() {
        return this.f15626n;
    }

    public final Integer getHintTextColor() {
        return this.f15627o;
    }

    public final EnumC5611b getInputType() {
        return this.f15622j;
    }

    public final String getPlaceholder() {
        return this.f15628p;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.f15629q;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.f15631s;
    }

    public final Integer getTextColor() {
        return this.f15624l;
    }

    public final Integer getTintColor() {
        return this.f15625m;
    }

    /* renamed from: k */
    public final void m24955k() {
        C5601c m24842D;
        C5644q screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (m24842D = screenStackFragment.m24842D()) == null) {
            return;
        }
        m24842D.clearFocus();
    }

    /* renamed from: l */
    public final void m24954l() {
        C5601c m24842D;
        C5644q screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (m24842D = screenStackFragment.m24842D()) == null) {
            return;
        }
        m24842D.m24972o0();
    }

    /* renamed from: o */
    public final void m24951o() {
        C5601c m24842D;
        C5644q screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (m24842D = screenStackFragment.m24842D()) == null) {
            return;
        }
        m24842D.m24971p0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5644q screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            screenStackFragment.m24839G(new C5617c());
        }
    }

    /* renamed from: q */
    public final void m24949q(String str) {
        C5644q screenStackFragment;
        C5601c m24842D;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (m24842D = screenStackFragment.m24842D()) == null) {
            return;
        }
        m24842D.setText(str);
    }

    public final void setAutoCapitalize(EnumC5610a enumC5610a) {
        C9612q.m13917h(enumC5610a, "<set-?>");
        this.f15623k = enumC5610a;
    }

    public final void setAutoFocus(boolean z) {
        this.f15630r = z;
    }

    public final void setHeaderIconColor(Integer num) {
        this.f15626n = num;
    }

    public final void setHintTextColor(Integer num) {
        this.f15627o = num;
    }

    public final void setInputType(EnumC5611b enumC5611b) {
        C9612q.m13917h(enumC5611b, "<set-?>");
        this.f15622j = enumC5611b;
    }

    public final void setPlaceholder(String str) {
        C9612q.m13917h(str, "<set-?>");
        this.f15628p = str;
    }

    public final void setShouldOverrideBackButton(boolean z) {
        this.f15629q = z;
    }

    public final void setShouldShowHintSearchIcon(boolean z) {
        this.f15631s = z;
    }

    public final void setTextColor(Integer num) {
        this.f15624l = num;
    }

    public final void setTintColor(Integer num) {
        this.f15625m = num;
    }

    /* renamed from: t */
    public final void m24946t(boolean z) {
    }

    /* renamed from: u */
    public final void m24945u() {
        m24940z();
    }
}
