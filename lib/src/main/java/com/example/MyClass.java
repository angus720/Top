package com.example;

import java.io.IOException;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class MyClass {
    public static void main(String[] args) {
        Schema schema = new Schema(1, "com.angus.topdemo.entities");
        schema.setDefaultJavaPackageDao("com.angus.topdemo.dao");
        //        class Topclass{
//            private int id;
//            private String name;
//        }
//        class  Top  {
//            private String title;//资讯标题
//            private int topclass;//一级分类
//            private String img;//图片
//            private String description;//描述
//            private String keywords;//关键字
//            private String message;//资讯内容
//            private int count ;//访问次数
//            private int fcount;//收藏数
//            private int rcount;//评论读数
//            private String fromname;
//            private String fromurl;
//            private Timestamp time;
//        }
        Entity topclass = schema.addEntity("Topclass");
        topclass.addIdProperty();
        topclass.addShortProperty("name");
        Entity top = schema.addEntity("Top");
        top.addIdProperty();
        top.addStringProperty("title");
        top.addStringProperty("img");
        top.addStringProperty("description");
        top.addStringProperty("keywords");
        top.addStringProperty("message");
        top.addStringProperty("fromname");
        top.addStringProperty("fromurl");
        top.addLongProperty("topclass");
        top.addIntProperty("count");
        top.addIntProperty("fcount");
        top.addIntProperty("rcount");
        top.addDateProperty("time");
        try {
            DaoGenerator generator = new DaoGenerator();
            generator.generateAll(schema,"app/src/main/java");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
