void main() {
    final int no1;
    no1 = 1;
    System.out.println("Number 1 : " + no1);
    
    Test test = new Test(99, 100);
    //test.setNo1(90);
    System.out.println("Test No1 : " + test.getNo1());
    //test.setNo1(100);
    System.out.println("Test No2 : " + test.getNo2());

    test = new Test(111, 201);
    System.out.println("Test No1 : " + test.getNo1());
    System.out.println("Test No2 : " + test.getNo2());
}
