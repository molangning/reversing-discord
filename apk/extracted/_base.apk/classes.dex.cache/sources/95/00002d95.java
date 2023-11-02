package com.horcrux.svg;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.ViewManagerOnDemandReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.ViewManager;
import com.horcrux.svg.RenderableViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SvgPackage extends TurboReactPackage implements ViewManagerOnDemandReactPackage {
    private Map<String, ModuleSpec> mViewManagers;

    /* renamed from: com.horcrux.svg.SvgPackage$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5170a implements Provider<NativeModule> {
        C5170a() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.ImageViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5171b implements Provider<NativeModule> {
        C5171b() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.ClipPathViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5172c implements Provider<NativeModule> {
        C5172c() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.DefsViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5173d implements Provider<NativeModule> {
        C5173d() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.UseViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5174e implements Provider<NativeModule> {
        C5174e() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.SymbolManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5175f implements Provider<NativeModule> {
        C5175f() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.LinearGradientManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5176g implements Provider<NativeModule> {
        C5176g() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.RadialGradientManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5177h implements Provider<NativeModule> {
        C5177h() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.PatternManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5178i implements Provider<NativeModule> {
        C5178i() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.MaskManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5179j implements Provider<NativeModule> {
        C5179j() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.ForeignObjectManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5180k implements Provider<NativeModule> {
        C5180k() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.GroupViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5181l implements Provider<NativeModule> {
        C5181l() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.MarkerManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5182m implements Provider<NativeModule> {
        C5182m() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new SvgViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$n */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5183n implements ReactModuleInfoProvider {
        C5183n() {
            SvgPackage.this = r1;
        }

        @Override // com.facebook.react.module.model.ReactModuleInfoProvider
        public Map<String, ReactModuleInfo> getReactModuleInfos() {
            HashMap hashMap = new HashMap();
            Class[] clsArr = {SvgViewModule.class, RNSVGRenderableManager.class};
            for (int i = 0; i < 2; i++) {
                Class cls = clsArr[i];
                ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                hashMap.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            }
            return hashMap;
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$o */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5184o implements Provider<NativeModule> {
        C5184o() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.PathViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$p */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5185p implements Provider<NativeModule> {
        C5185p() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.CircleViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$q */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5186q implements Provider<NativeModule> {
        C5186q() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.EllipseViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$r */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5187r implements Provider<NativeModule> {
        C5187r() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.LineViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$s */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5188s implements Provider<NativeModule> {
        C5188s() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.RectViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$t */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5189t implements Provider<NativeModule> {
        C5189t() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.TextViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$u */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5190u implements Provider<NativeModule> {
        C5190u() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.TSpanViewManager();
        }
    }

    /* renamed from: com.horcrux.svg.SvgPackage$v */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5191v implements Provider<NativeModule> {
        C5191v() {
            SvgPackage.this = r1;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return new RenderableViewManager.TextPathViewManager();
        }
    }

    private Map<String, ModuleSpec> getViewManagersMap(ReactApplicationContext reactApplicationContext) {
        if (this.mViewManagers == null) {
            HashMap newHashMap = MapBuilder.newHashMap();
            newHashMap.put(RenderableViewManager.GroupViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5180k()));
            newHashMap.put(RenderableViewManager.PathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5184o()));
            newHashMap.put(RenderableViewManager.CircleViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5185p()));
            newHashMap.put(RenderableViewManager.EllipseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5186q()));
            newHashMap.put(RenderableViewManager.LineViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5187r()));
            newHashMap.put(RenderableViewManager.RectViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5188s()));
            newHashMap.put(RenderableViewManager.TextViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5189t()));
            newHashMap.put(RenderableViewManager.TSpanViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5190u()));
            newHashMap.put(RenderableViewManager.TextPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5191v()));
            newHashMap.put(RenderableViewManager.ImageViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5170a()));
            newHashMap.put(RenderableViewManager.ClipPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5171b()));
            newHashMap.put(RenderableViewManager.DefsViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5172c()));
            newHashMap.put(RenderableViewManager.UseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5173d()));
            newHashMap.put(RenderableViewManager.SymbolManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5174e()));
            newHashMap.put(RenderableViewManager.LinearGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5175f()));
            newHashMap.put(RenderableViewManager.RadialGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5176g()));
            newHashMap.put(RenderableViewManager.PatternManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5177h()));
            newHashMap.put(RenderableViewManager.MaskManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5178i()));
            newHashMap.put(RenderableViewManager.ForeignObjectManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5179j()));
            newHashMap.put(RenderableViewManager.MarkerManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5181l()));
            newHashMap.put(SvgViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C5182m()));
            this.mViewManagers = newHashMap;
        }
        return this.mViewManagers;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = getViewManagersMap(reactApplicationContext).get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // com.facebook.react.TurboReactPackage
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (!str.equals(RNSVGRenderableManager.NAME)) {
            if (!str.equals(SvgViewModule.NAME)) {
                return null;
            }
            return new SvgViewModule(reactApplicationContext);
        }
        return new RNSVGRenderableManager(reactApplicationContext);
    }

    @Override // com.facebook.react.TurboReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        try {
            return (ReactModuleInfoProvider) Class.forName("com.horcrux.svg.SvgPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new C5183n();
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e2) {
            e = e2;
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e);
        }
    }

    @Override // com.facebook.react.TurboReactPackage
    protected List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).values());
    }

    @Override // com.facebook.react.ViewManagerOnDemandReactPackage
    public List<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return (List) getViewManagersMap(reactApplicationContext).keySet();
    }
}