package com.neusoft.sample.GreenDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.neusoft.sample.GreenDao.TextOneStructure;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TEXT_ONE_STRUCTURE".
*/
public class TextOneStructureDao extends AbstractDao<TextOneStructure, Long> {

    public static final String TABLENAME = "TEXT_ONE_STRUCTURE";

    /**
     * Properties of entity TextOneStructure.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ChapterNo = new Property(1, String.class, "chapterNo", false, "CHAPTER_NO");
        public final static Property ShowSequence = new Property(2, Integer.class, "showSequence", false, "SHOW_SEQUENCE");
        public final static Property ChapterSequence = new Property(3, Integer.class, "chapterSequence", false, "CHAPTER_SEQUENCE");
        public final static Property ChapterSequenceName = new Property(4, String.class, "chapterSequenceName", false, "CHAPTER_SEQUENCE_NAME");
        public final static Property ChapterName = new Property(5, String.class, "chapterName", false, "CHAPTER_NAME");
        public final static Property HasSectionNum = new Property(6, String.class, "hasSectionNum", false, "HAS_SECTION_NUM");
        public final static Property HasResource = new Property(7, Boolean.class, "hasResource", false, "HAS_RESOURCE");
        public final static Property FullFree = new Property(8, Boolean.class, "FullFree", false, "FULL_FREE");
    };


    public TextOneStructureDao(DaoConfig config) {
        super(config);
    }
    
    public TextOneStructureDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TEXT_ONE_STRUCTURE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"CHAPTER_NO\" TEXT NOT NULL UNIQUE ," + // 1: chapterNo
                "\"SHOW_SEQUENCE\" INTEGER," + // 2: showSequence
                "\"CHAPTER_SEQUENCE\" INTEGER," + // 3: chapterSequence
                "\"CHAPTER_SEQUENCE_NAME\" TEXT," + // 4: chapterSequenceName
                "\"CHAPTER_NAME\" TEXT," + // 5: chapterName
                "\"HAS_SECTION_NUM\" TEXT," + // 6: hasSectionNum
                "\"HAS_RESOURCE\" INTEGER," + // 7: hasResource
                "\"FULL_FREE\" INTEGER);"); // 8: FullFree
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TEXT_ONE_STRUCTURE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, TextOneStructure entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getChapterNo());
 
        Integer showSequence = entity.getShowSequence();
        if (showSequence != null) {
            stmt.bindLong(3, showSequence);
        }
 
        Integer chapterSequence = entity.getChapterSequence();
        if (chapterSequence != null) {
            stmt.bindLong(4, chapterSequence);
        }
 
        String chapterSequenceName = entity.getChapterSequenceName();
        if (chapterSequenceName != null) {
            stmt.bindString(5, chapterSequenceName);
        }
 
        String chapterName = entity.getChapterName();
        if (chapterName != null) {
            stmt.bindString(6, chapterName);
        }
 
        String hasSectionNum = entity.getHasSectionNum();
        if (hasSectionNum != null) {
            stmt.bindString(7, hasSectionNum);
        }
 
        Boolean hasResource = entity.getHasResource();
        if (hasResource != null) {
            stmt.bindLong(8, hasResource ? 1L: 0L);
        }
 
        Boolean FullFree = entity.getFullFree();
        if (FullFree != null) {
            stmt.bindLong(9, FullFree ? 1L: 0L);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public TextOneStructure readEntity(Cursor cursor, int offset) {
        TextOneStructure entity = new TextOneStructure( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // chapterNo
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // showSequence
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // chapterSequence
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // chapterSequenceName
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // chapterName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // hasSectionNum
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0, // hasResource
            cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0 // FullFree
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, TextOneStructure entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setChapterNo(cursor.getString(offset + 1));
        entity.setShowSequence(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setChapterSequence(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setChapterSequenceName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setChapterName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setHasSectionNum(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setHasResource(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
        entity.setFullFree(cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(TextOneStructure entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(TextOneStructure entity) {
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
