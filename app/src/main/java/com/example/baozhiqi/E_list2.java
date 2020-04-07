package com.example.baozhiqi;



import java.io.Serializable;
/*spinner的java类*/

public class E_list2 implements Serializable {
    private String name;
    private int img;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getImg() {
        return img;
    }
    public void setImg(int img) {
        this.img = img;
    }



    public E_list2(String name,int img)
    {
        this.name=name;
        this.img=img;

    }


}
