package com.lpy.design.desigenpattern.pattern23.templateMethodPattern;

/**
 * 模板方法模式
 */
public abstract class AbstractCourse {
    protected abstract void  checkHomework();
    public final void createCourse(){
        postPreResource();
        createPPT();
        liveVideo();
        postResource();
        postHomework();
    }

    /**
     * 布置作业
     */
    protected void postHomework() {
        if(needCheckHomework()){
            checkHomework();
        }
        System.out.println("布置作业");
    }

    protected abstract boolean needCheckHomework();

    /**
     * 上传课后资料
     */
    protected void postResource() {
        System.out.println("上传课后资料");
    }

    /**
     * 直播授课
     */
    protected void liveVideo() {
        System.out.println("直播授课");
    }

    /**
     * 制作课件
     */
    protected void createPPT() {
        System.out.println("制作课件");
    }

    /**
     * 发布预习资料
     */
    protected void postPreResource() {
        System.out.println("发布预习资料");
    }
}
