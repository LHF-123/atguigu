package com.atguigu.day27;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LHF
 * @create 2020-08-26-12:00
 */
public final class AtGuiGuStudent extends Date implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;

    public AtGuiGuStudent(String name) {
        this.name = name;
    }

    public AtGuiGuStudent() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AtGuiGuStudent{" + "name='" + name + '\'' + '}';
    }
    
    public static void test(int a) {
		System.out.println("a = " + a);
	}
    
}
