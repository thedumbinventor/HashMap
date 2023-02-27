class Circle extends Shape {
    public void draw() throws InterruptedException {
        System.out.println("Drawing a circle");
        //wait(500);
        Thread.sleep(1000);
        System.out.println("Circle Drawn");
    }
}
