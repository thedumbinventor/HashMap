
class Square extends Shape {
    public void draw() throws InterruptedException {
        System.out.println("Drawing a square");
     //   wait(500);
        Thread.sleep(1000);
        System.out.println("Square Drawn");
    }
}