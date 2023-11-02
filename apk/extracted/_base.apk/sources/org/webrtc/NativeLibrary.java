package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
class NativeLibrary {
    private static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static Object lock = new Object();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    static class DefaultLoader implements NativeLibraryLoader {
        @Override // org.webrtc.NativeLibraryLoader
        public boolean load(String str) {
            String str2 = NativeLibrary.TAG;
            Logging.m8411d(str2, "Loading library: " + str);
            System.loadLibrary(str);
            return true;
        }
    }

    NativeLibrary() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            if (libraryLoaded) {
                Logging.m8411d(TAG, "Native library has already been loaded.");
                return;
            }
            String str2 = TAG;
            Logging.m8411d(str2, "Loading native library: " + str);
            libraryLoaded = nativeLibraryLoader.load(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isLoaded() {
        boolean z;
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }
}
