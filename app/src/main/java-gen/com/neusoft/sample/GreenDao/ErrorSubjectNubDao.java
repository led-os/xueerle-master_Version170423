package com.neusoft.sample.GreenDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.neusoft.sample.GreenDao.ErrorSubjectNub;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ERROR_SUBJECT_NUB".
*/
public class ErrorSubjectNubDao extends AbstractDao<ErrorSubjectNub, Long> {

    public static final String TABLENAME = "ERROR_SUBJECT_NUB";

    /**
     * Properties of entity ErrorSubjectNub.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Xtdctm_id = new Property(1, String.class, "xtdctm_id", false, "XTDCTM_ID");
        public final static Property Examination_number = new Property(2, String.class, "examination_number", false, "EXAMINATION_NUMBER");
        public final static Property Ismastered = new Property(3, Integer.class, "ismastered", false, "ISMASTERED");
        public final static Property Test_group_number = new Property(4, String.class, "test_group_number", false, "TEST_GROUP_NUMBER");
        public final static Property User_id = new Property(5, String.class, "user_id", false, "USER_ID");
        public final static Property Xtcsjl_id = new Property(6, Integer.class, "xtcsjl_id", false, "XTCSJL_ID");
        public final static Property Answer = new Property(7, String.class, "answer", false, "ANSWER");
        public final static Property Jl_datetime = new Property(8, String.class, "jl_datetime", false, "JL_DATETIME");
        public final static Property TableName = new Property(9, String.class, "tableName", false, "TABLE_NAME");
    };


    public ErrorSubjectNubDao(DaoConfig config) {
        super(config);
    }
    
    public ErrorSubjectNubDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ERROR_SUBJECT_NUB\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"XTDCTM_ID\" TEXT," + // 1: xtdctm_id
                "\"EXAMINATION_NUMBER\" TEXT UNIQUE ," + // 2: examination_number
                "\"ISMASTERED\" INTEGER," + // 3: ismastered
                "\"TEST_GROUP_NUMBER\" TEXT," + // 4: test_group_number
                "\"USER_ID\" TEXT," + // 5: user_id
                "\"XTCSJL_ID\" INTEGER," + // 6: xtcsjl_id
                "\"ANSWER\" TEXT," + // 7: answer
                "\"JL_DATETIME\" TEXT," + // 8: jl_datetime
                "\"TABLE_NAME\" TEXT);"); // 9: tableName
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ERROR_SUBJECT_NUB\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ErrorSubjectNub entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String xtdctm_id = entity.getXtdctm_id();
        if (xtdctm_id != null) {
            stmt.bindString(2, xtdctm_id);
        }
 
        String examination_number = entity.getExamination_number();
        if (examination_number != null) {
            stmt.bindString(3, examination_number);
        }
 
        Integer ismastered = entity.getIsmastered();
        if (ismastered != null) {
            stmt.bindLong(4, ismastered);
        }
 
        String test_group_number = entity.getTest_group_number();
        if (test_group_number != null) {
            stmt.bindString(5, test_group_number);
        }
 
        String user_id = entity.getUser_id();
        if (user_id != null) {
            stmt.bindString(6, user_id);
        }
 
        Integer xtcsjl_id = entity.getXtcsjl_id();
        if (xtcsjl_id != null) {
            stmt.bindLong(7, xtcsjl_id);
        }
 
        String answer = entity.getAnswer();
        if (answer != null) {
            stmt.bindString(8, answer);
        }
 
        String jl_datetime = entity.getJl_datetime();
        if (jl_datetime != null) {
            stmt.bindString(9, jl_datetime);
        }
 
        String tableName = entity.getTableName();
        if (tableName != null) {
            stmt.bindString(10, tableName);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ErrorSubjectNub readEntity(Cursor cursor, int offset) {
        ErrorSubjectNub entity = new ErrorSubjectNub( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // xtdctm_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // examination_number
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // ismastered
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // test_group_number
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // user_id
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // xtcsjl_id
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // answer
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // jl_datetime
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // tableName
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ErrorSubjectNub entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setXtdctm_id(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setExamination_number(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setIsmastered(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setTest_group_number(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUser_id(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setXtcsjl_id(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setAnswer(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setJl_datetime(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setTableName(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ErrorSubjectNub entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ErrorSubjectNub entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
