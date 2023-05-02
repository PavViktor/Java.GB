import java.util.Date;
import java.util.Calendar;
import java.util.Objects;

/**
 * Это класс Сотрудник
 */
public class Employee {
    private String nPassport;
    private String firstName;
    private String lastName;
    private double salary;
    private Date dateBirth;
    private String title;
    private String education;
    private float stake;

    /**
     * Это конструктор
     * @param nPassport - номер паспорта
     * @param firstName - имя
     * @param lastName - фамилия
     * @param dateBirth - дата рождения
     * @param title - должность
     * @param stake - ставка
     * @param salary - зарплата
     * @param education - образование
     */
    public Employee(String nPassport, String firstName, String lastName, Date dateBirth, String title, float stake, double salary, String education) {
        this.nPassport = nPassport;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.title = title;
        this.stake = stake;
        this.salary = salary;
        this.education = education;
    }

    /**
     * Это конструктор (зарплата по умолчанию 50.0)
     * @param nPassport - номер паспорта
     * @param firstName - имя
     * @param lastName - фамилия
     * @param dateBirth - дата рождения
     * @param title - должность
     * @param stake - ставка
     * @param education - образование
     */
    public Employee(String nPassport, String firstName, String lastName, Date dateBirth, String title, float stake, String education) {
        this(nPassport, firstName, lastName, dateBirth, title, stake, 50, education);
    }

    /**
     * Это конструктор (зарплата по умолчанию 50.0, ставка по умолчанию 1.0)
     * @param nPassport - номер паспорта
     * @param firstName - имя
     * @param lastName - фамилия
     * @param dateBirth - дата рождения
     * @param title - должность
     * @param education - образование
     */
    public Employee(String nPassport, String firstName, String lastName, Date dateBirth, String title, String education) {
        this(nPassport, firstName, lastName, dateBirth, title, 1, 50, education);
    }

    /**
     * Это конструктор (ставка по умолчанию 1.0)
     * @param nPassport - номер паспорта
     * @param firstName - имя
     * @param lastName - фамилия
     * @param dateBirth - дата рождения
     * @param title - должность
     * @param education - образование
     * @param salary - зарплата
     */
    public Employee(String nPassport, String firstName, String lastName, Date dateBirth, String title, double salary, String education) {
        this(nPassport, firstName, lastName, dateBirth, title, 1, salary, education);
    }

    /**
     * Это геттер номера паспорта
     * @return
     */
    public String getNPassport () { return nPassport; }

    /**
     * Это геттер имени
     * @return
     */
    public String getFirstName() { return firstName; }

    /**
     * Это сеттер имени
     * @param firstName - имя
     */
    public void setFirstName(String firstName) { this.firstName = firstName; }

    /**
     * Это геттер фамилии
     * @return
     */
    public String getLastName() { return lastName; }

    /**
     * Это сеттер фамилии
     * @param lastName - фамилия
     */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /**
     * Это геттер даты рождения
     * @return
     */
    public Date getDateBirth() { return dateBirth; }

    /**
     * Это геттер даты рождения
     * @return
     */
    public double getSalary() { return salary; }

    /**
     * Это сеттер зарплаты
     * @param salary - зарплата
     */
    public void setSalary(double salary) { this.salary = salary; }

    /**
     * Это геттер количества полных лет
     * @return
     */
    public int getAge() {
        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();
        dob.setTime(this.dateBirth);
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        return (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR)) ? age-1 : age;
    }

    /**
     * Это геттер имени и фамилии в строке
     * @return
     */
    public String getFullName() { return firstName + " " + lastName; }

    /**
     * Это геттер всей информации по сотруднику
     * @param sep - разделитель полей в строке
     * @return
     */
    public String getFullInformation(String sep) {
        return title + sep + stake + sep + firstName + sep + lastName + sep + nPassport + sep + dateBirth.toString() + sep + education + sep + salary;
    }

    /**
     * Это геттер всей информации по сотруднику (разделитель по умолчанию пробел)
     * @return
     */
    public String getFullInformation() { return getFullInformation(" "); }

    /**
     * Метод определения старше ли сотрудник другого
     * @param employee - сотрудник с которым сравниваем
     * @return true - старше, false - моложе, либо родились в один день
     */
    public boolean olderThan(Employee employee) {
        return this.getDateBirth().compareTo(employee.getDateBirth()) > 0 ? false : true;
    }

    /**
     * Метод повышающий зарплату
     * @param upSalary - надбавка
     */
    public void upgrade(double upSalary) { this.salary += upSalary; }

    /**
     * Это геттер должности
     * @return
     */
    public String getTitle() { return title; }

    /**
     * Это сеттер должности
     * @param title - должность
     */
    public void setTitle(String title) { this.title = title; }


    /**
     * Это геттер ставки
     * @return
     */
    public float getStake() { return stake; }

    /**
     * Это сеттер количества ставок(норм рабочего времени)
     * @param stake - ставка
     */
    public void setStake(float stake) { this.stake = stake; }

    /**
     * Переопределение функции сравнения сотрудников
     * @param obj сотрудник с которым сравниваем
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee employee = (Employee) obj;
            return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && dateBirth.equals(employee.dateBirth);
        }
        return false;
    }

    /**
     * Переопределение функции нахождения хэша сотрудника
     * @return
     */
    @Override
    public int hashCode() { return Objects.hash(nPassport); }
}