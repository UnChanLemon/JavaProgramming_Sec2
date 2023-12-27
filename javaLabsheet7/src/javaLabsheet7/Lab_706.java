package javaLabsheet7;
import javax.swing.*;
public class Lab_706 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int indexNumb=Integer.parseInt(JOptionPane.showInputDialog(
				"Input index of array: "));
		while(!checkIndex(nums, indexNumb)) {
			indexNumb = Integer.parseInt(JOptionPane.showInputDialog(
					"Input index of array, agin: "));
		
		}
		int currentValue = currentData(nums, indexNumb); //menthod e
		int prevValue = prevData(nums, indexNumb);
		int nextValue= nextData(nums, indexNumb);
	
	if(nextValue ==0) {
		JOptionPane.showMessageDialog(null, "current data, nums["+indexNumb+
				"] is "+ currentValue
				+"\n"+"Previous data,nums["+(indexNumb-1)+"] is "+ prevValue+
				"\n"+"No next data");
	}
	else if(prevValue==0) {
		JOptionPane.showMessageDialog(null, "current data, nums["+indexNumb+
				"] is "+ currentValue
				+"\n"+"No previous data\n"
				+"Next data,nums["+(indexNumb+1)+"] is "+nextValue);
	}
	else {
		JOptionPane.showMessageDialog(null, "current data, nums["+indexNumb+
				"] is "+ currentValue
				+"\n"+"Previous data,nums["+(indexNumb-1)+"] is "+ prevValue+
				"Next data,nums["+(indexNumb+1)+"] is "+nextValue);
	}
	}// end of main
	public static boolean checkIndex(int [] number, int index) {
		/*if ((index>=number.length)|| (index<0)) {
			return true;
		}
		else {
			return false;
		}*/
	return ((index>=number.length)||(index<0)) ? true:false;
	}
	public static int currentData(int[] nums, int index) {
		return nums[index];
	}
	public static int prevData(int[]nums , int index) {
		
		
		return (index<1)? 0:nums[index-1];
		}
	public static int nextData(int[]num , int index) {
		
		
		return (index>=6)? 0:num[index+1];
	
	
}
	}
