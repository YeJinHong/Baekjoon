package someones;

import java.io.*;
import java.util.*;

//comparable�� ������ ���.
//Comparator-Arrays.sort, Comparable-Collections.sort  
//�� ���̽��� ���� compareTo �޼ҵ��� ���ϰ��� 1, -1�� ���� ���������� ���ʿ��� ����� ���̴� ȿ���� ������
//�ڵ尡 ������� ������ ����.
public class BJ10825_darkraykim {
	public static void main(String[] args) throws Exception, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int StNum = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		List<Student> students = new ArrayList<>();
		
		for(int i=0; i<StNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			students.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
		
		Collections.sort(students);
		
		for(Student std : students) {
			sb.append(std.name).append('\n');
		}
		System.out.println(sb.toString());		
	}
}
class Student implements Comparable<Student>{
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	Student(){}
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	@Override
	public int compareTo(Student me) {
		//������ �� ���� �ٲ��.
		
		if(me.kor > kor)//��������
		{
			return 1;
		}
		else if(me.kor == kor) 
		{
			if(me.eng < eng) //��������
			{
				return 1;
			}
			else if(me.eng == eng)
			{
				if(me.math > math)
				{
					return 1;
				}
				else if(me.math == math)
				{
					return name.compareTo(me.name);
				}
				else
				{
					return -1;
				}
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return -1;
		}
	}
}