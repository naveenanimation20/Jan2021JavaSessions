package JavaSessions;


public class DataTypes {

	public static void main(String[] args) {
		
		//data types:
		//statically type language:
		//1. primitive data types:
			//Boolean type: boolean : true/false
			//Numeric Type: Integral type: 
							//Integer : byte, short, int, long
							//Floating - type: float, double
			//CHARATCTER TYPE: char
		
		//byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b = 10;
		 b = 20;
		System.out.println(b+30); 
		byte b1 = -5;
		byte b2 = 0;
		
		//short:
		//size: 2 bytes = 16 bits
		//range: -32768 to 32767
		short sh = 100;
		System.out.println(sh);
		
		//int:
		//size: 4 bytes = 32 bits
		//range: -2147483648 to 2147483647
		int i = 1000;
		int j = i+20;
		System.out.println(j);
		//int p = 12.33;
		
		//long:
		//size: 8 bytes = 64 bits
		long l = 100000;
		long phone = 88898989;
		//CC, acc num, 
		
		//float:
		//size: 4 bytes = 32 bits
		//range: after . can take upto 7 digits
		float f = 12.33f;
		float f1 = (float)34.55;
		System.out.println(f);
		System.out.println(f+20);
		float f2 = 100;
		System.out.println(f2);
		
		//double:
		//size: 8 bytes = 64 bits
		//range: after . can take upto 16 digits
		double d = 12.33;
		double d1 = 1.1;
		
		//char: 1 digit value
		//size: 2 bytes = 16 bits
		char c = 'a';
		char c1 = '1';
		char c2 = '$';
		System.out.println(c);//a
		
		//boolean: true/false
		//size: ~1 bit = 1 bit
		boolean flag = true;
		boolean isActive = false;
		boolean isDiplayed = true;
		
		int total = 100;
		total = 300;
		System.out.println(total);
		
		byte b3 = 010;//octal number
		System.out.println(b3);
		//065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
		
	}

}

