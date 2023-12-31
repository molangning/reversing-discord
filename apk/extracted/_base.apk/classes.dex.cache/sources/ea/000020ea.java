package com.discord.tti_manager;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9618w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C9622a;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/tti_manager/TTILoggingApplication;", "Landroid/app/Application;", "()V", "initialize", "", "onCreate", "Companion", "tti_manager_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class TTILoggingApplication extends Application {
    public static final Companion Companion = new Companion(null);
    private static final ReadWriteProperty<Object, Long> applicationInitializeTimestamp$delegate;
    private static final ReadWriteProperty<Object, Long> applicationOpenedTimestampExcludingActivityLaunchGap$delegate;
    private static final ReadWriteProperty<Object, Long> applicationStartedTimestamp$delegate;

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0015J\u0006\u0010\u0016\u001a\u00020\u0017R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0018"}, m14357d2 = {"Lcom/discord/tti_manager/TTILoggingApplication$Companion;", "", "()V", "<set-?>", "", "applicationInitializeTimestamp", "getApplicationInitializeTimestamp", "()J", "setApplicationInitializeTimestamp", "(J)V", "applicationInitializeTimestamp$delegate", "Lkotlin/properties/ReadWriteProperty;", "applicationOpenedTimestampExcludingActivityLaunchGap", "getApplicationOpenedTimestampExcludingActivityLaunchGap", "setApplicationOpenedTimestampExcludingActivityLaunchGap", "applicationOpenedTimestampExcludingActivityLaunchGap$delegate", "applicationStartedTimestamp", "getApplicationStartedTimestamp", "setApplicationStartedTimestamp", "applicationStartedTimestamp$delegate", "getAppOpenedTimestamp", "getAppOpenedTimestamp$tti_manager_release", "trackActivityDelegateInitialized", "", "tti_manager_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {C9591f0.m13966e(new C9618w(Companion.class, "applicationOpenedTimestampExcludingActivityLaunchGap", "getApplicationOpenedTimestampExcludingActivityLaunchGap()J", 0)), C9591f0.m13966e(new C9618w(Companion.class, "applicationStartedTimestamp", "getApplicationStartedTimestamp()J", 0)), C9591f0.m13966e(new C9618w(Companion.class, "applicationInitializeTimestamp", "getApplicationInitializeTimestamp()J", 0))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long getApplicationInitializeTimestamp() {
            return ((Number) TTILoggingApplication.applicationInitializeTimestamp$delegate.getValue(this, $$delegatedProperties[2])).longValue();
        }

        private final long getApplicationOpenedTimestampExcludingActivityLaunchGap() {
            return ((Number) TTILoggingApplication.applicationOpenedTimestampExcludingActivityLaunchGap$delegate.getValue(this, $$delegatedProperties[0])).longValue();
        }

        private final long getApplicationStartedTimestamp() {
            return ((Number) TTILoggingApplication.applicationStartedTimestamp$delegate.getValue(this, $$delegatedProperties[1])).longValue();
        }

        public final void setApplicationInitializeTimestamp(long j) {
            TTILoggingApplication.applicationInitializeTimestamp$delegate.setValue(this, $$delegatedProperties[2], Long.valueOf(j));
        }

        private final void setApplicationOpenedTimestampExcludingActivityLaunchGap(long j) {
            TTILoggingApplication.applicationOpenedTimestampExcludingActivityLaunchGap$delegate.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
        }

        public final void setApplicationStartedTimestamp(long j) {
            TTILoggingApplication.applicationStartedTimestamp$delegate.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
        }

        public final long getAppOpenedTimestamp$tti_manager_release() {
            return getApplicationOpenedTimestampExcludingActivityLaunchGap();
        }

        public final void trackActivityDelegateInitialized() {
            setApplicationOpenedTimestampExcludingActivityLaunchGap(System.currentTimeMillis() - (getApplicationInitializeTimestamp() - getApplicationStartedTimestamp()));
        }
    }

    static {
        C9622a c9622a = C9622a.f25358a;
        applicationOpenedTimestampExcludingActivityLaunchGap$delegate = c9622a.m13895a();
        applicationStartedTimestamp$delegate = c9622a.m13895a();
        applicationInitializeTimestamp$delegate = c9622a.m13895a();
    }

    public TTILoggingApplication() {
        Companion.setApplicationStartedTimestamp(System.currentTimeMillis());
    }

    public abstract void initialize();

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        initialize();
        Companion.setApplicationInitializeTimestamp(System.currentTimeMillis());
    }
}