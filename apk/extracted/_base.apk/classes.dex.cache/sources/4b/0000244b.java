package com.facebook.react.bridge;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import p058d5.C5743a;
import p077e5.InterfaceC6107a;
import p127h3.C6889c;
import p148i3.C7380a;
import p150i5.C7384b;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    private boolean mIsCreating;
    private boolean mIsInitializing;
    private NativeModule mModule;
    private final String mName;
    private Provider<? extends NativeModule> mProvider;
    private final ReactModuleInfo mReactModuleInfo;

    public ModuleHolder(ReactModuleInfo reactModuleInfo, Provider<? extends NativeModule> provider) {
        this.mName = reactModuleInfo.name();
        this.mProvider = provider;
        this.mReactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.needsEagerInit()) {
            this.mModule = create();
        }
    }

    private NativeModule create() {
        boolean z;
        boolean z2 = true;
        if (this.mModule == null) {
            z = true;
        } else {
            z = false;
        }
        SoftAssertions.assertCondition(z, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        C7384b.m20802a(0L, "ModuleHolder.createModule").mo20799b(ZeroconfModule.KEY_SERVICE_NAME, this.mName).mo20798c();
        C6889c.m21705a().mo21708a(C7380a.f19863e, "NativeModule init: %s", this.mName);
        try {
            NativeModule nativeModule = (NativeModule) ((Provider) C5743a.m24583c(this.mProvider)).get();
            this.mProvider = null;
            synchronized (this) {
                this.mModule = nativeModule;
                if (!this.mInitializable || this.mIsInitializing) {
                    z2 = false;
                }
            }
            if (z2) {
                doInitialize(nativeModule);
            }
            return nativeModule;
        } finally {
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z;
        C7384b.m20802a(0L, "ModuleHolder.initialize").mo20799b(ZeroconfModule.KEY_SERVICE_NAME, this.mName).mo20798c();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                if (this.mInitializable && !this.mIsInitializing) {
                    z = true;
                    this.mIsInitializing = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                nativeModule.initialize();
                synchronized (this) {
                    this.mIsInitializing = false;
                }
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            C7384b.m20801b(0L).mo20798c();
        }
    }

    public synchronized void destroy() {
        NativeModule nativeModule = this.mModule;
        if (nativeModule != null) {
            nativeModule.invalidate();
        }
    }

    public boolean getCanOverrideExistingModule() {
        return this.mReactModuleInfo.canOverrideExistingModule();
    }

    public String getClassName() {
        return this.mReactModuleInfo.className();
    }

    public boolean getHasConstants() {
        return this.mReactModuleInfo.hasConstants();
    }

    @InterfaceC6107a
    public NativeModule getModule() {
        boolean z;
        NativeModule nativeModule;
        NativeModule nativeModule2;
        synchronized (this) {
            NativeModule nativeModule3 = this.mModule;
            if (nativeModule3 != null) {
                return nativeModule3;
            }
            if (!this.mIsCreating) {
                z = true;
                this.mIsCreating = true;
            } else {
                z = false;
            }
            if (z) {
                NativeModule create = create();
                synchronized (this) {
                    this.mIsCreating = false;
                    notifyAll();
                }
                return create;
            }
            synchronized (this) {
                while (true) {
                    nativeModule = this.mModule;
                    if (nativeModule != null || !this.mIsCreating) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                nativeModule2 = (NativeModule) C5743a.m24583c(nativeModule);
            }
            return nativeModule2;
        }
    }

    @InterfaceC6107a
    public String getName() {
        return this.mName;
    }

    public synchronized boolean hasInstance() {
        boolean z;
        if (this.mModule != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public boolean isCxxModule() {
        return this.mReactModuleInfo.isCxxModule();
    }

    public boolean isTurboModule() {
        return this.mReactModuleInfo.isTurboModule();
    }

    public void markInitializable() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            this.mInitializable = true;
            boolean z2 = false;
            if (this.mModule != null) {
                if (!this.mIsInitializing) {
                    z2 = true;
                }
                C5743a.m24585a(z2);
                nativeModule = this.mModule;
            } else {
                nativeModule = null;
                z = false;
            }
        }
        if (z) {
            doInitialize(nativeModule);
        }
    }

    public ModuleHolder(NativeModule nativeModule) {
        String name = nativeModule.getName();
        this.mName = name;
        this.mReactModuleInfo = new ReactModuleInfo(nativeModule.getName(), nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), TurboModule.class.isAssignableFrom(nativeModule.getClass()));
        this.mModule = nativeModule;
        C6889c.m21705a().mo21708a(C7380a.f19863e, "NativeModule init: %s", name);
    }
}