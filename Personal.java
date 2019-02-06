public class Personal {

    public String fullName;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Personal (){
        fullName = "Иванов Иван Иванович";
        position = "Программист";
        email = "ivanov@proger.com";
        phone = "+7-777-77-77";
        salary = 50000;
        age = 35;

    }

    public Personal (String fullName,String position,String email,String phone,int salary,int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    void printDetails (String fullName,String position,String email,String phone,int salary,int age) {

        System.out.println("ФИО " + fullName);
        System.out.println("должность " + position);
        System.out.println("email " + email);
        System.out.println("телефон " + phone);
        System.out.println("зарплата " + salary);
        System.out.println("возраст " + age);

    }

    void printDetails () {

        System.out.println("ФИО " + this.fullName);
        System.out.println("должность " + this.position);
        System.out.println("email " + this.email);
        System.out.println("телефон " + this.phone);
        System.out.println("зарплата " + this.salary);
        System.out.println("возраст " + this.age);
        System.out.println();
    }

    public static void main(String[] args) {

        Personal personal = new Personal();
        //--Вызов метода для вывода информации об объекте personal
        personal.printDetails();

        Personal[] persArray = new Personal[5]; // Вначале объявляем массив объектов
        persArray[0] = new Personal("Ivanov Ivan", "Engineer", "Ivanov@mailbox.com", "8923232323", 30000, 30);
        persArray[1] = new Personal("Petrov petr", "Top Engineer", "Petrov@mailbox.com", "8923565656", 40000, 35);
        persArray[2] = new Personal("Sidorov Fedr", "Deputy Director", "Sidorov@mailbox.com", "8923898989", 50000, 43);
        persArray[3] = new Personal("Konoplev Aleksey", "Director", "Konoplev@mailbox.com", "8923787878", 60000, 34);
        persArray[4] = new Personal("Nikolaev Nikolay", "General Director", "Nikolaev@mailbox.com", "8923121212", 70000, 58);

        for (int i = 0; i < persArray.length; i++) {
            int n = persArray[i].age;
            if (n > 40) {
                persArray[i].printDetails();
            }
        }
    }

}
