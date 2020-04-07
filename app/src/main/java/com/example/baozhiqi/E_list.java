package com.example.baozhiqi;

import java.io.Serializable;
public class E_list implements Serializable {
        private String name;//名字
        private String type;//类型
        private String date1;//生产日期
        private String date2;//剩余天数
        private int img;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type= type;
    }




    public String getDate1(){
        return  date1;
    }
    public  void setDate1(String date1){
        this.date1=date1;
    }





    public String getDate2() {
        return date2;
    }
    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public int getImg() {
        return img;
    }
    public void setImg(int img) {
        this.img = img;
    }



        public E_list(String name,String type,String date1,String date2,int img)
        {
        this.name=name;
        this.type=type;
        this.date1=date1;
        this.date2=date2;
        this.img=img;

        }


}