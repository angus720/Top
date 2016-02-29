package com.angus.topdemo.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.angus.topdemo.dao.DaoMaster;
import com.angus.topdemo.dao.DaoSession;
import com.angus.topdemo.dao.TopclassDao;
import com.angus.topdemo.entities.Topclass;

/**
 * Created by Administrator on 2016/2/27.
 */
public class DbUtil {
    private static DaoSession session;
    public static void init(Context context){
        TopOpenHelper helper = new TopOpenHelper(context, "top.db", null);
        session = new DaoMaster(helper.getWritableDatabase()).newSession();
    }

    public static DaoSession getSession() {
        return session;
    }

    private static class TopOpenHelper extends DaoMaster.DevOpenHelper{

        public TopOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            super.onCreate(db);
            TopclassDao dao = new DaoMaster(db).newSession().getTopclassDao();
            dao.insert(new Topclass(1L,"民生热点"));
            dao.insert(new Topclass(2L, "娱乐热点"));
            dao.insert(new Topclass(3L, "财经热点"));
            dao.insert(new Topclass(4L, "体育热点"));
            dao.insert(new Topclass(5L, "教育热点"));
            dao.insert(new Topclass(6L, "社会热点"));
        }
    }
}
