package testbj;

import java.util.*;
import java.lang.Object;

class Solution {
    public String solution(int num) {
    	public static long hangulToNum(String input){
            long result = 0;
            long tmpResult =0;
            long num = 0;
          
            final String NUMBER="�����̻�����ĥ�ȱ�";
            final String UNIT= "�ʹ�õ������";
            final long[] UNIT_NUM = {
                          10,100,1000,10000,(long)Math.pow(10, 8),(long)Math.pow(10,12)
            };
          
            StringTokenizer st = new StringTokenizer(input,UNIT,true);//����
            while(st.hasMoreTokens()){//��,*,*,��,*,*
                   String token =st.nextToken();
                   //�������� ����(UNIT)���� Ȯ���Ѵ�.
                   int check =NUMBER.indexOf(token);//1)�� ->3 2)�� ->-1
                   System.out.println("CHECK:"+check);
                 
                   if(check==-1){//�����ΰ��
                          if("������".indexOf(token)==-1){//�������� �ƴϸ� 3)��
                                tmpResult+=(num!=0?num:1)*UNIT_NUM[UNIT.indexOf(token)];//num=30 * 10000
                          }else{
                                //��,��,�� ��� ->result
                                tmpResult +=num;
                                result +=(tmpResult!=0?tmpResult:1)*UNIT_NUM[UNIT.indexOf(token)];
                                tmpResult = 0;
                          }
                          num = 0;
                   }else{//����
                          num = check;
                   }
            }
            System.out.println("result:"+result);
            System.out.println("tmpResult:"+tmpResult);
            System.out.println("num:"+num);
          
            return result +tmpResult + num;      
      }
}
    