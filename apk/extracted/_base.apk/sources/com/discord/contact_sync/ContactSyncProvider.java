package com.discord.contact_sync;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p467zf.C14180c;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bJ \u0010\u000e\u001a\u0004\u0018\u00010\b*\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u0004\u0018\u00010\b*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0002¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/contact_sync/ContactSyncProvider;", "", "()V", "getContactName", "Lcom/discord/contact_sync/ContactNameEntry;", "context", "Landroid/content/Context;", "contactId", "", "getContactsMap", "", "Lcom/discord/contact_sync/ContactSyncBlobEntry;", "getImageForContactId", "deviceContactId", "asBase64BitmapString", "Landroid/net/Uri;", "quality", "", "getColumnString", "Landroid/database/Cursor;", "columnName", "contact_sync_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ContactSyncProvider {
    public static final ContactSyncProvider INSTANCE = new ContactSyncProvider();

    private ContactSyncProvider() {
    }

    private final String asBase64BitmapString(Uri uri, Context context, int i) {
        String str;
        AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor == null) {
            return null;
        }
        try {
            FileDescriptor fileDescriptor = openAssetFileDescriptor.getFileDescriptor();
            if (fileDescriptor != null) {
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                decodeFileDescriptor.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } else {
                str = null;
            }
            C14180c.m514a(openAssetFileDescriptor, null);
            return str;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C14180c.m514a(openAssetFileDescriptor, th2);
                throw th3;
            }
        }
    }

    static /* synthetic */ String asBase64BitmapString$default(ContactSyncProvider contactSyncProvider, Uri uri, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        return contactSyncProvider.asBase64BitmapString(uri, context, i);
    }

    private final String getColumnString(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    private final ContactNameEntry getContactName(Context context, String str) {
        boolean z;
        Cursor query = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, "mimetype = ? AND contact_id = " + str, new String[]{"vnd.android.cursor.item/name"}, null);
        String str2 = null;
        if (query == null) {
            return null;
        }
        String str3 = null;
        while (query.moveToNext()) {
            try {
                str2 = getColumnString(query, "data2");
            } catch (Exception unused) {
            }
            try {
                str3 = getColumnString(query, "data3");
            } catch (Exception unused2) {
            }
            boolean z2 = false;
            if (str2 != null && str2.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                break;
            }
            if (str3 == null || str3.length() == 0) {
                z2 = true;
                continue;
            }
            if (!z2) {
                break;
            }
        }
        query.close();
        return new ContactNameEntry(str2, str3);
    }

    public final Map<String, ContactSyncBlobEntry> getContactsMap(Context context) {
        String str;
        String str2;
        boolean z;
        String familyName;
        String givenName;
        ContactSyncProvider contactSyncProvider = this;
        C9612q.m13917h(context, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"_id", "data4", "display_name", "photo_file_id", "contact_id"}, null, null, null);
        if (query == null) {
            return linkedHashMap;
        }
        while (query.moveToNext()) {
            String columnString = contactSyncProvider.getColumnString(query, "display_name");
            String columnString2 = contactSyncProvider.getColumnString(query, "data4");
            String columnString3 = contactSyncProvider.getColumnString(query, "_id");
            String columnString4 = contactSyncProvider.getColumnString(query, "contact_id");
            if (columnString3 != null) {
                if (columnString4 != null) {
                    ContactNameEntry contactName = contactSyncProvider.getContactName(context, columnString4);
                    if (contactName == null || (givenName = contactName.getGivenName()) == null) {
                        str = "";
                    } else {
                        str = givenName;
                    }
                    if (contactName == null || (familyName = contactName.getFamilyName()) == null) {
                        str2 = "";
                    } else {
                        str2 = familyName;
                    }
                    if (contactSyncProvider.getColumnString(query, "photo_file_id") != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = z;
                    if (columnString2 != null) {
                        if (columnString == null) {
                            columnString = "";
                        }
                        ContactSyncBlobEntry contactSyncBlobEntry = (ContactSyncBlobEntry) linkedHashMap.put(columnString2, new ContactSyncBlobEntry(columnString2, columnString, z2, columnString3, str, str2));
                    }
                }
            }
            contactSyncProvider = this;
        }
        query.close();
        return linkedHashMap;
    }

    public final String getImageForContactId(Context context, String deviceContactId) {
        String str;
        Uri parse;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(deviceContactId, "deviceContactId");
        Cursor query = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"_id", "photo_thumb_uri"}, "_id = ?", new String[]{deviceContactId}, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() > 0) {
                query.moveToFirst();
                ContactSyncProvider contactSyncProvider = INSTANCE;
                String columnString = contactSyncProvider.getColumnString(query, "photo_thumb_uri");
                if (columnString != null && (parse = Uri.parse(columnString)) != null) {
                    C9612q.m13918g(parse, "parse(it)");
                    str = asBase64BitmapString$default(contactSyncProvider, parse, context, 0, 2, null);
                    C14180c.m514a(query, null);
                    return str;
                }
            }
            str = null;
            C14180c.m514a(query, null);
            return str;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C14180c.m514a(query, th2);
                throw th3;
            }
        }
    }
}
