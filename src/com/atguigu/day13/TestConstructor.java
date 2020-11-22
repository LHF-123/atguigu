package com.atguigu.day13;
/*
 * 	子类在继承父类时，构造器到底有什么关系？
 * 	一句话：子类的构造器中一定会调用父类的构造器、
 */
public class TestConstructor {

}

/*
 * 	情形一：
 * 	（1）父类有默认无参构造，并且只有一个无参构造
 */
class SuperClass1{
	//有一个默认的无参构造
}
class SubClass1 extends SuperClass1{
	//有一个默认的无参构造
}

/*
 * 	情形二：
 * 	（2）父类有自己编写的无参构造，并且只有一个无参构造
 */
class SuperClass2{
	//有一个自定义的无参构造
	SuperClass2() {
		// TODO Auto-generated constructor stub
	}
}
class SubClass2 extends SuperClass2{
	//有一个默认的无参构造
}
class SubClass2_2 extends SuperClass2{
	//有一个自定义的无参构造
	SubClass2_2(){
//		super();//可以省略
	}
}

/*
 * 	情形三：父类没有无参构造，那么子类必须手动编写构造器
 */
class SuperClass3{
	private String info;
	//有一个自定义的无参构造
	SuperClass3(String info) {
		this.info = info;
	}
}
//此时，因为父类没有无参构造，那么子类必须手动编写构造器
class SubClass3 extends SuperClass3{
	//手动编写有参构造
	SubClass3(String info){
		super(info);
	}
}
//此时，因为父类没有无参构造，那么子类必须手动编写构造器
class SubClass3_3 extends SuperClass3{
	//手动编写有参构造
	SubClass3_3(){
		super("");//只能手动调用父类的有参构造
	}
}

/*
 * 	情形四：父类既有无参构造，又有有参构造
 */
class SuperClass4{
	private String info;
	//也有一个自定义的无参构造
	SuperClass4() {
		
	}
	
	//有一个自定义的无参构造
	SuperClass4(String info) {
		this.info = info;
	}
}
//子类就自由
class SubClass4 extends SuperClass4{
	
}
class SubClass4_4 extends SuperClass4{
	SubClass4_4(String info){
		super(info);
	}
}
class SubClass4_5 extends SuperClass4{
	SubClass4_5(){
		
	}
	
	SubClass4_5(String info){
		super(info);
	}
}