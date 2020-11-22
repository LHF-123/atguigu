package com.atguigu.day13;

/*
 * 	多态的应用：多态参数
 * 		形参是父类的类型
 * 		实参是子类的对象
 * 
 * 
 * 	需求：在工具类GraphicTools中，声明一个方法，功能：可以比较两个图形的面积是否相同
 */
public class TestUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicTools gt = new GraphicTools();
		
		//c1,c2是实参
		//形参g1是Graphic类型，实参c1是Circle_1类型，实参给形参赋值
		//隐含Graphic g1 = c1; 左边g1是父类的类型，右边c1是子类的对象
		//隐含Graphic g2 = c2; 
		Circle_1 c1 = new Circle_1(1);
		Circle_1 c2 = new Circle_1(1);
		boolean flag = gt.compare(c1, c2);
		System.out.println(flag);
		
		Rectangle_1 r1 = new Rectangle_1(2, 3);
		Rectangle_1 r2 = new Rectangle_1(3, 2);
		flag = gt.compare(r1, r2);
		System.out.println(flag);
		
		Triangle t1 = new Triangle(3, 4, 5);
		Triangle t2 = new Triangle(3, 4, 5);
		flag = gt.compare(t1, t2);
		System.out.println(flag);
		
		
	}

}
class GraphicTools{
	/*
	 * 	参数：两个图形的面积
	 */
	public boolean compare(Graphic g1, Graphic g2) {
		if (g1.getArea() == g2.getArea()) {
			return true;
		}else {
			return false;
		}
	}
	
}