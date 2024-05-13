//判断是否为闰年 闰年要能取余4但是不能取余100，取余400的也可以
@Test
public void work1() {
Scanner scanner = new Scanner(System.in);
int year = scanner.nextInt();
if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
System.out.println("是闰年");
} else {
System.out.println("是平年");
}
}
