package com.zhb.simple.from151to200;

/**
 * @author zhb
 * @create 2022-03-31 23:31
 */

import java.util.Deque;
import java.util.LinkedList;


/**
 * 155. 最小栈
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * 实现 MinStack 类:
 *
 * MinStack() 初始化堆栈对象。
 * void push(int val) 将元素val推入堆栈。
 * void pop() 删除堆栈顶部的元素。
 * int top() 获取堆栈顶部的元素。
 * int getMin() 获取堆栈中的最小元素。
 */
public class Problem_155_MinStack {
    /**
     * 描述：实现T(getMin) = O(1) 的栈
     * 思路：辅助栈assist(与dataStack同步)：
     * push的val比min小 ==> assist.push(val); push的val比min大, ==> assist.push(min);
     * getMin()即为assist.top();
     *
     * debug记录：一：AC
     */
    class MinStack {
        Deque<Integer> dataStack = null;
        Deque<Integer> assistStack = null;

        MinStack(){
            dataStack = new LinkedList<Integer>();
            assistStack = new LinkedList<Integer>();
            assistStack.push(Integer.MAX_VALUE);
        }

        void push(int val) {
            dataStack.push(val);
            int smaller = Math.min(val,assistStack.peek());
            assistStack.push(smaller);
        }
        void pop() {
            dataStack.pop();
            assistStack.pop();
        }
        int top(){
            return dataStack.peek();
        }

        int getMin() {
            return assistStack.peek();
        }
    }
}
/**
 * 栈 设计
 */