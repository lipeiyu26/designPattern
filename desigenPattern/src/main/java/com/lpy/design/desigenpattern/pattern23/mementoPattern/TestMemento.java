package com.lpy.design.desigenpattern.pattern23.mementoPattern;

public class TestMemento {
    public static void main(String[] args) {
        DraftsBox draftsBox = new DraftsBox();
        Edit edit = new Edit("我是一个java程序员","目前是中高级","qwewqrwerqw.png");
        ArticleMemento articleMemento = edit.saveToMemento();
        draftsBox.addMemento(articleMemento);
        System.out.println("标题："+edit.getTitle());
        System.out.println("内容："+edit.getContent());
        System.out.println("插图："+edit.getImgs());

        System.out.println("------------1修改--------------");
        edit.setTitle("LPY-->我是一个java程序员");
        edit.setContent("目前是中高级,希望能进入高级");
        articleMemento = edit.saveToMemento();
        draftsBox.addMemento(articleMemento);
        System.out.println("标题："+edit.getTitle());
        System.out.println("内容："+edit.getContent());
        System.out.println("插图："+edit.getImgs());
        System.out.println("------------1修改完成--------------");

        System.out.println("------------2修改--------------");
        edit.setContent("已经进入高级");
        edit.setTitle("LPY-->我是一个高级java程序员");
        System.out.println("标题："+edit.getTitle());
        System.out.println("内容："+edit.getContent());
        System.out.println("插图："+edit.getImgs());
        System.out.println("-------------修改完成----------------");

        articleMemento = draftsBox.getMemento();
        edit.undoFromMemento(articleMemento);
        System.out.println("-------------第一次回退---------------");
        System.out.println("标题："+edit.getTitle());
        System.out.println("内容："+edit.getContent());
        System.out.println("插图："+edit.getImgs());

        articleMemento = draftsBox.getMemento();
        edit.undoFromMemento(articleMemento);
        System.out.println("-------------第二次回退---------------");
        System.out.println("标题："+edit.getTitle());
        System.out.println("内容："+edit.getContent());
        System.out.println("插图："+edit.getImgs());
    }
}
