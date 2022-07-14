package com.jsyiyi.javacode.sqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Para_Huang on 1/23/2017.
 */

public class StudentDao {
    private SQLiteDatabase db;

    public StudentDao(Context context){
        String path = Environment.getExternalStorageDirectory() + "/stu.db";
        SQLiteOpenHelper helper = new SQLiteOpenHelper(context,path,null,2) {
            @Override
            public void onCreate(SQLiteDatabase sqLiteDatabase) {
                 String sql = "create table info_tb (_id integer primary key autoincrement," +
                                "name varhcar(20)," +
                                "age integer," +
                                "gender varhcar(20))";
                 sqLiteDatabase.execSQL(sql);
                System.out.println("");
            }

            @Override
            public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
                System.out.println("");
            }
        };
        db = helper.getReadableDatabase();
    }

    public void addStudent(Student stu){
        try{
            String sql = "insert into info_tb (name,age,gender) values(?,?,?)";
            db.execSQL(sql,new Object[]{stu.getName(),stu.getAge()+"",stu.getGender()});
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Cursor getStudent(String... strs){
        Cursor c = null;
        try {
            //1.查询所有(没有参数)
            String sql = "select * from info_tb ";
            //2.含条件查询（姓名/年龄/编号）（参数形式：第一个参数指明条件，第二个参数指明条件值）
            if(strs.length != 0){
                sql += " where " + strs[0] + "='" + strs[1] + "'";
            }
            c = db.rawQuery(sql,null);
        }catch (Exception e){
            e.printStackTrace();
        }
        return c;
    }

    public ArrayList<Student> getStudentInList(String... strs){
        ArrayList<Student> list = new ArrayList<>();
        Cursor c = getStudent(strs);
        while (c.moveToNext()){
            int id = c.getInt(0);
            String name = c.getString(1);
            int age = c.getInt(2);
            String gender = c.getString(3);
            Student s = new Student(id,name,age,gender);
            list.add(s);
        }
        return list;
    }

    public void deleteStudent(String... strs){
        String sql  = "delete from info_tb where " + strs[0] + "='" + strs[1] + "'";
        db.execSQL(sql);
    }

    public void updateStudent(Student stu){
        String sql = "update info_tb set name=?,age=?,gender=? where _id=?";
        db.execSQL(sql,new Object[]{stu.getName(),stu.getAge(),stu.getGender(),stu.getId()});
    }

}
