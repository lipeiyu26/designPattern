package com.lpy.design.desigenpattern.pattern23.compositePattern.safeMode;

public class TestSafe {
    public static void main(String[] args) {
        System.out.println("===============安全模式写法================");

        File qq = new File("QQ.exe");
        File wx = new File("WX.exe");

        Folder office = new Folder("办公软件",2);
        File word = new File("word.exe");
        File ppt = new File("ppt.exe");
        File excel = new File("excel.exe");
        office.add(word);
        Folder root = new Folder("D盘",1);
        root.add(qq);
        root.add(wx);
        root.add(office);
        System.out.println("============show()================");
        root.show();
    }
}
