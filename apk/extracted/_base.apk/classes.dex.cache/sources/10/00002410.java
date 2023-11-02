package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.react.common.ReactConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p077e5.InterfaceC6107a;
import p414x2.C13677a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class Inspector {
    private final HybridData mHybridData;

    @InterfaceC6107a
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class LocalConnection {
        private final HybridData mHybridData;

        private LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void disconnect();

        public native void sendMessage(String str);
    }

    @InterfaceC6107a
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Page {
        private final int mId;
        private final String mTitle;
        private final String mVM;

        @InterfaceC6107a
        private Page(int i, String str, String str2) {
            this.mId = i;
            this.mTitle = str;
            this.mVM = str2;
        }

        public int getId() {
            return this.mId;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public String getVM() {
            return this.mVM;
        }

        public String toString() {
            return "Page{mId=" + this.mId + ", mTitle='" + this.mTitle + "'}";
        }
    }

    @InterfaceC6107a
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface RemoteConnection {
        @InterfaceC6107a
        void onDisconnect();

        @InterfaceC6107a
        void onMessage(String str);
    }

    static {
        ReactBridge.staticInit();
    }

    private Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static LocalConnection connect(int i, RemoteConnection remoteConnection) {
        try {
            return instance().connectNative(i, remoteConnection);
        } catch (UnsatisfiedLinkError e) {
            C13677a.m1853k(ReactConstants.TAG, "Inspector doesn't work in open source yet", e);
            throw new RuntimeException(e);
        }
    }

    private native LocalConnection connectNative(int i, RemoteConnection remoteConnection);

    public static List<Page> getPages() {
        try {
            return Arrays.asList(instance().getPagesNative());
        } catch (UnsatisfiedLinkError e) {
            C13677a.m1853k(ReactConstants.TAG, "Inspector doesn't work in open source yet", e);
            return Collections.emptyList();
        }
    }

    private native Page[] getPagesNative();

    private static native Inspector instance();
}