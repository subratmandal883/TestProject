package stringOperations;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		String str=" ";
		long startTime=System.nanoTime();
		for(int i=0;i<10;i++) {
			str=str+i;
		}
		long endTime=System.nanoTime();
		System.out.println(String.format("String operation took [%d]nano second",(endTime-startTime)));
		 StringBuilder builder=new StringBuilder();
		 startTime=System.nanoTime();
		 for (int i = 0; i < 10; i++) {
			 builder.append(i);
		}
		 endTime=System.nanoTime();
		 System.out.println(String.format("String stringBuilder took [%d]nano second", (endTime-startTime)));
		 StringBuffer  buffer=new StringBuffer();
		 startTime=System.nanoTime();
		 for (int i = 0; i < 10; i++) {
			buffer.append(i);
		}
		 endTime=System.nanoTime();
		 System.out.println(String.format("String StringBuffer took [%d] nano second", (endTime-startTime)));
	}

}
