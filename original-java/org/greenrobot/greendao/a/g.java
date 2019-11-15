package org.greenrobot.greendao.a;

import android.database.sqlite.SQLiteStatement;

/* compiled from: StandardDatabaseStatement */
public class g implements c {
    private final SQLiteStatement a;

    public g(SQLiteStatement sQLiteStatement) {
        this.a = sQLiteStatement;
    }

    public void a() {
        this.a.execute();
    }

    public long b() {
        return this.a.simpleQueryForLong();
    }

    public long c() {
        return this.a.executeInsert();
    }

    public void a(int i, String str) {
        this.a.bindString(i, str);
    }

    public void a(int i, long j) {
        this.a.bindLong(i, j);
    }

    public void d() {
        this.a.clearBindings();
    }

    public void a(int i, double d) {
        this.a.bindDouble(i, d);
    }

    public void e() {
        this.a.close();
    }

    public Object f() {
        return this.a;
    }
}
