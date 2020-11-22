package com.atguigu.day20;

/*
 * 	容器：用来装数据的
 * 
 * 	1、数组
 * 	优点：可以根据索引快速定位到某个元素，访问速度非常快
 * 	缺点：长度是固定的，如果数组满了，需要考虑扩容，并且删除和插入元素时，需要移动元素。
 * 
 * 	2、集合
 * 	集合新设计的一组容器，具有各种特点。
 * 	数据结构
 * 	栈、队列、链表、堆、图、树...
 * 
 * 	无论多复杂，都是从以下两种物理结构的基础上构建出来的：
 * 	（1）数组
 * 		在内存中需要开辟连续的存储空间。有可能有很多空闲的空间
 * 		元素类型：就是数据的类型
 * 	（2）链式
 * 		在内存中不需要连续的空间。不会有空闲空间
 * 		元素类型：结点类型
 * 	
 * 	结点类型：
 * 	单向链表：
 * 	class Node{
 * 		Object data;
 * 		Node next;
 * 	}
 * 	双向链表：
 * 	class Node{
 * 		Node previous;
 * 		Object data;
 * 		Node next;
 * 	}
 * 	树
 * 	class Node{
 * 		Node parent;
 * 		Object data;
 * 		Node left;
 * 		Node right;
 * 	}
 * 	....
 */
public class TestData {

}
