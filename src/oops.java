public class oops
{
    public static void main(String[] args) throws InterruptedException
    {
        Employee employee = new Employee("Priyanshu", 22, 50000.0);
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee age: " + employee.getAge());
        System.out.println("Employee salary: " + employee.getSalary());
        employee.setSalary(55000.0);
        System.out.println("Employee new salary: " + employee.getSalary());
        Manager manager = new Manager("Suraj SIr", 30, 120000, "SoftwareDept.");
        System.out.println("Manager name: " + manager.getName());
        System.out.println("Manager age: " + manager.getAge());
        System.out.println("Manager salary: " + manager.getSalary());
        System.out.println("Manager department: " + manager.getDepartment());
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        shape1.draw();
        shape2.draw();
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.setSpeed(50.0);
        bike.setSpeed(50.0);
    }
}
