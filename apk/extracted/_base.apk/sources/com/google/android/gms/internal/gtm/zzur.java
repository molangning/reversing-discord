package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzuj;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class zzur<T extends zzuj> {
    private static final Logger zza = Logger.getLogger(zzto.class.getName());
    private static final String zzb = "com.google.android.gms.internal.gtm.zzsq";

    static <T extends zzuj> T zzb(Class<T> cls) {
        String format;
        String str;
        ClassLoader classLoader = zzur.class.getClassLoader();
        if (cls.equals(zzuj.class)) {
            format = zzb;
        } else if (cls.getPackage().equals(zzur.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((zzur) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException(e);
                    } catch (NoSuchMethodException e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (InvocationTargetException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzur.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzur) it.next()).zza()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = zza;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    if (simpleName.length() != 0) {
                        str = "Unable to load ".concat(simpleName);
                    } else {
                        str = new String("Unable to load ");
                    }
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str, (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    protected abstract T zza();
}
