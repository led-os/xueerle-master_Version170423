package com.neusoft.sample.GreenDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.neusoft.sample.GreenDao.teacher;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TEACHER".
*/
public class teacherDao extends AbstractDao<teacher, Long> {

    public static final String TABLENAME = "TEACHER";

    /**
     * Properties of entity teacher.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TeacherName = new Property(1, String.class, "teacherName", false, "TEACHER_NAME");
        public final static Property RealName = new Property(2, String.class, "realName", false, "REAL_NAME");
        public final static Property NickName = new Property(3, String.class, "nickName", false, "NICK_NAME");
        public final static Property Sex = new Property(4, String.class, "sex", false, "SEX");
        public final static Property Birthday = new Property(5, String.class, "birthday", false, "BIRTHDAY");
        public final static Property Motto = new Property(6, String.class, "motto", false, "MOTTO");
        public final static Property Teacher_icon_url = new Property(7, String.class, "teacher_icon_url", false, "TEACHER_ICON_URL");
        public final static Property Password = new Property(8, String.class, "password", false, "PASSWORD");
        public final static Property TotalIntegral = new Property(9, String.class, "totalIntegral", false, "TOTAL_INTEGRAL");
        public final static Property UserIntegral = new Property(10, String.class, "userIntegral", false, "USER_INTEGRAL");
        public final static Property HomeWorkIntegral = new Property(11, String.class, "homeWorkIntegral", false, "HOME_WORK_INTEGRAL");
        public final static Property ArticleIntegral = new Property(12, String.class, "articleIntegral", false, "ARTICLE_INTEGRAL");
        public final static Property FeedbackIntegral = new Property(13, String.class, "feedbackIntegral", false, "FEEDBACK_INTEGRAL");
        public final static Property SchoolNum = new Property(14, String.class, "schoolNum", false, "SCHOOL_NUM");
        public final static Property SchoolName = new Property(15, String.class, "schoolName", false, "SCHOOL_NAME");
        public final static Property IsClassTeacher = new Property(16, String.class, "isClassTeacher", false, "IS_CLASS_TEACHER");
        public final static Property SubjectNum = new Property(17, String.class, "subjectNum", false, "SUBJECT_NUM");
        public final static Property SubjectName = new Property(18, String.class, "subjectName", false, "SUBJECT_NAME");
        public final static Property TextBookNum = new Property(19, String.class, "textBookNum", false, "TEXT_BOOK_NUM");
        public final static Property TextBookName = new Property(20, String.class, "textBookName", false, "TEXT_BOOK_NAME");
        public final static Property ClassNum1 = new Property(21, String.class, "classNum1", false, "CLASS_NUM1");
        public final static Property ClassName1 = new Property(22, String.class, "className1", false, "CLASS_NAME1");
        public final static Property PeopleNum1 = new Property(23, String.class, "peopleNum1", false, "PEOPLE_NUM1");
        public final static Property PeopleRegister1 = new Property(24, String.class, "peopleRegister1", false, "PEOPLE_REGISTER1");
        public final static Property PeopleBuy1 = new Property(25, String.class, "peopleBuy1", false, "PEOPLE_BUY1");
        public final static Property ClassNum2 = new Property(26, String.class, "classNum2", false, "CLASS_NUM2");
        public final static Property ClassName2 = new Property(27, String.class, "className2", false, "CLASS_NAME2");
        public final static Property PeopleNum2 = new Property(28, String.class, "peopleNum2", false, "PEOPLE_NUM2");
        public final static Property PeopleRegister2 = new Property(29, String.class, "peopleRegister2", false, "PEOPLE_REGISTER2");
        public final static Property PeopleBuy2 = new Property(30, String.class, "peopleBuy2", false, "PEOPLE_BUY2");
        public final static Property ClassNum3 = new Property(31, String.class, "classNum3", false, "CLASS_NUM3");
        public final static Property ClassName3 = new Property(32, String.class, "className3", false, "CLASS_NAME3");
        public final static Property PeopleNum3 = new Property(33, String.class, "peopleNum3", false, "PEOPLE_NUM3");
        public final static Property PeopleRegister3 = new Property(34, String.class, "peopleRegister3", false, "PEOPLE_REGISTER3");
        public final static Property PeopleBuy3 = new Property(35, String.class, "peopleBuy3", false, "PEOPLE_BUY3");
        public final static Property ClassNum4 = new Property(36, String.class, "classNum4", false, "CLASS_NUM4");
        public final static Property ClassName4 = new Property(37, String.class, "className4", false, "CLASS_NAME4");
        public final static Property PeopleNum4 = new Property(38, String.class, "peopleNum4", false, "PEOPLE_NUM4");
        public final static Property PeopleRegister4 = new Property(39, String.class, "peopleRegister4", false, "PEOPLE_REGISTER4");
        public final static Property PeopleBuy4 = new Property(40, String.class, "peopleBuy4", false, "PEOPLE_BUY4");
        public final static Property QqNum = new Property(41, String.class, "qqNum", false, "QQ_NUM");
        public final static Property WeChatNum = new Property(42, String.class, "weChatNum", false, "WE_CHAT_NUM");
        public final static Property Email = new Property(43, String.class, "email", false, "EMAIL");
    };


    public teacherDao(DaoConfig config) {
        super(config);
    }
    
    public teacherDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TEACHER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TEACHER_NAME\" TEXT NOT NULL ," + // 1: teacherName
                "\"REAL_NAME\" TEXT," + // 2: realName
                "\"NICK_NAME\" TEXT," + // 3: nickName
                "\"SEX\" TEXT," + // 4: sex
                "\"BIRTHDAY\" TEXT," + // 5: birthday
                "\"MOTTO\" TEXT," + // 6: motto
                "\"TEACHER_ICON_URL\" TEXT," + // 7: teacher_icon_url
                "\"PASSWORD\" TEXT," + // 8: password
                "\"TOTAL_INTEGRAL\" TEXT," + // 9: totalIntegral
                "\"USER_INTEGRAL\" TEXT," + // 10: userIntegral
                "\"HOME_WORK_INTEGRAL\" TEXT," + // 11: homeWorkIntegral
                "\"ARTICLE_INTEGRAL\" TEXT," + // 12: articleIntegral
                "\"FEEDBACK_INTEGRAL\" TEXT," + // 13: feedbackIntegral
                "\"SCHOOL_NUM\" TEXT," + // 14: schoolNum
                "\"SCHOOL_NAME\" TEXT," + // 15: schoolName
                "\"IS_CLASS_TEACHER\" TEXT," + // 16: isClassTeacher
                "\"SUBJECT_NUM\" TEXT," + // 17: subjectNum
                "\"SUBJECT_NAME\" TEXT," + // 18: subjectName
                "\"TEXT_BOOK_NUM\" TEXT," + // 19: textBookNum
                "\"TEXT_BOOK_NAME\" TEXT," + // 20: textBookName
                "\"CLASS_NUM1\" TEXT," + // 21: classNum1
                "\"CLASS_NAME1\" TEXT," + // 22: className1
                "\"PEOPLE_NUM1\" TEXT," + // 23: peopleNum1
                "\"PEOPLE_REGISTER1\" TEXT," + // 24: peopleRegister1
                "\"PEOPLE_BUY1\" TEXT," + // 25: peopleBuy1
                "\"CLASS_NUM2\" TEXT," + // 26: classNum2
                "\"CLASS_NAME2\" TEXT," + // 27: className2
                "\"PEOPLE_NUM2\" TEXT," + // 28: peopleNum2
                "\"PEOPLE_REGISTER2\" TEXT," + // 29: peopleRegister2
                "\"PEOPLE_BUY2\" TEXT," + // 30: peopleBuy2
                "\"CLASS_NUM3\" TEXT," + // 31: classNum3
                "\"CLASS_NAME3\" TEXT," + // 32: className3
                "\"PEOPLE_NUM3\" TEXT," + // 33: peopleNum3
                "\"PEOPLE_REGISTER3\" TEXT," + // 34: peopleRegister3
                "\"PEOPLE_BUY3\" TEXT," + // 35: peopleBuy3
                "\"CLASS_NUM4\" TEXT," + // 36: classNum4
                "\"CLASS_NAME4\" TEXT," + // 37: className4
                "\"PEOPLE_NUM4\" TEXT," + // 38: peopleNum4
                "\"PEOPLE_REGISTER4\" TEXT," + // 39: peopleRegister4
                "\"PEOPLE_BUY4\" TEXT," + // 40: peopleBuy4
                "\"QQ_NUM\" TEXT," + // 41: qqNum
                "\"WE_CHAT_NUM\" TEXT," + // 42: weChatNum
                "\"EMAIL\" TEXT);"); // 43: email
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TEACHER\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, teacher entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getTeacherName());
 
        String realName = entity.getRealName();
        if (realName != null) {
            stmt.bindString(3, realName);
        }
 
        String nickName = entity.getNickName();
        if (nickName != null) {
            stmt.bindString(4, nickName);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(5, sex);
        }
 
        String birthday = entity.getBirthday();
        if (birthday != null) {
            stmt.bindString(6, birthday);
        }
 
        String motto = entity.getMotto();
        if (motto != null) {
            stmt.bindString(7, motto);
        }
 
        String teacher_icon_url = entity.getTeacher_icon_url();
        if (teacher_icon_url != null) {
            stmt.bindString(8, teacher_icon_url);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(9, password);
        }
 
        String totalIntegral = entity.getTotalIntegral();
        if (totalIntegral != null) {
            stmt.bindString(10, totalIntegral);
        }
 
        String userIntegral = entity.getUserIntegral();
        if (userIntegral != null) {
            stmt.bindString(11, userIntegral);
        }
 
        String homeWorkIntegral = entity.getHomeWorkIntegral();
        if (homeWorkIntegral != null) {
            stmt.bindString(12, homeWorkIntegral);
        }
 
        String articleIntegral = entity.getArticleIntegral();
        if (articleIntegral != null) {
            stmt.bindString(13, articleIntegral);
        }
 
        String feedbackIntegral = entity.getFeedbackIntegral();
        if (feedbackIntegral != null) {
            stmt.bindString(14, feedbackIntegral);
        }
 
        String schoolNum = entity.getSchoolNum();
        if (schoolNum != null) {
            stmt.bindString(15, schoolNum);
        }
 
        String schoolName = entity.getSchoolName();
        if (schoolName != null) {
            stmt.bindString(16, schoolName);
        }
 
        String isClassTeacher = entity.getIsClassTeacher();
        if (isClassTeacher != null) {
            stmt.bindString(17, isClassTeacher);
        }
 
        String subjectNum = entity.getSubjectNum();
        if (subjectNum != null) {
            stmt.bindString(18, subjectNum);
        }
 
        String subjectName = entity.getSubjectName();
        if (subjectName != null) {
            stmt.bindString(19, subjectName);
        }
 
        String textBookNum = entity.getTextBookNum();
        if (textBookNum != null) {
            stmt.bindString(20, textBookNum);
        }
 
        String textBookName = entity.getTextBookName();
        if (textBookName != null) {
            stmt.bindString(21, textBookName);
        }
 
        String classNum1 = entity.getClassNum1();
        if (classNum1 != null) {
            stmt.bindString(22, classNum1);
        }
 
        String className1 = entity.getClassName1();
        if (className1 != null) {
            stmt.bindString(23, className1);
        }
 
        String peopleNum1 = entity.getPeopleNum1();
        if (peopleNum1 != null) {
            stmt.bindString(24, peopleNum1);
        }
 
        String peopleRegister1 = entity.getPeopleRegister1();
        if (peopleRegister1 != null) {
            stmt.bindString(25, peopleRegister1);
        }
 
        String peopleBuy1 = entity.getPeopleBuy1();
        if (peopleBuy1 != null) {
            stmt.bindString(26, peopleBuy1);
        }
 
        String classNum2 = entity.getClassNum2();
        if (classNum2 != null) {
            stmt.bindString(27, classNum2);
        }
 
        String className2 = entity.getClassName2();
        if (className2 != null) {
            stmt.bindString(28, className2);
        }
 
        String peopleNum2 = entity.getPeopleNum2();
        if (peopleNum2 != null) {
            stmt.bindString(29, peopleNum2);
        }
 
        String peopleRegister2 = entity.getPeopleRegister2();
        if (peopleRegister2 != null) {
            stmt.bindString(30, peopleRegister2);
        }
 
        String peopleBuy2 = entity.getPeopleBuy2();
        if (peopleBuy2 != null) {
            stmt.bindString(31, peopleBuy2);
        }
 
        String classNum3 = entity.getClassNum3();
        if (classNum3 != null) {
            stmt.bindString(32, classNum3);
        }
 
        String className3 = entity.getClassName3();
        if (className3 != null) {
            stmt.bindString(33, className3);
        }
 
        String peopleNum3 = entity.getPeopleNum3();
        if (peopleNum3 != null) {
            stmt.bindString(34, peopleNum3);
        }
 
        String peopleRegister3 = entity.getPeopleRegister3();
        if (peopleRegister3 != null) {
            stmt.bindString(35, peopleRegister3);
        }
 
        String peopleBuy3 = entity.getPeopleBuy3();
        if (peopleBuy3 != null) {
            stmt.bindString(36, peopleBuy3);
        }
 
        String classNum4 = entity.getClassNum4();
        if (classNum4 != null) {
            stmt.bindString(37, classNum4);
        }
 
        String className4 = entity.getClassName4();
        if (className4 != null) {
            stmt.bindString(38, className4);
        }
 
        String peopleNum4 = entity.getPeopleNum4();
        if (peopleNum4 != null) {
            stmt.bindString(39, peopleNum4);
        }
 
        String peopleRegister4 = entity.getPeopleRegister4();
        if (peopleRegister4 != null) {
            stmt.bindString(40, peopleRegister4);
        }
 
        String peopleBuy4 = entity.getPeopleBuy4();
        if (peopleBuy4 != null) {
            stmt.bindString(41, peopleBuy4);
        }
 
        String qqNum = entity.getQqNum();
        if (qqNum != null) {
            stmt.bindString(42, qqNum);
        }
 
        String weChatNum = entity.getWeChatNum();
        if (weChatNum != null) {
            stmt.bindString(43, weChatNum);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(44, email);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public teacher readEntity(Cursor cursor, int offset) {
        teacher entity = new teacher( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // teacherName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // realName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // nickName
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // sex
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // birthday
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // motto
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // teacher_icon_url
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // password
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // totalIntegral
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // userIntegral
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // homeWorkIntegral
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // articleIntegral
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // feedbackIntegral
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // schoolNum
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // schoolName
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // isClassTeacher
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // subjectNum
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // subjectName
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // textBookNum
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // textBookName
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // classNum1
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // className1
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // peopleNum1
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // peopleRegister1
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // peopleBuy1
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // classNum2
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // className2
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // peopleNum2
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // peopleRegister2
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // peopleBuy2
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // classNum3
            cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32), // className3
            cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33), // peopleNum3
            cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34), // peopleRegister3
            cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35), // peopleBuy3
            cursor.isNull(offset + 36) ? null : cursor.getString(offset + 36), // classNum4
            cursor.isNull(offset + 37) ? null : cursor.getString(offset + 37), // className4
            cursor.isNull(offset + 38) ? null : cursor.getString(offset + 38), // peopleNum4
            cursor.isNull(offset + 39) ? null : cursor.getString(offset + 39), // peopleRegister4
            cursor.isNull(offset + 40) ? null : cursor.getString(offset + 40), // peopleBuy4
            cursor.isNull(offset + 41) ? null : cursor.getString(offset + 41), // qqNum
            cursor.isNull(offset + 42) ? null : cursor.getString(offset + 42), // weChatNum
            cursor.isNull(offset + 43) ? null : cursor.getString(offset + 43) // email
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, teacher entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTeacherName(cursor.getString(offset + 1));
        entity.setRealName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNickName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSex(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBirthday(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setMotto(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTeacher_icon_url(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPassword(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setTotalIntegral(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setUserIntegral(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setHomeWorkIntegral(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setArticleIntegral(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setFeedbackIntegral(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setSchoolNum(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setSchoolName(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setIsClassTeacher(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setSubjectNum(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setSubjectName(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setTextBookNum(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setTextBookName(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setClassNum1(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setClassName1(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setPeopleNum1(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setPeopleRegister1(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setPeopleBuy1(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setClassNum2(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setClassName2(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setPeopleNum2(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setPeopleRegister2(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setPeopleBuy2(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setClassNum3(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setClassName3(cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32));
        entity.setPeopleNum3(cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33));
        entity.setPeopleRegister3(cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34));
        entity.setPeopleBuy3(cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35));
        entity.setClassNum4(cursor.isNull(offset + 36) ? null : cursor.getString(offset + 36));
        entity.setClassName4(cursor.isNull(offset + 37) ? null : cursor.getString(offset + 37));
        entity.setPeopleNum4(cursor.isNull(offset + 38) ? null : cursor.getString(offset + 38));
        entity.setPeopleRegister4(cursor.isNull(offset + 39) ? null : cursor.getString(offset + 39));
        entity.setPeopleBuy4(cursor.isNull(offset + 40) ? null : cursor.getString(offset + 40));
        entity.setQqNum(cursor.isNull(offset + 41) ? null : cursor.getString(offset + 41));
        entity.setWeChatNum(cursor.isNull(offset + 42) ? null : cursor.getString(offset + 42));
        entity.setEmail(cursor.isNull(offset + 43) ? null : cursor.getString(offset + 43));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(teacher entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(teacher entity) {
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
