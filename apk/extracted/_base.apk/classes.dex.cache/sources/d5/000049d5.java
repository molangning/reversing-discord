package p292q2;

/* renamed from: q2.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC11685a {

    /* renamed from: q2.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC11686a {
        READ_DECODE,
        READ_FILE,
        READ_FILE_NOT_FOUND,
        READ_INVALID_ENTRY,
        WRITE_ENCODE,
        WRITE_CREATE_TEMPFILE,
        WRITE_UPDATE_FILE_NOT_FOUND,
        WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND,
        WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND,
        WRITE_RENAME_FILE_OTHER,
        WRITE_CREATE_DIR,
        WRITE_CALLBACK_ERROR,
        WRITE_INVALID_ENTRY,
        DELETE_FILE,
        EVICTION,
        GENERIC_IO,
        OTHER
    }

    /* renamed from: a */
    void mo7170a(EnumC11686a enumC11686a, Class<?> cls, String str, Throwable th2);
}