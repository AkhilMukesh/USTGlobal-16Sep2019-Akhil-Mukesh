package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {

		int id;
		String name;
		double percentage;
		public Student(int id, String name, double percentage) {
			super();
			this.id = id;
			this.name = name;
			this.percentage = percentage;
		}
		@Override
		public int compareTo(Student s) {
			return 0;
			// TODO Auto-generated method stub
//			if(this.id>s.id) {
//				return 1;
//			}else if(this.id<s.id) {
//				return -1;
//			}else {
//				return 0;
//	
//			}
			
//			if(this.percentage>s.percentage) {
//				return 1;
//			}else if(this.percentage<s.id) {
//				return -1;
//				
//			}else {
//				return 0;
//			}
//			

		int s0 = this,id;
		int s1 = this.id;
		
		return s0.compareTo(s1);
		
		}
		
		
		
		
}
