/**class Demo{
	private static int x;
	viod f1() {
		x=5;
	}
}
class Program{
	public static void main(String[] args){
		Demo d1=new Demo();
		d1.f1();
	}
}

**/
class Demo {
    private static int x;

    void f1() {
        x = 5;
    }
}

class Program {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.f1();
    }
}
